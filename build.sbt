import Dependencies._

lazy val typeclass_json = (project in file("."))
  .settings(
    name := "typeclass_json",
    fork in run := true,
    libraryDependencies += scalaTest % Test,
    libraryDependencies += scalaParser,
    libraryDependencies += scalaRefrect,
    //scalafmtOnCompile := true,
  )

name := "typeclass_json"

version := "0.1"

scalaVersion := "2.13.1"
