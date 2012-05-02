resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += Resolver.url(
  "sbt-plugin-releases", 
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/")
)(Resolver.ivyStylePatterns)

addSbtPlugin("com.github.retronym" % "sbt-onejar" % "0.7")

// addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0")

// libraryDependencies += "com.typesafe" %% "sbt-scalariform" % "0.1"
