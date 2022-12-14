package com.edu.huce.layer.application.service;

import com.edu.huce.layer.application.domain.entity.PhieuNhap;
import com.edu.huce.utility.response.ResultResponse;

public interface IPhieuNhapService {
    PhieuNhap create(PhieuNhap phieuNhap);

    PhieuNhap get(String id);

    PhieuNhap update(PhieuNhap phieuNhap);

    PhieuNhap delete(String id);

    ResultResponse getList(Integer page, Integer limit, String keyword, Integer sort);
}
