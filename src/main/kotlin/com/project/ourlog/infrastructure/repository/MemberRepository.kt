package com.project.ourlog.infrastructure.repository

import com.project.ourlog.domain.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long>{
}