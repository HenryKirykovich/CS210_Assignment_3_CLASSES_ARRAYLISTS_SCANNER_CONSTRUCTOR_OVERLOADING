import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Bellevue College, CS1
// 6/9/2025
// Student ID: 202872633
// Description: ASSIGNMENT 3 – CLASSES + ARRAYLISTS + SCANNER + CONSTRUCTOR + OVERLOADING

public class People  {
    
    // Attributes
    private String major;
    private String name;
    private String gender;
    private int age;


    // Set fields by Constructor ?  Requirement?
    public People(String major, String name, String gender, int age) {
        this.major = major;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // array for saving people from file.txt
    public static List<People> peopleList = new ArrayList<>();

    // Constructor 1 to read from file and by creating for any line New Object Person and adding it to the List.   
    public People(String nameOfFile) throws FileNotFoundException {
        Scanner input = new Scanner(new File(nameOfFile));  //declaring scanner and file
        while (input.hasNext()) {    // Reading the from LIne by token!!!!
            String tokenMajor = input.next();  // reading token not line
            String tokenName = input.next();
            String tokenGender = input.next();
            int tokenAge = input.nextInt();  // pass to constructor
            People newPerson = new People(tokenMajor, tokenName, tokenGender, tokenAge); // Create new People object
            peopleList.add(newPerson);  // Add new People object to the list
        }
    }

        // Method 1 show the List of all students OR all teachers
        public void list(String typeMajor) {
            String fullNameMajor = (typeMajor.equalsIgnoreCase("s")) ? "Student" : "Teacher"; // I used ternanry it is shorter and undertodable
            System.out.println("List of people"); // for top of table
            System.out.println("type: " + fullNameMajor); // describing table
            for (int i=0; i<peopleList.size(); i++) {
                People person = peopleList.get(i);
                if (person.major.equalsIgnoreCase(typeMajor)) {
                    System.out.println(person.name);
                }
            }
            
        }

                                                    
        // Method 2 shos List of student or teachers female or male and age greater than or equal to given age
        public void list(String typeMajor, String gender, int age) {
            String fullNameMajor = (typeMajor.equalsIgnoreCase("s")) ? "Student" : "Teacher";
            String fullNameGender = (gender.equalsIgnoreCase("m")) ? "Male" : "Female";
            System.out.println("List of people");
            System.out.println("type: " + fullNameMajor + " gender: " + fullNameGender + " age: >= " + age);
            for (int i=0; i<peopleList.size(); i++) {
                People person = peopleList.get(i);
                if (person.major.equalsIgnoreCase(typeMajor) && person.gender.equalsIgnoreCase(gender) && person.age >= age) {
                    System.out.println(person.name + " " + person.gender + " " + person.age);
                }
            }
        }
    // Methos 3 shows  List of female or male students OR teachers whose age is greater than or equal to given age1 and less than or equal to given age2
    public void list (String typeMajor, String gender, int age1, int age2) {
        String fullNameMajor = (typeMajor.equalsIgnoreCase("s")) ? "Student" : "Teacher";
        String fullNameGender = (gender.equalsIgnoreCase("m")) ? "Male" : "Female";
        System.out.println("List of people");
        System.out.println("type: " + fullNameMajor + " gender: " + fullNameGender + " age: >= " + age1 + " & " + "<= " + age2);
        for (int i=0; i<peopleList.size(); i++) {
            People person = peopleList.get(i);
            if (person.major.equalsIgnoreCase(typeMajor) && person.gender.equalsIgnoreCase(gender) && person.age >= age1 && person.age <= age2) {
                System.out.println(person.name + " " + person.gender + " " + person.age);
            }
        }
    }


        // Method 4 shows us List of students OR teachers whose age is greater than or equal to given age 
        public void list(String typeMajor, int age) {
        String fullNameMajor = (typeMajor.equalsIgnoreCase("s")) ? "Student" : "Teacher";
        System.out.println("List of people");
        System.out.println("type: " + fullNameMajor + " age: >= " + age);
        for (int i=0; i<peopleList.size(); i++) {
            People person = peopleList.get(i);
            if (person.major.equalsIgnoreCase(typeMajor) && person.age >= age) {
                System.out.println(person.name + ", " + person.age);
            }
        }
    }


}

   
   


   


















