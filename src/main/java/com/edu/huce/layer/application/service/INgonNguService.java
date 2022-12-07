package com.edu.huce.layer.application.service;

import com.edu.huce.layer.application.domain.dto.DocGiaDTO;
import com.edu.huce.layer.application.domain.dto.NgonNguDTO;
import com.edu.huce.utility.response.ResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

public interface INgonNguService {
    NgonNguDTO createNgonNgu(NgonNguDTO ngonNguDTO);

    NgonNguDTO updateNgonNgu(NgonNguDTO ngonNguDTO);

    NgonNguDTO getNgonNgu(String id);

    ResultResponse getListNgonNgu(Integer page, Integer limit, String keyword, Integer sort);
}
