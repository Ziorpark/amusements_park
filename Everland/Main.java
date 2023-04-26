package Everland;

import java.util.HashMap;
import java.util.HashSet;

public class Main{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputClass inputClass = new InputClass();
		calculateClass cc = new calculateClass();
		
		int ticket = inputClass.Select_ticket();
		String age = inputClass.Select_id();
		int age2 = cc.getAge(age);
		int cnt = inputClass.Select_ticketNum();
		int Udea = inputClass.Select_Udea();
		int price = cc.getPrice(age2, ticket);
		int finalprice = cc.getDiscount(Udea, price);
		
		//System.out.println(cc.getAge(age)); // 나이확인
		//System.out.println(price); // 가격 확인
		//System.out.println(finalprice); //할인된 가격 확인
		
		ListSave save = new ListSave();
		save.setOrderlist(ticket, ticket, cnt, Udea, price, finalprice);


//		System.out.printf("\"권종 : %s, 나이 : %s, 갯수 : %s, 우대 : %s, 가격 : %s, 할인적용가 : %s\n",
//					info[0], info[1], info[2], info[3], info[4], info[5]);

		
		
	}

}
