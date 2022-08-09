import com.school.*;

public class School {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Madhi", 40, "Maths");
        Teacher teacher2 = new Teacher("bala", 35, "tamil");
        Teacher teacher3 = new Teacher("siva", 29, "science");
        Teacher teacher4 = new Teacher("ranjith", 55, "social");
        Teacher teacher5 = new Teacher("kishore", 44, "English");

        System.out.println(teacher1.getSubject());
        teacher1.setAge(44);
        System.out.println(teacher1.getAge());

        Student student1 = new Student("joseph","5th",'C');
        Student student2 = new Student("jeeva","6th",'b');
        Student student3 = new Student("danush","7th",'a');
        Student student4 = new Student("ragav","8th",'d');
        Student student5 = new Student("sekar","9th",'e');

        System.out.println(student2.getStanded());


        Ground ground1 = new Ground("GSK","adayar","chennai");
        Ground ground2 = new Ground("Arr","kk nagar","chennai");
        Ground ground3 = new Ground("St annis","arumbakkam","chennai");
        Ground ground4 = new Ground("Blossom","velacherry","chennai");
        Ground ground5 = new Ground("Tamarai","OMR","chennai");

        System.out.println(ground3.getName());
        System.out.println(ground3.getPlace());


        Vehicle vehicle1 = new Vehicle("bus",25,10);
        Vehicle vehicle2 = new Vehicle("van",15,7);
        Vehicle vehicle3= new Vehicle("car",5,6);
        Vehicle vehicle4 = new Vehicle("Auto",3,5);
        Vehicle vehicle5 = new Vehicle("bike",1,10);

        System.out.println(vehicle2.getType());
        System.out.println(vehicle2.getSeats());




        Building building1 = new Building("Jvc",5,3);
        Building building2 = new Building("VV",4,2);
        Building building3 = new Building("Chith vihar",3,1);
        Building building4 = new Building("cc",1,1);
        Building building5 = new Building("KC",1,1);

        System.out.println(building2.getFloors());





    }

}
