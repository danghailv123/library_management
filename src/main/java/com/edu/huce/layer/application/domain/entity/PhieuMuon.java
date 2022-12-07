package com.edu.huce.layer.application.domain.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
@Entity(name = "tbl_phanquyen")
public class PhieuMuon {

    @Id
    @Column(name = "ma_phieu_muon")
    private String maPhieuMuon;

    @Column(name = "ma_doc_gia")
    private String maDocGia;

    @Column(name = "ma_sach")
    private String maSach;

    @Column(name = "ngay_muon")
    private Timestamp ngayMuon;

    @Column(name = "han_tra")
    private Timestamp hanTra;

    @Column(name = "ngay_tra")
    private Timestamp ngayTra;
}
