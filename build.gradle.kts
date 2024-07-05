// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.2.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")

        classpath ("com.vanniktech:gradle-maven-publish-plugin:0.24.0")
        classpath ("org.jetbrains.dokka:dokka-gradle-plugin:1.7.20")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }


}
plugins {
    id("com.google.gms.google-services") version "4.4.2" apply false
}

tasks.register<Delete>("clean").configure {
    delete(rootProject.buildDir)
}