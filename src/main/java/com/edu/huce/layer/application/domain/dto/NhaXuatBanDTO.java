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
public class NhaXuatBanDTO {

    @JsonProperty("ma_nxb")
    private String maNXB;

    @JsonProperty("ten_nxb")
    private String tenNXB;

    @JsonProperty("ghi_chu")
    private String ghiChu;
}
