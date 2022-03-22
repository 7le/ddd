package com.ddd.client.controller.item;

import com.ddd.client.controller.item.service.ItemClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ddd/item")
public class ItemController {

    @Autowired
    private ItemClientService itemClientService;

    @PostMapping("/public")
    public String publicItem() {
        itemClientService.publicItem();
        return "success";
    }

}
