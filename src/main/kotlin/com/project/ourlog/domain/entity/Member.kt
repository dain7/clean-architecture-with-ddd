package com.project.ourlog.domain.entity

import com.project.ourlog.domain.repository.DateDomainRepository
import com.project.ourlog.domain.repository.PlaceDomainRepository

class Member (
        val name : String,
        val id : Long? = null,
){
    private lateinit var dateDomainRepository: DateDomainRepository
    private lateinit var placeDomainRepository: PlaceDomainRepository

    fun getCalendar(year: Int, month: Int): List<Date> {
        return dateDomainRepository.findAllByMemberIdAndYearAndMonth(id!!, year, month)
    }

    fun getDate(dateId: Long): Date {
        return dateDomainRepository.findById(id!!, dateId)
    }

    fun searchDate(year: Int, month: Int, day : Int) : Date {
        return dateDomainRepository.findByMemberIdAndYearAndMonthAndDay(id!!, year, month, day)
    }

    fun addDate(year: Int, month: Int, day : Int, name : String) : Date {
        val newDate = Date(id!!, year, month, day, name)
        return dateDomainRepository.save(newDate)
    }

    fun getPlace(dateId: Long, placeId: Long) : Place {
        return placeDomainRepository.findByDateIdAndPlaceId(dateId, placeId)
    }

    fun addPlace(dateId : Long, name : String, location : String) : Place {
        val newPlace = Place(dateId, name, location)
        return placeDomainRepository.save(newPlace)
    }
}