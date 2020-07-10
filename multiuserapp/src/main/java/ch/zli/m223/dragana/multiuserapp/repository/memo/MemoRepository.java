package ch.zli.m223.dragana.multiuserapp.repository.memo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zli.m223.dragana.multiuserapp.model.memo.Memo;
import ch.zli.m223.dragana.multiuserapp.model.memo.MemoImpl;
import ch.zli.m223.dragana.multiuserapp.model.user.User;
import ch.zli.m223.dragana.multiuserapp.model.user.UserImpl;
/*
 * @author Dragana Ristic
 * @version 1.4
 * @date 10.07.20
 */

public interface MemoRepository extends JpaRepository<MemoImpl, Long> {
	
	List<Memo> findMemoByUserId(Long userId);
	
	public default Memo createMemo(User user, String note) {
		
		return save(new MemoImpl(new UserImpl(user), note));
	}
	
}
