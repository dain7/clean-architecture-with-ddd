package com.project.ourlog.domain.entity

import com.project.ourlog.domain.repository.DateDomianRepository

class Date (
        val memberId : Long,
        var year : Int,
        var month : Int,
        var day : Int,
        var name : String,
        val id : Long? = null
) {

    private lateinit var dateDomianRepository: DateDomianRepository

    fun update(year : Int, month: Int, day: Int, name: String) : Date {
        return dateDomianRepository.update(id!!, year, month, day, name)
    }
}