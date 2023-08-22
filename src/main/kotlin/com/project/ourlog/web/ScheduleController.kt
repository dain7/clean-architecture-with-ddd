package com.project.ourlog.web

import com.project.ourlog.domain.dto.AddDateRequestDto
import com.project.ourlog.domain.usecase.MemberUseCase
import com.project.ourlog.domain.usecase.ScheduleUseCase
import com.project.ourlog.utils.Status
import com.project.ourlog.web.protocol.request.*
import com.project.ourlog.web.protocol.response.*
import org.springframework.web.bind.annotation.*

/**
 * 컨트롤러 정의
 */
@RestController
class ScheduleController(
        private val scheduleUseCase: ScheduleUseCase,
        private val memberUseCase: MemberUseCase,
) {

    @PostMapping("/api/sign-up")
    fun signUp(
            @RequestBody signUpRequest: SignUpRequest
    ) : CommonResponse<SignUpResponse> {
        val member = memberUseCase.signUp(signUpRequest.name)
        val data = SignUpResponse(member.id!!, member.name)
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

    @GetMapping("/api/member/{member_id}/date/{date_Id}")
    fun getDate(
            @PathVariable("member_id") memberId: Long,
            @PathVariable("date_id") dateId: Long,
    ) : CommonResponse<GetDateResponse> {
        val date = scheduleUseCase.getDate(memberId, dateId)
        val data = GetDateResponse(date)
        return CommonResponse(Status.SUCCESS, data)
    }

    @PostMapping("/api/member/{member_id}/date/search")
    fun searchDate(
            @PathVariable("member_id") memberId: Long,
            @RequestBody searchDateRequest: SearchDateRequest
    ) : CommonResponse<SearchDateResponse> {
        val date = scheduleUseCase.searchDate(memberId, searchDateRequest.request)
        val data = SearchDateResponse(date)
        return CommonResponse(Status.SUCCESS, data)
    }

    @PostMapping("/api/member/{member_id}/date")
    fun addDate(
            @PathVariable("member_id") memberId: Long,
            @RequestBody addDateRequest: AddDateRequest
    ) : CommonResponse<AddDateResponse> {
        val date = scheduleUseCase.addDate(memberId, addDateRequest.request)
        val data = AddDateResponse(date)
        return CommonResponse(Status.SUCCESS, data)
    }

    @PutMapping("/api/member/{member_id}/date/{date_id}")
    fun updateDate(
            @PathVariable("member_id") memberId: Long,
            @PathVariable("date_id") dateId: Long,
            @RequestBody updateDateRequest: UpdateDateRequest
    ) : CommonResponse<UpdateDateResponse> {
        val date = scheduleUseCase.updateDate(memberId, dateId, updateDateRequest.request)
        val data = UpdateDateResponse(date)
        return CommonResponse(Status.SUCCESS, data)
    }

    @PostMapping("/api/member/{member_id}/date/{date_id}/place")
    fun addPlace(
            @PathVariable("member_id") memberId: Long,
            @PathVariable("date_id") dateId: Long,
            @RequestBody addPlaceRequest: AddPlaceRequest
    ) : CommonResponse<AddPlaceResponse> {
        val place = scheduleUseCase.addPlace(memberId, dateId, addPlaceRequest.request)
        val data = AddPlaceResponse(place)
        return CommonResponse(Status.SUCCESS, data)
    }

    @GetMapping("/api/member/{member_id}/date/{date_id}/place/{place_id}")
    fun getPlace(
            @PathVariable("member_id") memberId: Long,
            @PathVariable("date_id") dateId: Long,
            @PathVariable("place_id") placeId: Long,
    ) : CommonResponse<GetPlaceResponse> {
        val place = scheduleUseCase.getPlace(memberId, dateId, placeId)
        val data = GetPlaceResponse(place)
        return CommonResponse(Status.SUCCESS, data)
    }
}