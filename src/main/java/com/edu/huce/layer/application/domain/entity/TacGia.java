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
@Entity(name = "tbl_tacgia")
public class TacGia {
    @Id
    @Column(name = "ma_tac_gia")
    private String maTacGia;

    @Column(name = "ten_tac_gia")
    private String tenTacGia;

    @Column(name = "ghi_chu")
    private String ghiChu;
}
