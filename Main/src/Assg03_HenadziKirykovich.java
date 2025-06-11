// Bellevue College, CS1
// 6/9/2025
// Student ID: 202872633
// Description: ASSIGNMENT 3 – CLASSES + ARRAYLISTS + SCANNER + CONSTRUCTOR + OVERLOADING

public class Assg03_HenadziKirykovich {
    public static void main(String[] args) throws Exception {
        // invoke my class and initialazing object by passing file name
        People p = new People("C:\\Users\\info\\Desktop\\CS1-2\\JavaProjects\\Assignment_3_CLASSES_ARRAYLISTS_SCANNER_CONSTRUCTOR_OVERLOADING\\Main\\src\\people.txt"); // Create People object with file name
        
        
        //Test 
        p.list("s"); // all students
        // p.list("t"); // all teachers
        // p.list("s","f", 18); // female students age>=18
        // p.list("s","m", 20); // male students age>=20
        // p.list("t","f", 30); // female teachers age>=30
        // p.list("t","m", 35); // male teachers age>=35
        // p.list("s","f", 15, 18); //female students age>=15 & age<=18
        p.list("s","m", 15, 20); //male students age>=15 & age<=20
        // p.list("t","f", 30, 40); //female teachers age>=30 & age<=40
        // p.list("t","m", 30, 40); //male teachers age>=30 and age<=40 
  
    }
}
