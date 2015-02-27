To reproduce the bug:

1. Execute `sbt compile`
2. go sleeping...

The problem seems to be the `x => ???`. If it is replaced with `x => x`, the code compiles normally.
