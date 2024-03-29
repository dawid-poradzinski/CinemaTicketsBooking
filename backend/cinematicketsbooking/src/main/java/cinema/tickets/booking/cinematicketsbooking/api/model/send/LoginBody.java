package cinema.tickets.booking.cinematicketsbooking.api.model.send;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class LoginBody {

    @NotNull
    @NotBlank
    private String usernameOrEmail;
    @NotNull
    @NotBlank
    private String password;

}
