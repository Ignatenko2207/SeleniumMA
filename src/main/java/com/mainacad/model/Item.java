package com.mainacad.model;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Item {

    private String itemId;
    private String name;
    private String itemUrl;
    private Integer price;
    private Integer initPrice;
}
