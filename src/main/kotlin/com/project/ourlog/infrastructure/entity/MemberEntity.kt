package com.project.ourlog.infrastructure.entity

import jakarta.persistence.*
import org.springframework.data.annotation.Id

@Entity
class MemberEntity(
        val name : String,

        @OneToMany(mappedBy = "memberEntity", cascade = [CascadeType.ALL], orphanRemoval = true)
        val dateEntities : MutableList<DateEntity> = mutableListOf(),

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
) {
}