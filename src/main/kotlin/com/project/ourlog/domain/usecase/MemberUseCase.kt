package com.project.ourlog.domain.usecase

import com.project.ourlog.domain.entity.Member
import org.springframework.stereotype.Component

@Component
interface MemberUseCase {
    fun signUp(name: String) : Member
}