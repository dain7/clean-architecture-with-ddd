package com.project.ourlog.web.protocol.request

import org.jetbrains.annotations.NotNull

data class SignUpRequest (
        @NotNull
        val name : String
) {
}