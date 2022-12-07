package com.edu.huce.layer.application.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NgonNguDTO {

    @JsonProperty("ma_ngon_ngu")
    private String maNgonNgu;

    @JsonProperty("ten_ngon_ngu")
    private String tenNgonNgu;

    @JsonProperty("ghi_chu")
    private String ghiChu;
}
