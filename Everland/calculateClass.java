package Everland;

import java.time.LocalDate;

public class calculateClass {
	
	// 나이 계산
	public int getAge(String id) {
		int year = 0;
		int month = 0;
		int day = 0;
		int flag = 0;
		
		// 배열에 저장
		String[] arr = new String[13];
		for (int i = 0 ; i < id.length(); i++) {
			char ch = id.charAt(i);
			arr[i] = Character.toString(ch);
		}
		
		// 1900년생과 2000년생 구분하기
		year = Integer.parseInt(arr[0] + arr[1]);
		flag = Integer.parseInt(arr[6]);
		if (flag == 1 || flag == 2) {
			year += 1900;
		} else {
			year += 2000;
		}
		
		int nowyear = LocalDate.now().getYear();
		int age = nowyear - year;
		
		// 생일이 지났을까?
		month = Integer.parseInt(arr[2] + arr[3]);
		day = Integer.parseInt(arr[4] + arr[5]);
	
		if (month > LocalDate.now().getMonthValue()) {
			age = age - 1;
		} else if (month == LocalDate.now().getMonthValue() && day > LocalDate.now().getDayOfMonth()) {
			age = age - 1;
		}
		
		return age;

	}
	
	// 티켓가격
	public int getPrice(int age, int ticket) {
		
		if (age>=19 && age<=64 && ticket == 1) { // 19세 이상 64이하 주간권
			return 56000;
		} else if (age>=19 && age<=64 && ticket == 2) { // 19세 이상 64세이하 야간권
			return 46000;
		} else if (age>=13 && age<=18 && ticket == 1) { // 13세 이상 18세 이하 주간권
			return 47000;
		} else if (age>=13 && age<=18 && ticket == 2) { // 13세 이상 18세 이하 야간권
			return 40000;
		} else if (age>=3 && age<=12 && ticket == 1) { // 3세 이상 12세 이하 주간권
			return 44000;
		} else if (age>=3 && age<=12 && ticket == 2) { // 3세 이상 12세 이하 야간권
			return 37000;
		} else {
			return 0; // 2세 이하 65세 이상
		}
	}
	
	// 우대사항 적용
	public int getDiscount(int Udea, int price) {
		
		int totalPrice = 0;
		
		if (Udea==1){
			totalPrice = price; // 할인적용 없음
		} else if (Udea==2){
			totalPrice = (int) (price *  0.6); // 할인 40
		} else if (Udea==3){ 
			totalPrice = (int) (price *  0.5); // 할인 50
		} else if (Udea==4){
			totalPrice = (int) (price *  0.8); // 할인 20
		} else if (Udea==5){
			totalPrice = (int) (price *  0.85); // 할인 15
		} else {
			totalPrice = 0; // 그외 0으로 
		}

		return totalPrice;
	}
	
	
}
