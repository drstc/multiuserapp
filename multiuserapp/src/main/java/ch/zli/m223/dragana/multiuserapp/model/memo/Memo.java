package ch.zli.m223.dragana.multiuserapp.model.memo;

import ch.zli.m223.dragana.multiuserapp.model.user.User;
/*
 * @author Dragana Ristic
 * @version 1.4
 * @date 10.07.20
 */
public interface Memo {
	Long getId();
	
	User getUser();
	
	String getNote();
	
	long getDate();
}
