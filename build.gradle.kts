repositories {
    mavenCentral()
}

plugins {
    java
    idea
}

val wiremockStandaloneVersion = "2.23.2"

dependencies {
    testImplementation("com.github.tomakehurst:wiremock-standalone:$wiremockStandaloneVersion")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
