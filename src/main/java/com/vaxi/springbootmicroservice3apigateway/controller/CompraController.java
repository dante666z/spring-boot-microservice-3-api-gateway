package com.vaxi.springbootmicroservice3apigateway.controller;

import com.vaxi.springbootmicroservice3apigateway.request.ComprasServiceRequest;
import com.vaxi.springbootmicroservice3apigateway.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gateway/compra")
public class CompraController {

    @Autowired
    private ComprasServiceRequest comprasServiceRequest;

    @PostMapping
    public ResponseEntity<?> saveCompra(@RequestBody Object compra) {
        return new ResponseEntity<>(comprasServiceRequest.saveCompra(compra), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllComprasOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return ResponseEntity.ok(comprasServiceRequest.getAllComprasOfUser(userPrincipal.getId()));
    }
}
