package com.project.ourlog.domain.repository

import com.project.ourlog.domain.entity.Member


interface MemberRepository {
    fun save(member : Member) : Long
    fun findById(memberId : Long) : Member
}