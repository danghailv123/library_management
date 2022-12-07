package com.edu.huce.layer.application.domain.dao;

import com.edu.huce.layer.application.domain.entity.PhanQuyen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhanQuyenDao extends JpaRepository<PhanQuyen, String> {

    PhanQuyen getPhanQuyenByMaQuyen(String id);
}
