package bank;

public class AccountServiceImpl implements AccountService {
	AccountBean account = new AccountBean();

	@Override
	public String open(String name, int password) {
		account.setName(name);
		account.setPassword(password);
		return account.toString();
	}

	@Override
	public String deposit(int money) {
		account.setMoney(account.getMoney() + money);
		return account.toString();
	}

	@Override
	public String withdraw(int money) {
		if (account.getMoney() > money) {
			account.setMoney(account.getMoney() - money);
		} else {
			System.out.println("돈 부족ㅎㅎ");
		}
		return account.toString();
	}

	@Override
	public String search() {
		return account.toString();
	}
}
