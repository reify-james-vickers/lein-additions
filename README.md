# lein-additions
Additions to lein config for debugging, development experience, etc.

## profiles.clj

This file can be placed under you `~/.lein` directory (create if doesn't exist) to customize leiningen behavior.  You can also merge the contents of this one with your `~/.lein/profiles.clj` as you like to get just some parts of this customization.

The stuff like `:bengal` and `:bengal-dev` are of course specific to [Bengal](hub.com/reifyhealth/bengal).

### Random stuff

`:pedantic? :warn` avoids some errors running some repo's like bengal.

This increases how long `lein repl` will wait, which avoids a timeout error on some projects that take a long time to startup.  Default is 30s so you need something like this if it takes longer than that to start your REPL.
```
{:repl-options
      {:timeout 600000}
```

### :plugins

#### lein-pprint

Allows you to run `lein pprint` which gives some info about your lein setup, useful for debugging.

### :injections

The overall strategy in this file for `:injections` is to use the lucid library to 'inject' some symbols to be included in `clojure.core`, which makes these symbols/functions always available since that namespace is always loaded (without this injection, these include's might be lost when you load a namespace, for example).

#### [hashp](https://github.com/weavejester/hashp) - quick way to print values at runtime

This setup adds a reader macro so you can print forms by putting `#p` before them, e.g. `(+ #p x 5)` will print the current value of `x` when evaluated.  Primitive but quick way of outputting some values, prints the form and the evaluation of it; another nice thing is you don't have to wrap the form in another function call to use it.

#### [debux](https://github.com/philoskim/debux) - print and return expressions/forms

Debux can do a few things but the main thing I use is `dbg` which can show the result of an expression and also return it so the code is unchanged (you can wrap a call in `dbg` and it still returns the same value as if not wrapped in `dbg`).  It is especially good at showing you what's happening in threading macros like `->` and `->>`, for example:

```clj
(dbg (-> "a b c d"
         .toUpperCase
         (.replace "A" "X")
         (.split " ")
         first))
```

Will print:

```
{:ns examples.demo, :line 18}
dbg: (-> "a b c d" .toUpperCase (.replace "A" "X") (.split " ") first) =>
| "a b c d" =>
|   "a b c d"
| .toUpperCase =>
|   "A B C D"
| (.replace "A" "X") =>
|   "X B C D"
| (.split " ") =>
|   ["X", "B", "C", "D"]
| first =>
|   "X"
```

Note that using `#p` from `hashp` library here instead of `dbg` will only print the final result instead of each intermediate result like `dbg` does for threading macros.  `dbg` also works well for other threading macros like `some->` and `cond->`.

#### [clojure.tools.trace](https://github.com/clojure/tools.trace) - print values at runtime

Similar purpose to debux and hashp, but has some different functionality: `trace-ns` can be used to add tracing output to an entire namespace, and `trace-forms` can see which form is failing.

#### [postmortem](https://github.com/athos/Postmortem) - capture and log things

Sort of the REPL-driven alternative to libraries like hashp and debux.  Haven't used this much.

#### [scope capture](https://github.com/vvvvalvalval/scope-capture) - log, capture and recreate enclosing scopes

I haven't used this much.

#### string interpolation (from [org.clojure/core.incubator](https://github.com/clojure/core.incubator))

This allows you to do string interpolation in clojure via `<<`, something I wish was built-in.  Note this will only work for you so don't use it in production code (only for your debugging purposes) unless it's part of e.g. `project.clj`.

```clj
(<< "the value of x is ~{x}, x is even: ~(even? x)")
```

#### [inspector](https://practical.li/clojure-staging/clojure-tools/data-browsers/clojure-inspector.html) - see GUI of clojure data structures

IDE's or other tools are generally better and quicker to use but you can use this to bring up a graphical representation of Clojure data.  This is built into the Clojure jar (no dependencies required).
