package study.msa.msadesigntaskcommunity.application.communityPost.response;

import lombok.*;
import study.msa.msadesigntaskcommunity.application.communityPost.response.dto.CommunityPostDTO;

import java.util.List;

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FindCommunityPostListResponse {

    private List<CommunityPostDTO> communityPostDTOList; // 게시글 목록
}
