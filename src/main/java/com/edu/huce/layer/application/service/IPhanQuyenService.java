package com.edu.huce.layer.application.service;

import com.edu.huce.layer.application.domain.entity.PhanQuyen;
import com.edu.huce.utility.response.ResultResponse;

public interface IPhanQuyenService {
    PhanQuyen create(PhanQuyen phanQuyen);

    PhanQuyen get(String id);

    PhanQuyen update(PhanQuyen phanQuyen);

    PhanQuyen delete(String id);

    ResultResponse getList(Integer page, Integer limit, String keyword, Integer sort);
}
