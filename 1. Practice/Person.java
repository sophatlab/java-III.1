public class Person {
    public String name;
    public String gender;
    public String dob;
    public String nationalId;
    public String address;
    public String email;
    public String phone;

    public void showPerson() {
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Date of Birth: " + this.dob);
        System.out.println("National ID: " + this.nationalId);
        System.out.println("Address: " + this.address);
        System.out.println("Email: " + this.email);
        System.out.println("Phone Number: " + this.phone);
    }

    // public void main(String[] args) {
    //     Person person = new Person();
    //     person.name = "Sophat LEAT";
    //     person.gender = "Male";
    //     person.dob = "10/10/2001";
    //     person.nationalId = "101010101010";
    //     person.address = "Phnom Penh, Cambodia";
    //     person.email = "info.sophat@gmail.com";
    //     person.phone = "096 918 3363";
    //     person.showPerson();
    // }
}
