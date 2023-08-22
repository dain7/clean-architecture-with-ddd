package com.project.ourlog.domain.repository

import com.project.ourlog.domain.entity.Place
import org.springframework.stereotype.Component

/**
 * Repository가 수행해야 할 기능
 */
@Component
interface PlaceDomainRepository {
    fun save(place : Place) : Place
    fun findByDateIdAndPlaceId(dateId: Long, placeId: Long) : Place
}