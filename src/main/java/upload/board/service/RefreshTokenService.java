package upload.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import upload.board.domain.RefreshToken;
import upload.board.repository.RefreshTokenRepository;

@Service
@RequiredArgsConstructor
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}
