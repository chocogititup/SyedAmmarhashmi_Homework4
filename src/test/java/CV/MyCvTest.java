package CV;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MyCvTest {

    @Test
    public void builderCreatesObjectWithFields() {
        MyCv cv = MyCv.builder()
                .name("Ammar")
                .age(30)
                .address("123 Street")
                .email("ammar@example.com")
                .phone("555-1234")
                .education("BS Computer Science")
                .skills("Java, Maven, TestNG")
                .experience("3 years")
                .build();

        assertThat(cv.getName()).isEqualTo("Ammar");
        assertThat(cv.getAge()).isEqualTo(30);
        assertThat(cv.getAddress()).isEqualTo("123 Street");
        assertThat(cv.getEmail()).isEqualTo("ammar@example.com");
        assertThat(cv.getPhone()).isEqualTo("555-1234");
        assertThat(cv.getEducation()).isEqualTo("BS Computer Science");
        assertThat(cv.getSkills()).isEqualTo("Java, Maven, TestNG");
        assertThat(cv.getExperience()).isEqualTo("3 years");
    }
}