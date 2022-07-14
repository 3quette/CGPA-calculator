import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Program{
    Semester s;
    int semester;
    double semGPA;
    double CGPA;
    GPA g;
    Course c;
    BufferedReader r=new BufferedReader(new InputStreamReader(System.in));

public void calculateCGPA(Semester s, Course c,GPA g)throws IOException{
   System.out.println("Enter number of semesters:");
   semester=Integer.parseInt(r.readLine());
   for(int i=0;i<semester;i++){
       c.CourseGPA(g);
       s.SemesterGPA(c); 
       semGPA=semGPA+s.GPA;
   }
   CGPA=semGPA/semester;
   System.out.println("\t\t\t\t\t!!__________Program CGPA__________!!: ");
   System.out.println("CGPA: "+CGPA);

}
}