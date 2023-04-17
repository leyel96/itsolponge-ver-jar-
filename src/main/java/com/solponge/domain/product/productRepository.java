package com.solponge.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productRepository extends JpaRepository<productVo, Integer> {
    @Query(value = "select * from product WHERE product_garbage=1 ORDER BY product_date DESC LIMIT 8", nativeQuery=true)
    List<productVo> productNwe8();

    @Query(value = "select * from product WHERE product_garbage=1 ORDER BY product_sale DESC LIMIT 6", nativeQuery=true)
    List<productVo> productPopular6();
}
