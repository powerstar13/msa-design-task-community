package study.msa.msadesigntaskcommunity.application.communityPost.response.dto;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommunityCommentDTO {

    private Long communityCommentId; // 댓글 고유번호

    private Long communityPostId; // 게시글 고유번호

    private String communityCommentContent; // 댓글 내용
}
