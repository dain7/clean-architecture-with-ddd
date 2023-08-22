package com.project.ourlog.domain.entity

import com.project.ourlog.domain.repository.DateDomainRepository
import com.project.ourlog.domain.repository.PlaceDomainRepository

class Member (
        val name : String,
        val id : Long? = null,
){
    private lateinit var dateDomainRepository: DateDomainRepository
    private lateinit var placeDomainRepository: PlaceDomainRepository

    /** 멤버는 자신의 달력을 조회한다. */
    fun getCalendar(year: Int, month: Int): List<Date> {
        return dateDomainRepository.findAllByMemberIdAndYearAndMonth(id!!, year, month)
    }

    /** 멤버는 자신의 일정을 조회한다. */
    fun getDate(dateId: Long): Date {
        return dateDomainRepository.findById(id!!, dateId)
    }

    /** 멤버는 자신의 일정을 검색한다. */
    fun searchDate(year: Int, month: Int, day : Int) : Date {
        return dateDomainRepository.findByMemberIdAndYearAndMonthAndDay(id!!, year, month, day)
    }

    /** 멤버는 자신의 일정을 추가한다. */
    fun addDate(year: Int, month: Int, day : Int, name : String) : Date {
        val newDate = Date(id!!, year, month, day, name)
        return dateDomainRepository.save(newDate)
    }

    /** 멤버는 자신이 등록한 장소를 조회한다. */
    fun getPlace(dateId: Long, placeId: Long) : Place {
        return placeDomainRepository.findByDateIdAndPlaceId(dateId, placeId)
    }

    /** 멤버는 장소를 추가한다. */
    fun addPlace(dateId : Long, name : String, location : String) : Place {
        val newPlace = Place(dateId, name, location)
        return placeDomainRepository.save(newPlace)
    }
}