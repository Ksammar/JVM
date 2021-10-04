name := "ScalaMapRed"

version := "0.1"

scalaVersion := "2.12.15"

//javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
//
//libraryDependencies ++= Seq(
//  "org.apache.hadoop" % "hadoop-common" % "2.10.1" % "provided",
//  "org.apache.hadoop" % "hadoop-hdfs" % "2.10.1" % "provided",
//  "org.apache.hadoop" % "hadoop-mapreduce-client-core" % "2.10.1" % "provided"
//)

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
val provided = "provided"
val hdp = ("org.apache.hadoop", "2.10.1")
libraryDependencies ++= Seq(
  hdp._1 % "hadoop-common" % hdp._2 % provided,
  hdp._1 % "hadoop-hdfs" % hdp._2 % provided,
  hdp._1 % "hadoop-mapreduce-client-core" % hdp._2 % provided
)
