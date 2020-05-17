dependencies {
    val hibernateVersion: String by project
    val springBootVersion: String by project
    compile("org.hibernate:hibernate-jcache:$hibernateVersion")
    runtime("org.ehcache:ehcache:3.8.1")
    compile("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")
    runtime("com.h2database:h2:1.4.199")
    runtime("mysql:mysql-connector-java:8.0.20")
    runtime("org.postgresql:postgresql:42.2.12")
}

