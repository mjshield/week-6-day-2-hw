public class AnalogCamera extends Camera implements Printable{

  private String make;
  private String model;

  public AnalogCamera(String make, String model){
    this.make = make;
    this.model = model;
  }


  public String printDetails(){
    return this.make + " | " + this.model;
  }

  public String getMake(){
    return this.make;
  }

  public String getModel(){
    return this.model;
  }

}