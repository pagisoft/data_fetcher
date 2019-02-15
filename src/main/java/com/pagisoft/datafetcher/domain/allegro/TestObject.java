package com.pagisoft.datafetcher.domain.allegro;

public class TestObject {

    private Long objectId;
    private String objectName;

    public TestObject(final Long objectId, final String objectName) {
        this.objectId = objectId;
        this.objectName = objectName;
    }

    public String getName() {
        return this.objectName;
    }
}
