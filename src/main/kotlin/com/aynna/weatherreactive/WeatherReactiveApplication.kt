package com.aynna.weatherreactive

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WeatherReactiveApplication

fun main(args: Array<String>) {
    runApplication<WeatherReactiveApplication>(*args)
}
