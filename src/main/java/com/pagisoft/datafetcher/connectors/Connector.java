package com.pagisoft.datafetcher.connectors;

import java.util.List;

public interface Connector {

    List<Object> getObjectList(String categoryId, Integer limit, Integer offset);
}
