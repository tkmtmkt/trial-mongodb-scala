//

name := "study-mongodb-scala"

version := "0.1-SNAPSHOT"

organization := "home"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
    //"org.slf4j" % "slf4j-simple" % "1.7.3",
    //"org.slf4j" % "slf4j-log4j12" % "1.7.3",
    "ch.qos.logback" % "logback-classic" % "1.0.10",
    "org.codehaus.groovy" % "groovy" % "2.1.1",
    "org.mongodb" %% "casbah" % "2.5.1",
    "com.novus" %% "salat" % "1.9.1",
    "junit" % "junit" % "4.10" % "test",
    "org.specs2" %% "specs2" % "1.12.4" % "test",
    "org.mockito" % "mockito-core" % "1.9.0" % "test"
)

// vim: set ft=scala ts=4 sw=4 et:
