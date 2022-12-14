package com.edu.huce.layer.presentation.controller;

import com.edu.huce.layer.application.domain.dto.NhaXuatBanDTO;
import com.edu.huce.layer.application.service.INhaXuatBanService;
import com.edu.huce.utility.response.Response;
import com.edu.huce.utility.response.ResponseFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nha-cung-cap")
@Slf4j
public class NhaXuatBanController {

    private final INhaXuatBanService nhaXuatBanService;

    public NhaXuatBanController(INhaXuatBanService nhaXuatBanService) {
        this.nhaXuatBanService = nhaXuatBanService;
    }

    @PostMapping("/add")
    public Response add(@RequestBody NhaXuatBanDTO nhaXuatBanDTO) {
        try {
            log.info(nhaXuatBanDTO.toString());
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, nhaXuatBanService.create(nhaXuatBanDTO));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Response get(@PathVariable(name = "id") String id) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, nhaXuatBanService.get(id));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @PutMapping("/update")
    public Response update(@RequestBody NhaXuatBanDTO nhaXuatBanDTO) {
        try {
            log.info(nhaXuatBanDTO.toString());
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, nhaXuatBanService.update(nhaXuatBanDTO));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @DeleteMapping("/detele/{id}")
    public Response deleted(@PathVariable(name = "id") String id) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, nhaXuatBanService.delete(id));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @GetMapping("/list")
    public Response getList(@RequestParam(name = "page", defaultValue = "0", required = false) Integer page, @RequestParam(name = "limit", defaultValue = "30", required = false) Integer limit, @RequestParam(name = "type", defaultValue = "0", required = false) Integer type, @RequestParam(name = "key_word", defaultValue = "", required = false) String keyWork) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, nhaXuatBanService.getList(page, limit, keyWork, type));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }
}
