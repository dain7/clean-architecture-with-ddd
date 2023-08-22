package com.project.ourlog.infrastructure.repository

import com.project.ourlog.infrastructure.entity.PlaceEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface PlaceRepository : JpaRepository<PlaceEntity, Long> {
    fun findByDateEntityIdAndId(dateEntityId: Long, placeId: Long) : Optional<PlaceEntity>
}