package ch.zli.m223.dragana.multiuserapp.model.memo;

import ch.zli.m223.dragana.multiuserapp.model.user.User;

public class MemoDto {
	public long id;
	public User user;
	public String note;
	public long date;
	
	public MemoDto() {} // for JPA only
	
	public MemoDto(Memo memo) {
		
		id = memo.getId();
		user = memo.getUser();
		note = memo.getNote();
		date = memo.getDate();
	}
}
