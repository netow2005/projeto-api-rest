package projeto.neto.projeto_api_rest.Service.Impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import projeto.neto.projeto_api_rest.Service.UserService;
import projeto.neto.projeto_api_rest.model.User;
import projeto.neto.projeto_api_rest.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public User findbyid(Long id) {
        
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccount_AccountNumber(userToCreate.getAccount().getAccountNumber())  ){
            throw new IllegalArgumentException(" this user already exists. ");
        }
        return userRepository.save(userToCreate);
    }

}
