package study.msa.msadesigntaskcommunity.application.communityPost;

import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntaskcommunity.application.communityPost.response.CommunityPostRegistrationResponse;
import study.msa.msadesigntaskcommunity.application.communityPost.response.FindCommunityPostListResponse;

public interface CommunityPostApplicationService {

    CommunityPostRegistrationResponse communityPostRegistration(ServerRequest request); // 게시글 작성

    FindCommunityPostListResponse findCommunityPostList(ServerRequest request); // 게시판 열람

    void communityCommentRegistration(ServerRequest request); // 댓글 작성
    void communityPostOrCommentHide(ServerRequest request); // 게시글이나 댓글 숨김 처리
}
