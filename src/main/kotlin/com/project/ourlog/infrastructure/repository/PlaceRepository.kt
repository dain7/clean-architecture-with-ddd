package com.project.ourlog.infrastructure.repository

import com.project.ourlog.infrastructure.entity.PlaceEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PlaceRepository : JpaRepository<PlaceEntity, Long> {
}