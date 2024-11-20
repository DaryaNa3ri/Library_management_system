package ir.maktabsharif;

import ir.maktabsharif.model.Accessibility;
import ir.maktabsharif.model.User;
import ir.maktabsharif.repository.entity.impl.UserRepository;
import ir.maktabsharif.repository.entity.impl.UserRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();

        userRepository.insert(User.builder()
                .firstName("Darya")
                .lastName("Naseri")
                .accessibility(Accessibility.LIBRARIAN)
                .build());


    }
}
