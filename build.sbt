lazy val root = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Full)
  .in(file("."))
  .settings(
    organization := "com.example",
    name := "native-converter-crossproject",
    version := "0.1.0-SNAPSHOT",
    versionScheme := Some("early-semver"),

    scalaVersion := "3.0.1",
  )
  .jsSettings(
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
      "org.getshaka" %%% "native-converter" % "0.5.2"
    )
  )
  .jvmSettings(
    
  )
