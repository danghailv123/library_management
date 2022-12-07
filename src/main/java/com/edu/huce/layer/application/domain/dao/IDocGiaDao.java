package com.edu.huce.layer.application.domain.dao;

import com.edu.huce.layer.application.domain.entity.DocGia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocGiaDao extends JpaRepository<DocGia, String> {
    DocGia getDocGiaByMaDocGia(String maDocGia);

    Page<DocGia> findDocGiaByHoTen(String hoTen, Pageable pageable);
}
