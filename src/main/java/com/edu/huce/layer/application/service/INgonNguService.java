package com.edu.huce.layer.application.service;

import com.edu.huce.layer.application.domain.dto.NgonNguDTO;
import com.edu.huce.utility.response.ResultResponse;

public interface INgonNguService {
    NgonNguDTO createNgonNgu(NgonNguDTO ngonNguDTO);

    NgonNguDTO updateNgonNgu(NgonNguDTO ngonNguDTO);

    NgonNguDTO getNgonNgu(String id);

    NgonNguDTO deleteNgonNgu(String id) throws Exception;

    ResultResponse getListNgonNgu(Integer page, Integer limit, String keyword, Integer sort);
}
