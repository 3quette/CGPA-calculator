import java.io.IOException;
class Assignments extends Milestone{
 
public void assngMarks()throws IOException{
    System.out.println("__Assignments__");
    super.getinfo();
    System.out.println("Marks Obtained in Assignments:"+super.getMarks());
}
public Double getmarks(){
    return super.getMarks();
}
}