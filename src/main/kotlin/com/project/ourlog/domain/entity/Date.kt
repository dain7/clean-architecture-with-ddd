package com.project.ourlog.domain.entity

import com.project.ourlog.domain.repository.DateRepository

class Date (
        val memberId : Long,
        var year : Int,
        var month : Int,
        var day : Int,
        var name : String,
        val id : Long? = null
) {

    private lateinit var dateRepository: DateRepository

    fun update(year : Int, month: Int, day: Int, name: String) : Date {
        return dateRepository.update(id!!, year, month, day)
    }
}