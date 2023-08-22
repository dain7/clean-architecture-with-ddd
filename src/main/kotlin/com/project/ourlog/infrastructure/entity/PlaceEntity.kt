package com.project.ourlog.infrastructure.entity

import jakarta.persistence.*


@Entity
class PlaceEntity (
        @ManyToOne
        val dateEntity : DateEntity,

        val name : String,
        val location : String,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null
) {
}