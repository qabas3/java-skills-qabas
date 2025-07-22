public class UserInfo {
    private String name;
    private int age;
    private String email;
    private boolean isActive;

    public UserInfo(String name, int age, String email, boolean isActive) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("IsActive: " + isActive);
    }

    public static void main(String[] args) {
        UserInfo user1 = new UserInfo("Fatma", 20, "Fatma@gmail.com", true);
        UserInfo user2 = new UserInfo("Maryam", 21, "Maryam@gmail.com", true);
        UserInfo user3 = new UserInfo("Ahmed", 26, "Ahmed@gmail.com", false);

        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();

        // Test setter
        user1.setName("Fatma");
        user1.setAge(20);
        user2.setName("Maryam");
        user2.setAge(26);
        user3.setEmail("Ahmed@gmail.com");
        user3.setActive(false);

        // Test getter
        System.out.println("User1 Name: " + user1.getName());
        System.out.println("User2 Age: " + user2.getAge());
        System.out.println("User3 Email: " + user3.getEmail());
        System.out.println("User3 Active: " + user3.isActive());

    }
}
