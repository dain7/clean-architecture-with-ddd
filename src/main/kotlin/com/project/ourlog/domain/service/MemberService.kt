package com.project.ourlog.domain.service

import com.project.ourlog.domain.entity.Member
import com.project.ourlog.domain.repository.MemberDomainRepository
import com.project.ourlog.domain.usecase.MemberUseCase

class MemberService (
        private val memberDomainRepository : MemberDomainRepository
) : MemberUseCase {
    override fun signUp(name: String): Member {
        val newMember = Member(name)
        return memberDomainRepository.save(newMember)
    }
}