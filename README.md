This little extension just provides printing of timestamps on each iteration start.

It will print out to stdout, for warmups:

```
>>> Warmup <n> started at <iso8601 timestamp>.
```

e.g.

```
>>> Warmup 3 started at 2026-08-07T09:03:16.926313120Z.
```

for the final, real measurement:

```
>>> Final started at <iso8601 timestamp>.
```

e.g.

```
>>> Final started at 2026-08-07T09:03:19.555869929Z.
```

We could deduce those times on our own from the stock output, somehow, but this is more convenient.

Invoke dacapo like this: pass it both the extension jar and the dacapo jar in the classpath, then pass the class name of the callback with -c:

```
java -cp dacapo/extension/dacapoExtension.jar:dacapo/the-benchmark/dacapo-23.11-MR2-chopin.jar Harness -c stuefe.dacapo.JBRCallback <other dacapo options> <benchmark name>
```

E.g.

```
java -cp dacapo/extension/dacapoExtension.jar:dacapo/the-benchmark/dacapo-23.11-MR2-chopin.jar Harness -c stuefe.dacapo.JBRCallback -n 3 --verbose --print-stats pmd
```

