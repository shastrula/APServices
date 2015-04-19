package com.apservices.beans.core;

import com.apservices.beans.BaseEntity;
import com.apservices.beans.common.Address;
import com.apservices.beans.common.User;

/**
 * Created by praveen on 4/19/2015.
 */
public class Customer extends BaseEntity {
    String firstName;
    String lastName;
    String middleName;
    Address billAddress;
    Address shipAddress;
    User user;
}
