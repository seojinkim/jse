package member;

import java.util.ArrayList;

public interface MemberService {
	public String logIn(String userId, String password);

	public String update(MemberBean member);

	public String join(MemberBean member);

	public MemberBean searchById(String id);

	public ArrayList<MemberBean> searchByName(String name);

	public String remove(String userId);

	public int countAll();

	public int searchCountByName(String name);

}
