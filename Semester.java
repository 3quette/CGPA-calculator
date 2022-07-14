import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Semester{
int prgCredhrs;
int semester;
Course c;
double GPA;
BufferedReader r=new BufferedReader(new InputStreamReader(System.in));

public void SemesterGPA(Course c)throws IOException{
   System.out.println("sem c total:"+c.getSemCourseTotal()); 
   GPA=c.getSemCourseTotal()/c.getTotalCredhrs(); 
   System.out.println("\t\t\t\t\t!!__________GPA PER SEMESTER__________!!: ");
   System.out.println("GPA: "+GPA);
}
public Double getGPA(){
   return GPA;
}
}
