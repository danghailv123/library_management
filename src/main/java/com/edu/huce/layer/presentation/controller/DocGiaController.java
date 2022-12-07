package com.edu.huce.layer.presentation.controller;

import com.edu.huce.layer.application.domain.dto.DocGiaDTO;
import com.edu.huce.layer.application.service.IDocGiaService;
import com.edu.huce.utility.response.Response;
import com.edu.huce.utility.response.ResponseFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/docgia")
@Slf4j
public class DocGiaController {
    private final IDocGiaService docGiaService;

    public DocGiaController(IDocGiaService docGiaService) {
        this.docGiaService = docGiaService;
    }


    @PostMapping("/add")
    public Response addDocGia(@RequestBody DocGiaDTO docGiaDTO) {
        try {
            log.info(docGiaDTO.toString());
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, docGiaService.createDocGia(docGiaDTO));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Response getDocGia(@PathVariable(name = "id") String id) {
        try {
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, docGiaService.getDocGia(id));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }

    @PutMapping("/update")
    public Response updateDocGia(@RequestBody DocGiaDTO docGiaDTO) {
        try {
            log.info(docGiaDTO.toString());
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, docGiaService.updateDocGia(docGiaDTO));
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
            return ResponseFactory.getSuccessResponse(Response.SUCCESS, docGiaService.getListDocGia(page, limit, keyWork, type));
        } catch (Exception exception) {
            log.error(exception.getMessage(), exception);
            return ResponseFactory.getClientErrorResponse(exception.getMessage());
        }
    }
}
