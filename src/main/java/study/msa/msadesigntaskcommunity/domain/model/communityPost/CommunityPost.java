package study.msa.msadesigntaskcommunity.domain.model.communityPost;

import lombok.*;
import study.msa.msadesigntaskcommunity.domain.model.communityComment.CommunityComment;
import study.msa.msadesigntaskcommunity.domain.model.communityComment.CommunityShowType;

import java.util.List;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommunityPost {

    private Long communityPostId; // 게시글 고유번호

    private Long communityPostWriterId; // 게시글 작성자 고유번호
    private MemberTargetType memberTargetType; // 게시글 작성자 유형

    private String communitySubject; // 게시글 제목
    private String communityContent; // 게시글 내용

    private CommunityShowType communityShowType; // 게시글 노출 여부

    private List<CommunityComment> communityCommentList; // 댓글 목록

}
