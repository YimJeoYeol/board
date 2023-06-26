package upload.board.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import upload.board.domain.Article;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ArticleViewResponse {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String author;

    public ArticleViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.createdAt = article.getCreatedAt();
        this.author = article.getAuthor();
    }
}
