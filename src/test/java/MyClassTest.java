import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Date;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServiceImpl userService;

    @Test
    public void testRetrieveUser() {
        // Arrange
        User user = new User("f1", "l1", new Date(), Role.ADMINISTRATEUR);
        Mockito.when(userRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(user));

        // Act
        User retrievedUser = userService.retrieveUser("2");

        // Assert
        Assertions.assertNotNull(retrievedUser);
    }
}
