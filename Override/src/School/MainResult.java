package School;

public class MainResult {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Raja", "Social");
        Student student= new Student("vinoth","All","6th","c");

        student.total_no_of_branch();
        student.getStd();
        System.out.println(student.getSection());


    }
}
