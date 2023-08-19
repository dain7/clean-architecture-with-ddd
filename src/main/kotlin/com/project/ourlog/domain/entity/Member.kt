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

    fun getDate() {

    }

    fun addDate() {

    }

    fun searchDate() {

    }

    fun getPlace() {

    }

    fun addPlace() {

    }
}