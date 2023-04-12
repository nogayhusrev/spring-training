package com.nogayhusrev.repository;

import com.nogayhusrev.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
