package com.edu.huce.layer.application.service.impl;

import com.edu.huce.layer.application.domain.entity.PhanQuyen;
import com.edu.huce.layer.application.service.IPhanQuyenService;
import com.edu.huce.utility.response.ResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class PhanQuyenService implements IPhanQuyenService {
    @Override
    public PhanQuyen create(PhanQuyen phanQuyen) {
        return null;
    }

    @Override
    public PhanQuyen get(String id) {
        return null;
    }

    @Override
    public PhanQuyen update(PhanQuyen phanQuyen) {
        return null;
    }

    @Override
    public PhanQuyen delete(String id) {
        return null;
    }

    @Override
    public ResultResponse getList(Integer page, Integer limit, String keyword, Integer sort) {
        return null;
    }
}
