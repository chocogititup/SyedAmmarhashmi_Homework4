package cv;

import org.testng.annotations.*;
import static org.assertj.core.api.Assertions.*;

public class MyCvTest {

    private MyCv myCv;

    @BeforeClass
    public void setupCv() {
        // Create CV using Lombok Builder
        myCv = MyCv.builder()
                .name("Ammar")
                .age(20)
                .address("Newtown Street")
                .email("ammar@gmail.com")
                .phone("+91-995551234")
                .education("BS Computer Science")
                .skills("Java, Maven, TestNG")
                .experience("1 years")
                .build();
    }

    @Test
    public void printCv() {
        System.out.println("======================================");
        System.out.println("            MY CURRICULUM VITAE       ");
        System.out.println("======================================");
        System.out.println("Name        : " + myCv.getName());
        System.out.println("Age         : " + myCv.getAge());
        System.out.println("Address     : " + myCv.getAddress());
        System.out.println("Email       : " + myCv.getEmail());
        System.out.println("Phone       : " + myCv.getPhone());
        System.out.println("Education   : " + myCv.getEducation());
        System.out.println("Skills      : " + myCv.getSkills());
        System.out.println("Experience  : " + myCv.getExperience());
        System.out.println("======================================");
    }

    @AfterClass
    public void validateCvFields() {
        assertThat(myCv.getName()).isNotBlank();
        assertThat(myCv.getAge()).isGreaterThan(0);
        assertThat(myCv.getAddress()).isNotBlank();
        assertThat(myCv.getEmail()).contains("@");
        assertThat(myCv.getPhone()).isNotBlank();
        assertThat(myCv.getEducation()).isNotBlank();
        assertThat(myCv.getSkills()).isNotBlank();
        assertThat(myCv.getExperience()).isNotBlank();

        System.out.println("\n✅ All CV fields are valid and complete!");
    }
}
