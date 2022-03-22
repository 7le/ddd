package com.ddd.domain.item.item.model.entity.ability.pub.impl;

import com.ddd.domain.item.item.model.entity.ability.pub.PublicEntityAbility;
import com.ddd.domain.item.item.model.entity.ability.pub.extensions.PublicEntityAbilityExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicEntityAbilityImpl implements PublicEntityAbility {

    @Autowired
    private PublicEntityAbilityExt publicEntityAbilityExt;

    @Override
    public void pub() {
        publicEntityAbilityExt.pub();
    }
}
