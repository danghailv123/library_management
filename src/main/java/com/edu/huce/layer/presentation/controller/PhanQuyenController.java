package com.edu.huce.layer.presentation.controller;

import com.edu.huce.layer.application.domain.entity.PhanQuyen;
import com.edu.huce.layer.application.service.IPhanQuyenService;
import com.edu.huce.utility.response.Response;
import com.edu.huce.utility.response.ResponseFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/phan-quyen")
@Slf4j
public class PhanQuyenController {

    private final IPhanQuyenService phanQuyenService;

    public PhanQuyenController(IPhanQuyenService phanQuyenService) {
        this.phanQuyenService = phanQuyenService;
    }

    @PostMapping("/add")
    public Response add(@RequestBody PhanQuyen phanQuyen) {
        try {
            log.info(phanQuyen.toString());
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, phanQuyenService.create(phanQuyen));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Response get(@PathVariable(name = "id") String id) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, phanQuyenService.get(id));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @PutMapping("/update")
    public Response update(@RequestBody PhanQuyen phanQuyen) {
        try {
            log.info(phanQuyen.toString());
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, phanQuyenService.update(phanQuyen));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @DeleteMapping("/detele/{id}")
    public Response deleted(@PathVariable(name = "id") String id) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, phanQuyenService.delete(id));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @GetMapping("/list")
    public Response getList(@RequestParam(name = "page", defaultValue = "0", required = false) Integer page, @RequestParam(name = "limit", defaultValue = "30", required = false) Integer limit, @RequestParam(name = "type", defaultValue = "0", required = false) Integer type, @RequestParam(name = "key_word", defaultValue = "", required = false) String keyWork) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, phanQuyenService.getList(page, limit, keyWork, type));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }
}
