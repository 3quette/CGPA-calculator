import java.io.IOException;
class Finals extends Milestone{

public void FinalMarks()throws IOException{
    System.out.println("__Finals__");
    super.getinfo();
    System.out.println("Marks Obtained in Finals:"+super.getMarks());
}
public Double getmarks(){
    return super.getMarks();
    
}
}