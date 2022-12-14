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
public class NhaCungCapDTO {

    @JsonProperty("ma_nha_cc")
    private String maNhaCC;

    @JsonProperty("ten_nha_cc")
    private String tenNhaCC;

    @JsonProperty("dia_chi")
    private String diaChi;

    @JsonProperty("dien_thoai")
    private String dienThoai;
}
