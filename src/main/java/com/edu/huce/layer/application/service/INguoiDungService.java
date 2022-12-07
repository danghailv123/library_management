package com.edu.huce.layer.application.service;

import com.edu.huce.layer.application.domain.dto.NgonNguDTO;
import com.edu.huce.layer.application.domain.dto.NguoiDungDTO;
import com.edu.huce.utility.response.ResultResponse;

public interface INguoiDungService {
    NguoiDungDTO createNguoiDung(NguoiDungDTO nguoiDungDTO);

    NguoiDungDTO updateNguoiDung(NguoiDungDTO nguoiDungDTO);

    NguoiDungDTO getNguoiDung(String id);

    ResultResponse getListNguoiDung(Integer page, Integer limit, String keyword, Integer sort);
}
