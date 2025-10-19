package CV;

public class MyCv {
    private String name;
    private int age;
    private String address;
    private String email;
    private String phone;
    private String education;
    private String skills;
    private String experience;

    public MyCv() {}

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final MyCv instance = new MyCv();

        public Builder name(String name) { instance.name = name; return this; }
        public Builder age(int age) { instance.age = age; return this; }
        public Builder address(String address) { instance.address = address; return this; }
        public Builder email(String email) { instance.email = email; return this; }
        public Builder phone(String phone) { instance.phone = phone; return this; }
        public Builder education(String education) { instance.education = education; return this; }
        public Builder skills(String skills) { instance.skills = skills; return this; }
        public Builder experience(String experience) { instance.experience = experience; return this; }

        public MyCv build() { return instance; }
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getEducation() { return education; }
    public String getSkills() { return skills; }
    public String getExperience() { return experience; }
}