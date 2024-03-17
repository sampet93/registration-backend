package fi.registration.registrationplatform.user.api;

import fi.registration.registrationplatform.user.model.User;
import fi.registration.registrationplatform.user.service.UserService;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  private static final Logger logger = LoggerFactory.getLogger(UserController.class);

  @Autowired UserService userService;

  @GetMapping("/users/{userId}")
  public ResponseEntity<User> getUserById(@PathVariable Long userId) {
    logger.info("GET-request to find user with id: {}", userId);
    User user = userService.getUserById(userId);

    return Objects.nonNull(user)
        ? new ResponseEntity<>(user, HttpStatus.OK)
        : new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}
