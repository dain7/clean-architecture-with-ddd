package com.project.ourlog.domain.service

import com.project.ourlog.domain.repository.DateDomainRepository
import com.project.ourlog.domain.repository.MemberDomainRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class ScheduleServiceTest {

    @Mock
    lateinit var memberDomainRepository: MemberDomainRepository

    @Mock
    lateinit var dateDomainRepository: DateDomainRepository

    @InjectMocks
    lateinit var scheduleService: ScheduleService

    @Test
    @DisplayName("달력 조회 : 성공")
    fun getCalendar() {
        // given
        val memberId = 1L
        val year = 2023
        val month = 8

        // when
        val calendar = scheduleService.getCalendar(memberId, year, month)

        // then

    }
}