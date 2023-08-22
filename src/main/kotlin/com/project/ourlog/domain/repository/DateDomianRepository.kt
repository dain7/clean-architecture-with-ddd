package com.project.ourlog.domain.repository

import com.project.ourlog.domain.entity.Date
import org.springframework.stereotype.Component

@Component
interface DateDomainRepository {
    fun findAllByMemberIdAndYearAndMonth(memberId : Long, year : Int, month : Int) : List<Date>
    fun findByMemberIdAndYearAndMonthAndDay(memberId : Long, year : Int, month : Int, day : Int) : Date
    fun findById(memberId: Long, dateId: Long) : Date
    fun save(date : Date) : Date
    fun update(dateId: Long, year: Int, month: Int, day: Int, name: String) : Date
}