package com.edu.huce.layer.application.domain.dao;

import com.edu.huce.layer.application.domain.entity.NhaCungCap;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INhaCungCapDao extends JpaRepository<NhaCungCap, String> {

    NhaCungCap getNhaCungCapByMaNhaCC(String id);

    Page<NhaCungCap> findNhaCungCapByTenNhaCC(String ten, Pageable pageable);

}
