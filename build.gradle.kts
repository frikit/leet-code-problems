val junit_version: String by project

plugins {
    java
    kotlin("jvm") version "1.5.31"
}

group = "org.github.frikit"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
