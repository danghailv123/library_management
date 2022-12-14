package com.edu.huce.layer.application.domain.dao;

import com.edu.huce.layer.application.domain.entity.NgonNgu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INgonNguDao extends JpaRepository<NgonNgu, String> {

    NgonNgu getNgonNguByMaNgonNgu(String id);


    Page<NgonNgu> findNgonNguByTenNgonNgu(String ten, Pageable pageable);
}
