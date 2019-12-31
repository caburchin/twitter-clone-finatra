lazy val root = (project in file(".")).
  settings(
    name := "twitter-clone",
    scalaVersion := "2.12.8",
    libraryDependencies ++= dervy,
    resolvers ++= resolve
  )

lazy val dervy = {
  Seq(
    "com.twitter" %% "finatra-http" % "19.7.0",
    "com.typesafe" % "config" % "1.3.2",
    "io.getquill" %% "quill-jdbc" % "3.5.0",
    "javax.enterprise" % "cdi-api" % "2.0" % "provided",
    "mysql" % "mysql-connector-java" % "8.0.17",
    "org.scala-lang" % "scala-compiler" % "2.12.8",
    "org.slf4j" % "slf4j-simple" % "1.6.4",
    "com.github.t3hnar" %% "scala-bcrypt" % "4.1"
  )
}

lazy val test = {
  Seq("com.twitter" %% "finatra-http" % "19.7.0" % "test" classifier "tests")
}

lazy val resolve = {
  Seq(
    Resolver.sonatypeRepo("releases"),
    "Twitter Maven" at "https://maven.twttr.com",
  )
}
