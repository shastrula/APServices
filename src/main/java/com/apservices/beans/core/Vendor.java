package com.apservices.beans.core;

import com.apservices.beans.BaseEntity;
import com.apservices.beans.common.Address;
import com.apservices.beans.common.User;

/**
 * Created by praveen on 4/19/2015.
 */
public class Vendor extends BaseEntity {
    Address address;
    long rank;
    String department;
    User user;
}
