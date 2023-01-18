package kr.co.sboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.sboard.dao.UserDAO;
import kr.co.sboard.entity.UserEntity;
import kr.co.sboard.repository.UserRepo;
import kr.co.sboard.vo.TermsVO;

@Service
public class UserService {

	@Autowired
	private UserDAO dao;
	
	@Autowired
	private UserRepo repo;
	
	public TermsVO selectTerms() {
		return dao.selectTerms();
	}
	
	public int insertUser(UserEntity vo) {
		String pass = vo.getPass2();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		vo.setPass(encoder.encode(pass));
		
		int result = dao.insertUser(vo);
		
		return result;
	}
	
	public int countUser(String uid) {
		return repo.countByUid(uid);
	}
	
	public int countNick(String nick) {
		return repo.countByNick(nick);
	}
}
