import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Course{
    double courseTotal;
    GPA g;
    int course;
    String grade;
    Milestone mile;
    int credhrs;
    int totalcredhrs;
    double SemCourseTotal;
    double total;
    double D=1.00;
    double D_plus=1.33;
    double C_minus=1.66;
    double C_plus=2.33;
    double C=2.0;
    double B_minus=2.66;
    double B_plus=3.33;
    double B=3.00;
    double A_minus=3.66;
    double A=4.00;

    BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
    

public void CourseGPA(GPA g)throws IOException{
       System.out.println("Enter total number of Courses:");
       course=Integer.parseInt(r.readLine());
       for(int i=0;i<course;i++){ 
       g.calGPA();
       courseTotal=g.getcoursemarks();
       CalculateCourseTotal(g);
   
 }
}

public void CalculateCourseTotal(GPA g)throws IOException{
    System.out.println("Enter Credit Hours of Course:");
    credhrs=Integer.parseInt(r.readLine());
    System.out.println("Total Weightage:"+courseTotal);
    Cal();
}
public void Cal(){
    if(courseTotal<50){
     grade="F";
     System.out.println("Grade:"+grade);
    }
    else if(courseTotal>=50 && courseTotal<=53){
     grade="D";
     total=D*credhrs;
     totalcredhrs=totalcredhrs+credhrs;
     SemCourseTotal=SemCourseTotal+total;

     System.out.println("Grade:"+grade);
    }
    else if(courseTotal>=54 && courseTotal<57){
     grade="D+";
     total=D_plus*credhrs;
     totalcredhrs=totalcredhrs+credhrs;
     SemCourseTotal=SemCourseTotal+total;
     System.out.println("Grade:"+grade);
    }
    else if(courseTotal>=58 && courseTotal<60){
     grade="C-";
     total=C_minus*credhrs;
     totalcredhrs=totalcredhrs+credhrs;
     SemCourseTotal=SemCourseTotal+total;
     System.out.println("Grade:"+grade);
    }
    else if(courseTotal>=61 && courseTotal<63){
     grade="C";
     total=C*credhrs;
     totalcredhrs=totalcredhrs+credhrs;
     SemCourseTotal=SemCourseTotal+total;
     System.out.println("Grade:"+grade);
    }
    else if(courseTotal>=64 && courseTotal<67){
     grade="C+";
     total=C_plus*credhrs;
     totalcredhrs=totalcredhrs+credhrs;
     SemCourseTotal=SemCourseTotal+total;
     System.out.println("Grade:"+grade);
    }
    else if(courseTotal>=68 && courseTotal<70){
     grade="B-";
     total=B_minus*credhrs;
     totalcredhrs=totalcredhrs+credhrs;
     SemCourseTotal=SemCourseTotal+total;
     System.out.println("Grade:"+grade);
    }
    else if(courseTotal>=71 && courseTotal<74){
     grade="B";
     total=B*credhrs;
     totalcredhrs=totalcredhrs+credhrs;
     SemCourseTotal=SemCourseTotal+total;
     System.out.println("Grade:"+grade);
    }
    else if(courseTotal>=75 && courseTotal<79){
        grade="B+";
        total=B_plus*credhrs;
        totalcredhrs=totalcredhrs+credhrs;
        SemCourseTotal=SemCourseTotal+total;
        System.out.println("Grade:"+grade);
       }
    else if(courseTotal>=80 && courseTotal<84){
        grade="A-";
        total=A_minus*credhrs;
        totalcredhrs=totalcredhrs+credhrs;
        SemCourseTotal=SemCourseTotal+total;
        System.out.println("Grade:"+grade);
       }   
    else if(courseTotal>=85){
     grade="A";
     total=A*credhrs;
     totalcredhrs=totalcredhrs+credhrs;
     SemCourseTotal=SemCourseTotal+total;
     System.out.println("Grade:"+grade);
    }
}
public double getSemCourseTotal(){
    return SemCourseTotal;
}
public int getTotalCredhrs(){
    return totalcredhrs;
}
}