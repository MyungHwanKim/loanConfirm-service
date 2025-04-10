plugins {
    kotlin("plugin.jpa")
}

version = "0.0.1"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.6")
    implementation(project(":domain"))
}