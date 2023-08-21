package com.project.ourlog.infrastructure.repository

import com.project.ourlog.infrastructure.entity.Place
import org.springframework.data.jpa.repository.JpaRepository

interface PlaceRepository : JpaRepository<Place, Long> {
}