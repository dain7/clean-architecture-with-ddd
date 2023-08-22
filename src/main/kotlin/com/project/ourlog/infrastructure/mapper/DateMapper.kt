package com.project.ourlog.infrastructure.mapper

import com.project.ourlog.domain.entity.Date
import com.project.ourlog.infrastructure.entity.DateEntity
import com.project.ourlog.infrastructure.entity.MemberEntity

class DateMapper {
    companion object {

        fun toDomainEntity(dateEntity : DateEntity) : Date {
            return Date(
                    memberId = dateEntity.memberEntity.id!!,
                    year = dateEntity.year,
                    month = dateEntity.month,
                    day = dateEntity.day,
                    name = dateEntity.name,
                    id = dateEntity.id)
        }

        fun toJpaEntity(member: MemberEntity, date : Date) : DateEntity {
            return DateEntity(
                    memberEntity = member,
                    year = date.year,
                    month = date.month,
                    day = date.day,
                    name = date.name,
            )
        }

    }
}