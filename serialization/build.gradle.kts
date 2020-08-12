plugins {
    kotlin("plugin.serialization") version "1.3.71"
}

dependencies {
    compileOnly(project(":core"))//, configuration = "shadow"))

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.20.0")
    implementation("com.charleskorn.kaml:kaml:0.17.0")
    //implementation("de.brudaswen.kotlinx.serialization:kotlinx-serialization-csv:0.1.0")
}