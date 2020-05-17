plugins {
    java
    eclipse
}

allprojects {
    group = "it.discovery"
}

subprojects {
    apply(plugin = "java")

    java.sourceCompatibility = JavaVersion.VERSION_13
    java.targetCompatibility = JavaVersion.VERSION_13

    repositories {
        jcenter()
    }

    dependencies {
        val springBootVersion: String by project
        implementation(platform("org.springframework.boot:spring-boot-dependencies:$springBootVersion"))

        compileOnly("org.projectlombok:lombok:1.18.12")
        annotationProcessor("org.projectlombok:lombok:1.18.12")
        testCompile("org.springframework.boot:spring-boot-starter-test")
    }

    tasks.test {
        useJUnitPlatform()
    }

}

