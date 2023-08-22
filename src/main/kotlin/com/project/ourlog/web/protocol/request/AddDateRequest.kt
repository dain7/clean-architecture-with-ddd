package com.project.ourlog.web.protocol.request

import com.fasterxml.jackson.annotation.JsonUnwrapped
import com.project.ourlog.domain.dto.AddDateRequestDto

data class AddDateRequest(
        @JsonUnwrapped
        val request: AddDateRequestDto
)
