package study.msa.msadesigntaskcommunity.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import study.msa.msadesigntaskcommunity.presentation.lecture.CommunityHandler;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@EnableWebFlux // WebFlux 설정 활성화
public class WebFluxRouterConfig implements WebFluxConfigurer {

    @Bean
    public RouterFunction<ServerResponse> routerBuilder(CommunityHandler handler) {

        return route()
            .path("/community", helloBuilder ->
                helloBuilder.nest(accept(APPLICATION_JSON), builder ->
                    builder
                        .POST("/communityPostRegistration", handler::communityPostRegistration) // 게시글 작성
                        .GET("/findCommunityPostList", handler::findCommunityPostList) // 게시판 열람
                        .POST("/communityCommentRegistration", handler::communityCommentRegistration) // 댓글 작성
                        .PUT("/communityPostOrCommentHide", handler::communityPostOrCommentHide) // 게시글이나 댓글 숨김 처리
                )
            )
            .build();
    }
}
