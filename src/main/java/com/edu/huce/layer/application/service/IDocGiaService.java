package com.edu.huce.layer.application.service;

import com.edu.huce.layer.application.domain.dto.DocGiaDTO;
import com.edu.huce.utility.response.ResultResponse;

public interface IDocGiaService {
    DocGiaDTO createDocGia(DocGiaDTO docGiaDTO);

    DocGiaDTO updateDocGia(DocGiaDTO docGiaDTO);

    DocGiaDTO getDocGia(String id);

    ResultResponse getListDocGia(Integer page, Integer limit, String keyword, Integer sort);
}
