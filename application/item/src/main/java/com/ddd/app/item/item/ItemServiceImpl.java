package com.ddd.app.item.item;

import com.ddd.client.controller.item.service.ItemClientService;
import com.ddd.domain.item.api.item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemClientService {

    @Autowired
    @Qualifier("itemDomainServiceImpl")
    private ItemService itemService;


    @Override
    public void publicItem() {
        // Application Service: Define what the system should do, and call domain to complete

        itemService.publicItem();
    }
}
