package com.project.ourlog.domain.service

import com.project.ourlog.domain.entity.Member
import com.project.ourlog.domain.repository.MemberDomainRepository
import com.project.ourlog.domain.usecase.MemberUseCase
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemberService (
        private val memberDomainRepository : MemberDomainRepository
) : MemberUseCase {

    @Transactional
    override fun signUp(name: String): Member {
        val newMember = Member(name)
        return memberDomainRepository.save(newMember)
    }
}