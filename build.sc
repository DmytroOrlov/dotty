#!/usr/bin/env amm
import ammonite.ops._
import ammonite.ops.ImplicitWd._

%sbt('publishLocal, "scala-library/publishLocal", "dotty-library-bootstrapped/publishLocal", "dotty-bootstrapped/publishLocal")
