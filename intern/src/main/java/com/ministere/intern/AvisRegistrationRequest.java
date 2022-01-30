package com.ministere.intern;

public record AvisRegistrationRequest(
        String cin ,
        String reason,
        String date
) {
}
