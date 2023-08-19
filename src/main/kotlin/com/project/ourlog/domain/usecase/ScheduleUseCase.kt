package com.project.ourlog.domain.usecase

import org.springframework.stereotype.Component

@Component
interface ScheduleUseCase {
    fun getCalendar(memberId: Long, year: Int, month: Int): List<Calendar>
}