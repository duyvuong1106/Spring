/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nldv.service.impl;

import com.nldv.pojo.Product;
import com.nldv.repository.ProductRepository;
import com.nldv.service.ProductService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */

@Service

public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository prodRepo; 
    
    @Override
    public List<Product> getProducts(Map<String, String> params) {
        return this.prodRepo.getProducts(params); 
    }
    
}
