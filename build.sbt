name := """Recetas"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  "org.postgresql" % "postgresql" % "9.4-1206-jdbc42",
  javaWs
)

enablePlugins(PlayEbean)
libraryDependencies += evolutions
routesGenerator := InjectedRoutesGenerator
