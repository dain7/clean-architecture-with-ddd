package com.project.ourlog.domain.usecase

import com.project.ourlog.domain.dto.AddDateRequestDto
import com.project.ourlog.domain.dto.UpdateDateRequestDto
import com.project.ourlog.domain.entity.Date
import org.springframework.stereotype.Component

@Component
interface ScheduleUseCase {
    fun getCalendar(memberId: Long, year: Int, month: Int): List<Date>
    fun getDate(memberId: Long, dateId: Long) : Date
    fun searchDate(memberId: Long, year: Int, month: Int, day : Int) : Date
    fun addDate(memberId : Long, request : AddDateRequestDto): Long
    fun updateDate(memberId: Long, dateId: Long, request : UpdateDateRequestDto) : Date
}