package com.project.ourlog.infrastructure.entity

import jakarta.persistence.*
import org.springframework.data.annotation.Id

@Entity
class Member(
        val name : String,

        @OneToMany(mappedBy = "member", cascade = [CascadeType.ALL], orphanRemoval = true)
        val dates : MutableList<Date> = mutableListOf(),

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
) {
}