package com.edu.huce.layer.application.service;

import com.edu.huce.layer.application.domain.entity.PhieuMuon;
import com.edu.huce.utility.response.ResultResponse;

public interface IPhieuMuonService {

    PhieuMuon create(PhieuMuon phieuMuon);

    PhieuMuon get(String id);

    PhieuMuon update(PhieuMuon phieuMuon);

    PhieuMuon delete(String id);

    ResultResponse getList(Integer page, Integer limit, String keyword, Integer sort);
}
