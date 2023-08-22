package com.project.ourlog.domain.usecase

import com.project.ourlog.domain.entity.Member
import org.springframework.stereotype.Component

/**
 * 시스템이 수행해야 할 비즈니스 유즈케이스 정의
 */
@Component
interface MemberUseCase {
    fun signUp(name: String) : Member
}