plugins {
    id("org.jetbrains.intellij") version "0.6.1"
    kotlin("jvm") version "1.4.10"
}

group = "io.unhrottled"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    // working version
//    version = "2020.2.2"

    // broken version
    version = "LATEST-EAP-SNAPSHOT"
}
tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes("""
      Add change notes here.<br>
      <em>most HTML tags may be used</em>""")
}