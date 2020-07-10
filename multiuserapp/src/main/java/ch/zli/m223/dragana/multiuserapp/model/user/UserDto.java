package ch.zli.m223.dragana.multiuserapp.model.user;
/*
 * @author Dragana Ristic
 * @version 1.4
 * @date 10.07.20
 */
public class UserDto {
	public long id;
	public String name;
	
	public UserDto() {} // for JPA only
	
	public UserDto(User user) {
		
		id = user.getId();
		name = user.getName();
	}
}
