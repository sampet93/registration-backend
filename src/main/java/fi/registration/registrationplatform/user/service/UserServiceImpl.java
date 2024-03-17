package fi.registration.registrationplatform.user.service;

import fi.registration.registrationplatform.user.dao.UserRepository;
import fi.registration.registrationplatform.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired UserRepository userRepository;

  @Override
  public User getUserById(Long id) {
    return userRepository.findById(id).orElse(null);
  }

  @Override
  public void saveUser(User user) {
    userRepository.save(user);
  }
}
