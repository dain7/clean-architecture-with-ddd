package com.project.ourlog.infrastructure.entity

import jakarta.persistence.*
import org.springframework.data.annotation.Id

@Entity
class Date (

        @ManyToOne
        val member : Member,

        var year : Int,
        var month : Int,
        var day : Int,
        var name : String,

        @OneToMany(mappedBy = "date", cascade = [CascadeType.ALL], orphanRemoval = true)
        val places : MutableList<Place> = mutableListOf(),

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id : Long? = null
) {

}