package com.project.ourlog.domain.service

import com.project.ourlog.domain.repository.MemberDomainRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.any
import org.mockito.kotlin.times
import org.mockito.kotlin.verify

@ExtendWith(MockitoExtension::class)
class MemberServiceTest {

    @Mock
    lateinit var memberDomainRepository : MemberDomainRepository

    @InjectMocks
    lateinit var memberService: MemberService

    @Test
    @DisplayName("회원 가입 : 성공")
    fun signUp() {
        // given
        val name = "김철수"

        // when
        memberService.signUp(name)

        // then
        verify(memberDomainRepository, times(1)).save(any())
    }
}