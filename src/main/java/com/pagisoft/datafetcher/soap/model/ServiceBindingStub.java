/**
 * ServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pagisoft.datafetcher.soap.model;

public class ServiceBindingStub extends org.apache.axis.client.Stub implements com.pagisoft.datafetcher.soap.model.ServicePort_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[82];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddPackageInfoToPostBuyForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddPackageInfoToPostBuyFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddPackageInfoToPostBuyFormRequest"), com.pagisoft.datafetcher.soap.model.DoAddPackageInfoToPostBuyFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddPackageInfoToPostBuyFormResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoAddPackageInfoToPostBuyFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddPackageInfoToPostBuyFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoAddToBlackListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToBlackListRequest"), com.pagisoft.datafetcher.soap.model.DoAddToBlackListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToBlackListResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoAddToBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doAddToBlackListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoBidItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoBidItemRequest"), com.pagisoft.datafetcher.soap.model.DoBidItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doBidItemResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoBidItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doBidItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelRefundForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCancelRefundFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundFormRequest"), com.pagisoft.datafetcher.soap.model.DoCancelRefundFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundFormResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoCancelRefundFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCancelRefundFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangeItemFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeItemFieldsRequest"), com.pagisoft.datafetcher.soap.model.DoChangeItemFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeItemFieldsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoChangeItemFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangeItemFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangePriceItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangePriceItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangePriceItemRequest"), com.pagisoft.datafetcher.soap.model.DoChangePriceItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangePriceItemResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoChangePriceItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangePriceItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeQuantityItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoChangeQuantityItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeQuantityItemRequest"), com.pagisoft.datafetcher.soap.model.DoChangeQuantityItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeQuantityItemResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoChangeQuantityItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doChangeQuantityItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckItemDescription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCheckItemDescriptionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckItemDescriptionRequest"), com.pagisoft.datafetcher.soap.model.DoCheckItemDescriptionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckItemDescriptionResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoCheckItemDescriptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCheckItemDescriptionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoCheckNewAuctionExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckNewAuctionExtRequest"), com.pagisoft.datafetcher.soap.model.DoCheckNewAuctionExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckNewAuctionExtResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoCheckNewAuctionExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doCheckNewAuctionExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFinishItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemRequest"), com.pagisoft.datafetcher.soap.model.DoFinishItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoFinishItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFinishItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoFinishItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemsRequest"), com.pagisoft.datafetcher.soap.model.DoFinishItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoFinishItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doFinishItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBidItem2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetBidItem2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBidItem2Request"), com.pagisoft.datafetcher.soap.model.DoGetBidItem2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBidItem2Response"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetBidItem2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetBidItem2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBlackListUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetBlackListUsersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBlackListUsersRequest"), com.pagisoft.datafetcher.soap.model.DoGetBlackListUsersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBlackListUsersResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetBlackListUsersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetBlackListUsersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCategoryPath");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCategoryPathRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCategoryPathRequest"), com.pagisoft.datafetcher.soap.model.DoGetCategoryPathRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCategoryPathResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetCategoryPathResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCategoryPathResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataRequest"), com.pagisoft.datafetcher.soap.model.DoGetCatsDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetCatsDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataCountRequest"), com.pagisoft.datafetcher.soap.model.DoGetCatsDataCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataCountResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetCatsDataCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCatsDataLimitRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataLimitRequest"), com.pagisoft.datafetcher.soap.model.DoGetCatsDataLimitRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataLimitResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetCatsDataLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCatsDataLimitResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCountries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetCountriesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCountriesRequest"), com.pagisoft.datafetcher.soap.model.DoGetCountriesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCountriesResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetCountriesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetCountriesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetDealsRequest"), com.pagisoft.datafetcher.soap.model.DoGetDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetDealsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFilledPostBuyForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFilledPostBuyFormsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFilledPostBuyFormsRequest"), com.pagisoft.datafetcher.soap.model.DoGetFilledPostBuyFormsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFilledPostBuyFormsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetFilledPostBuyFormsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFilledPostBuyFormsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFreeDeliveryAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetFreeDeliveryAmountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFreeDeliveryAmountRequest"), com.pagisoft.datafetcher.soap.model.DoGetFreeDeliveryAmountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFreeDeliveryAmountResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetFreeDeliveryAmountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetFreeDeliveryAmountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemFieldsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemFieldsRequest"), com.pagisoft.datafetcher.soap.model.DoGetItemFieldsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemFieldsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetItemFieldsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemFieldsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsInfoRequest"), com.pagisoft.datafetcher.soap.model.DoGetItemsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsInfoResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetItemsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetItemsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsListRequest"), com.pagisoft.datafetcher.soap.model.DoGetItemsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsListResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetItemsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetItemsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyBidItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyBidItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyBidItemsRequest"), com.pagisoft.datafetcher.soap.model.DoGetMyBidItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyBidItemsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMyBidItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyBidItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyCurrentShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyCurrentShipmentPriceTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyCurrentShipmentPriceTypeRequest"), com.pagisoft.datafetcher.soap.model.DoGetMyCurrentShipmentPriceTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyCurrentShipmentPriceTypeResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMyCurrentShipmentPriceTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyCurrentShipmentPriceTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyDataRequest"), com.pagisoft.datafetcher.soap.model.DoGetMyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyDataResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyFutureItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyFutureItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyFutureItemsRequest"), com.pagisoft.datafetcher.soap.model.DoGetMyFutureItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyFutureItemsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMyFutureItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyFutureItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyIncomingPaymentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRequest"), com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyIncomingPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyIncomingPaymentsRefundsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRefundsRequest"), com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsRefundsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsRefundsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsRefundsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyIncomingPaymentsRefundsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotSoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyNotSoldItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotSoldItemsRequest"), com.pagisoft.datafetcher.soap.model.DoGetMyNotSoldItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotSoldItemsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMyNotSoldItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyNotSoldItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyNotWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyNotWonItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotWonItemsRequest"), com.pagisoft.datafetcher.soap.model.DoGetMyNotWonItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotWonItemsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMyNotWonItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyNotWonItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRequest"), com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPaymentsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsInfoRequest"), com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsInfoResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPaymentsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPayoutsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsRequest"), com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPayoutsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayoutsDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyPayoutsDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsDetailsRequest"), com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsDetailsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyPayoutsDetailsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySellItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellItemsRequest"), com.pagisoft.datafetcher.soap.model.DoGetMySellItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellItemsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMySellItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySellItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySoldItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMySoldItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySoldItemsRequest"), com.pagisoft.datafetcher.soap.model.DoGetMySoldItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySoldItemsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMySoldItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMySoldItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyWonItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetMyWonItemsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWonItemsRequest"), com.pagisoft.datafetcher.soap.model.DoGetMyWonItemsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWonItemsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetMyWonItemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetMyWonItemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPaymentMethodsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentMethodsRequest"), com.pagisoft.datafetcher.soap.model.DoGetPaymentMethodsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentMethodsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetPaymentMethodsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPaymentMethodsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyDataRequest"), com.pagisoft.datafetcher.soap.model.DoGetPostBuyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyDataResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetPostBuyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForBuyers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsDataForBuyersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForBuyersRequest"), com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForBuyersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForBuyersResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForBuyersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsDataForBuyersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsDataForSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsDataForSellersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForSellersRequest"), com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForSellersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForSellersResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForSellersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsDataForSellersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyFormsIdsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsIdsRequest"), com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsIdsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsIdsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsIdsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyFormsIdsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyItemInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetPostBuyItemInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyItemInfoRequest"), com.pagisoft.datafetcher.soap.model.DoGetPostBuyItemInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyItemInfoResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetPostBuyItemInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetPostBuyItemInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundsDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsDealsRequest"), com.pagisoft.datafetcher.soap.model.DoGetRefundsDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsDealsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetRefundsDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundsDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsListRequest"), com.pagisoft.datafetcher.soap.model.DoGetRefundsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsListResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetRefundsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundsListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundsReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetRefundsReasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsReasonsRequest"), com.pagisoft.datafetcher.soap.model.DoGetRefundsReasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsReasonsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetRefundsReasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetRefundsReasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsForCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSellFormFieldsForCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsForCategoryRequest"), com.pagisoft.datafetcher.soap.model.DoGetSellFormFieldsForCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsForCategoryResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetSellFormFieldsForCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSellFormFieldsForCategoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSessionHandleForWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSessionHandleForWidgetRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSessionHandleForWidgetRequest"), com.pagisoft.datafetcher.soap.model.DoGetSessionHandleForWidgetRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSessionHandleForWidgetResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetSessionHandleForWidgetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSessionHandleForWidgetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataRequest"), com.pagisoft.datafetcher.soap.model.DoGetShipmentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetShipmentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentPriceTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetShipmentPriceTypesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentPriceTypesRequest"), com.pagisoft.datafetcher.soap.model.DoGetShipmentPriceTypesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentPriceTypesResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetShipmentPriceTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetShipmentPriceTypesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalRequest"), com.pagisoft.datafetcher.soap.model.DoGetSiteJournalRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetSiteJournalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalDealsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsRequest"), com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalDealsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalDealsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalDealsInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsInfoRequest"), com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsInfoResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalDealsInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSiteJournalInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalInfoRequest"), com.pagisoft.datafetcher.soap.model.DoGetSiteJournalInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalInfoResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetSiteJournalInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSiteJournalInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetStatesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetStatesInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetStatesInfoRequest"), com.pagisoft.datafetcher.soap.model.DoGetStatesInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetStatesInfoResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetStatesInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetStatesInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSystemTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetSystemTimeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSystemTimeRequest"), com.pagisoft.datafetcher.soap.model.DoGetSystemTimeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSystemTimeResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetSystemTimeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetSystemTimeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetTransactionsIDs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetTransactionsIDsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetTransactionsIDsRequest"), com.pagisoft.datafetcher.soap.model.DoGetTransactionsIDsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetTransactionsIDsResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetTransactionsIDsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetTransactionsIDsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserIDRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserIDRequest"), com.pagisoft.datafetcher.soap.model.DoGetUserIDRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserIDResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetUserIDResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserIDResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoGetUserLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLoginRequest"), com.pagisoft.datafetcher.soap.model.DoGetUserLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLoginResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoGetUserLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doGetUserLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginRequest"), com.pagisoft.datafetcher.soap.model.DoLoginRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoLoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginEnc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginEncRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginEncRequest"), com.pagisoft.datafetcher.soap.model.DoLoginEncRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginEncResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoLoginEncResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginEncResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginWithAccessToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoLoginWithAccessTokenRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginWithAccessTokenRequest"), com.pagisoft.datafetcher.soap.model.DoLoginWithAccessTokenRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginWithAccessTokenResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoLoginWithAccessTokenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doLoginWithAccessTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccount2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyAccount2Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccount2Request"), com.pagisoft.datafetcher.soap.model.DoMyAccount2Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccount2Response"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoMyAccount2Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyAccount2Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccountItemsCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyAccountItemsCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccountItemsCountRequest"), com.pagisoft.datafetcher.soap.model.DoMyAccountItemsCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccountItemsCountResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoMyAccountItemsCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyAccountItemsCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBilling");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyBillingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingRequest"), com.pagisoft.datafetcher.soap.model.DoMyBillingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoMyBillingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyBillingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBillingItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoMyBillingItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingItemRequest"), com.pagisoft.datafetcher.soap.model.DoMyBillingItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingItemResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoMyBillingItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doMyBillingItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoNewAuctionExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoNewAuctionExtRequest"), com.pagisoft.datafetcher.soap.model.DoNewAuctionExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doNewAuctionExtResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoNewAuctionExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doNewAuctionExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQueryAllSysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoQueryAllSysStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQueryAllSysStatusRequest"), com.pagisoft.datafetcher.soap.model.DoQueryAllSysStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQueryAllSysStatusResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoQueryAllSysStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doQueryAllSysStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQuerySysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoQuerySysStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQuerySysStatusRequest"), com.pagisoft.datafetcher.soap.model.DoQuerySysStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQuerySysStatusResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoQuerySysStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doQuerySysStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRemoveFromBlackListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromBlackListRequest"), com.pagisoft.datafetcher.soap.model.DoRemoveFromBlackListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromBlackListResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoRemoveFromBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRemoveFromBlackListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestPayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoRequestPayoutRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestPayoutRequest"), com.pagisoft.datafetcher.soap.model.DoRequestPayoutRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestPayoutResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoRequestPayoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doRequestPayoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgain");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSellSomeAgainRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainRequest"), com.pagisoft.datafetcher.soap.model.DoSellSomeAgainRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoSellSomeAgainResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSellSomeAgainResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgainInShop");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSellSomeAgainInShopRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainInShopRequest"), com.pagisoft.datafetcher.soap.model.DoSellSomeAgainInShopRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainInShopResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoSellSomeAgainInShopResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSellSomeAgainInShopResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendEmailToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendEmailToUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendEmailToUserRequest"), com.pagisoft.datafetcher.soap.model.DoSendEmailToUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendEmailToUserResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoSendEmailToUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendEmailToUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendRefundForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSendRefundFormRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendRefundFormRequest"), com.pagisoft.datafetcher.soap.model.DoSendRefundFormRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendRefundFormResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoSendRefundFormResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSendRefundFormResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetFreeDeliveryAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSetFreeDeliveryAmountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetFreeDeliveryAmountRequest"), com.pagisoft.datafetcher.soap.model.DoSetFreeDeliveryAmountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetFreeDeliveryAmountResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoSetFreeDeliveryAmountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSetFreeDeliveryAmountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetShipmentPriceType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoSetShipmentPriceTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetShipmentPriceTypeRequest"), com.pagisoft.datafetcher.soap.model.DoSetShipmentPriceTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetShipmentPriceTypeResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoSetShipmentPriceTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doSetShipmentPriceTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowItemInfoExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoShowItemInfoExtRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowItemInfoExtRequest"), com.pagisoft.datafetcher.soap.model.DoShowItemInfoExtRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowItemInfoExtResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoShowItemInfoExtResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doShowItemInfoExtResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoShowUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserRequest"), com.pagisoft.datafetcher.soap.model.DoShowUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoShowUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doShowUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doVerifyItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DoVerifyItemRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoVerifyItemRequest"), com.pagisoft.datafetcher.soap.model.DoVerifyItemRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doVerifyItemResponse"));
        oper.setReturnClass(com.pagisoft.datafetcher.soap.model.DoVerifyItemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "doVerifyItemResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

    }

    public ServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddPackageInfoToPostBuyFormRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoAddPackageInfoToPostBuyFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddPackageInfoToPostBuyFormResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoAddPackageInfoToPostBuyFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoAddToBlackListRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoAddToBlackListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doAddToBlackListResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoAddToBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoBidItemRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoBidItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doBidItemResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoBidItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCancelRefundFormRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoCancelRefundFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCancelRefundFormResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoCancelRefundFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeItemFieldsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoChangeItemFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeItemFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoChangeItemFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangePriceItemRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoChangePriceItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangePriceItemResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoChangePriceItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoChangeQuantityItemRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoChangeQuantityItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doChangeQuantityItemResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoChangeQuantityItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckItemDescriptionRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoCheckItemDescriptionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckItemDescriptionResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoCheckItemDescriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoCheckNewAuctionExtRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoCheckNewAuctionExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doCheckNewAuctionExtResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoCheckNewAuctionExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoFinishItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoFinishItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoFinishItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoFinishItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doFinishItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoFinishItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBidItem2Request");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetBidItem2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBidItem2Response");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetBidItem2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetBlackListUsersRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetBlackListUsersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetBlackListUsersResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetBlackListUsersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCategoryPathRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetCategoryPathRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCategoryPathResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetCategoryPathResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataCountRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetCatsDataCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataCountResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetCatsDataCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataLimitRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetCatsDataLimitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataLimitResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetCatsDataLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCatsDataRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetCatsDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCatsDataResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetCatsDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetCountriesRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetCountriesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetCountriesResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetCountriesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetDealsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetDealsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFilledPostBuyFormsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetFilledPostBuyFormsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFilledPostBuyFormsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetFilledPostBuyFormsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetFreeDeliveryAmountRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetFreeDeliveryAmountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetFreeDeliveryAmountResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetFreeDeliveryAmountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemFieldsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetItemFieldsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetItemFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetItemsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetItemsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetItemsListRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetItemsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetItemsListResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetItemsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyBidItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyBidItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyBidItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyBidItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyCurrentShipmentPriceTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyCurrentShipmentPriceTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyCurrentShipmentPriceTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyCurrentShipmentPriceTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyDataRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyDataResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyFutureItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyFutureItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyFutureItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyFutureItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRefundsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsRefundsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsRefundsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsRefundsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyIncomingPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyIncomingPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotSoldItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyNotSoldItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotSoldItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyNotSoldItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyNotWonItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyNotWonItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyNotWonItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyNotWonItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPaymentsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPaymentsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsDetailsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyPayoutsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyPayoutsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySellItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMySellItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySellItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMySellItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMySoldItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMySoldItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMySoldItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMySoldItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetMyWonItemsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyWonItemsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetMyWonItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetMyWonItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPaymentMethodsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetPaymentMethodsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPaymentMethodsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetPaymentMethodsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyDataRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetPostBuyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyDataResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetPostBuyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForBuyersRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForBuyersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForBuyersResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForBuyersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsDataForSellersRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForSellersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsDataForSellersResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForSellersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyFormsIdsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsIdsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyFormsIdsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsIdsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetPostBuyItemInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetPostBuyItemInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetPostBuyItemInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetPostBuyItemInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsDealsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetRefundsDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsDealsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetRefundsDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsListRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetRefundsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsListResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetRefundsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetRefundsReasonsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetRefundsReasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetRefundsReasonsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetRefundsReasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSellFormFieldsForCategoryRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSellFormFieldsForCategoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSellFormFieldsForCategoryResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSellFormFieldsForCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSessionHandleForWidgetRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSessionHandleForWidgetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSessionHandleForWidgetResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSessionHandleForWidgetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentDataRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetShipmentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentDataResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetShipmentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetShipmentPriceTypesRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetShipmentPriceTypesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetShipmentPriceTypesResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetShipmentPriceTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalDealsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalDealsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSiteJournalInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSiteJournalInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSiteJournalRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSiteJournalRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSiteJournalResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSiteJournalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetStatesInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetStatesInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetStatesInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetStatesInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSystemTimeRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSystemTimeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSystemTimeResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetSystemTimeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetTransactionsIDsRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetTransactionsIDsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetTransactionsIDsResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetTransactionsIDsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserIDRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetUserIDRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserIDResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetUserIDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetUserLoginRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetUserLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetUserLoginResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoGetUserLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginEncRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoLoginEncRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginEncResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoLoginEncResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoLoginRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoLoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoLoginWithAccessTokenRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoLoginWithAccessTokenRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doLoginWithAccessTokenResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoLoginWithAccessTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccount2Request");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoMyAccount2Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccount2Response");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoMyAccount2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyAccountItemsCountRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoMyAccountItemsCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyAccountItemsCountResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoMyAccountItemsCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingItemRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoMyBillingItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingItemResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoMyBillingItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoMyBillingRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoMyBillingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doMyBillingResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoMyBillingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoNewAuctionExtRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoNewAuctionExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doNewAuctionExtResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoNewAuctionExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQueryAllSysStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoQueryAllSysStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQueryAllSysStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoQueryAllSysStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoQuerySysStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoQuerySysStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doQuerySysStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoQuerySysStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRemoveFromBlackListRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoRemoveFromBlackListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRemoveFromBlackListResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoRemoveFromBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoRequestPayoutRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoRequestPayoutRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doRequestPayoutResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoRequestPayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainInShopRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoSellSomeAgainInShopRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainInShopResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoSellSomeAgainInShopResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSellSomeAgainRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoSellSomeAgainRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSellSomeAgainResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoSellSomeAgainResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendEmailToUserRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoSendEmailToUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendEmailToUserResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoSendEmailToUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSendRefundFormRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoSendRefundFormRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSendRefundFormResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoSendRefundFormResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetFreeDeliveryAmountRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoSetFreeDeliveryAmountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetFreeDeliveryAmountResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoSetFreeDeliveryAmountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoSetShipmentPriceTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoSetShipmentPriceTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doSetShipmentPriceTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoSetShipmentPriceTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowItemInfoExtRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoShowItemInfoExtRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowItemInfoExtResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoShowItemInfoExtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowUserRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoShowUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoShowUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoVerifyItemRequest");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoVerifyItemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doVerifyItemResponse");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DoVerifyItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AdvertInfoType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.AdvertInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AfterSalesServiceConditionsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.AfterSalesServiceConditionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AlcoholDataStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.AlcoholDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AmountStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.AmountStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfAttribstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.AttribStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AttribStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBiditemstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.BidItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBidliststruct2");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.BidListStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidListStruct2");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBlacklistresstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.BlackListResStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListResStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfBlackliststruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.BlackListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorydata");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CategoryData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryData");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorypathtype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CategoryPathType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryPathType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCategorytreetype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CategoryTreeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryTreeType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCatinfotype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CatInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CatInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfCountryinfotype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CountryInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CountryInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfDealsstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DealsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFieldsvalue");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FieldsValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FieldsValue");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilteroptionstype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FilterOptionsType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterOptionsType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFilterslisttype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FiltersListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FiltersListType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFiltervaluetype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FilterValueType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterValueType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFinishfailurestruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FinishFailureStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishFailureStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFinishitemsstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FinishItemsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishItemsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFutureitemstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FutureItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FutureItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItembilling");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemBilling[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemBilling");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemcatlist");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemCatList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemCatList");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemimagelist");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemImageList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImageList");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfIteminfostruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItempostbuydatastruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemPostBuyDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPostBuyDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItempricestruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemPriceStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPriceStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemslisttype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemsListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsListType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemsurchargestruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemSurchargeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemSurchargeStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfMyaccountstruct2");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.MyAccountStruct2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyAccountStruct2");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNotsolditemstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.NotSoldItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfNotwonitemstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.NotWonItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotWonItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPackageinfostruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PackageInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PackageInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfParameterinfotype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ParameterInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ParameterInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentdetailsstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PaymentDetailsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentDetailsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentitemsstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PaymentItemsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentItemsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentmethodstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PaymentMethodStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentMethodStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPaymentsellersstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PaymentSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentSellersStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPayoutpaymentsstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PayoutPaymentsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutPaymentsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPayoutrefundfromstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PayoutRefundFromStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutRefundFromStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPayoutrefundtostruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PayoutRefundToStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutRefundToStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPhotoinfotype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PhotoInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PhotoInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostagestruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostageStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostageStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformdatastruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformforbuyersdatastruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormForBuyersDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormForBuyersDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformitemdealsadditionalservicestruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormItemDealsAdditionalServiceStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemDealsAdditionalServiceStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformitemdealsstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormItemDealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemDealsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformitemstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformsellersstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormSellersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormSellersStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyformshipmenttrackingstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormShipmentTrackingStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormShipmentTrackingStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPostbuyiteminfostruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyItemInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyItemInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfPriceinfotype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PriceInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PriceInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfProductparametersgroupstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ProductParametersGroupStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersGroupStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfProductparametersstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ProductParametersStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfReasoninfotype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ReasonInfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ReasonInfoType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRefundlisttype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.RefundListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundListType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfRefundsdealslisttype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.RefundsDealsListType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundsDealsListType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellformtype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SellFormType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellitemstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SellItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSellratingaveragestruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SellRatingAverageStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAverageStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentdatastruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ShipmentDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfShipmentpricetypestruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ShipmentPriceTypeStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPriceTypeStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSitejournal");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SiteJournal[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournal");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSitejournaldealsstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SiteJournalDealsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSolditemstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SoldItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStateinfostruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.StateInfoStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StateInfoStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStructsellagain");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.StructSellAgain[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellAgain");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfStructsellfailed");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.StructSellFailed[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellFailed");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSysstatustype");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SysStatusType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SysStatusType");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfTagnamestruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.TagNameStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TagNameStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserblacklistaddresultstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserBlackListAddResultStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListAddResultStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserblackliststruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserBlackListStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserincomingpaymentrefundsstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserIncomingPaymentRefundsStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentRefundsStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserincomingpaymentstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserIncomingPaymentStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpaymentstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserPaymentStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpayoutstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserPayoutStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPayoutStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfUserpostbuydatastruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserPostBuyDataStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPostBuyDataStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfVariantquantitystruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.VariantQuantityStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "VariantQuantityStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfVariantstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.VariantStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "VariantStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfWonitemstruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.WonItemStruct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WonItemStruct");
            qName2 = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AttribStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.AttribStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidItemStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.BidItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BidListStruct2");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.BidListStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListResStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.BlackListResStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "BlackListStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.BlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoriesListType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CategoriesListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryData");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CategoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryPathType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CategoryPathType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CategoryTreeType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CategoryTreeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CatInfoType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CatInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ChangedItemStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ChangedItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyExtraDataStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CompanyExtraDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanyInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CompanyInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CompanySecondAddressStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CompanySecondAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "CountryInfoType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.CountryInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DealsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DurationInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.DurationInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FieldsValue");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FieldsValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilledPostBuyFormsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FilledPostBuyFormsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterOptionsType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FilterOptionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterPriceStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FilterPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterRelationType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FilterRelationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FiltersListType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FiltersListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FilterValueType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FilterValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishFailureStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FinishFailureStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FinishItemsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FinishItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FulfillmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FulfillmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FutureFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FutureFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "FutureItemStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.FutureItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "InvoiceDataStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.InvoiceDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemBilling");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemBilling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemCatList");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemCatList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemDescriptionStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemDescriptionStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemImageList");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemImageList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfo");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoExt");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemInfoExt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPaymentOptions");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemPaymentOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemPriceStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemPriceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemsListType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemSurchargeStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemSurchargeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ItemTemplateCreateStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ItemTemplateCreateStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "MyAccountStruct2");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.MyAccountStruct2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.NotSoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotSoldItemStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.NotSoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "NotWonItemStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.NotWonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ParameterInfoType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ParameterInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentDetailsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PaymentDetailsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentItemsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PaymentItemsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentMethodStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PaymentMethodStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentSellersStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PaymentSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PaymentsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsPayoutStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PaymentsPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PaymentsUserDataStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PaymentsUserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoFrequencyStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PayoutAutoFrequencyStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutAutoSettingsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PayoutAutoSettingsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutPaymentsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PayoutPaymentsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutRefundFromStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PayoutRefundFromStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PayoutRefundToStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PayoutRefundToStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PharmacyDataStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PharmacyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PharmacyRecipientDataStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PharmacyRecipientDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PhotoInfoType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PhotoInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostageStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormAddressStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormAddressStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormDataStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormForBuyersDataStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormForBuyersDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemDealsAdditionalServiceStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormItemDealsAdditionalServiceStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemDealsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormItemDealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemDealsVariantStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormItemDealsVariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormItemStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormPackageInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormPackageInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormSellersStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormSellersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyFormShipmentTrackingStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyFormShipmentTrackingStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PostBuyItemInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PostBuyItemInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PriceInfoType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.PriceInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersGroupStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ProductParametersGroupStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductParametersStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ProductParametersStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ProductStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ProductStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeDateValueStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.RangeDateValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeFloatValueStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.RangeFloatValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeIntValueStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.RangeIntValueStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RangeValueType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.RangeValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ReasonInfoType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ReasonInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundDetailsType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.RefundDetailsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundListType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.RefundListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RefundsDealsListType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.RefundsDealsListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RelatedPersonsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.RelatedPersonsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "RequestPayoutStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.RequestPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SellFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormFieldsForCategoryStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SellFormFieldsForCategoryStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellFormType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SellFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellItemStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SellItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellRatingAverageStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SellRatingAverageStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentDataStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ShipmentDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentPriceTypeStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ShipmentPriceTypeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShipmentTimeStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ShipmentTimeStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ShowUserFeedbacks");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.ShowUserFeedbacks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournal");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SiteJournal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SiteJournalDealsInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalDealsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SiteJournalDealsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SiteJournalInfo");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SiteJournalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldFilterOptionsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SoldFilterOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SoldItemStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SoldItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SortOptionsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SortOptionsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SortOptionsType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SortOptionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StateInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.StateInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellAgain");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.StructSellAgain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "StructSellFailed");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.StructSellFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SysStatusType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.SysStatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "TagNameStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.TagNameStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListAddResultStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserBlackListAddResultStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserBlackListStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserBlackListStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserDataStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentRefundsStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserIncomingPaymentRefundsStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserIncomingPaymentStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserIncomingPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserInfoStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserInfoStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserInfoType");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPaymentStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserPaymentStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPayoutStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserPayoutStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserPostBuyDataStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserPostBuyDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "UserSentToDataStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.UserSentToDataStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "VariantQuantityStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.VariantQuantityStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "VariantStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.VariantStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WonItemStruct");
            cachedSerQNames.add(qName);
            cls = com.pagisoft.datafetcher.soap.model.WonItemStruct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.pagisoft.datafetcher.soap.model.DoAddPackageInfoToPostBuyFormResponse doAddPackageInfoToPostBuyForm(com.pagisoft.datafetcher.soap.model.DoAddPackageInfoToPostBuyFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddPackageInfoToPostBuyForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddPackageInfoToPostBuyForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoAddPackageInfoToPostBuyFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoAddPackageInfoToPostBuyFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoAddPackageInfoToPostBuyFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoAddToBlackListResponse doAddToBlackList(com.pagisoft.datafetcher.soap.model.DoAddToBlackListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddToBlackList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doAddToBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoAddToBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoAddToBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoAddToBlackListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoBidItemResponse doBidItem(com.pagisoft.datafetcher.soap.model.DoBidItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doBidItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoBidItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoBidItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoBidItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoCancelRefundFormResponse doCancelRefundForm(com.pagisoft.datafetcher.soap.model.DoCancelRefundFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelRefundForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCancelRefundForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoCancelRefundFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoCancelRefundFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoCancelRefundFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoChangeItemFieldsResponse doChangeItemFields(com.pagisoft.datafetcher.soap.model.DoChangeItemFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangeItemFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangeItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoChangeItemFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoChangeItemFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoChangeItemFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoChangePriceItemResponse doChangePriceItem(com.pagisoft.datafetcher.soap.model.DoChangePriceItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangePriceItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangePriceItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoChangePriceItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoChangePriceItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoChangePriceItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoChangeQuantityItemResponse doChangeQuantityItem(com.pagisoft.datafetcher.soap.model.DoChangeQuantityItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangeQuantityItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doChangeQuantityItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoChangeQuantityItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoChangeQuantityItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoChangeQuantityItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoCheckItemDescriptionResponse doCheckItemDescription(com.pagisoft.datafetcher.soap.model.DoCheckItemDescriptionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCheckItemDescription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCheckItemDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoCheckItemDescriptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoCheckItemDescriptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoCheckItemDescriptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoCheckNewAuctionExtResponse doCheckNewAuctionExt(com.pagisoft.datafetcher.soap.model.DoCheckNewAuctionExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCheckNewAuctionExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doCheckNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoCheckNewAuctionExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoCheckNewAuctionExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoCheckNewAuctionExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoFinishItemResponse doFinishItem(com.pagisoft.datafetcher.soap.model.DoFinishItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFinishItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFinishItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoFinishItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoFinishItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoFinishItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoFinishItemsResponse doFinishItems(com.pagisoft.datafetcher.soap.model.DoFinishItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doFinishItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doFinishItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoFinishItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoFinishItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoFinishItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetBidItem2Response doGetBidItem2(com.pagisoft.datafetcher.soap.model.DoGetBidItem2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetBidItem2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetBidItem2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetBidItem2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetBidItem2Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetBidItem2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetBlackListUsersResponse doGetBlackListUsers(com.pagisoft.datafetcher.soap.model.DoGetBlackListUsersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetBlackListUsers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetBlackListUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetBlackListUsersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetBlackListUsersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetBlackListUsersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetCategoryPathResponse doGetCategoryPath(com.pagisoft.datafetcher.soap.model.DoGetCategoryPathRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCategoryPath");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCategoryPath"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetCategoryPathResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetCategoryPathResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetCategoryPathResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetCatsDataResponse doGetCatsData(com.pagisoft.datafetcher.soap.model.DoGetCatsDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetCatsDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetCatsDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetCatsDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetCatsDataCountResponse doGetCatsDataCount(com.pagisoft.datafetcher.soap.model.DoGetCatsDataCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsDataCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsDataCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetCatsDataCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetCatsDataCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetCatsDataCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetCatsDataLimitResponse doGetCatsDataLimit(com.pagisoft.datafetcher.soap.model.DoGetCatsDataLimitRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCatsDataLimit");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCatsDataLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetCatsDataLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetCatsDataLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetCatsDataLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetCountriesResponse doGetCountries(com.pagisoft.datafetcher.soap.model.DoGetCountriesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetCountries");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetCountries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetCountriesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetCountriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetCountriesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetDealsResponse doGetDeals(com.pagisoft.datafetcher.soap.model.DoGetDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetFilledPostBuyFormsResponse doGetFilledPostBuyForms(com.pagisoft.datafetcher.soap.model.DoGetFilledPostBuyFormsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFilledPostBuyForms");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFilledPostBuyForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetFilledPostBuyFormsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetFilledPostBuyFormsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetFilledPostBuyFormsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetFreeDeliveryAmountResponse doGetFreeDeliveryAmount(com.pagisoft.datafetcher.soap.model.DoGetFreeDeliveryAmountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetFreeDeliveryAmount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetFreeDeliveryAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetFreeDeliveryAmountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetFreeDeliveryAmountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetFreeDeliveryAmountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetItemFieldsResponse doGetItemFields(com.pagisoft.datafetcher.soap.model.DoGetItemFieldsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetItemFieldsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetItemFieldsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetItemFieldsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetItemsInfoResponse doGetItemsInfo(com.pagisoft.datafetcher.soap.model.DoGetItemsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetItemsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetItemsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetItemsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetItemsListResponse doGetItemsList(com.pagisoft.datafetcher.soap.model.DoGetItemsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetItemsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetItemsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetItemsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetItemsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetItemsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMyBidItemsResponse doGetMyBidItems(com.pagisoft.datafetcher.soap.model.DoGetMyBidItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyBidItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyBidItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyBidItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyBidItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMyBidItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMyCurrentShipmentPriceTypeResponse doGetMyCurrentShipmentPriceType(com.pagisoft.datafetcher.soap.model.DoGetMyCurrentShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyCurrentShipmentPriceType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyCurrentShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyCurrentShipmentPriceTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyCurrentShipmentPriceTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMyCurrentShipmentPriceTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMyDataResponse doGetMyData(com.pagisoft.datafetcher.soap.model.DoGetMyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMyFutureItemsResponse doGetMyFutureItems(com.pagisoft.datafetcher.soap.model.DoGetMyFutureItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyFutureItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyFutureItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyFutureItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyFutureItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMyFutureItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsResponse doGetMyIncomingPayments(com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyIncomingPayments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyIncomingPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsRefundsResponse doGetMyIncomingPaymentsRefunds(com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsRefundsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyIncomingPaymentsRefunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyIncomingPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsRefundsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsRefundsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMyIncomingPaymentsRefundsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMyNotSoldItemsResponse doGetMyNotSoldItems(com.pagisoft.datafetcher.soap.model.DoGetMyNotSoldItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyNotSoldItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyNotSoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyNotSoldItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyNotSoldItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMyNotSoldItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMyNotWonItemsResponse doGetMyNotWonItems(com.pagisoft.datafetcher.soap.model.DoGetMyNotWonItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyNotWonItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyNotWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyNotWonItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyNotWonItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMyNotWonItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsResponse doGetMyPayments(com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsInfoResponse doGetMyPaymentsInfo(com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPaymentsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPaymentsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMyPaymentsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsResponse doGetMyPayouts(com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayouts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsDetailsResponse doGetMyPayoutsDetails(com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsDetailsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyPayoutsDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyPayoutsDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMyPayoutsDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMySellItemsResponse doGetMySellItems(com.pagisoft.datafetcher.soap.model.DoGetMySellItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySellItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySellItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMySellItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMySellItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMySellItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMySoldItemsResponse doGetMySoldItems(com.pagisoft.datafetcher.soap.model.DoGetMySoldItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMySoldItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMySoldItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMySoldItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMySoldItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMySoldItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetMyWonItemsResponse doGetMyWonItems(com.pagisoft.datafetcher.soap.model.DoGetMyWonItemsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetMyWonItems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetMyWonItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyWonItemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetMyWonItemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetMyWonItemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetPaymentMethodsResponse doGetPaymentMethods(com.pagisoft.datafetcher.soap.model.DoGetPaymentMethodsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPaymentMethods");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPaymentMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetPaymentMethodsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetPaymentMethodsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetPaymentMethodsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetPostBuyDataResponse doGetPostBuyData(com.pagisoft.datafetcher.soap.model.DoGetPostBuyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetPostBuyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetPostBuyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetPostBuyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForBuyersResponse doGetPostBuyFormsDataForBuyers(com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForBuyersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsDataForBuyers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsDataForBuyers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForBuyersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForBuyersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForBuyersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForSellersResponse doGetPostBuyFormsDataForSellers(com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForSellersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsDataForSellers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsDataForSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForSellersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForSellersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsDataForSellersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsIdsResponse doGetPostBuyFormsIds(com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsIdsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyFormsIds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyFormsIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsIdsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsIdsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetPostBuyFormsIdsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetPostBuyItemInfoResponse doGetPostBuyItemInfo(com.pagisoft.datafetcher.soap.model.DoGetPostBuyItemInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetPostBuyItemInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetPostBuyItemInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetPostBuyItemInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetPostBuyItemInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetPostBuyItemInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetRefundsDealsResponse doGetRefundsDeals(com.pagisoft.datafetcher.soap.model.DoGetRefundsDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetRefundsDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetRefundsDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetRefundsDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetRefundsListResponse doGetRefundsList(com.pagisoft.datafetcher.soap.model.DoGetRefundsListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetRefundsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetRefundsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetRefundsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetRefundsReasonsResponse doGetRefundsReasons(com.pagisoft.datafetcher.soap.model.DoGetRefundsReasonsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundsReasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetRefundsReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetRefundsReasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetRefundsReasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetRefundsReasonsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetSellFormFieldsForCategoryResponse doGetSellFormFieldsForCategory(com.pagisoft.datafetcher.soap.model.DoGetSellFormFieldsForCategoryRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSellFormFieldsForCategory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSellFormFieldsForCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetSellFormFieldsForCategoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetSellFormFieldsForCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetSellFormFieldsForCategoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetSessionHandleForWidgetResponse doGetSessionHandleForWidget(com.pagisoft.datafetcher.soap.model.DoGetSessionHandleForWidgetRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSessionHandleForWidget");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSessionHandleForWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetSessionHandleForWidgetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetSessionHandleForWidgetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetSessionHandleForWidgetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetShipmentDataResponse doGetShipmentData(com.pagisoft.datafetcher.soap.model.DoGetShipmentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetShipmentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetShipmentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetShipmentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetShipmentPriceTypesResponse doGetShipmentPriceTypes(com.pagisoft.datafetcher.soap.model.DoGetShipmentPriceTypesRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetShipmentPriceTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetShipmentPriceTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetShipmentPriceTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetShipmentPriceTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetShipmentPriceTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetSiteJournalResponse doGetSiteJournal(com.pagisoft.datafetcher.soap.model.DoGetSiteJournalRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetSiteJournalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetSiteJournalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetSiteJournalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsResponse doGetSiteJournalDeals(com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalDeals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsInfoResponse doGetSiteJournalDealsInfo(com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalDealsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalDealsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetSiteJournalDealsInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetSiteJournalInfoResponse doGetSiteJournalInfo(com.pagisoft.datafetcher.soap.model.DoGetSiteJournalInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSiteJournalInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSiteJournalInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetSiteJournalInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetSiteJournalInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetSiteJournalInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetStatesInfoResponse doGetStatesInfo(com.pagisoft.datafetcher.soap.model.DoGetStatesInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetStatesInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetStatesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetStatesInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetStatesInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetStatesInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetSystemTimeResponse doGetSystemTime(com.pagisoft.datafetcher.soap.model.DoGetSystemTimeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetSystemTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetSystemTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetSystemTimeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetSystemTimeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetSystemTimeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetTransactionsIDsResponse doGetTransactionsIDs(com.pagisoft.datafetcher.soap.model.DoGetTransactionsIDsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetTransactionsIDs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetTransactionsIDs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetTransactionsIDsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetTransactionsIDsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetTransactionsIDsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetUserIDResponse doGetUserID(com.pagisoft.datafetcher.soap.model.DoGetUserIDRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetUserIDResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetUserIDResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetUserIDResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoGetUserLoginResponse doGetUserLogin(com.pagisoft.datafetcher.soap.model.DoGetUserLoginRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetUserLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doGetUserLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoGetUserLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoGetUserLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoGetUserLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoLoginResponse doLogin(com.pagisoft.datafetcher.soap.model.DoLoginRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoLoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoLoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoLoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoLoginEncResponse doLoginEnc(com.pagisoft.datafetcher.soap.model.DoLoginEncRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLoginEnc");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLoginEnc"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoLoginEncResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoLoginEncResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoLoginEncResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoLoginWithAccessTokenResponse doLoginWithAccessToken(com.pagisoft.datafetcher.soap.model.DoLoginWithAccessTokenRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doLoginWithAccessToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doLoginWithAccessToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoLoginWithAccessTokenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoLoginWithAccessTokenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoLoginWithAccessTokenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoMyAccount2Response doMyAccount2(com.pagisoft.datafetcher.soap.model.DoMyAccount2Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyAccount2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyAccount2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoMyAccount2Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoMyAccount2Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoMyAccount2Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoMyAccountItemsCountResponse doMyAccountItemsCount(com.pagisoft.datafetcher.soap.model.DoMyAccountItemsCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyAccountItemsCount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyAccountItemsCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoMyAccountItemsCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoMyAccountItemsCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoMyAccountItemsCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoMyBillingResponse doMyBilling(com.pagisoft.datafetcher.soap.model.DoMyBillingRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyBilling");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyBilling"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoMyBillingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoMyBillingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoMyBillingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoMyBillingItemResponse doMyBillingItem(com.pagisoft.datafetcher.soap.model.DoMyBillingItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doMyBillingItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doMyBillingItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoMyBillingItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoMyBillingItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoMyBillingItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoNewAuctionExtResponse doNewAuctionExt(com.pagisoft.datafetcher.soap.model.DoNewAuctionExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doNewAuctionExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoNewAuctionExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoNewAuctionExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoNewAuctionExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoQueryAllSysStatusResponse doQueryAllSysStatus(com.pagisoft.datafetcher.soap.model.DoQueryAllSysStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doQueryAllSysStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doQueryAllSysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoQueryAllSysStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoQueryAllSysStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoQueryAllSysStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoQuerySysStatusResponse doQuerySysStatus(com.pagisoft.datafetcher.soap.model.DoQuerySysStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doQuerySysStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doQuerySysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoQuerySysStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoQuerySysStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoQuerySysStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoRemoveFromBlackListResponse doRemoveFromBlackList(com.pagisoft.datafetcher.soap.model.DoRemoveFromBlackListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveFromBlackList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRemoveFromBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoRemoveFromBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoRemoveFromBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoRemoveFromBlackListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoRequestPayoutResponse doRequestPayout(com.pagisoft.datafetcher.soap.model.DoRequestPayoutRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRequestPayout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doRequestPayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoRequestPayoutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoRequestPayoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoRequestPayoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoSellSomeAgainResponse doSellSomeAgain(com.pagisoft.datafetcher.soap.model.DoSellSomeAgainRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSellSomeAgain");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSellSomeAgain"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoSellSomeAgainResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoSellSomeAgainResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoSellSomeAgainResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoSellSomeAgainInShopResponse doSellSomeAgainInShop(com.pagisoft.datafetcher.soap.model.DoSellSomeAgainInShopRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSellSomeAgainInShop");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSellSomeAgainInShop"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoSellSomeAgainInShopResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoSellSomeAgainInShopResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoSellSomeAgainInShopResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoSendEmailToUserResponse doSendEmailToUser(com.pagisoft.datafetcher.soap.model.DoSendEmailToUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendEmailToUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendEmailToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoSendEmailToUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoSendEmailToUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoSendEmailToUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoSendRefundFormResponse doSendRefundForm(com.pagisoft.datafetcher.soap.model.DoSendRefundFormRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendRefundForm");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSendRefundForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoSendRefundFormResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoSendRefundFormResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoSendRefundFormResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoSetFreeDeliveryAmountResponse doSetFreeDeliveryAmount(com.pagisoft.datafetcher.soap.model.DoSetFreeDeliveryAmountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetFreeDeliveryAmount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetFreeDeliveryAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoSetFreeDeliveryAmountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoSetFreeDeliveryAmountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoSetFreeDeliveryAmountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoSetShipmentPriceTypeResponse doSetShipmentPriceType(com.pagisoft.datafetcher.soap.model.DoSetShipmentPriceTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSetShipmentPriceType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doSetShipmentPriceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoSetShipmentPriceTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoSetShipmentPriceTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoSetShipmentPriceTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoShowItemInfoExtResponse doShowItemInfoExt(com.pagisoft.datafetcher.soap.model.DoShowItemInfoExtRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowItemInfoExt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowItemInfoExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoShowItemInfoExtResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoShowItemInfoExtResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoShowItemInfoExtResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoShowUserResponse doShowUser(com.pagisoft.datafetcher.soap.model.DoShowUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doShowUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doShowUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoShowUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoShowUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoShowUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.pagisoft.datafetcher.soap.model.DoVerifyItemResponse doVerifyItem(com.pagisoft.datafetcher.soap.model.DoVerifyItemRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doVerifyItem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "doVerifyItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.pagisoft.datafetcher.soap.model.DoVerifyItemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.pagisoft.datafetcher.soap.model.DoVerifyItemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.pagisoft.datafetcher.soap.model.DoVerifyItemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
