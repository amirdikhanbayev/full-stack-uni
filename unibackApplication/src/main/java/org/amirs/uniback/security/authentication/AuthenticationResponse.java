package org.amirs.uniback.security.authentication;

import lombok.*;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {

    @Getter
    private String accessToken;

    private String refreshToken;




}
