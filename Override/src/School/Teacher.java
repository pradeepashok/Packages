package School;

public class Teacher {

    public String name;
    public String subject;

    void total_no_of_branch(){
        System.out.println("three to four not specific");
    }

    Teacher (String name, String subject){
        this.name = name;
        this.subject= subject;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
