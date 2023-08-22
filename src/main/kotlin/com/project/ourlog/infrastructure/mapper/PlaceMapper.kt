package com.project.ourlog.infrastructure.mapper

import com.project.ourlog.domain.entity.Place
import com.project.ourlog.infrastructure.entity.DateEntity
import com.project.ourlog.infrastructure.entity.PlaceEntity

class PlaceMapper {
    companion object {
        fun toDomainEntity(placeEntity: PlaceEntity) : Place{
            return Place(
                    dateId = placeEntity.dateEntity.id!!,
                    name = placeEntity.name,
                    location = placeEntity.location,
                    id = placeEntity.id
            )
        }

        fun toJpaEntity(dateEntity: DateEntity, place: Place) : PlaceEntity {
            return PlaceEntity(
                    dateEntity = dateEntity,
                    name = place.name,
                    location = place.location,
                    id = place.id
            )
        }
    }
}