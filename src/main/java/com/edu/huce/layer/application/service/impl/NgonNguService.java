package com.edu.huce.layer.application.service.impl;

import com.edu.huce.config.Constants;
import com.edu.huce.layer.application.domain.dao.INgonNguDao;
import com.edu.huce.layer.application.domain.dto.DocGiaDTO;
import com.edu.huce.layer.application.domain.dto.NgonNguDTO;
import com.edu.huce.layer.application.domain.entity.DocGia;
import com.edu.huce.layer.application.domain.entity.NgonNgu;
import com.edu.huce.layer.application.service.INgonNguService;
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
public class NgonNguService implements INgonNguService {


    private final INgonNguDao ngonNguDao;

    public NgonNguService(INgonNguDao ngonNguDao) {
        this.ngonNguDao = ngonNguDao;
    }

    @Override
    public NgonNguDTO createNgonNgu(NgonNguDTO ngonNguDTO) {
        NgonNgu ngonNgu = Constants.SERIALIZER.convertValue(ngonNguDTO, NgonNgu.class);
        return Constants.SERIALIZER.convertValue(ngonNguDao.save(ngonNgu), NgonNguDTO.class);
    }

    @Override
    public NgonNguDTO updateNgonNgu(NgonNguDTO ngonNguDTO) {
        NgonNgu ngonNgu = Constants.SERIALIZER.convertValue(ngonNguDTO, NgonNgu.class);
        return Constants.SERIALIZER.convertValue(ngonNguDao.save(ngonNgu), NgonNguDTO.class);
    }

    @Override
    public NgonNguDTO getNgonNgu(String id) {
        return Constants.SERIALIZER.convertValue(ngonNguDao.getNgonNguByMaNgonNgu(id), NgonNguDTO.class);
    }

    @Override
    public ResultResponse getListNgonNgu(Integer page, Integer limit, String keyword, Integer sort) {
        Pageable pageable = PageRequest.of(page, limit);
        Page<NgonNgu> ngonNgus;
        if (!keyword.equals("")) {
            ngonNgus = ngonNguDao.findNgonNguByTenNgonNgu(keyword, pageable);
        } else {
            ngonNgus = ngonNguDao.findAll(pageable);
        }
        ResultResponse<NgonNguDTO> resultResponse = new ResultResponse<>();
        List<NgonNguDTO> docGiaDTOS = new ArrayList<>();
        for (NgonNgu ngonNgu : ngonNgus.getContent()) {
            docGiaDTOS.add(Constants.SERIALIZER.convertValue(ngonNgu, NgonNguDTO.class));
        }
        resultResponse.setData(docGiaDTOS);
        resultResponse.setPage(page);
        resultResponse.setLimit(limit);
        resultResponse.setTotal((int) ngonNgus.getTotalElements());
        return resultResponse;
    }
}
