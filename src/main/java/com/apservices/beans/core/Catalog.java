package com.apservices.beans.core;

import com.apservices.beans.BaseEntity;

/**
 * Created by praveen on 4/19/2015.
 */
public class Catalog extends BaseEntity {
    String identifier;
    String description;
    Vendor vendor;
    double listPrice;
    double discount;
}
