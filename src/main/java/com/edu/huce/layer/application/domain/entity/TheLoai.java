package com.edu.huce.layer.application.domain.entity;


import ch.qos.logback.core.model.NamedModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@Entity(name = "tbl_theloai")
public class TheLoai {
    @Id
    @Column(name = "ma_the_loai")
    @JsonProperty("ma_the_loai")
    private Integer maTheLoai;

    @Column(name = "ten_the_loai")
    @JsonProperty("ten_the_loai")
    private String tenTheLoai;

    @Column(name = "ghi_chu")
    @JsonProperty("ghi_chu")
    private String ghiChu;
}
