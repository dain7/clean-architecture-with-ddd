package com.project.ourlog.web.protocol.request

import com.fasterxml.jackson.annotation.JsonUnwrapped
import com.project.ourlog.domain.dto.AddPlaceRequestDto

data class AddPlaceRequest(
        @JsonUnwrapped
        val request: AddPlaceRequestDto
)
