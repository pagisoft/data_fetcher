package com.pagisoft.datafetcher.domain.allegro;

import java.util.List;

public class Offer {

    private Long id;
    private String name;
    private Seller seller;
    private Promotion promotion;
    private Delivery delivery;
    private List<ImageUrl> images;
    private SellingMode sellingMode;
    private Stock stock;
    private Category category;
    private Publication publication;

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seller=" + seller +
                ", promotion=" + promotion +
                ", delivery=" + delivery +
                ", images=" + images +
                ", sellingMode=" + sellingMode +
                ", stock=" + stock +
                ", category=" + category +
                ", publication=" + publication +
                '}';
    }
}
