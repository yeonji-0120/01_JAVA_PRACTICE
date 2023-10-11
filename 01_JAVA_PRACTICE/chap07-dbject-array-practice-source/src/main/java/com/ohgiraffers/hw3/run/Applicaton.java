package com.ohgiraffers.hw3.run;

import com.ohgiraffers.hw3.controller.ProductController;
import com.ohgiraffers.hw3.model.vo.ProductDTO;

public class Applicaton {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.mainMenu();

    }
}
