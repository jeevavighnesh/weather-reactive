package com.aynna.weatherreactive.model

import java.time.LocalDateTime

data class Weather(val city: String,
                   val temperature: Double,
                   val humidity: Double,
                   val timeStamp: LocalDateTime)
