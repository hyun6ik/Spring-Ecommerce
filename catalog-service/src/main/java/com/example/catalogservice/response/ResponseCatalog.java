package com.example.catalogservice.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
//NULL 값 반환 X
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCatalog {

    private String productId;
    private String productName;
    private Integer stock;
    private Integer unitPrice;
    private Date createdAt;

}
