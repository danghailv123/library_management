package com.edu.huce.layer.application.domain.dao;

import com.edu.huce.layer.application.domain.entity.TheLoai;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITheLoaiDao extends JpaRepository<TheLoai, Integer> {
}
