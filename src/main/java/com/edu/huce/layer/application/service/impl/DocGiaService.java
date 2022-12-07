package com.edu.huce.layer.application.service.impl;

import com.edu.huce.config.Constants;
import com.edu.huce.layer.application.domain.dao.IDocGiaDao;
import com.edu.huce.layer.application.domain.dto.DocGiaDTO;
import com.edu.huce.layer.application.domain.entity.DocGia;
import com.edu.huce.layer.application.service.IDocGiaService;
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
public class DocGiaService implements IDocGiaService {

    private final IDocGiaDao docGiaDao;

    public DocGiaService(IDocGiaDao docGiaDao) {
        this.docGiaDao = docGiaDao;
    }

    @Override
    public DocGiaDTO createDocGia(DocGiaDTO docGiaDTO) {
        DocGia docGia = Constants.SERIALIZER.convertValue(docGiaDTO, DocGia.class);
        return Constants.SERIALIZER.convertValue(docGiaDao.save(docGia), DocGiaDTO.class);
    }

    @Override
    public DocGiaDTO updateDocGia(DocGiaDTO docGiaDTO) {
        DocGia docGia = Constants.SERIALIZER.convertValue(docGiaDTO, DocGia.class);
        return Constants.SERIALIZER.convertValue(docGiaDao.save(docGia), DocGiaDTO.class);
    }

    @Override
    public DocGiaDTO getDocGia(String id) {
        return Constants.SERIALIZER.convertValue(docGiaDao.getDocGiaByMaDocGia(id), DocGiaDTO.class);
    }

    @Override
    public ResultResponse getListDocGia(Integer page, Integer limit, String keyword, Integer sort) {
        Pageable pageable = PageRequest.of(page, limit);
        Page<DocGia> docGias;
        if (!keyword.equals("")) {
            docGias = docGiaDao.findDocGiaByHoTen(keyword, pageable);
        } else {
            docGias = docGiaDao.findAll(pageable);
        }
        ResultResponse<DocGiaDTO> resultResponse = new ResultResponse<>();
        List<DocGiaDTO> docGiaDTOS = new ArrayList<>();
        for (DocGia docGia : docGias.getContent()) {
            docGiaDTOS.add(Constants.SERIALIZER.convertValue(docGia, DocGiaDTO.class));
        }
        resultResponse.setData(docGiaDTOS);
        resultResponse.setPage(page);
        resultResponse.setLimit(limit);
        resultResponse.setTotal((int) docGias.getTotalElements());
        return resultResponse;
    }
}
