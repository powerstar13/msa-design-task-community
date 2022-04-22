package study.msa.msadesigntaskcommunity.domain.model.communityComment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum CommunityShowType {

    SHOW("SHOW", "노출"),
    HIDE("HIDE", "숨김");

    private String name;
    private String description;
}
