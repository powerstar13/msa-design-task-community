package study.msa.msadesigntaskcommunity.application.communityPost;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import study.msa.msadesigntaskcommunity.application.communityPost.response.CommunityPostRegistrationResponse;
import study.msa.msadesigntaskcommunity.application.communityPost.response.FindCommunityPostListResponse;

@Service
public class CommunityPostApplicationServiceImpl implements CommunityPostApplicationService {

    @Override
    public CommunityPostRegistrationResponse communityPostRegistration(ServerRequest request) {
        return CommunityPostRegistrationResponse.builder().build();
    }

    @Override
    public FindCommunityPostListResponse findCommunityPostList(ServerRequest request) {
        return FindCommunityPostListResponse.builder().build();
    }

    @Override
    public void communityCommentRegistration(ServerRequest request) {}

    @Override
    public void communityPostOrCommentHide(ServerRequest request) {}
}
