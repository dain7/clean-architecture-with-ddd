package com.project.ourlog.domain.repository

import com.project.ourlog.domain.entity.Member
import org.springframework.stereotype.Component
import java.util.Optional

/**
 * Repository가 수행해야 할 기능
 */
@Component
interface MemberDomainRepository {
    fun save(member : Member) : Member
    fun findById(memberId : Long) : Member
}