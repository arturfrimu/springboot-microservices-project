package com.programming.techie.repository;

import com.programming.techie.model.Inventory;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static lombok.AccessLevel.PRIVATE;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class InventoryRepository {

    static Map<Long, Inventory> inventoriesTable = new HashMap<>();

    public Optional<Inventory> findBySkuCode(String skuCode) {
        return inventoriesTable.values().stream()
                .filter(el -> el.getSkuCode().equals(skuCode))
                .findFirst();
    }
}