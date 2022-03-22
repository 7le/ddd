package com.ddd.infrastructure.datatunnel.item;

import com.ddd.domain.item.item.model.entity.require.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemRepositoryImpl implements ItemRepository {

    @Override
    public void saveItem() {
        //db operate
    }
}
