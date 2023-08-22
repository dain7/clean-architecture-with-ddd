package com.project.ourlog.web.protocol.response

import com.project.ourlog.utils.Status
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.*

data class CommonResponse<T>(
        var status : Status,
        var data : T
) {
}