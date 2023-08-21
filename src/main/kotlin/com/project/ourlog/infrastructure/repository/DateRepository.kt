package com.project.ourlog.infrastructure.repository

import com.project.ourlog.infrastructure.entity.Date
import org.springframework.data.jpa.repository.JpaRepository

interface DateRepository : JpaRepository<Date, Long> {
}