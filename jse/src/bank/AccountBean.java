package bank;

public class AccountBean {
	// 멤버 필드(멤버변수를 정의한 영역)
	// 멤변은 초기화를 하지 않는다. 지변과의 차이점
	// 멤변은 메소드 밖에 위치하며 메소드들 사이에서 값을 공유한다.
	// POJO plain old java object
	public static String BANK = "한빛뱅크";
	private int accountNo;
	private String name;
	private int money;
	private int password;
	private String msg;

	//멤버메소드 에어리어(멤버메소드를 정의한 영역)
	// 생성자
	public AccountBean() {
		this.accountNo = (int) (Math.random() * 9000) + 1000;
	}
	// 멤변에 값을 입력하고, 조회할 수 있는 메소드인 getter/setter 생성

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "[" + AccountBean.BANK + "] " + this.getName() + " : " + this.getAccountNo() + "계좌, 잔고 " + this.getMoney()
				+ "원";
	}
}
