package org.amirs.uniback.security.jwt;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class JwtToken {

    public String token;

    public boolean revoked;

    public boolean expired;
}
