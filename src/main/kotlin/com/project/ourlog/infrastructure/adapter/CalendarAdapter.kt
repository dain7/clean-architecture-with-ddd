package com.project.ourlog.infrastructure.adapter

import com.project.ourlog.domain.entity.Date
import com.project.ourlog.domain.entity.Member
import com.project.ourlog.domain.entity.Place
import com.project.ourlog.domain.repository.DateDomainRepository
import com.project.ourlog.domain.repository.MemberDomainRepository
import com.project.ourlog.domain.repository.PlaceDomainRepository
import com.project.ourlog.infrastructure.mapper.DateMapper
import com.project.ourlog.infrastructure.mapper.MemberMapper
import com.project.ourlog.infrastructure.mapper.PlaceMapper
import com.project.ourlog.infrastructure.repository.DateRepository
import com.project.ourlog.infrastructure.repository.MemberRepository
import com.project.ourlog.infrastructure.repository.PlaceRepository
import org.springframework.stereotype.Component

@Component

class CalendarAdapter(
        private val memberRepository: MemberRepository,
        private val dateRepository: DateRepository,
        private val placeRepository: PlaceRepository,
) : MemberDomainRepository, DateDomainRepository, PlaceDomainRepository {

    // Date
    override fun findAllByMemberIdAndYearAndMonth(memberId: Long, year: Int, month: Int): List<Date> {
        val dateEntitis = dateRepository.findAllByMemberEntityIdAndYearAndMonth(memberId, year, month)
        return dateEntitis.map { dateEntity ->  DateMapper.toDomainEntity(dateEntity) }
    }

    override fun findByMemberIdAndYearAndMonthAndDay(memberId: Long, year: Int, month: Int, day: Int): Date {
        val dateEntity = dateRepository.findByMemberEntityIdAndYearAndMonthAndDay(memberId, year, month, day).orElseThrow()
        return DateMapper.toDomainEntity(dateEntity)
    }

    override fun findById(memberId: Long, dateId: Long): Date {
        val dateEntity = dateRepository.findByMemberEntityIdAndId(memberId, dateId).orElseThrow()
        return DateMapper.toDomainEntity(dateEntity)
    }

    override fun save(date: Date): Date {
        val memberEntity = memberRepository.findById(date.memberId).orElseThrow()
        val newDateEntityFixture = DateMapper.toJpaEntity(memberEntity, date)
        val newDateEntity = dateRepository.save(newDateEntityFixture)
        return DateMapper.toDomainEntity(newDateEntity)
    }

    override fun update(dateId: Long, year: Int, month: Int, day: Int, name: String): Date {
        val dateEntity = dateRepository.findById(dateId).orElseThrow();
        dateEntity.update(year, month, day, name)
        return DateMapper.toDomainEntity(dateEntity)
    }

    // Member
    override fun save(member: Member): Member {
        val newMemberEntityFixture = MemberMapper.toJpaEntity(member)
        val newMemberEntity = memberRepository.save(newMemberEntityFixture)
        return MemberMapper.toDomainEntity(newMemberEntity)
    }

    override fun findById(memberId: Long): Member {
        val memberEntity = memberRepository.findById(memberId).orElseThrow()
        return MemberMapper.toDomainEntity(memberEntity)
    }

    // Place
    override fun save(place: Place): Place {
        val dateEntity = dateRepository.findById(place.dateId).orElseThrow()
        val newPlaceEntityFixture = PlaceMapper.toJpaEntity(dateEntity, place)
        val newPlaceEntity = placeRepository.save(newPlaceEntityFixture)
        return PlaceMapper.toDomainEntity(newPlaceEntity)
    }

    override fun findByDateIdAndPlaceId(dateId: Long, placeId: Long): Place {
        val newPlaceEntity = placeRepository.findByDateEntityIdAndId(dateId, placeId).orElseThrow()
        return PlaceMapper.toDomainEntity(newPlaceEntity)
    }
}