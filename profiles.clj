{:bengal-dev {:source-paths ["src" "src-common" "src-admin" "src-sponsor"
                             "dev" "dev-common" "dev-sponsor"]
              :test-paths ["test" "test-common" "test-admin" "test-sponsor"]}

 :bengal {:plugins [[cider/cider-nrepl "0.25.5"]
                    [refactor-nrepl "2.5.1" :exclusions [nrepl]]]}
 :user
   {:repl-options
      {:timeout 600000}
    :pedantic? :warn
    ; not sure what this does but fixes: syntax errors compiling fipp/ednize.clj:1
    :eval-in :subprocess
    :plugins [[lein-pprint "1.3.2"]]
    :dependencies [[hashp "0.2.1" :exclusions [org.clojure/tools.reader]]
                   [philoskim/debux "0.8.2" :exclusions [args4j]]
                   [org.clojure/tools.trace "0.7.11"]
                   [im.chit/lucid.core.inject "1.3.13" :exclusions [rewrite-clj]]
                   [djblue/portal "0.26.0"]
                   [org.clojure/core.incubator "0.1.4"]]
    :injections [(require 'hashp.core)
                 (require '[lucid.core.inject :as inj])
                 (require '[portal.api :as portal])
                 (portal/tap) ; add portal as a tap target
                 (def my-portal (portal/open {:launcher :vs-code}))
                 (inj/in
                  clojure.core
                  [debux.core dbg dbgn dbgt set-debug-mode! set-ns-whitelist! set-ns-blacklist!]
                  [clojure.tools.trace trace trace-ns untrace-ns trace-vars untrace-vars trace-forms deftrace]
                  [clojure.core.strint <<])]}}
