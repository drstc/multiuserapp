package ch.zli.m223.dragana.multiuserapp.service.user;

import java.util.List;

import ch.zli.m223.dragana.multiuserapp.model.user.User;
import ch.zli.m223.dragana.multiuserapp.model.user.UserDto;


public interface UserService {
	public List<UserDto> getAllUsers();

	public User getUserById(Long id);

	public User createUser(String name);

	public void deleteUser(Long id);

}
