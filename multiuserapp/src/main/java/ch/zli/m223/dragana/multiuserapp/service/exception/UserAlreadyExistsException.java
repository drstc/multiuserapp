package ch.zli.m223.dragana.multiuserapp.service.exception;
/*
 * @author Dragana Ristic
 * @version 1.4
 * @date 10.07.20
 */
@SuppressWarnings("serial")
public class UserAlreadyExistsException extends RuntimeException{
	
	public UserAlreadyExistsException(String message) {
		super(message);
	}
}
