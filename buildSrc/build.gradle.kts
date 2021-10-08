plugins {
  `kotlin-dsl`
  kotlin("plugin.serialization") version "1.5.31"
}

tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile> {
  kotlinOptions {
    freeCompilerArgs += listOf(
      "-Xopt-in=kotlin.RequiresOptIn",
    )
  }
}

repositories {
  mavenCentral()
  google()
}

dependencies {
  implementation(gradleApi())
  implementation("com.android.tools.build:gradle:7.0.2")
  implementation("com.android.tools:sdklib:30.0.0")
  implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.5.31")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.0")
}
