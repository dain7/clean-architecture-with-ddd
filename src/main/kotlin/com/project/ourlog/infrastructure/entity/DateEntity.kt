package com.project.ourlog.infrastructure.entity

import jakarta.persistence.*
import org.springframework.data.annotation.Id

@Entity
class DateEntity (

        @ManyToOne
        val memberEntity : MemberEntity,

        var year : Int,
        var month : Int,
        var day : Int,
        var name : String,

        @OneToMany(mappedBy = "dateEntity", cascade = [CascadeType.ALL], orphanRemoval = true)
        val placeEntities : MutableList<PlaceEntity> = mutableListOf(),

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id : Long? = null
) {

        fun update(year: Int, month: Int, day: Int, name: String) {
                this.year = year
                this.month = month
                this.day = day
                this.name = name
        }
}