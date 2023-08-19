package com.project.ourlog.domain.repository

import com.project.ourlog.domain.entity.Date

interface DateRepository {
    fun findByMemberIdAndYearAndMonth(memberId : Long, year : Int, month : Int) : List<Date>
    fun findByMemberIdAndYearAndMonthAndDay(memberId : Long, year : Int, month : Int, day : Int) : Date
}