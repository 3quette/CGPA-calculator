import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Milestone{
    double weightage;
    double totalMarks;
    double obtMarks;
    double Marks;
    double courseMarks;
    int numOfassesments;
    double final_Asses_Marks;
    BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
    
public void getinfo()throws IOException{
      System.out.println("Enter total Weightage:");
       weightage=Integer.parseInt(r.readLine());     
      System.out.println("Enter total marks:");
       totalMarks=Double.parseDouble(r.readLine());
      System.out.println("Enter Marks obtained:");
       obtMarks=Double.parseDouble(r.readLine());
      calculateTotal();
}
public void calculateTotal(){
       totalMarks=obtMarks/totalMarks;
       Marks=totalMarks*weightage;
    }
public void getnumofAssgn()throws IOException{
     System.out.println("Enter Total number of Assignments:");
     int numOfAssgn=Integer.parseInt(r.readLine());
     getinfo();
}
public void CourseMarks()throws IOException{
     System.out.println("Enter Total Marks of the Course:");
     courseMarks=Double.parseDouble(r.readLine());

}    
public Double getMarks(){
    return Marks;
}
public Double getCourseMarks(){
    return courseMarks;
}
}    
