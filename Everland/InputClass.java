package Everland;

import java.util.Scanner;

public class InputClass {
	Scanner sc = new Scanner(System.in);

	int ticket = 3; // 티켓 권종
	int[] id = new int[13]; // 주민번호 배열
	String inputNumArr = ""; // 주민번호 문자열
	int cnt = 0; // 티켓장수
	int Udea = 0; // 우대사항 번호로 
	
	// 권종 선택
	public int Select_ticket() {

		while (!(ticket==1 || ticket==2)) {
			System.out.printf("\n=========================================\n");
			System.out.printf("권종을 선택하세요.\n1. 주간권\n2. 야간권\n");
			ticket = sc.nextInt();
			
		}
		
		return ticket;
	}
	
	//주민번호
	public String Select_id() {
		
		while (true) {
			System.out.printf("\n=========================================\n");
			System.out.printf("주민번호를 입력하세요\n");
	
			inputNumArr = sc.next();
//			sc.nextLine();

			int len = inputNumArr.length();
			
			//형식확인 
			if(len == 13){
				break;
			}
			
		}
		
		return inputNumArr;
	}
	
	//티켓수
	public int Select_ticketNum() {
		while (true) {
			System.out.printf("\n=========================================\n");
			System.out.printf("\n몇개를 주문하시겠습니까?(최대 10개)\n");

			cnt = sc.nextInt();
			
			if (cnt>=1 && cnt<=10) break;

		}
		
		return cnt;
	}
	
	//우대사항
	public int Select_Udea() {
		boolean b = true;
		while (true) {
			System.out.printf("\n=========================================\n");
			System.out.printf("\n 1.없음(나이우대는 자동처리)\n");
			System.out.printf("\n 2.장애인\n");
			System.out.printf("\n 3.국가유공자\n");
			System.out.printf("\n 4.다자녀\n");
			System.out.printf("\n 5.임산부\n");
			
			Udea = sc.nextInt();
			
			if (Udea == 0 || Udea > 5) {
				continue;
			}
			
			break;

		}
		
		return Udea;
	}
}
