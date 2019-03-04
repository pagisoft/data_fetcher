package com.pagisoft.datafetcher.model.allegro;

public class AllegroCategory {

    private String id;
    private String name;
    private Boolean leaf;
    private AllegroParentCategory parent;

    public String getId() {
        return this.id;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public String getName() {
        return name;
    }
}
