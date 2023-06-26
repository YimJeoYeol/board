package upload.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upload.board.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
