import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dependency.management)
}

java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

springBoot {
    buildInfo()
}

dependencies {

    // Spring Boot
    implementation(libs.spring.boot.starter.main)
    implementation(libs.spring.boot.starter.jpa)
    implementation(libs.spring.boot.starter.web)
    implementation(libs.spring.boot.starter.validation)

    // Liquibase
    implementation(libs.liquibase.core)

    // PostgreSQL
    runtimeOnly(libs.postgresql)

    // Keycloak
    implementation(libs.keyckoak.admin.client)

    // Kafka
    implementation(libs.spring.kafka)

    // MapStruct
    implementation(libs.mapstruct.core)
    kapt(libs.mapstruct.processor)

    // MapStruct Annotation Processor
    annotationProcessor(libs.mapstruct.processor)

    // Testing
    testImplementation(libs.spring.boot.starter.test)
    testImplementation(libs.spring.mockk)
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
