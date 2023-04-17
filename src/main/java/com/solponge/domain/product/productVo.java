package com.solponge.domain.product;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="product")
public class productVo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_num;
    private String product_title;
    private String product_subtitle;
    private String product_writer;
    private int product_price;
    private String product_img;
    private Date product_date;
    private String product_page;
    private String product_code;
    private int product_stock;
    private int product_sale;
    private int product_visit;

    private int PRODUCT_GARBAGE;

}
