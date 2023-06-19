package com.productcatalog.catalog.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CatalogItem {
    String name;
    String desc;
    int rate;

}
