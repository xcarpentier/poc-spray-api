organization  := "com.example"

version       := "0.1"

scalaVersion  := "2.10.3"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.0"
  val sprayV = "1.3.1"
  Seq(
    "io.spray"            %   "spray-can"       % sprayV,
    "io.spray"            %   "spray-routing"   % sprayV,
    "org.json4s"          %%  "json4s-jackson"  % "3.2.10",
    "io.spray"            %   "spray-testkit"   % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-actor"      % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"    % akkaV   % "test",
    "org.specs2"          %%  "specs2-core"     % "2.3.7" % "test"
  )
}

Revolver.settings
