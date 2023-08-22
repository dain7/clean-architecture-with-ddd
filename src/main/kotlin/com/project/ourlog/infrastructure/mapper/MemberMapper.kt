package com.project.ourlog.infrastructure.mapper

import com.project.ourlog.domain.entity.Member
import com.project.ourlog.infrastructure.entity.MemberEntity

class MemberMapper {

    companion object {
        fun toDomainEntity(memberEntity: MemberEntity) : Member {
            return Member(
                    id = memberEntity.id,
                    name = memberEntity.name
            )
        }

        fun toJpaEntity(member: Member) : MemberEntity {
            return MemberEntity(
                    id = member.id,
                    name = member.name
            )
        }
    }
}