package com.project.ourlog.infrastructure.repository

import com.project.ourlog.infrastructure.entity.DateEntity
import com.project.ourlog.infrastructure.mapper.DateMapper
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface DateRepository : JpaRepository<DateEntity, Long> {
    fun findAllByMemberEntityIdAndYearAndMonth(memberId: Long, year: Int, month: Int) : List<DateEntity>
    fun findByMemberEntityIdAndYearAndMonthAndDay(memberId: Long, year: Int, month: Int, day : Int) : Optional<DateEntity>
    fun findByMemberEntityIdAndId(memberId: Long, dateId: Long) : Optional<DateEntity>
}