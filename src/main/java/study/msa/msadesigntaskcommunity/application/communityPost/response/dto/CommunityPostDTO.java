package study.msa.msadesigntaskcommunity.application.communityPost.response.dto;

import lombok.*;

import java.util.List;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommunityPostDTO {

    private Long communityPostId; // 게시글 고유번호

    private String communitySubject; // 게시글 제목
    private String communityContent; // 게시글 내용

    private List<CommunityCommentDTO> communityCommentDTOList; // 댓긂 목록
}
