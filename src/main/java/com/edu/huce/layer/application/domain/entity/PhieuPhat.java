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
@Entity(name = "tbl_phieuphat")
public class PhieuPhat {

    @Id
    @Column(name = "ma_phieu_phat")
    @JsonProperty("ma_phieu_phat")
    private String maPhieuPhat;

    @Column(name = "ma_phieu_muon")
    @JsonProperty("ma_phieu_muon")
    private String maPhieuMuon;

    @Column(name = "ly_do_vp")
    @JsonProperty("ly_do_vp")
    private String lyDoVP;

    @Column(name = "tien_phat")
    @JsonProperty("tien_phat")
    private String tienNhat;

    @Column(name = "ngay_xu_ly")
    @JsonProperty("ngay_xu_ly")
    private Timestamp ngayXuLy;

    @Column(name = "nguoi_xu_ly")
    @JsonProperty("nguoi_xu_ly")
    private String nguoiXuLy;

}
