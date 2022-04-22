package study.msa.msadesigntaskcommunity.application.communityPost.response;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommunityPostRegistrationResponse {

    private long communityPostId; // 게시글 고유번호
}
