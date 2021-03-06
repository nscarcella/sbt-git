sbtPlugin := true

name := "sbt-git"
organization := "com.typesafe.sbt"


enablePlugins(GitVersioning)
git.baseVersion := "0.8"


libraryDependencies ++= Seq(
  "org.eclipse.jgit" % "org.eclipse.jgit.pgm" % "4.5.0.201609210915-r"
    exclude("javax.jms", "jms")
    exclude("com.sun.jdmk", "jmxtools")
    exclude("com.sun.jmx", "jmxri")
)
publishMavenStyle := false


scriptedSettings
scriptedLaunchOpts += s"-Dproject.version=${version.value}"
