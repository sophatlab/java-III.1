public class Student extends Person
{
    public String studentID;

    public void showStudent() {
        System.out.println("Student ID: " + studentID);
        super.showPerson();
    }

    public void main(String[] arg) {
        Student student = new Student();
        student.studentID = "TT02222";
        student.name = "Leat Sophat";
        student.gender = "Male";
        student.nationalId = "101010101";
        student.dob = "10/10/2001";
        student.address = "Phnom Penh";
        student.email = "info.sophat@gmail.com";
        student.phone = "01010101010";
        student.showStudent();
    }
}