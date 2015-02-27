One way to reproduce the bug:

1. Execute `sbt eclipse`
2. Import the project in Eclipse

Now, Eclipse should already take a long time to open `src/main/scala/x.scala`.

If not, further changes can be done:

1. Delete `.groupBy { x => ??? }` and save the document
2. Undo the change and save again

Now, the compiler shouldn't response normally anymore.
