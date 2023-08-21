package com.project.ourlog.infrastructure.adapter

import com.project.ourlog.domain.entity.Date
import com.project.ourlog.domain.entity.Member
import com.project.ourlog.domain.entity.Place
import com.project.ourlog.domain.repository.DateRepository
import com.project.ourlog.domain.repository.MemberRepository
import com.project.ourlog.domain.repository.PlaceRepository
import java.util.*

class CalendarAdapter(

) : MemberRepository, DateRepository, PlaceRepository {
    override fun findByMemberIdAndYearAndMonth(memberId: Long, year: Int, month: Int): List<Date> {
        TODO("Not yet implemented")
    }

    override fun findByMemberIdAndYearAndMonthAndDay(memberId: Long, year: Int, month: Int, day: Int): Optional<Date> {
        TODO("Not yet implemented")
    }

    override fun findById(memberId: Long, dateId: Long): Optional<Date> {
        TODO("Not yet implemented")
    }

    override fun save(date: Date): Long {
        TODO("Not yet implemented")
    }

    override fun update(dateId: Long, year: Int, month: Int, day: Int): Date {
        TODO("Not yet implemented")
    }

    override fun save(member: Member): Long {
        TODO("Not yet implemented")
    }

    override fun findById(memberId: Long): Optional<Member> {
        TODO("Not yet implemented")
    }

    override fun save(place: Place): Place {
        TODO("Not yet implemented")
    }

    override fun findByDateIdAndPlaceId(dateId: Long, placeId: Long): Optional<Place> {
        TODO("Not yet implemented")
    }

}