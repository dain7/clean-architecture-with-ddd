package com.project.ourlog.domain.service

import com.project.ourlog.domain.entity.Member
import com.project.ourlog.domain.repository.MemberRepository
import com.project.ourlog.domain.usecase.MemberUseCase
import com.project.ourlog.utils.fail

class MemberService (
        private val memberRepository : MemberRepository
) : MemberUseCase {
    override fun signUp(name: String): Long {
        val newMember = Member(name)
        if (memberRepository.existMember(newMember)) fail()

        return memberRepository.save(newMember)
    }
}