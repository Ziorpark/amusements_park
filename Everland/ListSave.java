package Everland;

import java.util.ArrayList;
import java.util.List;

public class ListSave {
	
	private static List<OrderList> data = new ArrayList<OrderList>();
	
	public void setOrderlist(int ticket, int age, int cnt, int Udea, int price, int finalprice) {
		OrderList ol = new OrderList();
		ol.setTicket_kind(ticket);
		ol.setAge(age);
		ol.setTicketCnt(cnt);
		ol.setUdea(Udea);
		ol.setPrice(price);
		ol.setTotalprice(finalprice);
	}
	
	public List<OrderList> getData(){
		return data;
	}

}
