import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    // library frogo-build-src
    implementation("com.github.frogobox:frogo-build-src:1.2.4")

    // library open-build-src
    implementation("com.github.frogobox:open-build-src:1.1.1")
}
