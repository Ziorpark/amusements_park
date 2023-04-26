package Everland;

public class OrderList {
	private String ticket_kind = null;
	private int age;
	private int ticketCnt;
	private String Udea = null;
	private int price;
	private int totalprice;
	
	
	public String getTicket_kind() {
		return ticket_kind;
	}
	public void setTicket_kind(int ticket) {
		
		if (ticket == 1) {
			ticket_kind = "주간권";
		} else {
			ticket_kind = "야간권";
		}
		
		this.ticket_kind = ticket_kind;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTicketCnt() {
		return ticketCnt;
	}
	public void setTicketCnt(int ticketCnt) {
		this.ticketCnt = ticketCnt;
	}
	public String getUdea() {
		return Udea;
	}
	public void setUdea(int udea) {
		
		String treat = null;
		if (udea == 1) {
			treat = "없음";
		} else if (udea == 2) {
			treat = "장애인";
		} else if (udea == 3) {
			treat = "국가유공자";
		} else if (udea == 4) {
			treat = "다자녀";
		} else if (udea == 5) {
			treat = "임산부";
		} else {
			
		}
		
		this.Udea = treat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	
	
}
