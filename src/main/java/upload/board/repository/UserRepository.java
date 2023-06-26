package upload.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upload.board.domain.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email) ;
}
