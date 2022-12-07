package com.edu.huce.layer.application.domain.dao;

import com.edu.huce.layer.application.domain.entity.TacGia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITacGiaDao extends JpaRepository<TacGia,String> {
}
