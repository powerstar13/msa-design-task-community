package study.msa.msadesigntaskcommunity.presentation.lecture;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import study.msa.msadesigntaskcommunity.application.communityPost.CommunityPostApplicationService;
import study.msa.msadesigntaskcommunity.application.communityPost.response.CommunityPostRegistrationResponse;
import study.msa.msadesigntaskcommunity.application.communityPost.response.FindCommunityPostListResponse;
import study.msa.msadesigntaskcommunity.presentation.shared.response.ServerResponseFactory;

@Component
@RequiredArgsConstructor
public class CommunityHandler {

    private final ServerResponseFactory serverResponseFactory;
    private final CommunityPostApplicationService communityPostApplicationService;

    /**
     * 게시글 작성
     * --> ‘학생’, ‘사이트 운영자’, ‘강사’는 커뮤니티 게시판에 게시글을 작성할 수 있다.
     * @param request : 작성할 게시글 정보
     * @return Mono<ServerResponse> : 작성된 게시글 정보
     */
    public Mono<ServerResponse> communityPostRegistration(ServerRequest request) {

        CommunityPostRegistrationResponse response = communityPostApplicationService.communityPostRegistration(request);

        return serverResponseFactory.successBodyValue(response);
    }

    /**
     * 게시판 열람
     * --> ‘학생’, ‘사이트 운영자’, ‘강사’는 커뮤니티 게시판을 열람할 수 있다.
     * @param request : 조회할 게시판 정보
     * @return Mono<ServerResponse> : 조회된 게시판 정보
     */
    public Mono<ServerResponse> findCommunityPostList(ServerRequest request) {

        FindCommunityPostListResponse response = communityPostApplicationService.findCommunityPostList(request);

        return serverResponseFactory.successBodyValue(response);
    }

    /**
     * 댓글 작성
     * --> ‘학생’, ‘사이트 운영자’, ‘강사’는 커뮤니티 게시글에 댓글을 작성할 수 있다.
     * @param request : 작성할 댓글 정보
     * @return Mono<ServerResponse> : 댓글 작성 완료
     */
    public Mono<ServerResponse> communityCommentRegistration(ServerRequest request) {

        communityPostApplicationService.communityCommentRegistration(request);

        return serverResponseFactory.successOnly();
    }

    /**
     * 게시글이나 댓글 숨김 처리
     * --> ‘사이트 운영자’는 커뮤니티 게시글이나 댓글을 숨김 처리할 수 있다.
     * @param request : 작성할 댓글 정보
     * @return Mono<ServerResponse> : 댓글 작성 완료
     */
    public Mono<ServerResponse> communityPostOrCommentHide(ServerRequest request) {

        communityPostApplicationService.communityPostOrCommentHide(request);

        return serverResponseFactory.successOnly();
    }
}
