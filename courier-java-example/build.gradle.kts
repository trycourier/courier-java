plugins {
    id("courier.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":courier-java-core"))
    implementation(project(":courier-java-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :courier-java-example:run` to run `Main`
    // Use `./gradlew :courier-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.courier.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
