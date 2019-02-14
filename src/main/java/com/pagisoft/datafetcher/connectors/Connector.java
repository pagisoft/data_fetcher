package com.pagisoft.datafetcher.connectors;

import java.util.List;

public interface Connector {
    String getToken();

    List<Object> getObjectList(Integer limit, Integer offset);
}
