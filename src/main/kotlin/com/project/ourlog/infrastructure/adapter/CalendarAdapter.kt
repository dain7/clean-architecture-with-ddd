package com.project.ourlog.infrastructure.adapter

import com.project.ourlog.domain.entity.Date
import com.project.ourlog.domain.entity.Member
import com.project.ourlog.domain.repository.DateRepository
import com.project.ourlog.domain.repository.MemberRepository
import com.project.ourlog.domain.repository.PlaceRepository

class CalendarAdapter(

) : MemberRepository, DateRepository, PlaceRepository {
    override fun save(member: Member): Long {
        TODO("Not yet implemented")
    }

    override fun findById(memberId: Long): Member {
        TODO("Not yet implemented")
    }

    override fun findByMemberIdAndYearAndMonth(memberId: Long, year: Int, month: Int): List<Date> {
        TODO("Not yet implemented")
    }
}