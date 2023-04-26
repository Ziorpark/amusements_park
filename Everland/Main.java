package Everland;

import java.util.HashMap;
import java.util.HashSet;

public class Main{
	
	static int[] ticketList = new int[6]; // 티켓 권종
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputClass inputClass = new InputClass();
		
		int ticket = inputClass.Select_ticket();
		String age = inputClass.Select_id();
		int cnt = inputClass.Select_ticketNum();
		int Udea = inputClass.Select_Udea();
		
		calculateClass cc = new calculateClass();
		int price = cc.getPrice(cc.getAge(age), ticket);
		int finalprice = cc.getDiscount(Udea, price);
		
		//System.out.println(cc.getAge(age)); // 나이확인
		//System.out.println(price); // 가격 확인
		//System.out.println(finalprice); //할인된 가격 확인
		
		ticketList[0] = ticket;
		ticketList[1] = cc.getAge(age);
		ticketList[2] = cnt;
		ticketList[3] = Udea;
		ticketList[4] = price;
		ticketList[5] = finalprice;
		
		// 최종확인
//		for (Integer x : ticketList) {
//			System.out.printf("%d ", x);
//		}
		
		
	}

}
