name := "Numbers"

version := "1.0"

//master

scalaVersion := "2.12.1"

wartremoverErrors ++= Warts.unsafe
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"
libraryDependencies += "org.scoverage" % "scalac-scoverage-plugin_2.10" % "1.1.0" % "provided"
