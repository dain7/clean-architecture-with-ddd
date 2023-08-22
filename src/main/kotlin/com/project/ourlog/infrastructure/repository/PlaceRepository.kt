package com.project.ourlog.infrastructure.repository

import com.project.ourlog.infrastructure.entity.PlaceEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface PlaceRepository : JpaRepository<PlaceEntity, Long> {
    fun findByDateEntityIdAndId(dateEntityId: Long, placeId: Long) : Optional<PlaceEntity>
}