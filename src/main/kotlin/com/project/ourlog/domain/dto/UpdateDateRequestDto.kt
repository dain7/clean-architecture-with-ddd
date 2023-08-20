package com.project.ourlog.domain.dto

data class UpdateDateRequestDto(
        val year : Int,
        val month : Int,
        val day : Int,
        val name : String
)