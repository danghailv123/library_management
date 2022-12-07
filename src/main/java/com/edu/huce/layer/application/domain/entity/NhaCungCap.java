package com.edu.huce.layer.application.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity(name = "tbl_nhacungcap")
public class NhaCungCap {

    @Id
    @Column(name = "ma_nha_cc")
    private String maNhaCC;

    @Column(name = "ten_nha_cc")
    private String tenNhaCC;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "dien_thoai")
    private String dienThoai;
}
