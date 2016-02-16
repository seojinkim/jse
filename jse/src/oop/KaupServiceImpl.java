package oop;

public class KaupServiceImpl implements KaupService {
	String status;

	@Override
	public String getState(double height, double weight) {
		int index = (int) ((weight / (height * height)) * 10000);
		if (index > 30) {
			status = "비만";
		} else if (index > 24) {
			status = "과체중";
		} else if (index > 20) {
			status = "정상";
		} else if (index > 15) {
			status = "저체중";
		} else if (index > 13) {
			status = "마름";
		} else if (index > 10) {
			status = "영양실조";
		} else {
			status = "소모증";
		}
		return status;
	}

	// 접근제한자 + 리턴타입 + 메소드명 + 메소드연산자 + 블럭

}
