# Reproducer for a Gradle bug in excluding tasks with configuration cache

Execute `./gradlew help` twice

It works fine

<hr/>

Execute `./gradlew help -DshouldFail=true` twice

It fails on the first build, but stores configuration entry and then successfully reuses it on the second

The `shouldFail` system property adds `:lib:jar` to `gradle.startParameter.excludedTaskNames`