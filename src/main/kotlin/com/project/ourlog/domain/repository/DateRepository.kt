package com.project.ourlog.domain.repository

import com.project.ourlog.domain.entity.Date

interface DateRepository {
    fun findByMemberIdAndYearAndMonth(memberId : Long, year : Int, month : Int) : List<Date>
}