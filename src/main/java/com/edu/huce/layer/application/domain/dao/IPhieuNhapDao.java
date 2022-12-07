package com.edu.huce.layer.application.domain.dao;

import com.edu.huce.layer.application.domain.entity.PhieuNhap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhieuNhapDao extends JpaRepository<PhieuNhap,String> {
}
