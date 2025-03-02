package projeto.neto.projeto_api_rest.Service;

import projeto.neto.projeto_api_rest.model.User;

public interface UserService {

    User findbyid(Long id);

    User create(User userToCreate);
}
