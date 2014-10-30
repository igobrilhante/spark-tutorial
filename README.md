spark-tutorial
==============

#### Creating build.sbt
In the root project, we need to create the file **build.sbt** as follows.
```
scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.1.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.1.0"

resolvers ++= Seq(
  "Akka Repository" at "http://repo.akka.io/releases/",
  "Spray Repository" at "http://repo.spray.cc/")
```
Here we define the scala version and the state that the project depends on spark-core and spark-streaming version 1.1.0.

#### Creating project/plugins.sbt

```
resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.7.0-SNAPSHOT")
```
