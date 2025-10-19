package CV;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MyCv {
    private String name;
    private int age;
    private String address;
    private String email;
    private String phone;
    private String education;
    private String skills;
    private String experience;
}
