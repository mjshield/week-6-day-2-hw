import java.util.*;

public class Photographer{
  
  private ArrayList<Printable> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Printable>();
  }

  public int cameraCount(){
    return this.cameras.size();
  }

  public void addCamera(Printable camera){
    this.cameras.add(camera);
  }

  public void removeCamera(){
    this.cameras.remove(0);
  }

  public String cameraDetails(){
    String details = "";

    for (int i = 0 ; i < this.cameras.size(); i++ ) {
      details += this.cameras.get(i).printDetails();
    }

    return details;
  }

}