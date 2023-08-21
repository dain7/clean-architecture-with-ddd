package com.project.ourlog.domain.repository

import com.project.ourlog.domain.entity.Place
import java.util.Optional

interface PlaceRepository {
    fun save(place : Place) : Place
    fun findByDateIdAndPlaceId(dateId: Long, placeId: Long) : Optional<Place>
}