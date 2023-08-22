package com.project.ourlog.domain.service

import com.project.ourlog.domain.entity.Member
import com.project.ourlog.domain.repository.MemberDomainRepository
import com.project.ourlog.domain.usecase.MemberUseCase
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * 유즈 케이스를 구현하는 서비스
 */
@Service
class MemberService (
        private val memberDomainRepository : MemberDomainRepository
) : MemberUseCase {
    /** 회원가입 */
    @Transactional
    override fun signUp(name: String): Member {
        val newMember = Member(name)
        return memberDomainRepository.save(newMember)
    }
}