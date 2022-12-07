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
public class NguoiDungDTO {

    @JsonProperty("ma_nguoi_dung")
    private String maNguoiDung;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("password")
    private String password;

    @JsonProperty("ma_quyen")
    private String maQuyen;

    @JsonProperty("ten_quyen")
    private String tenQuyen;
}
