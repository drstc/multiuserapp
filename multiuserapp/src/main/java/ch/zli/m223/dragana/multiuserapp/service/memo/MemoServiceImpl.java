package ch.zli.m223.dragana.multiuserapp.service.memo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.zli.m223.dragana.multiuserapp.model.memo.Memo;
import ch.zli.m223.dragana.multiuserapp.model.memo.MemoDto;
import ch.zli.m223.dragana.multiuserapp.repository.memo.MemoRepository;

@Service
public class MemoServiceImpl implements MemoService{
	@Autowired
	MemoRepository memoRepository;
	@Override
	public List<MemoDto> getUserMemos(Long userId) {
		
		List<Memo> oldList;
		List<MemoDto> newList;
		
		oldList = memoRepository.findMemoByUserId(userId);
		
		newList = new ArrayList<>();
		
		for (Memo user : oldList) {
			newList.add(new MemoDto(user));
		}
		
		return newList;
	}
	@Override
	public MemoDto createMemo(MemoDto memoDto) {
		
		return new MemoDto(memoRepository.createMemo(memoDto.user, memoDto.note));
	}
	
	@Override
	public void deleteMemo(Long id) {
		
		memoRepository.deleteById(id);
	}

}
