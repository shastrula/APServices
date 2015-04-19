package com.apservices.beans.core;

import com.apservices.beans.BaseEntity;
import com.apservices.beans.common.Status;

import java.util.Date;

/**
 * Created by praveen on 4/19/2015.
 */
public class Invoice extends BaseEntity {
    Date orderDate;
    Order order;
    Double orderAmount;
    Shipment shipment;
    PaymentInfo paymentInfo;
    Status status;
}
