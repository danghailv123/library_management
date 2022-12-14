package com.edu.huce.layer.application.service;

import com.edu.huce.layer.application.domain.entity.PhieuPhat;
import com.edu.huce.layer.application.domain.entity.TacGia;
import com.edu.huce.utility.response.ResultResponse;

public interface ITacGiaService {
    TacGia create(TacGia tacGia);

    TacGia get(String id);

    TacGia update(TacGia tacGia);

    TacGia delete(String id);

    ResultResponse getList(Integer page, Integer limit, String keyword, Integer sort);
}
