plugins {
  id("org.openstreetmap.josm").version("0.5.3")
}

repositories {
  jcenter()
}

/**
 * For documentation about the `josm{}` block see
 * https://floscher.gitlab.io/gradle-josm-plugin/kdoc/latest/gradle-josm-plugin/org.openstreetmap.josm.gradle.plugin.config/-josm-plugin-extension/
 */
josm {
  josmCompileVersion = "14289"
  manifest {
    description = "The description of my awesome plugin"
    mainClass = "org.openstreetmap.josm.plugins.myawesomeplugin.MyAwesomePlugin"
    minJosmVersion = "2830"
    // author = "John Doe"
    // canLoadAtRuntime = true
    // iconPath = "path/to/my/icon.svg"
    // loadEarly = false
    // loadPriority = 50
    // pluginDependencies.addAll(setOf("apache-commons", "apache-http"))
    // website = URL("https://example.org")
    // oldVersionDownloadLink(123, "v1.2.0", URL("https://example.org/download/v1.2.0/MyAwesomePlugin.jar"))
    // oldVersionDownloadLink( 42, "v1.0.0", URL("https://example.org/download/v1.0.0/MyAwesomePlugin.jar"))
  }
  i18n {
    // pathTransformer = getPathTransformer("gitlab.com/floscher/gradle-josm-plugin/blob/demo")
    // bugReportEmail = "me@example.com"
    // copyrightHolder = "John Doe"
  }
}
