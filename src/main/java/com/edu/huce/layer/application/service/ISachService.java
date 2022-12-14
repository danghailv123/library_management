package com.edu.huce.layer.application.service;

import com.edu.huce.layer.application.domain.entity.PhieuPhat;
import com.edu.huce.layer.application.domain.entity.Sach;
import com.edu.huce.utility.response.ResultResponse;

public interface ISachService {
    Sach create(Sach sach);

    Sach get(String id);

    Sach update(Sach sach);

    Sach delete(String id);

    ResultResponse getList(Integer page, Integer limit, String keyword, Integer sort);
}
