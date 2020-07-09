package ch.zli.m223.dragana.multiuserapp.model.memo;

import ch.zli.m223.dragana.multiuserapp.model.user.User;

public interface Memo {
	Long getId();
	
	User getUser();
	
	String getNote();
	
	long getDate();
}
