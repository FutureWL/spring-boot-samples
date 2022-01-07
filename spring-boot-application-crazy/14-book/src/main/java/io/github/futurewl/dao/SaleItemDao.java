package io.github.futurewl.dao;

import io.github.futurewl.entity.SaleItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleItemDao extends JpaRepository<SaleItem, Integer> {

    List<SaleItem> findBySaleId(Integer saleId);
}
