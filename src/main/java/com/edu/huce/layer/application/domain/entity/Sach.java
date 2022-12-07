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
@Entity(name = "tbl_sach")
public class Sach {

    @Id
    @Column(name = "ma_sach")
    private String maSach;

    @Column(name = "ten_sach")
    private String tenSach;

    @Column(name = "ma_the_loai")
    private String maTheLoai;

    @Column(name = "ma_tac_gia")
    private String maTacGia;

    @Column(name = "ma_nxb")
    private String maNXB;

    @Column(name = "ma_ngon_ngu")
    private String maNgonNgu;

    @Column(name = "ma_vi_tri")
    private String maViTri;

    @Column(name = "gia_sach")
    private Integer giaSach;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "so_luong_hien_tai")
    private Integer soLuongHienTai;
}
