package com.project.ourlog.domain.repository

import com.project.ourlog.domain.entity.Place

interface PlaceRepository {
    fun save(place : Place) : Place
}