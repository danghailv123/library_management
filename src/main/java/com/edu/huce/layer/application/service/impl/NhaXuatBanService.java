package com.edu.huce.layer.application.service.impl;

import com.edu.huce.layer.application.domain.dto.NhaXuatBanDTO;
import com.edu.huce.layer.application.service.INhaXuatBanService;
import com.edu.huce.utility.response.ResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NhaXuatBanService implements INhaXuatBanService {
    @Override
    public NhaXuatBanDTO create(NhaXuatBanDTO nhaXuatBanDTO) {
        return null;
    }

    @Override
    public NhaXuatBanDTO get(String id) {
        return null;
    }

    @Override
    public NhaXuatBanDTO update(NhaXuatBanDTO nhaXuatBanDTO) {
        return null;
    }

    @Override
    public NhaXuatBanDTO delete(String id) {
        return null;
    }

    @Override
    public ResultResponse getList(Integer page, Integer limit, String keyword, Integer sort) {
        return null;
    }
}
