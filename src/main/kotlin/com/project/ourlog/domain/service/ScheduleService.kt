package com.project.ourlog.domain.service

import com.project.ourlog.domain.entity.Date
import com.project.ourlog.domain.repository.DateRepository
import com.project.ourlog.domain.repository.MemberRepository
import com.project.ourlog.domain.usecase.ScheduleUseCase

class ScheduleService (
        private val memberRepository: MemberRepository,
        private val dateRepository: DateRepository
) : ScheduleUseCase {
    override fun getCalendar(memberId: Long, year: Int, month: Int) : List<Date> {
        val member = memberRepository.findById(memberId)
        return member.getCalendar(year, month)
    }
}