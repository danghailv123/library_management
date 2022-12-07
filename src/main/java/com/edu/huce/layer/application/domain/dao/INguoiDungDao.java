package com.edu.huce.layer.application.domain.dao;

import com.edu.huce.layer.application.domain.entity.NguoiDung;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INguoiDungDao extends JpaRepository<NguoiDung, String> {
    NguoiDung findNguoiDungByMaNguoiDung(String id);

    Page<NguoiDung> findNguoiDungByUserName(String username, Pageable pageable);
}
