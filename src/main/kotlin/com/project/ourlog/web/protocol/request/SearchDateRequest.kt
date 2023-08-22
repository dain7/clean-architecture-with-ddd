package com.project.ourlog.web.protocol.request

import com.fasterxml.jackson.annotation.JsonUnwrapped
import com.project.ourlog.domain.dto.SearchDateRequestDto

data class SearchDateRequest (
        @JsonUnwrapped
        val request: SearchDateRequestDto
)