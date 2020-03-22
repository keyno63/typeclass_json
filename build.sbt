lazy val typeclass_json = (project in file("."))
  .settings(
    name := "typeclass_json",
    fork in run := true,
    libraryDependencies += scalaTest % Test,
  )

name := "typeclass_json"

version := "0.1"

scalaVersion := "2.12.10"
