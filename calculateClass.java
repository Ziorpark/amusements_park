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
	
	
}
