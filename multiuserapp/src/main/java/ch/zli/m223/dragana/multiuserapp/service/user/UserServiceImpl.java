package ch.zli.m223.dragana.multiuserapp.service.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.zli.m223.dragana.multiuserapp.model.user.User;
import ch.zli.m223.dragana.multiuserapp.model.user.UserDto;
import ch.zli.m223.dragana.multiuserapp.repository.user.UserRepository;
import ch.zli.m223.dragana.multiuserapp.service.exception.InvalidParamException;
import ch.zli.m223.dragana.multiuserapp.service.exception.UserAlreadyExistsException;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	
	public List<UserDto> getAllUsers() {
		
		List<User> oldList;
		List<UserDto> newList;
		
		oldList = userRepository.findAllUsers();
		
		newList = new ArrayList<>();
		
		for (User user : oldList) {
			newList.add(new UserDto(user));
		}
		
		return newList;
	}

	public User getUserById(Long id) {
		
		if (id == null) {
			// TODO error handling
		}
		
		return userRepository.findById(id).orElseThrow(RuntimeException::new); // throw better exception
	}

	public User createUser(String name) {
		
		// Check input
		if (name == null) {
			throw new InvalidParamException(
				String.format("Name: %s", name)
			);
		}
		
		// Check logic: user may already exist
		
		User existingUser;
		
		existingUser = userRepository.findUserByName(name);
		
		if (existingUser != null) {
			throw new UserAlreadyExistsException(
				String.format("Name: %s", name)
			);
		}
		
		return userRepository.createUser(name);
	}

	public void deleteUser(Long id) {
		
		userRepository.deleteById(id);
	}

	
}
