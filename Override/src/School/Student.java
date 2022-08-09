package School;

public class Student extends Teacher {

    public String std;
    public String section;

    //constructor of Teacher

    Student(String name, String subject,String std,String section) {
        super(name, subject);

        this.section=section;
        this.std=std;

        }

     //  Child class constructor


//    public Student(String name, String subject, String std, String section) {
//        super(name, subject);
//        this.std = std;
//        Section = section;
//    }
    // Getter setter

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        section = section;
    }

    void total_no_of_branch(){
        System.out.println("5 branches");
    }

}


