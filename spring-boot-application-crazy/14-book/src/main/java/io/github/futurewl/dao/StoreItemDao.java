package io.github.futurewl.dao;

import io.github.futurewl.entity.StoreItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoreItemDao extends JpaRepository<StoreItem, Integer> {

    List<StoreItem> findByStoreId(Integer storeId);
}
