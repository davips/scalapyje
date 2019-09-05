scalaVersion := "2.11.12"

nativeLinkStubs := true

enablePlugins(ScalaNativePlugin)

libraryDependencies += "me.shadaj" % "scalapy-core_native0.3_2.11" % "0.3.0+1-e1acbe6f"

nativeLinkingOptions ++= {
   "-L/usr/lib/python3.7/config-3.7m-x86_64-linux-gnu -Lvenv/lib -lpython3.7 -lcrypt -lpthread -ldl  -lutil -lm".split(' ').map(_.trim).filter(_.nonEmpty).toSeq
}
