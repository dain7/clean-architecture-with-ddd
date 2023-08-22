package com.project.ourlog.domain.service

import com.project.ourlog.domain.dto.AddDateRequestDto
import com.project.ourlog.domain.dto.AddPlaceRequestDto
import com.project.ourlog.domain.dto.SearchDateRequestDto
import com.project.ourlog.domain.dto.UpdateDateRequestDto
import com.project.ourlog.domain.entity.Date
import com.project.ourlog.domain.entity.Place
import com.project.ourlog.domain.repository.DateDomainRepository
import com.project.ourlog.domain.repository.MemberDomainRepository
import com.project.ourlog.domain.usecase.ScheduleUseCase
import org.springframework.stereotype.Service

@Service
class ScheduleService (
        private val memberDomainRepository: MemberDomainRepository,
        private val dateDomainRepository: DateDomainRepository
) : ScheduleUseCase {
    override fun getCalendar(memberId: Long, year: Int, month: Int) : List<Date> {
        val member = memberDomainRepository.findById(memberId)
        return member.getCalendar(year, month)
    }

    override fun getDate(memberId: Long, dateId: Long) : Date {
        val member = memberDomainRepository.findById(memberId)
        return member.getDate(dateId)
    }

    override fun searchDate(memberId: Long, requestDto: SearchDateRequestDto): Date {
        val member = memberDomainRepository.findById(memberId)
        return member.searchDate(requestDto.year, requestDto.month, requestDto.day)
    }

    override fun addDate(memberId: Long, request: AddDateRequestDto) : Date {
        val member = memberDomainRepository.findById(memberId)
        return member.addDate(request.year, request.month, request.day, request.name)
    }

    override fun updateDate(memberId: Long, dateId: Long, request: UpdateDateRequestDto) : Date {
        memberDomainRepository.findById(memberId)
        val date = dateDomainRepository.findById(memberId, dateId)
        return date.update(request.year, request.month, request.day, request.name)
    }

    override fun addPlace(memberId: Long, dateId: Long, request: AddPlaceRequestDto): Place {
        val member = memberDomainRepository.findById(memberId)
        val date = dateDomainRepository.findById(memberId, dateId)
        return member.addPlace(date.id!!, request.name, request.location)
    }

    override fun getPlace(memberId: Long, dateId: Long, placeId: Long): Place {
        val member = memberDomainRepository.findById(memberId)
        val date = dateDomainRepository.findById(memberId, dateId)
        return member.getPlace(date.id!!, placeId)
    }
}