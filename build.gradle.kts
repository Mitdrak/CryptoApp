// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.serialization) apply false
    alias(libs.plugins.hilt.android) apply false // Add this line
    alias(libs.plugins.google.services) apply false
    alias(libs.plugins.crashlytics) apply false
    id("com.google.devtools.ksp") version "2.1.0-1.0.29" apply false
    kotlin("kapt") version "2.1.0"
}