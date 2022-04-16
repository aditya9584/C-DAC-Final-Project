package com.app.dto;

import java.util.List;

import com.app.pojo.PMode;
import com.app.pojo.Product;
import com.app.pojo.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MyOrder {
	
	private List<Product> list ;
	private Status status ;
	private PMode pStatus ;
	
	public List<Product> getList() {
		return list;
	}
	public void setList(List<Product> list) {
		this.list = list;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public PMode getpStatus() {
		return pStatus;
	}
	public void setpStatus(PMode pStatus) {
		this.pStatus = pStatus;
	}
	public MyOrder(List<Product> list, Status status, PMode pStatus) {
		super();
		this.list = list;
		this.status = status;
		this.pStatus = pStatus;
	}
	
	

}
