package com.edu.huce.layer.application.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocGiaDTO {
    @JsonProperty("ma_doc_gia")
    private String maDocGia;

    @JsonProperty("ho_ten")
    private String hoTen;

    @JsonProperty("ngay_sinh")
    private Timestamp ngaySinh;

    @JsonProperty("gioi_tinh")
    private Integer gioiTinh;

    @JsonProperty("email")
    private String email;

    @JsonProperty("dien_thoai")
    private String dienThoai;
}
