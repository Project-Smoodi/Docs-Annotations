import org.jreleaser.model.Active

plugins {
    id("java")
    id("java-library")
    id("maven-publish")
    id("org.jreleaser") version "1.17.0"
}

group = "org.smoodi.annotation"
version = "1.3.0"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    withJavadocJar()
    withSourcesJar()
}

tasks.named("jreleaserFullRelease") {
    dependsOn("publish")
}

tasks.named("jreleaserDeploy") {
    dependsOn("publish")
}

publishing {

    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

            artifactId = "docs-annotations"

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
            name = "staging"
            url = uri(layout.buildDirectory.dir("staging-deploy").get().asFile.absolutePath) // 로컬 Staging 디렉토리 설정은 동일
        }
    }
}

jreleaser {
    signing {
        active.set(Active.RELEASE)
        armored = true
    }
    deploy {
        maven {
            mavenCentral {
                create("sonatype") {
                    active.set(Active.RELEASE)
                    url.set("https://central.sonatype.com/api/v1/publisher")
                    stagingRepository(layout.buildDirectory.dir("staging-deploy").get().asFile.absolutePath)
                }
            }
            nexus2 {
                create("sonatype-snapshots") {
                    active.set(Active.SNAPSHOT)
                    url.set("https://s01.oss.sonatype.org/content/repositories/snapshots/")
                    snapshotUrl.set("https://s01.oss.sonatype.org/content/repositories/snapshots/")
                    applyMavenCentralRules.set(true)
                }
            }
        }
    }
    release {
        github {
            tagName.set("v{{projectVersion}}")
            releaseName.set("Release v{{projectVersion}}")
            changelog {
                formatted.set(Active.ALWAYS)
                preset.set("conventional-commits")
            }
        }
    }
}