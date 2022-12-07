package com.edu.huce.layer.application.service.impl;

import com.edu.huce.config.Constants;
import com.edu.huce.layer.application.domain.dao.INguoiDungDao;
import com.edu.huce.layer.application.domain.dao.IPhanQuyenDao;
import com.edu.huce.layer.application.domain.dto.NgonNguDTO;
import com.edu.huce.layer.application.domain.dto.NguoiDungDTO;
import com.edu.huce.layer.application.domain.entity.NgonNgu;
import com.edu.huce.layer.application.domain.entity.NguoiDung;
import com.edu.huce.layer.application.domain.entity.PhanQuyen;
import com.edu.huce.layer.application.domain.model.mapper.NguoiDungMapper;
import com.edu.huce.layer.application.service.INguoiDungService;
import com.edu.huce.utility.response.ResultResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public class NguoiDungService implements INguoiDungService {

    private final INguoiDungDao nguoiDungDao;

    private final IPhanQuyenDao phanQuyenDao;

    public NguoiDungService(INguoiDungDao nguoiDungDao, IPhanQuyenDao phanQuyenDao) {
        this.nguoiDungDao = nguoiDungDao;
        this.phanQuyenDao = phanQuyenDao;
    }

    @Override
    public NguoiDungDTO createNguoiDung(NguoiDungDTO nguoiDungDTO) {
        NguoiDung nguoiDung = NguoiDungMapper.dto2Entity(nguoiDungDTO);
        PhanQuyen phanQuyen = phanQuyenDao.getPhanQuyenByMaQuyen(nguoiDung.getMaQuyen());
        return NguoiDungMapper.entity2DTO(nguoiDungDao.save(nguoiDung), phanQuyen);
    }

    @Override
    public NguoiDungDTO updateNguoiDung(NguoiDungDTO nguoiDungDTO) {
        NguoiDung nguoiDung = NguoiDungMapper.dto2Entity(nguoiDungDTO);
        PhanQuyen phanQuyen = phanQuyenDao.getPhanQuyenByMaQuyen(nguoiDung.getMaQuyen());
        return NguoiDungMapper.entity2DTO(nguoiDungDao.save(nguoiDung), phanQuyen);
    }

    @Override
    public NguoiDungDTO getNguoiDung(String id) {
        NguoiDung nguoiDung = nguoiDungDao.findNguoiDungByMaNguoiDung(id);
        PhanQuyen phanQuyen = phanQuyenDao.getPhanQuyenByMaQuyen(nguoiDung.getMaQuyen());
        return NguoiDungMapper.entity2DTO(nguoiDung, phanQuyen);
    }

    @Override
    public ResultResponse getListNguoiDung(Integer page, Integer limit, String keyword, Integer sort) {
        Pageable pageable = PageRequest.of(page, limit);
        Page<NguoiDung> ngonNgus;
        if (!keyword.equals("")) {
            ngonNgus = nguoiDungDao.findNguoiDungByUserName(keyword, pageable);
        } else {
            ngonNgus = nguoiDungDao.findAll(pageable);
        }
        ResultResponse<NguoiDungDTO> resultResponse = new ResultResponse<>();
        List<NguoiDungDTO> nguoiDungDTOS = new ArrayList<>();
        for (NguoiDung nguoiDung : ngonNgus.getContent()) {
            PhanQuyen phanQuyen = phanQuyenDao.getPhanQuyenByMaQuyen(nguoiDung.getMaQuyen());
            nguoiDungDTOS.add(NguoiDungMapper.entity2DTO(nguoiDung,phanQuyen));
        }
        resultResponse.setData(nguoiDungDTOS);
        resultResponse.setPage(page);
        resultResponse.setLimit(limit);
        resultResponse.setTotal((int) ngonNgus.getTotalElements());
        return null;
    }
}
