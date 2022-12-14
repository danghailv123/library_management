package com.edu.huce.layer.application.service;

import com.edu.huce.layer.application.domain.dto.NhaXuatBanDTO;
import com.edu.huce.utility.response.ResultResponse;

public interface INhaXuatBanService {
    NhaXuatBanDTO create(NhaXuatBanDTO nhaXuatBanDTO);

    NhaXuatBanDTO get(String id);

    NhaXuatBanDTO update(NhaXuatBanDTO nhaXuatBanDTO);

    NhaXuatBanDTO delete(String id);

    ResultResponse getList(Integer page, Integer limit, String keyword, Integer sort);
}
