import java.io.IOException;
class Mids extends Milestone{
 
public void MidMarks()throws IOException{
    System.out.println("__Mids__");
    super.getinfo();
    System.out.println("Marks Obtained in Mid Term:"+super.getMarks());
}
public Double getmarks(){
    return super.getMarks();
}
}