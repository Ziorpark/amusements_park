package Everland;

public class finalPrint {
	public String[] print_Finalticket(int[] ticketList) {
		String[] info = new String[6];
		
		// 권종
		if (ticketList[0] == 1) {
			info[0] = "주간권";
		} else {
			info[0] = "야간권";
		}
		
		// 나이
		info[1] = Integer.toString(ticketList[1]);
		
		// 갯수
		info[2] = Integer.toString(ticketList[2]);
		
		// 우대사항
		if (ticketList[3] == 1) {
			info[3] = "없음";
		} else if (ticketList[3] == 2) {
			info[3] = "장애인";
		} else if (ticketList[3] == 3) {
			info[3] = "국가유공자";
		} else if (ticketList[3] == 4) {
			info[3] = "다자녀";
		} else if (ticketList[3] == 5) {
			info[3] = "임산부";
		} else {
			
		}
		
		// 가격
		info[4] = Integer.toString(ticketList[4]);
		
		// 할인적용가
		info[5] = Integer.toString(ticketList[5]);
		
		return info;
	}
}
