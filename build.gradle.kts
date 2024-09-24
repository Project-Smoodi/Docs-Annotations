plugins {
    id("java")
    id("maven-publish")
}

group = "org.smoodi.annotation"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

publishing {

    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

            groupId = "org.smoodi.framework"
            artifactId = "docs-annotations"
            version = "1.2.0"

            pom {
                name.set("Docs Annotations")
                description.set("Annotations set library for documentation.")
                url.set("https://github.com/Project-Smoodi")

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }

                developers {
                    developer {
                        id.set("Daybreak312")
                        name.set("Daybreak312")
                        email.set("ty82afg12@gmail.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/Project-Smoodi/Docs-Annotations.git")
                    developerConnection.set("scm:git:ssh://git@github.com:Project-Smoodi/Docs-Annotations.git")
                    url.set("https://github.com/Project-Smoodi/Docs-Annotations")
                }
            }
        }
    }

    repositories {
        maven {
            name = "Docs-Annotations"
            url = uri("https://maven.pkg.github.com/Project-Smoodi/Docs-Annotations")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.token") as String? ?: System.getenv("TOKEN")
            }
        }
    }
}