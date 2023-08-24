package com.project.ourlog.domain.entity

import com.project.ourlog.domain.repository.PlaceDomainRepository

class Place (
        val dateId : Long,
        var name : String,
        var location : String,
        val id : Long? = null,
) {

    private lateinit var placeDomainRepository: PlaceDomainRepository

    fun update(name : String, location: String) : Place {
        return placeDomainRepository.update(id!!, name, location)
    }
}