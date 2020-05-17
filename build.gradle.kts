plugins {
    java
    eclipse
}

allprojects {
    group = "it.discovery"
}

subprojects {
    apply(plugin = "java")

    java.sourceCompatibility = JavaVersion.VERSION_14
    java.targetCompatibility = JavaVersion.VERSION_14

    repositories {
        jcenter()
    }

    dependencies {
        val springBootVersion: String by project
        implementation(platform("org.springframework.boot:spring-boot-dependencies:$springBootVersion"))

        compileOnly("org.projectlombok:lombok:1.18.12")
        annotationProcessor("org.projectlombok:lombok:1.18.12")
    }
}

