package com.edu.huce.layer.application.service.impl;

import com.edu.huce.config.Constants;
import com.edu.huce.layer.application.domain.dao.INhaCungCapDao;
import com.edu.huce.layer.application.domain.dto.NhaCungCapDTO;
import com.edu.huce.layer.application.domain.entity.NhaCungCap;
import com.edu.huce.layer.application.service.INhaCungCapService;
import com.edu.huce.utility.response.ResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class NhaCungCapService implements INhaCungCapService {

    private final INhaCungCapDao nhaCungCapDao;

    public NhaCungCapService(INhaCungCapDao nhaCungCapDao) {
        this.nhaCungCapDao = nhaCungCapDao;
    }


    @Override
    public NhaCungCapDTO create(NhaCungCapDTO nhaCungCapDTO) {
        return Constants.SERIALIZER.convertValue(nhaCungCapDao.save(Constants.SERIALIZER.convertValue(nhaCungCapDTO, NhaCungCap.class)), NhaCungCapDTO.class);
    }

    @Override
    public NhaCungCapDTO get(String id) {
        return Constants.SERIALIZER.convertValue(nhaCungCapDao.getNhaCungCapByMaNhaCC(id), NhaCungCapDTO.class);
    }

    @Override
    public NhaCungCapDTO update(NhaCungCapDTO nhaCungCapDTO) {
        return Constants.SERIALIZER.convertValue(nhaCungCapDao.save(Constants.SERIALIZER.convertValue(nhaCungCapDTO, NhaCungCap.class)), NhaCungCapDTO.class);
    }

    @Override
    public NhaCungCapDTO delete(String id) throws Exception {
        NhaCungCap nhaCungCap = nhaCungCapDao.getNhaCungCapByMaNhaCC(id);
        if (nhaCungCap == null) throw new Exception("Nhà cung cấp không tồn tại");
        return Constants.SERIALIZER.convertValue(nhaCungCap, NhaCungCapDTO.class);
    }

    @Override
    public ResultResponse getList(Integer page, Integer limit, String keyword, Integer sort) {
        Pageable pageable = PageRequest.of(page, limit);
        Page<NhaCungCap> nhaCungCaps;
        if (!keyword.equals("")) {
            nhaCungCaps = nhaCungCapDao.findNhaCungCapByTenNhaCC(keyword, pageable);
        } else {
            nhaCungCaps = nhaCungCapDao.findAll(pageable);
        }
        ResultResponse<NhaCungCapDTO> resultResponse = new ResultResponse<>();
        List<NhaCungCapDTO> docGiaDTOS = new ArrayList<>();
        for (NhaCungCap nhaCungCap : nhaCungCaps.getContent()) {
            docGiaDTOS.add(Constants.SERIALIZER.convertValue(nhaCungCap, NhaCungCapDTO.class));
        }
        resultResponse.setData(docGiaDTOS);
        resultResponse.setPage(page);
        resultResponse.setLimit(limit);
        resultResponse.setTotal((int) nhaCungCaps.getTotalElements());
        return resultResponse;
    }
}
