package com.project.ourlog.infrastructure.repository

import com.project.ourlog.infrastructure.entity.MemberEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : JpaRepository<MemberEntity, Long>{
}