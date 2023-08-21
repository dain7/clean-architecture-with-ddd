package com.project.ourlog.domain.repository

import com.project.ourlog.domain.entity.Date
import java.util.Optional

interface DateRepository {
    fun findByMemberIdAndYearAndMonth(memberId : Long, year : Int, month : Int) : List<Date>
    fun findByMemberIdAndYearAndMonthAndDay(memberId : Long, year : Int, month : Int, day : Int) : Optional<Date>
    fun findById(memberId: Long, dateId: Long) : Optional<Date>
    fun save(date : Date) : Long
    fun update(dateId: Long, year : Int, month : Int, day : Int) : Date
}