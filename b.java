import com.nokia.mid.ui.FullCanvas;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;

public abstract class loadGameResources
  extends FullCanvas
  implements Runnable
{
  public static int ak;
  public static int al;
  public static int am;
  public static int an;
  public final Font a;
  public int ao;
  public int ap;
  public long a;
  public long b;
  public Font b;
  public int aq;
  public String c;
  public String d;
  public String e;
  public String f;
  public String[] a;
  public int ar;
  public int as;
  public byte[] e;
  public byte e;
  public byte f;
  public Image e;
  public int at;
  public Random a;
  public Graphics a;
  public int au;
  public int[] j;
  public int[] k;
  public RecordStore a;
  
  public loadGameResources()
  {
    Font.getFont(64, 1, 0);
    this.jdField_a_of_type_JavaxMicroeditionLcduiFont = Font.getFont(64, 1, 8);
    new short[] { 25, 25, -50, -75 }[4] = 50;
    this.ao = 9;
    this.ap = (65536000 / this.ao >> 16);
    this.b = null;
    this.aq = 0;
    this.c = "/res_s60";
    this.d = "/snd_2_full";
    this.jdField_e_of_type_JavaLangString = "/data";
    this.jdField_f_of_type_JavaLangString = "/lang_en";
    this.ar = -3;
    this.as = 0;
    this.jdField_e_of_type_Byte = 3;
    this.jdField_f_of_type_Byte = 1;
    this.jdField_a_of_type_JavaxMicroeditionLcduiGraphics = null;
    this.j = new int[100];
    this.k = new int[100];
    this.jdField_a_of_type_JavaxMicroeditionRmsRecordStore = null;
  }
  
  public final int a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6)
  {
    this.au = 0;
    int i = 0;
    this.j[0] = 0;
    this.k[0] = 0;
    int m = paramString.length();
    int n = 0;
    int i1 = 0;
    while ((i < m) && (((this.au - paramInt5) * this.aq <= paramInt4) || (paramInt5 < 0)))
    {
      char c1 = paramString.charAt(i);
      i1 = this.b.charWidth(c1);
      if ((c1 == ' ') || (c1 == '\n')) {
        this.k[this.au] = (i - 1);
      }
      if (c1 == '\n') {
        i1 = paramInt3 + 1;
      }
      if (n + i1 > paramInt3)
      {
        if (this.k[this.au] == 0)
        {
          this.k[this.au] = (i - 1);
          this.j[(++this.au)] = i;
        }
        else
        {
          this.au += 1;
          i = this.j[this.au] = this.k[(this.au - 1)] + 2;
          this.k[this.au] = 0;
        }
        n = 0;
      }
      else
      {
        n += i1;
        i++;
      }
    }
    if (i > this.j[this.au]) {
      this.k[(this.au++)] = (i - 1);
    }
    if (paramInt5 < 0) {
      paramInt5 += this.au;
    }
    if ((this.au - paramInt5) * this.aq > paramInt4)
    {
      if (paramBoolean) {
        return 0;
      }
      this.au = (paramInt4 / this.aq + paramInt5);
      n = -1;
    }
    for (i = paramInt5; i < this.au; i++)
    {
      int i2 = paramGraphics.getColor();
      paramGraphics.setColor(0);
      paramGraphics.drawString(paramString.substring(this.j[i], this.k[i] + 1), paramInt1 + 1, 1 + paramInt2 + this.aq * (i - paramInt5), paramInt6);
      paramGraphics.setColor(i2);
      paramGraphics.drawString(paramString.substring(this.j[i], this.k[i] + 1), paramInt1, paramInt2 + this.aq * (i - paramInt5), paramInt6);
    }
    i1 = (this.au - paramInt5) * this.aq;
    if (n == -1) {
      return -i1;
    }
    return i1;
  }
  
  public final void a(Graphics paramGraphics, Font paramFont, boolean paramBoolean)
  {
    if ((paramBoolean) && (this.b == paramFont)) {
      return;
    }
    paramGraphics.setFont(paramFont);
    this.b = paramFont;
    this.aq = (paramFont.getHeight() + 2);
  }
  
  public final int randUnsigned(int max)
  {
    return Math.abs(this.jdField_a_of_type_JavaUtilRandom.nextInt()) % max;
  }
  
  public final int randSigned(int max)
  {
    return this.jdField_a_of_type_JavaUtilRandom.nextInt() % max;
  }
  
  public final void somethingWithLocale()
  {
    byte[] arrayOfByte;
    int i;
    char[] arrayOfChar = new char[(i = (arrayOfByte = getSomeResource(this.jdField_f_of_type_JavaLangString + "/text.txt")).length / 2) + 2];
    int[] arrayOfInt = new int[i + 2];
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    0[(i2++)] = 0;
    m = 2;
    n = (0xFF & arrayOfByte[m]) + ((0xFF & arrayOfByte[(m + 1)]) << 8);
    arrayOfChar[(i1++)] = ((char)n);
    if (i1 > 1)
    {
      arrayOfChar[(i1 - 2)] = '\n';
      if (arrayOfChar[(i1 - 1)] == '\\') {
        if ((arrayOfChar[(i1 - 2)] == '\r') && (arrayOfChar[(i1 - 1)] == '\n'))
        {
          i1 -= 2;
          arrayOfInt[(i2++)] = (arrayOfChar[(i1 - 2)] == '\\' ? i1-- : arrayOfChar[(i1 - 1)] == 'n' ? i1-- : i1);
        }
      }
    }
    m += 2;
    arrayOfInt[i2] = i1;
    this.jdField_a_of_type_ArrayOfJavaLangString = new String[i2];
    for (i1 = 0; i1 < i2; i1++)
    {
      this.jdField_a_of_type_ArrayOfJavaLangString[i1] = "";
      for (m = arrayOfInt[i1]; m < arrayOfInt[(i1 + 1)]; m++)
      {
        int tmp276_274 = i1;
        String[] tmp276_271 = this.jdField_a_of_type_ArrayOfJavaLangString;
        tmp276_271[tmp276_274] = (tmp276_271[tmp276_274] + arrayOfChar[m]);
      }
    }
    System.out.println("Text: " + i2);
  }
  
  public static byte[] getSomeResource(String name)
  {
    try
    {
      if (name == null) {
        return null;
      }
      if ((localInputStream = Runtime.getRuntime().getClass().getResourceAsStream(name)) == null) {
        return null;
      }
      int i = (int)localInputStream.skip(32768L);
      localInputStream.close();
      if (i < 1) {
        return null;
      }
      InputStream localInputStream = Runtime.getRuntime().getClass().getResourceAsStream(name);
      byte[] arrayOfByte = new byte[i];
      int m = 0;
      int n = 0;
      do
      {
        m = localInputStream.read(arrayOfByte, n, arrayOfByte.length - n);
        n += m;
      } while ((m != -1) && (n < arrayOfByte.length));
      localInputStream.close();
      return arrayOfByte;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public final void loadRecords(int[] paramArrayOfInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    try
    {
      this.jdField_a_of_type_JavaxMicroeditionRmsRecordStore = RecordStore.openRecordStore("save", false);
      try
      {
        byte[] arrayOfByte = this.jdField_a_of_type_JavaxMicroeditionRmsRecordStore.getRecord(1);
        DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
        for (int i = 0; i < paramArrayOfInt.length; i++) {
          paramArrayOfInt[i] = localDataInputStream.readInt();
        }
        for (i = 0; i < paramArrayOfByte1.length; i++) {
          paramArrayOfByte1[i] = localDataInputStream.readByte();
        }
        for (i = 0; i < paramArrayOfByte2.length; i++) {
          paramArrayOfByte2[i] = localDataInputStream.readByte();
        }
        for (i = 0; i < paramArrayOfByte3.length; i++) {
          paramArrayOfByte3[i] = localDataInputStream.readByte();
        }
      }
      catch (IOException localIOException)
      {
        System.out.println(localIOException);
      }
      this.jdField_a_of_type_JavaxMicroeditionRmsRecordStore.closeRecordStore();
      return;
    }
    catch (RecordStoreNotFoundException localRecordStoreNotFoundException)
    {
      System.out.println(localRecordStoreNotFoundException);
      return;
    }
    catch (RecordStoreException localRecordStoreException)
    {
      System.out.println(localRecordStoreException);
    }
  }
  
  public final void saveRecords(int[] paramArrayOfInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    try
    {
      this.jdField_a_of_type_JavaxMicroeditionRmsRecordStore = RecordStore.openRecordStore("save", true);
      int m = this.jdField_a_of_type_JavaxMicroeditionRmsRecordStore.getNumRecords();
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
        for (int i = 0; i < paramArrayOfInt.length; i++) {
          localDataOutputStream.writeInt(paramArrayOfInt[i]);
        }
        for (i = 0; i < paramArrayOfByte1.length; i++) {
          localDataOutputStream.writeByte(paramArrayOfByte1[i]);
        }
        for (i = 0; i < paramArrayOfByte2.length; i++) {
          localDataOutputStream.writeByte(paramArrayOfByte2[i]);
        }
        for (i = 0; i < paramArrayOfByte3.length; i++) {
          localDataOutputStream.writeByte(paramArrayOfByte3[i]);
        }
        byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
        if (m == 0) {
          this.jdField_a_of_type_JavaxMicroeditionRmsRecordStore.addRecord(arrayOfByte, 0, arrayOfByte.length);
        } else {
          this.jdField_a_of_type_JavaxMicroeditionRmsRecordStore.setRecord(1, arrayOfByte, 0, arrayOfByte.length);
        }
      }
      catch (IOException localIOException)
      {
        System.out.println("IOException: " + localIOException);
      }
      this.jdField_a_of_type_JavaxMicroeditionRmsRecordStore.closeRecordStore();
      return;
    }
    catch (RecordStoreFullException localRecordStoreFullException)
    {
      System.out.println(localRecordStoreFullException);
      return;
    }
    catch (RecordStoreNotFoundException localRecordStoreNotFoundException)
    {
      System.out.println(localRecordStoreNotFoundException);
      return;
    }
    catch (RecordStoreException localRecordStoreException)
    {
      System.out.println(localRecordStoreException);
    }
  }



  /**
   * <ul>
   * <li>0 – up
   * <li>1 – down  
   * <li>2 – left  
   * <li>3 – right
   * <li>4 – fire
   * <li>5 – left soft
   * <li>6 – right soft
   * <li>9 – zero
   * <li>10 – any key pressed
   * </ul>
   */
  public Byte[] controls = new Byte[11];

  
  public final void keyPressed(int paramInt)
  {
    this.controls[10] = 3;
    switch (paramInt)
    {

    case 51: // 3
      this.controls[3] = 3;
      this.controls[0] = 3;
      return;

    case 49: // 1
      this.controls[2] = 3;

    case -1: // Up
    case 50: // 2
      this.controls[0] = 3;
      return;

    case 57: // 9
      this.controls[3] = 3;
      this.controls[1] = 3;
      return;

    case 55: // 7
      this.controls[2] = 3;

    case -2: // Down
    case 56: // 8
      this.controls[1] = 3;
      return;
    
    case -3: // Left
    case 52: // 4
      this.controls[2] = 3;
      return;

    case -4: // Right
    case 54: // 6
      this.controls[3] = 3;
      return;

    case -5: // Select/middle softkey
    case 53: // 5
      this.controls[4] = 3;
      return;

    case 48: // 0
      this.controls[9] = 3;
      return;

    case -7: // Right softkey
      this.controls[6] = 3;
      return;

    case -6: // Left softkey
      this.controls[5] = 3;
    }
  }
  
  public final void keyReleased(int paramInt)
  {
    byte[] tmp6_1 = this.controls;
    tmp6_1[10] = ((byte)(tmp6_1[10] & 0xFFFFFFFD));
    switch (paramInt)
    {
    case 51: 
      int tmp293_292 = 3;
      byte[] tmp293_289 = this.controls;
      tmp293_289[tmp293_292] = ((byte)(tmp293_289[tmp293_292] & 0xFFFFFFFD));
      int tmp305_304 = 0;
      byte[] tmp305_301 = this.controls;
      tmp305_301[tmp305_304] = ((byte)(tmp305_301[tmp305_304] & 0xFFFFFFFD));
      return;
    case 49: 
      int tmp318_317 = 2;
      byte[] tmp318_314 = this.controls;
      tmp318_314[tmp318_317] = ((byte)(tmp318_314[tmp318_317] & 0xFFFFFFFD));
    case -1: 
    case 50: 
      int tmp330_329 = 0;
      byte[] tmp330_326 = this.controls;
      tmp330_326[tmp330_329] = ((byte)(tmp330_326[tmp330_329] & 0xFFFFFFFD));
      return;
    case 57: 
      int tmp343_342 = 3;
      byte[] tmp343_339 = this.controls;
      tmp343_339[tmp343_342] = ((byte)(tmp343_339[tmp343_342] & 0xFFFFFFFD));
      int tmp355_354 = 1;
      byte[] tmp355_351 = this.controls;
      tmp355_351[tmp355_354] = ((byte)(tmp355_351[tmp355_354] & 0xFFFFFFFD));
      return;
    case 55: 
      int tmp368_367 = 2;
      byte[] tmp368_364 = this.controls;
      tmp368_364[tmp368_367] = ((byte)(tmp368_364[tmp368_367] & 0xFFFFFFFD));
    case -2: 
    case 56: 
      int tmp380_379 = 1;
      byte[] tmp380_376 = this.controls;
      tmp380_376[tmp380_379] = ((byte)(tmp380_376[tmp380_379] & 0xFFFFFFFD));
      return;
    case -3: 
    case 52: 
      int tmp393_392 = 2;
      byte[] tmp393_389 = this.controls;
      tmp393_389[tmp393_392] = ((byte)(tmp393_389[tmp393_392] & 0xFFFFFFFD));
      return;
    case -4: 
    case 54: 
      int tmp406_405 = 3;
      byte[] tmp406_402 = this.controls;
      tmp406_402[tmp406_405] = ((byte)(tmp406_402[tmp406_405] & 0xFFFFFFFD));
      return;
    case -5: 
    case 53: 
      int tmp419_418 = 4;
      byte[] tmp419_415 = this.controls;
      tmp419_415[tmp419_418] = ((byte)(tmp419_415[tmp419_418] & 0xFFFFFFFD));
      return;
    case 48: 
      byte[] tmp433_428 = this.controls;
      tmp433_428[9] = ((byte)(tmp433_428[9] & 0xFFFFFFFD));
      return;
    case -7: 
      byte[] tmp447_442 = this.controls;
      tmp447_442[6] = ((byte)(tmp447_442[6] & 0xFFFFFFFD));
      return;
    case -6: 
      int tmp460_459 = 5;
      byte[] tmp460_456 = this.controls;
      tmp460_456[tmp460_459] = ((byte)(tmp460_456[tmp460_459] & 0xFFFFFFFD));
    }
  }
  
  public abstract void paint(Graphics paramGraphics);
  
  public abstract void run();
}


/* Location:              /home/m93a/Stažené/magnetic_joe_en.jar!/b.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */