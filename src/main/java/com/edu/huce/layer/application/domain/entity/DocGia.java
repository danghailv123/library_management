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

import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity(name = "tbl_docgia")
public class DocGia {
    @Id
    @Column(name = "ma_doc_gia")
    @JsonProperty("ma_doc_gia")
    private String maDocGia;

    @Column(name = "ho_ten")
    @JsonProperty("ho_ten")
    private String hoTen;

    @Column(name = "ngay_sinh")
    @JsonProperty("ngay_sinh")
    private Timestamp ngaySinh;

    @Column(name = "gioi_tinh")
    @JsonProperty("gioi_tinh")
    private Integer gioiTinh;

    @Column(name = "email")
    @JsonProperty("email")
    private String email;

    @Column(name = "dien_thoai")
    @JsonProperty("dien_thoai")
    private String dienThoai;
}
