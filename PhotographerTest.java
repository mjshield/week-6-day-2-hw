import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  DigitalCamera digitalcamera1;
  AnalogCamera analogcamera1;

  @Before
  public void before() {
    photographer = new Photographer();
    digitalcamera1 = new DigitalCamera("Nixon", "E20");
    analogcamera1 = new AnalogCamera("Foto", "Q4");
  }

  @Test 
  public void digitalCameraHasMake(){
    assertEquals("Nixon", digitalcamera1.getMake());
  }

  @Test 
  public void digitalCameraHasModel(){
    assertEquals("E20", digitalcamera1.getModel());
  }

  @Test 
  public void analogCameraHasMake(){
    assertEquals("Foto", analogcamera1.getMake());
  }

  @Test 
  public void analogCameraHasModel(){
    assertEquals("Q4", analogcamera1.getModel());
  }


  @Test
  public void camerasStartsEmpty(){
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canAdd(){
    photographer.addCamera(digitalcamera1);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemove(){
    photographer.addCamera(digitalcamera1);
    photographer.addCamera(digitalcamera1);
    photographer.removeCamera();
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canPrintAllDetails(){
    photographer.addCamera(digitalcamera1);
    assertEquals("Nixon | E20", photographer.cameraDetails());
  }

}