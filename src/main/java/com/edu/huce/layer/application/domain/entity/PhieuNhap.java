package com.edu.huce.layer.application.domain.entity;


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
@Entity(name = "tbl_phieunhap")
public class PhieuNhap {
    @Id
    @Column(name = "ma_phieu_nhp")
    @JsonProperty("")
    private String maPhieuNhp;

    @Column(name = "ma_sach")
    @JsonProperty("ma_sach")
    private String maSach;

    @Column(name = "ma_ncc")
    @JsonProperty("ma_ncc")
    private String maNCC;

    @Column(name = "nguoi_nhap")
    @JsonProperty("nguoi_nhap")
    private String nguoiNhap;

    @Column(name = "ngay_nhap")
    @JsonProperty("ngay_nhap")
    private Timestamp ngayNhap;

    @Column(name = "so_luong")
    @JsonProperty("so_luong")
    private Integer soLuong;
}
