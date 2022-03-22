package com.ddd.domain.item.item.model.entity.ability.pub.extensions.impl;

import com.ddd.domain.item.item.model.entity.ability.pub.extensions.PublicEntityAbilityExt;
import com.ddd.domain.item.item.model.entity.require.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicEntityAbilityTmallExtTBImpl implements PublicEntityAbilityExt {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void pub() {
        itemRepository.saveItem();
        //...
    }
}
