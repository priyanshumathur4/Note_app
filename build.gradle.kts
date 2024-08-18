plugins {
    // Plugin configuration
    alias(libs.plugins.android.application) apply false
}

// Add the buildscript block for classpath dependencies
buildscript {
    repositories {
        google() // Use Google's Maven repository
        mavenCentral() // Use Maven Central repository
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.4.0") // or your version
        classpath("com.google.gms:google-services:4.3.15") // or your version
    }
}