public class Person {
    public String name;
    public String gender;
    public String dob;
    public String address;
    public String email;
    public String phone;

    public void showPerson() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phone);
    }

    public void main(String[] args) {
        Person person = new Person();
        person.name = "Sophat LEAT";
        person.gender = "Male";
        person.dob = "10/10/2001";
        person.address = "Phnom Penh, Cambodia";
        person.email = "info.sophat@gmail.com";
        person.phone = "096 918 3363";
        person.showPerson();
    }
}
