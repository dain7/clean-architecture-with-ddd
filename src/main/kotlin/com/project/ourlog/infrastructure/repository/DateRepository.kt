package com.project.ourlog.infrastructure.repository

import com.project.ourlog.infrastructure.entity.DateEntity
import com.project.ourlog.infrastructure.mapper.DateMapper
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface DateRepository : JpaRepository<DateEntity, Long> {
    fun findAllByMemberIdAndYearAndMonth(memberId: Long, year: Int, month: Int) : List<DateEntity>
    fun findByMemberIdAndYearAndMonthAndDay(memberId: Long, year: Int, month: Int, day : Int) : Optional<DateEntity>
    fun findByMemberIdAndId(memberId: Long, dateId: Long) : Optional<DateEntity>
}