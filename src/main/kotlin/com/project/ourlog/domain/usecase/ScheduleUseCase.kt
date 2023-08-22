package com.project.ourlog.domain.usecase

import com.project.ourlog.domain.dto.AddDateRequestDto
import com.project.ourlog.domain.dto.AddPlaceRequestDto
import com.project.ourlog.domain.dto.SearchDateRequestDto
import com.project.ourlog.domain.dto.UpdateDateRequestDto
import com.project.ourlog.domain.entity.Date
import com.project.ourlog.domain.entity.Place
import org.springframework.stereotype.Component

@Component
interface ScheduleUseCase {
    fun getCalendar(memberId: Long, year: Int, month: Int): List<Date>
    fun getDate(memberId: Long, dateId: Long) : Date
    fun searchDate(memberId: Long, requestDto: SearchDateRequestDto) : Date
    fun addDate(memberId : Long, request : AddDateRequestDto): Date
    fun updateDate(memberId: Long, dateId: Long, request : UpdateDateRequestDto) : Date
    fun addPlace(memberId: Long, dateId : Long, request : AddPlaceRequestDto) : Place
    fun getPlace(memberId : Long, dateId: Long, placeId: Long) : Place
}