package com.example.exspring.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Request {
    public String getUid() {
        return uid;
    }
    public String getOperationUid() {
        return operationUid;
    }
    public String getSystemTime() {
        return systemTime;
    }
    @NotBlank
    @Size(max = 32)
    private String uid;

    @NotBlank
    @Size(max = 32)
    private String operationUid;
    private String systemName;

    @NotBlank
    private String systemTime;
    private String source;
    private Integer communicationId;
    private Integer templateId;

    @Max(7)
    private Integer productCode;

    @Max(5)
    private Integer smsCode;
}
