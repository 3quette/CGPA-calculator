import java.io.IOException;
class Quiz extends Milestone{
  
public void quizMarks()throws IOException{
    System.out.println("__Quiz__");
    super.getinfo();
    System.out.println("Marks Obtained in Quiz:"+super.getMarks());
}
public Double getmarks(){
    return super.getMarks();
}
}