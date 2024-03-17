package fi.registration.registrationplatform.user.service;

import fi.registration.registrationplatform.user.model.User;

public interface UserService {

  User getUserById(Long id);

  void saveUser(User user);
}
