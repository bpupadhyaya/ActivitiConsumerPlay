name := "ActivitiConsumerPlay"

version := "1.0"

lazy val `activiticonsumerplay` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , cache , ws   , specs2 % Test )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

fork in run := true

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.37"