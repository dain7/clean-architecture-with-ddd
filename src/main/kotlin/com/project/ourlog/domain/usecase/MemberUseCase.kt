package com.project.ourlog.domain.usecase

import org.springframework.stereotype.Component

@Component
interface MemberUseCase {
    fun signUp(name: String) : Long
}