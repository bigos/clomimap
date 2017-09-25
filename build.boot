(def project 'clomimap)
(def version "0.1.0-SNAPSHOT")

(set-env! :resource-paths #{"resources" "src" "target"}
          :source-paths   #{"test"}
          :dependencies   '[[org.clojure/clojure "1.8.0"]
                            [adzerk/boot-test "RELEASE" :scope "test"]
                            [seesaw "1.4.5"]])

(task-options!
 aot {:namespace   #{'clomimap.core}}
 pom {:project     project
      :version     version
      :description "Attempt to use Clojure to write a mind map editor"
      :url         "https://github.com/bigos/clomimap"
      :scm         {:url "https://github.com/bigos/clomimap"}
      :license     {"Eclipse Public License"
                    "http://www.eclipse.org/legal/epl-v10.html"}}
 jar {:main        'clomimap.core
      :file        (str "clomimap-" version "-standalone.jar")})

(deftask build
  "Build the project locally as a JAR."
  [d dir PATH #{str} "the set of directories to write to (target)."]
  (let [dir (if (seq dir) dir #{"target"})]
    (comp (aot) (pom) (uber) (jar) (target :dir dir))))

(deftask run
  "Run the project."
  [a args ARG [str] "the arguments for the application."]
  (require '[clomimap.core :as app])
  (apply (resolve 'app/-main) args))

(require '[adzerk.boot-test :refer [test]])
