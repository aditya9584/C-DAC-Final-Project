package com.app.service;

import com.app.dto.PlaceOrder;
import com.app.pojo.Order;

public interface IOrderService {
	Order placeCurrentCartOrder(PlaceOrder placeOrder) ;
	
	
}