package idusw.springboot.boardthymleaf.repository;

import idusw.springboot.boardthymleaf.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoReposity extends JpaRepository<Memo, Long> {
}
