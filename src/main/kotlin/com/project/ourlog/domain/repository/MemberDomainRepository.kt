package com.project.ourlog.domain.repository

import com.project.ourlog.domain.entity.Member
import java.util.Optional


interface MemberDomainRepository {
    fun save(member : Member) : Member
    fun findById(memberId : Long) : Member
}