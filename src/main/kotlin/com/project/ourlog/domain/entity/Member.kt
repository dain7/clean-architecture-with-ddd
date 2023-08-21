package com.project.ourlog.domain.entity

import com.project.ourlog.domain.repository.DateRepository
import com.project.ourlog.domain.repository.MemberRepository
import com.project.ourlog.domain.repository.PlaceRepository

class Member (
        private val name : String,
        private val id : Long? = null,
){
    private lateinit var memberRepository: MemberRepository
    private lateinit var dateRepository: DateRepository
    private lateinit var placeRepository: PlaceRepository

    fun getCalendar(year: Int, month: Int): List<Date> {
        return dateRepository.findByMemberIdAndYearAndMonth(id!!, year, month)
    }

    fun getDate(dateId: Long): Date {
        return dateRepository.findById(id!!, dateId).orElseThrow()
    }

    fun searchDate(year: Int, month: Int, day : Int) : Date {
        return dateRepository.findByMemberIdAndYearAndMonthAndDay(id!!, year, month, day).orElseThrow()
    }

    fun addDate(year: Int, month: Int, day : Int, name : String) : Long {
        val newDate = Date(id!!, year, month, day, name)
        return dateRepository.save(newDate)
    }

    fun getPlace(dateId: Long, placeId: Long) : Place {
        return placeRepository.findByDateIdAndPlaceId(dateId, placeId).orElseThrow()
    }

    fun addPlace(dateId : Long, name : String, location : String) : Place {
        val newPlace = Place(dateId, name, location)
        return placeRepository.save(newPlace)
    }
}