package com.project.ourlog.web

import com.project.ourlog.domain.usecase.MemberUseCase
import com.project.ourlog.domain.usecase.ScheduleUseCase
import com.project.ourlog.utils.Status
import com.project.ourlog.web.protocol.request.SignUpRequest
import com.project.ourlog.web.protocol.response.CommonResponse
import com.project.ourlog.web.protocol.response.GetCalendarResponse
import com.project.ourlog.web.protocol.response.SignUpResponse
import org.springframework.web.bind.annotation.*

@RestController
class ScheduleController(
        private val scheduleUseCase: ScheduleUseCase,
        private val memberUseCase: MemberUseCase,
) {

    @PostMapping("/api/sign-up")
    fun signUp(
            @RequestBody signUpRequest: SignUpRequest
    ) : CommonResponse<SignUpResponse> {
        val memberId = memberUseCase.signUp(signUpRequest.name)
        val data = SignUpResponse(memberId)
        return CommonResponse(Status.SUCCESS, data)
    }

    @GetMapping("/api/member/{member_id}/calendar")
    fun getCalendar(
            @PathVariable("member_id") memberId: Long,
            @RequestParam("year") year: Int,
            @RequestParam("month") month: Int,
    ) : CommonResponse<GetCalendarResponse> {
        val calendar = scheduleUseCase.getCalendar(memberId, year, month)
        val data = GetCalendarResponse(calendar)
        return CommonResponse(Status.SUCCESS, data)
    }
}