package com.project.ourlog.domain.entity

import com.project.ourlog.domain.repository.DateRepository
import com.project.ourlog.domain.repository.MemberRepository

class Member (
        private val id : Long? = null,
        private val name : String
){
    private lateinit var memberRepository: MemberRepository
    private lateinit var dateRepository: DateRepository

    fun getCalendar(year: Int, month: Int): List<Date> {
        return dateRepository.findByMemberIdAndYearAndMonth(id!!, year, month)
    }

    fun getDate(dateId: Long): Date {
        return dateRepository.findById(id!!, dateId)
    }

    fun searchDate(year: Int, month: Int, day : Int) : Date {
        return dateRepository.findByMemberIdAndYearAndMonthAndDay(id!!, year, month, day)
    }

    fun addDate(year: Int, month: Int, day : Int, name : String) : Long {
        val newDate = Date(id!!, year, month, day, name)
        return dateRepository.save(newDate)
    }

    fun getPlace() {

    }

    fun addPlace() {

    }
}