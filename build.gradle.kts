repositories {
    mavenCentral()
}

plugins {
    java
    idea
}

val wiremockStandaloneVersion = "2.24.1"

dependencies {
    testImplementation("com.github.tomakehurst:wiremock-standalone:$wiremockStandaloneVersion")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
