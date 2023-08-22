package com.project.ourlog.domain.repository

import com.project.ourlog.domain.entity.Member
import org.springframework.stereotype.Component
import java.util.Optional


@Component
interface MemberDomainRepository {
    fun save(member : Member) : Member
    fun findById(memberId : Long) : Member
}