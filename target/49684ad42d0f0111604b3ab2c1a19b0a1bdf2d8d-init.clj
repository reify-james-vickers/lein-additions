nil (do (set! *warn-on-reflection* nil) (do (try (clojure.core/doto (quote lein-profiles-demo.core) clojure.core/require clojure.core/in-ns) (catch java.lang.Exception e__11165__auto__ (clojure.core/when-not (clojure.core/= (quote lein-profiles-demo.core) (quote user)) (clojure.core/println e__11165__auto__)) (clojure.core/ns lein-profiles-demo.core))) (clojure.core/when-not (clojure.core/resolve (quote clojure.core/when-some)) (clojure.core/binding [clojure.core/*out* clojure.core/*err*] (clojure.core/println "As of 2.8.2, the repl task is incompatible with" "Clojure versions older than 1.7.0." "\nYou can downgrade to 2.8.1 or use `lein trampoline run" "-m clojure.main` for a simpler fallback repl.")) (java.lang.System/exit 1)) (try (clojure.core/require (quote nrepl.server)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote nrepl.server) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote incomplete.core)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote incomplete.core) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) (try (clojure.core/require (quote cider.nrepl)) (catch java.lang.Throwable t__11166__auto__ (clojure.core/println "Error loading" (clojure.core/str (quote cider.nrepl) ":") (clojure.core/or (.getMessage t__11166__auto__) (clojure.core/type t__11166__auto__))))) nil) (require (quote hashp.core)) (require (quote [lucid.core.inject :as inj])) (require (quote [sc.api])) (inj/inject-single (quote clojure.core) (quote _spy) (var sc.api/spy)) (inj/in clojure.core [postmortem.core log-for spy>> reset-key!] [debux.core dbg dbgn dbgt set-debug-mode! set-ns-whitelist! set-ns-blacklist!] [sc.api letsc defsc] [clojure.tools.trace trace trace-ns untrace-ns trace-vars untrace-vars trace-forms deftrace] [clojure.core.strint <<]) (do (if nil (clojure.core/require (clojure.core/symbol ""))) (clojure.core/let [server__11161__auto__ (nrepl.server/start-server :bind "127.0.0.1" :port 0 :transport-fn nil :greeting-fn nil :ack-port nil :handler (nrepl.server/default-handler (clojure.core/with-local-vars [wrap-init-ns__11118__auto__ (clojure.core/fn [h__11119__auto__] (clojure.core/with-local-vars [init-ns-sentinel__11120__auto__ nil] (clojure.core/fn [{:as msg__11121__auto__, :keys [session]}] (clojure.core/when-not ((clojure.core/deref session) init-ns-sentinel__11120__auto__) (clojure.core/swap! session clojure.core/assoc (var clojure.core/*ns*) (try (clojure.core/require (quote lein-profiles-demo.core)) (clojure.core/create-ns (quote lein-profiles-demo.core)) (catch java.lang.Throwable t__11122__auto__ (clojure.core/create-ns (quote user)))) init-ns-sentinel__11120__auto__ true)) (h__11119__auto__ msg__11121__auto__))))] (clojure.core/doto wrap-init-ns__11118__auto__ (nrepl.middleware/set-descriptor! {:expects #{"eval"}, :requires #{(var nrepl.middleware.session/session)}}) (clojure.core/alter-var-root (clojure.core/constantly (clojure.core/deref wrap-init-ns__11118__auto__))))) (var cider.nrepl/wrap-apropos) (var cider.nrepl/wrap-classpath) (var cider.nrepl/wrap-clojuredocs) (var cider.nrepl/wrap-complete) (var cider.nrepl/wrap-content-type) (var cider.nrepl/wrap-debug) (var cider.nrepl/wrap-enlighten) (var cider.nrepl/wrap-format) (var cider.nrepl/wrap-info) (var cider.nrepl/wrap-inspect) (var cider.nrepl/wrap-macroexpand) (var cider.nrepl/wrap-ns) (var cider.nrepl/wrap-out) (var cider.nrepl/wrap-slurp) (var cider.nrepl/wrap-profile) (var cider.nrepl/wrap-refresh) (var cider.nrepl/wrap-resource) (var cider.nrepl/wrap-spec) (var cider.nrepl/wrap-stacktrace) (var cider.nrepl/wrap-test) (var cider.nrepl/wrap-trace) (var cider.nrepl/wrap-tracker) (var cider.nrepl/wrap-undef) (var cider.nrepl/wrap-version) (var cider.nrepl/wrap-xref))) port__11162__auto__ (:port server__11161__auto__) repl-port-file__11163__auto__ (clojure.core/apply clojure.java.io/file ["/Users/jamesvickers/src/lein-additions" ".nrepl-port"]) legacy-repl-port__11164__auto__ (if (.exists (clojure.java.io/file "/Users/jamesvickers/src/lein-additions/target")) (clojure.java.io/file "/Users/jamesvickers/src/lein-additions/target" "repl-port"))] (clojure.core/when true (clojure.core/println "nREPL server started on port" port__11162__auto__ "on host" "127.0.0.1" (clojure.core/str "- " (nrepl.transport/uri-scheme #'nrepl.transport/bencode) "://" "127.0.0.1" ":" port__11162__auto__))) (clojure.core/spit (clojure.core/doto repl-port-file__11163__auto__ .deleteOnExit) port__11162__auto__) (clojure.core/when legacy-repl-port__11164__auto__ (clojure.core/spit (clojure.core/doto legacy-repl-port__11164__auto__ .deleteOnExit) port__11162__auto__)) (clojure.core/deref (clojure.core/promise)))))