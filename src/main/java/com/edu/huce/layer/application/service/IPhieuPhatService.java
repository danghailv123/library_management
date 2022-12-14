package com.edu.huce.layer.application.service;

import com.edu.huce.layer.application.domain.entity.PhieuNhap;
import com.edu.huce.layer.application.domain.entity.PhieuPhat;
import com.edu.huce.utility.response.ResultResponse;

public interface IPhieuPhatService {
    PhieuPhat create(PhieuPhat phieuPhat);

    PhieuPhat get(String id);

    PhieuPhat update(PhieuPhat phieuPhat);

    PhieuPhat delete(String id);

    ResultResponse getList(Integer page, Integer limit, String keyword, Integer sort);
}
