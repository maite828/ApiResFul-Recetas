name := """Recetas"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  javaWs
)

enablePlugins(PlayEbean)
libraryDependencies += evolutions
routesGenerator := InjectedRoutesGenerator
