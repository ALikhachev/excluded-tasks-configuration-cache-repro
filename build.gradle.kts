plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

if (System.getProperty("shouldFail").toBoolean()) {
    gradle.startParameter.excludedTaskNames += listOf(":lib:jar")
}