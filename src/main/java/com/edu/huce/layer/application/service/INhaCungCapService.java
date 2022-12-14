package com.edu.huce.layer.application.service;

import com.edu.huce.layer.application.domain.dto.NhaCungCapDTO;
import com.edu.huce.utility.response.ResultResponse;

public interface INhaCungCapService {

    NhaCungCapDTO create(NhaCungCapDTO nhaCungCapDTO);

    NhaCungCapDTO get(String id);

    NhaCungCapDTO update(NhaCungCapDTO nhaCungCapDTO);

    NhaCungCapDTO delete(String id) throws Exception;

    ResultResponse getList(Integer page, Integer limit, String keyword, Integer sort);
}
