# Reactive Weather Application

This is a reactive weather application used to demo the reactive powers of web applications using the following frameworks and languages:
- Kotlin
- Spring Boot
    - Spring Reactive Web
- Gradle

This currently is a gradle project which can be imported and used accordingly using the gradle commands. This is developed in Java 11.

It has one end point /weather/{cityName} where {cityName} is a string route param which can be used to check reactive requests. It is achieved using the Flux response from kotlin.