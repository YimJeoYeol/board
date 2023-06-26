package upload.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import upload.board.domain.Article;

@Getter
@Setter
@AllArgsConstructor
public class AddArticleRequest {
    private String title;
    private String content;

    public Article toEntity(String author) {
        return Article.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}
