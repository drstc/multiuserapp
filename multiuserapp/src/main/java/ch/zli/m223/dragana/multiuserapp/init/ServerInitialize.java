package ch.zli.m223.dragana.multiuserapp.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import ch.zli.m223.dragana.multiuserapp.model.user.User;
import ch.zli.m223.dragana.multiuserapp.repository.memo.MemoRepository;
import ch.zli.m223.dragana.multiuserapp.repository.user.UserRepository;

/*
 * @author Dragana Ristic
 * @version 1.4
 * @date 10.07.20
 */

@Component
public class ServerInitialize implements ApplicationRunner {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	MemoRepository memoRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		User user1, user2, user3;
		
		user1 = userRepository.createUser("user1");
		user2 = userRepository.createUser("user2");
		user3 = userRepository.createUser("user3");
		
		memoRepository.createMemo(user1, "note 1 for user 1");
		memoRepository.createMemo(user1, "another note for user 1");
		memoRepository.createMemo(user2, "note 1 for user 2");
		memoRepository.createMemo(user3, "note 1 for user 3");

	}
}