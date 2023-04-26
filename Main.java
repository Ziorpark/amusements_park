package Everland;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputClass inputClass = new InputClass();
//		
//		inputClass.Select_ticket();
		String age = inputClass.Select_id();
//		inputClass.Select_ticketNum();
//		inputClass.Select_Udea();
//		
//		
		calculateClass cc = new calculateClass();
		System.out.println(cc.getAge(age)); // 나이확인
		
	}

}
