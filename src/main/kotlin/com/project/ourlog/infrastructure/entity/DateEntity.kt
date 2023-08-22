package com.project.ourlog.infrastructure.entity

import jakarta.persistence.*

@Entity
class DateEntity (

        @ManyToOne
        val memberEntity : MemberEntity,

        @Column(name="_year")
        var year : Int,

        @Column(name="_month")
        var month : Int,

        @Column(name="_day")
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