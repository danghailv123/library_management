package com.edu.huce.layer.application.service;

import com.edu.huce.layer.application.domain.entity.PhieuPhat;
import com.edu.huce.layer.application.domain.entity.TacGia;
import com.edu.huce.layer.application.domain.entity.TheLoai;
import com.edu.huce.utility.response.ResultResponse;

public interface ITheLoaiService {
    TheLoai create(TheLoai theLoai);

    TheLoai get(String id);

    TheLoai update(TheLoai theLoai);

    TheLoai delete(String id);

    ResultResponse getList(Integer page, Integer limit, String keyword, Integer sort);
}
