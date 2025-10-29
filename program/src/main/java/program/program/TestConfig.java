package program.program;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Rafael", "", "", "");
        User u2 = new User(null, "realaf", "", "", "");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }

}
