package com.edu.huce.layer.presentation.controller;


import com.edu.huce.layer.application.domain.dto.NguoiDungDTO;
import com.edu.huce.layer.application.service.INguoiDungService;
import com.edu.huce.utility.response.Response;
import com.edu.huce.utility.response.ResponseFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/user")
public class NguoiDungController {

    private final INguoiDungService nguoiDungService;

    public NguoiDungController(INguoiDungService nguoiDungService) {
        this.nguoiDungService = nguoiDungService;
    }

    @PostMapping("/create")
    public Response createUser(@RequestBody NguoiDungDTO nguoiDungDTO) {
        try {
            nguoiDungService.createNguoiDung(nguoiDungDTO);
            return ResponseFactory.getSuccessResponse(Response.SUCCESS);
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }


    @GetMapping("/{ma_nguoi_dung}")
    public Response getUser(@PathVariable(name = "ma_nguoi_dung") String maNguoiDung) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, nguoiDungService.getNguoiDung(maNguoiDung));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @PutMapping("/update")
    public Response updateUser(@RequestBody NguoiDungDTO nguoiDungDTO) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, nguoiDungService.updateNguoiDung(nguoiDungDTO));
        } catch (Exception exception) {
            log.error(exception.getMessage());
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @DeleteMapping("/detele/{ma_nguoi_dung}")
    public Response deletedUser(@PathVariable(name = "ma_nguoi_dung") String maNguoiDUng) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, nguoiDungService.deleteNguoiDung(maNguoiDUng));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @GetMapping("/get-list")
    public Response getListUser(@RequestParam(name = "page", defaultValue = "0", required = false) Integer page, @RequestParam(name = "limit", defaultValue = "30", required = false) Integer limit, @RequestParam(name = "type", defaultValue = "0", required = false) Integer type, @RequestParam(name = "key_word", defaultValue = "", required = false) String keyWork) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, nguoiDungService.getListNguoiDung(page, limit, keyWork, type));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @GetMapping("/login")
    public Response loginUser(@RequestBody NguoiDungDTO nguoiDungDTO) {
        try {

            return ResponseFactory.getSuccessResponse(Response.SUCCESS);
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }
}
