package idusw.springboot.boardthymleaf.repository;

import idusw.springboot.boardthymleaf.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<MemoEntity, Long> {
    // Repository 는 Data를 Access 하는 객체, Entity(table, view, index ...)

}
