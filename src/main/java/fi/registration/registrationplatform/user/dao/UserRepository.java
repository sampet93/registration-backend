package fi.registration.registrationplatform.user.dao;

import fi.registration.registrationplatform.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
