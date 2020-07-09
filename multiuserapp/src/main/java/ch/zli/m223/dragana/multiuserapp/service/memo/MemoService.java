package ch.zli.m223.dragana.multiuserapp.service.memo;

import java.util.List;

import ch.zli.m223.dragana.multiuserapp.model.memo.MemoDto;

public interface MemoService {
	List<MemoDto> getUserMemos(Long userId);

	MemoDto createMemo(MemoDto memoDto);

	void deleteMemo(Long id);
}
