package com.rkgy.tokenintrospectionsample.Exception

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
class RequestExceptionHandler : ResponseEntityExceptionHandler() {
    /**
     * BadRequestExceptionのハンドラー
     */
    @ExceptionHandler(BadRequestException::class)
    fun getException(req: HttpServletRequest, error: BadRequestException): ResponseEntity<ErrorResponse> {
        return ErrorResponse.createResponse(error)
    }
}
