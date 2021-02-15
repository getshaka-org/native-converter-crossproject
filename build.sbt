lazy val root = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Full)
  .in(file("."))
  .settings(
    organization := "com.example",
    name := "native-converter-crossproject",
    version := "0.1.0-SNAPSHOT",
    versionScheme := Some("early-semver"),

    scalaVersion := "3.3.0",

    libraryDependencies ++= Seq(
      "org.getshaka" %%% "native-converter" % "0.9.0"
    )
  )
  .jsSettings(
    scalaJSUseMainModuleInitializer := true,
  )
  .jvmSettings(
    
  )
