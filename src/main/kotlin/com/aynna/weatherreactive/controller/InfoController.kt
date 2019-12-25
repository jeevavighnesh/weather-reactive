package com.aynna.weatherreactive.controller

import com.aynna.weatherreactive.model.Weather
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.time.Duration
import java.time.LocalDateTime.now
import java.util.concurrent.ThreadLocalRandom

@RestController
class InfoController {
    @GetMapping(value = ["/weather/{city}"], produces = arrayOf(MediaType.TEXT_EVENT_STREAM_VALUE))
    fun getWeatherDetails(@PathVariable city: String): Flux<Weather> {
        return Flux.interval(Duration.ofSeconds(1)).map { Weather(city, randomTemperature(), randomHumidity(), now()) }
    }

    private fun randomHumidity(): Double {
        return getRandomDoubleInRange(0.0, 100.0)
    }

    private fun randomTemperature(): Double {
        return getRandomDoubleInRange(-100.0, 100.0)
    }

    private fun getRandomDoubleInRange(origin: Double, bound: Double) = ThreadLocalRandom.current().nextDouble(origin, bound)
}