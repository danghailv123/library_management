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
@Entity(name = "tbl_nhaxuatban")
public class NhaXuatBan {
    @Id
    @Column(name = "ma_nxb")
    private String maNXB;

    @Column(name = "ten_nxb")
    private String tenNXB;

    @Column(name = "ghi_chu")
    private String ghiChu;
}
