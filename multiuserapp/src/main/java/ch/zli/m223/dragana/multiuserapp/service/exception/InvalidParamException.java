package ch.zli.m223.dragana.multiuserapp.service.exception;
/*
 * @author Dragana Ristic
 * @version 1.4
 * @date 10.07.20
 */
@SuppressWarnings("serial")
public class InvalidParamException extends RuntimeException {
	
public InvalidParamException(String message) {
		super(message);
	}
}
