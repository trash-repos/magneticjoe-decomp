import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class magneticjoe
  extends MIDlet
{
  public Display display;
  public static magneticjoe app;
  
  public static void main(String[] paramArrayOfString) {}
  
  public magneticjoe()
  {
    jdField_a_of_type_Magneticjoe = this;
    this.jdField_a_of_type_JavaxMicroeditionLcduiDisplay = Display.getDisplay(this);

    Game locala = new Game();
    Thread localThread = new Thread(locala);

    this.jdField_a_of_type_JavaxMicroeditionLcduiDisplay.setCurrent(locala);
    localThread.start();
  }
  
  public final void startApp() {}
  
  public final void pauseApp() {}
  
  public final void destroyApp(boolean paramBoolean)
  {
    this.jdField_a_of_type_JavaxMicroeditionLcduiDisplay.setCurrent(null);
    notifyDestroyed();
  }
}


/* Location:              /home/m93a/Stažené/magnetic_joe_en.jar!/magneticjoe.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */