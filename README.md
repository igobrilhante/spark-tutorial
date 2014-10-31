spark-tutorial
==============

## New Spark Project
Create the folder of the project, e.g. **spark-tutorial**,
``` console
$ mkdir spark-tutorial
$ cd spark-tutorial

$ vim project/plugins.sbt
```
After creating our root project, we need to set up the build of the project by creating **build.sbt** in the root of the project with the following content:
```
scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.1.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.1.0"

resolvers ++= Seq(
  "Akka Repository" at "http://repo.akka.io/releases/",
  "Spray Repository" at "http://repo.spray.cc/")
```
Here we define the scala version and the libs the project depends on.


## Using Intellij
If you use Intellij as your IDE, we can create its project through the sbt plugin **sbt-idea**. To use it, we need to add (create it if it does not exist) the following in **project/plugins.sbt**
```
resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.7.0-SNAPSHOT")
```
Then, we can run the sbt task to turn the project into an Intellij project by ``` sbt gen-idea ``` in the root of the project.

## Cloning this repo
If you want to use this project, you can get it by
``` 
git clone https://github.com/igobrilhante/spark-tutorial.git
cd spark-tutorial
sbt assembly
```
**sbt assembly** will generate a jar of the project to be used on the Spark environment.
