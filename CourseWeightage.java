import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class CourseWeightage{

    double courseTotal;
    Quiz q;
    Assignments a;
    Mids m;
    Finals f;
    int course;
    BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
 
public void coursewight(Quiz q,Assignments a,Mids m,Finals f)throws IOException{
       System.out.println("Enter total number of Courses:");
       course=Integer.parseInt(r.readLine());
    /*for(int i=0;i<course;i++){
        numOfCourses.add(q);
        numOfCourses.add(a);
        numOfCourses.add(m);
        numOfCourses.add(f);
    }*/
    for(int i=0;i<course;i++){
       q.quizMarks();
       a.assngMarks();
       m.MidMarks();
       f.FinalMarks();
       courseTotal= q.getmarks()+a.getmarks()+m.getmarks()+f.getmarks(); 
       System.out.println("Course Total: "+courseTotal);  
   }
}
}