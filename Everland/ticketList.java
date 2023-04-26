package Everland;

import java.util.*;

public class ticketList {
	private List<finalPrint> data = new ArrayList<finalPrint>(); 
	static int[] ticketList = new int[6]; // 티켓 
	
	// 한사람당 티켓을 리스트 만들어주고
	public void finalticketList(int ticket, int age, int cnt, int Udea, int price, int finalprice) {
		finalPrint fp = new finalPrint();
		String[] info = fp.print_Finalticket(ticketList);
		
		ticketList[0] = ticket;
		ticketList[1] = age;
		ticketList[2] = cnt;
		ticketList[3] = Udea;
		ticketList[4] = price;
		ticketList[5] = finalprice;
	}
	
	// 전체 티켓의 정보를 data로 만들어줌
}
