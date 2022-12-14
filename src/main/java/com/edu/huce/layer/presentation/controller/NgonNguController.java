package com.edu.huce.layer.presentation.controller;

import com.edu.huce.layer.application.domain.dto.NgonNguDTO;
import com.edu.huce.layer.application.service.INgonNguService;
import com.edu.huce.utility.response.Response;
import com.edu.huce.utility.response.ResponseFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ngonngu")
@Slf4j
public class NgonNguController {
    private final INgonNguService ngonNguService;

    public NgonNguController(INgonNguService ngonNguService) {
        this.ngonNguService = ngonNguService;
    }


    @PostMapping("/add")
    public Response addNgonNgu(@RequestBody NgonNguDTO ngonNguDTO) {
        try {
            log.info(ngonNguDTO.toString());
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, ngonNguService.createNgonNgu(ngonNguDTO));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Response getNgonNgu(@PathVariable(name = "id") String id) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, ngonNguService.getNgonNgu(id));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @PutMapping("/update")
    public Response updateNgonNgu(@RequestBody NgonNguDTO ngonNguDTO) {
        try {
            log.info(ngonNguDTO.toString());
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, ngonNguService.updateNgonNgu(ngonNguDTO));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @DeleteMapping("/detele/{id_ngon_ngu}")
    public Response deletedUser(@PathVariable(name = "id_ngon_ngu") String id) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, ngonNguService.deleteNgonNgu(id));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @GetMapping("/list")
    public Response getList(@RequestParam(name = "page", defaultValue = "0", required = false) Integer page,
                            @RequestParam(name = "limit", defaultValue = "30", required = false) Integer limit,
                            @RequestParam(name = "type", defaultValue = "0", required = false) Integer type,
                            @RequestParam(name = "key_word", defaultValue = "", required = false) String keyWork) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, ngonNguService.getListNgonNgu(page, limit, keyWork, type));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }
}
