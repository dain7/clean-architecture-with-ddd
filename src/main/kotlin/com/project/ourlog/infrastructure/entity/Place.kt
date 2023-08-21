package com.project.ourlog.infrastructure.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.ManyToOne
import org.springframework.data.annotation.Id


@Entity
class Place (
        @ManyToOne
        val date : Date,

        val name : String,
        val location : String,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null
) {
}