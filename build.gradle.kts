plugins {
    kotlin("jvm") version "1.4.0"
    maven
}

group = "ruckustboom"
version = "0.1.0"

repositories {
    mavenCentral()
}


dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")
}

kotlin {
    explicitApi()
}

tasks {
    compileKotlin {
        kotlinOptions {
            useIR = true
        }
    }
    compileTestKotlin {
        kotlinOptions {
            useIR = true
        }
    }
    test {
        useJUnitPlatform()
    }
}
