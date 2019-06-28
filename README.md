# hello-webpack

This is a dummy project to reproduce an issue: using `foreign-libs`, `sentry` and `kaocha-cljs`.

Based on https://clojurescript.org/guides/webpack

## Run:

```
yarn install

yarn webpack

clj -m cljs.main -co build.edn -v -c -s
```
Open localhost:9000 and check the console log.

## Test:

`clojure -A:test -m kaocha.runner unit-cljs`

That's when the issue happens.
