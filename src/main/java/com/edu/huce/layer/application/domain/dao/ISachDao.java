package com.edu.huce.layer.application.domain.dao;

import com.edu.huce.layer.application.domain.entity.Sach;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISachDao extends JpaRepository<Sach, String> {
}
