package member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService {
	Map<String, MemberBean> memberMap;

	public MemberServiceImpl() {
		memberMap = new HashMap<String, MemberBean>();
	}

	@Override
	public String logIn(String userId, String password) {
		String result = "로그인 실패";
		if (memberMap.get(userId).getPassword().equals(password)) {
			result = "로그인 성공";
		}
		return result;
	}

	@Override
	public String update(MemberBean member) {
		String result = "업데이트 실패";
		if (memberMap.get(member.getUserId()).getPassword().equals(member.getPassword())) {
			memberMap.replace(member.getUserId(), member);
			result = "업데이트 성공";
		}
		return result;
	}

	@Override
	public String join(MemberBean member) {
		// 회원가입
		String result = "회원가입 실패";
		if (memberMap.put(member.getUserId(), member) == null) {
			result = "회원가입 성공";
		}
		return result;
	}

	@Override
	public MemberBean searchById(String id) {
		// 아이디로 회원정보 검색
		return memberMap.get(id);
	}

	@Override
	public ArrayList<MemberBean> searchByName(String name) {
		// 이름으로 회원정보 검색
		ArrayList<MemberBean> tmpMemList = new ArrayList<MemberBean>();
		for (String key : memberMap.keySet()) {
			if (memberMap.get(key).getName().equals(name)) {
				tmpMemList.add(memberMap.get(key));
			}
		}
		return tmpMemList;
	}

	@Override
	public String remove(String userId) {
		// 회원 탈퇴
		String result = "탈퇴 실패";
		if (memberMap.remove(userId) != null) {
			result = "탈퇴 성공";
		}
		return result;
	}

	@Override
	public int countAll() {
		// 회원 수
		//return memberList.size();
		return memberMap.size();
	}

	@Override
	public int searchCountByName(String name) {
		//이름으로 회원수 검색
		int idx = 0;
		for (String key : memberMap.keySet()) {
			if (memberMap.get(key).getName().equals(name)) {
				idx++;
			}
		}
		return idx++;
	}

}
