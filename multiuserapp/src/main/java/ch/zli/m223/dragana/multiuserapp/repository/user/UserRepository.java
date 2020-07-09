package ch.zli.m223.dragana.multiuserapp.repository.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zli.m223.dragana.multiuserapp.model.user.User;
import ch.zli.m223.dragana.multiuserapp.model.user.UserImpl;


public interface UserRepository extends JpaRepository<UserImpl, Long> {

	public default List<User> findAllUsers() {
		
		return new ArrayList<User>(findAll());
	}
	
	public User findUserByName(String name);
	
	public default User createUser(String name) {
		
		return save(new UserImpl(name));
	}
}
