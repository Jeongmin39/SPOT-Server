package com.spot.spotserver.common.payload;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.OK;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessCode {

    // 200 OK
    GET_SPOT_SUCCESS(OK, "촬영지 조회에 성공하였습니다."),
    LOGIN_SUCCESS(OK, "로그인에 성공하였습니다"),
    REISSUE_TOKEN_SUCCESS(OK, "토큰 재발급에 성공하였습니다."),
    REGISTER_NICKNAME_SUCCESS(OK, "닉네임이 정상적으로 설정되었습니다."),
    UPDATE_NICKNAME_SUCCESS(OK, "닉네임이 정상적으로 변경되었습니다."),
    GET_NICKNAME_SUCCESS(OK, "닉네임이 정상적으로 조회되었습니다."),
    REGISTER_PROFILE_SUCCESS(OK, "프로필 이미지가 정상적으로 설정되었습니다."),
    UPDATE_PROFILE_SUCCESS(OK, "프로필 이미지가 정상적으로 변경되었습니다."),
    REGISTER_COLOR_SUCCESS(OK, "배경색이 정상적으로 설정되었습니다."),
    UPDATE_COLOR_SUCCESS(OK, "배경색이 정상적으로 변경되었습니다."),
    GET_PROFILE_SUCCESS(OK,"프로필이 정상적으로 조회되었습니다."),
    CREATE_RECORD_SUCCESS(OK, "여행 기록이 정상적으로 생성되었습니다."),
    GET_REGIONAL_RECORDS_SUCCESS(OK, "지역별 기록이 정상적으로 조회되었습니다."),
    GET_RECORD_SUCCESS(OK, "여행 기록이 정상적으로 조회되었습니다."),
    UPDATE_RECORD_SUCCESS(OK, "여행 기록이 정상적으로 수정되었습니다."),
    DELETE_RECORD_SUCCESS(OK, "여행 기록이 정상적으로 삭제되었습니다."),
    CREATE_REPRESENTATIVE_IMAGE_SUCCESS(OK, "대표 이미지가 정상적으로 생성되었습니다."),
    GET_REPRESENTATIVE_IMAGE_SUCCESS(OK, "대표 이미지가 정상적으로 조회되었습니다."),
    UPDATE_REPRESENTATIVE_IMAGE_SUCCESS(OK, "대표 이미지가 정상적으로 수정되었습니다."),
    GET_SPOT_DETAIL_SUCCESS(OK, "스팟 상세 정보가 정상적으로 조회되었습니다."),
    GET_SPOT_AROUND_SUCCESS(OK, "스팟 주변 장소 리스트가 정상적으로 조회되었습니다."),
    GET_QUIZ_LIST_SUCCESS(OK, "도전 가능 퀴즈 목록이 정상적으로 조회되었습니다."),
    GET_QUIZ_RESULT_SUCCESS(OK, "퀴즈 정답 확인 결과가 정상적으로 조회되었습니다.");

    private final HttpStatus httpStatus;
    private final String message;

    public int getHTTPStatusCode() {
        return httpStatus.value();
    }
}
