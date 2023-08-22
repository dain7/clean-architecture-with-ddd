package com.project.ourlog.domain.entity

import com.project.ourlog.domain.repository.DateDomianRepository
import com.project.ourlog.domain.repository.PlaceDomainRepository

class Member (
        val name : String,
        val id : Long? = null,
){
    private lateinit var dateDomianRepository: DateDomianRepository
    private lateinit var placeDomainRepository: PlaceDomainRepository

    fun getCalendar(year: Int, month: Int): List<Date> {
        return dateDomianRepository.findAllByMemberIdAndYearAndMonth(id!!, year, month)
    }

    fun getDate(dateId: Long): Date {
        return dateDomianRepository.findById(id!!, dateId)
    }

    fun searchDate(year: Int, month: Int, day : Int) : Date {
        return dateDomianRepository.findByMemberIdAndYearAndMonthAndDay(id!!, year, month, day)
    }

    fun addDate(year: Int, month: Int, day : Int, name : String) : Date {
        val newDate = Date(id!!, year, month, day, name)
        return dateDomianRepository.save(newDate)
    }

    fun getPlace(dateId: Long, placeId: Long) : Place {
        return placeDomainRepository.findByDateIdAndPlaceId(dateId, placeId).orElseThrow()
    }

    fun addPlace(dateId : Long, name : String, location : String) : Place {
        val newPlace = Place(dateId, name, location)
        return placeDomainRepository.save(newPlace)
    }
}