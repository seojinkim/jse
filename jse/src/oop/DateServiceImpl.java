package oop;

public class DateServiceImpl implements DateService {

	@Override
	public String getEndDate(int month) {
		int result = 0;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result = 31;
			break;
		case 2:
			result = 29;
			break;
		case 4: case 6: case 9: case 11:
			result = 30;
			break;
		default:
			System.out.println("잘못된 입력(1~12를 벗어난 입력)");
			break;
		}
		if (result != 0) {
			return month + "월의 마지막 날은 " + result + "일";
		} else {
			return "";
		}
	}
}

/*
case 2:
    result = "28일";
    if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) result = "29일";
    break;*/
