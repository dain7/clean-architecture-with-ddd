package com.project.ourlog.web.protocol.request

import com.fasterxml.jackson.annotation.JsonUnwrapped
import com.project.ourlog.domain.dto.UpdateDateRequestDto

data class UpdateDateRequest(
        @JsonUnwrapped
        val request: UpdateDateRequestDto
)
