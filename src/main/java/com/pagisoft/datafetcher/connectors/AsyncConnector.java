package com.pagisoft.datafetcher.connectors;

import java.util.List;

public interface AsyncConnector {

    List<Object> getObjectList(String categoryId, Integer limit, Integer offset);

    List<Object> getCategoryList(String parentCategoryId);

}
