package com.ddd.domain.item.item.service;

import com.ddd.domain.item.api.item.ItemService;
import com.ddd.domain.item.item.model.entity.ability.pub.PublicEntityAbility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemDomainServiceImpl")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private PublicEntityAbility publicEntityAbility;

    @Override
    public void publicItem() {
        //Domain Service: Orchestrating entities to achieve business.
        //item.pub()
        publicEntityAbility.pub();

        //xxxx domain
    }
}
