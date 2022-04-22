package study.msa.msadesigntaskcommunity.presentation.lecture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import study.msa.msadesigntaskcommunity.application.communityPost.response.CommunityPostRegistrationResponse;
import study.msa.msadesigntaskcommunity.application.communityPost.response.FindCommunityPostListResponse;
import study.msa.msadesigntaskcommunity.infrastructure.config.WebFluxRouterConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommunityHandlerTest {


    private WebTestClient webTestClient;

    @Autowired
    private WebFluxRouterConfig webFluxRouterConfig;
    @Autowired
    private CommunityHandler communityHandler;

    @BeforeEach
    void setUp() {
        webTestClient = WebTestClient
            .bindToRouterFunction( // WebFluxConfig에서 작성한 router를 WebTestClient에 바인딩해준다.
                webFluxRouterConfig.routerBuilder(communityHandler)
            )
            .build();
    }

    /**
     * 게시글 작성
     */
    @Test
    void communityPostRegistration() {

        webTestClient
            .post()
            .uri("/community/communityPostRegistration")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(CommunityPostRegistrationResponse.class);
    }

    /**
     * 게시판 열람
     */
    @Test
    void findCommunityPostList() {

        webTestClient
            .get()
            .uri("/community/findCommunityPostList")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody(FindCommunityPostListResponse.class);
    }

    /**
     * 게시판 열람
     */
    @Test
    void communityCommentRegistration() {

        webTestClient
            .post()
            .uri("/community/communityCommentRegistration")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk();
    }

    /**
     * 게시글이나 댓글 숨김 처리
     */
    @Test
    void communityPostOrCommentHide() {

        webTestClient
            .put()
            .uri("/community/communityPostOrCommentHide")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk();
    }

}