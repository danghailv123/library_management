package com.edu.huce.layer.application.domain.model.mapper;

import com.edu.huce.layer.application.domain.dto.NguoiDungDTO;
import com.edu.huce.layer.application.domain.entity.NguoiDung;
import com.edu.huce.layer.application.domain.entity.PhanQuyen;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class NguoiDungMapper {

    public static NguoiDungDTO entity2DTO(NguoiDung nguoiDung, PhanQuyen phanQuyen) {
        NguoiDungDTO nguoiDungDTO = new NguoiDungDTO();
        nguoiDungDTO.setMaNguoiDung(nguoiDung.getMaNguoiDung());
        nguoiDungDTO.setUserName(nguoiDung.getUserName());
        nguoiDungDTO.setTenQuyen(phanQuyen.getTenQuyen());
        return nguoiDungDTO;
    }

    public static NguoiDung dto2Entity(NguoiDungDTO nguoiDungDTO) {
        NguoiDung nguoiDung = new NguoiDung();
        nguoiDung.setMaNguoiDung(nguoiDungDTO.getMaNguoiDung() == null ? UUID.randomUUID().toString() : nguoiDungDTO.getMaNguoiDung());
        nguoiDung.setUserName(nguoiDungDTO.getUserName());
        nguoiDung.setMaQuyen(nguoiDungDTO.getMaQuyen());
        nguoiDung.setPassword(MD5(nguoiDungDTO.getPassword()));
        return nguoiDung;
    }

    public static String MD5(String input) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        assert md != null;
        md.update(input.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter.printHexBinary(digest);
    }

}
