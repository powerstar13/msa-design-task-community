package study.msa.msadesigntaskcommunity.domain.model.communityComment;

import lombok.*;
import study.msa.msadesigntaskcommunity.domain.model.communityPost.MemberTargetType;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommunityComment {

    private Long communityCommentId; // 댓글 고유번호

    private Long communityPostId; // 게시글 고유번호
    private Long communityCommentWriterId; // 댓글 작성자 고유번호
    private MemberTargetType communityCommentType; // 댓글 작성자 유형

    private String communityCommentContent; // 댓글 내용

    private CommunityShowType communityShowType; // 댓글 노출 여부
}
