package com.ddd.domain.item.item.model.entity;

public class Item {

    private Long id;
    private String name;
    private String sku;
    private CategoryEnum category;

    //一般情况，DDD的domain使用充血模式，内聚该domain的能力和职责
    // pub()













    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }
}
