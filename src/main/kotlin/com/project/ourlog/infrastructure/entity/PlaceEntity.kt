package com.project.ourlog.infrastructure.entity

import jakarta.persistence.*


@Entity
class PlaceEntity (
        @ManyToOne
        val dateEntity : DateEntity,

        var name : String,
        var location : String,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null
) {

        fun update(name: String, location: String) {
                this.name = name
                this.location = location
        }
}