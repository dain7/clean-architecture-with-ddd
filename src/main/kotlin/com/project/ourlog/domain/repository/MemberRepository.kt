package com.project.ourlog.domain.repository

import com.project.ourlog.domain.entity.Member
import java.util.Optional


interface MemberRepository {
    fun save(member : Member) : Long
    fun findById(memberId : Long) : Optional<Member>
}