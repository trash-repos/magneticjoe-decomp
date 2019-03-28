import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.midlet.MIDlet;

public final class Game
  extends resourcesAndControls
  implements Runnable
{
  public Image[] imageArrayA;
  public Image imageA;
  public Image imageB;
  public Image imageC;
  public Image imageD;
  public Image[] imageArrayB;
  public int intA;
  public String stringA;
  public Player[] playerArrayA;
  public int b;
  public int c;
  public int d;
  public int e;
  public int controlsThreshold;
  public int g;
  public byte[] a;
  public int h;
  public int i;
  public byte[][] a;
  public byte[] b;
  public int[] a;
  public byte a;
  public int j = 10;
  public String b;
  public byte[][] b;
  public byte[] c;
  public byte[] d;
  public int k = 18;
  public int l = 80;
  public int m = 120;
  public int n = 0;
  public int o = 0;
  public int p = 0;
  public int q = 0;
  public int r = 1;
  public int s = 24;
  public int t = this.l / this.s;
  public int u = this.m / this.s;
  public int v = 20;
  public int w = 5;
  public int fireActive = 0;
  public int[] b;
  public int somePhysicsIndex;
  public int z;
  public byte b;
  public int[] c;
  public int[] d;
  public int[] e;
  public int[] f;
  public int[] g;
  public int[] h;
  public int[] i;
  public int A;
  public int B;
  public int C;
  public int D;
  public int E;
  public int F;
  public int G = 0;
  public int H = 0;
  public int I = 0;
  public int J = 0;
  public int K = 0;
  public int L = 0;
  public int M = 0;
  public int N = 1;
  public int O = 1;
  public int P = 210;
  public int Q = 3;
  public int R = 0;
  public int S;
  public int T;
  public int U;
  public int V;
  public int W;
  public int X;
  public int Y = 0;
  public int[][] a;
  public int Z = 64;
  public int aa = 100;
  public int ab = 0;
  public int ac = 0;
  public int ad = 0;
  public int ae = 20;
  public int af = 24;
  public int ag = 90;
  public int ah = 20;
  public byte c;
  public int ai = 4;
  public int aj = 6;
  public byte d;

  private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

  private int[] jdField_c_of_type_ArrayOfInt = new int[16];
  private int[] jdField_d_of_type_ArrayOfInt = new int[16];
  private int[] jdField_e_of_type_ArrayOfInt = new int[16];
  private int[] jdField_f_of_type_ArrayOfInt = new int[16];
  private int[] jdField_g_of_type_ArrayOfInt = new int[16];

  private int[] maybePositionAndVelocity1 = new int[4];
  private int[] maybePositionAndVelocity2 = new int[4];
  
  public Game()
  {
    this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage = new Image[5];
    this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage = new Image[10];
    this.jdField_a_of_type_Int = 1;
    this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer = new Player[6];
    this.jdField_b_of_type_Int = 1000;
    this.jdField_c_of_type_Int = 0;
    this.jdField_d_of_type_Int = 49;
    this.jdField_e_of_type_Int = 0;
    this.jdField_f_of_type_Int = 0;
    this.jdField_g_of_type_Int = 0;
    this.jdField_a_of_type_ArrayOfByte = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    this.jdField_h_of_type_Int = 0;
    this.jdField_i_of_type_Int = 0;
    this.jdField_a_of_type_Array2dOfByte = new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
    this.jdField_b_of_type_ArrayOfByte = new byte[] { 0, 0, 0 };
    this.jdField_a_of_type_ArrayOfInt = new int[] { 4, 1, 1, 0 };
    this.jdField_a_of_type_Byte = 0;
    this.jdField_b_of_type_Array2dOfByte = new byte[][] { { 64, 64, 64, 64, 64, 64, 64, 64, 64 }, { 64, 64, 64, 64, 62, 64, 64, 64, 64 }, { 63, 63, 63, 63, 63, 63, 63, 63, 63 }, { 14, 14, 15, 15, 14, 15, 14, 14, 14 }, { 43, 14, 42, 43, 14, 42, 43, 15, 42 }, { 40, 40, 40, 15, 14, 42, 41, 41, 41 }, { 64, 47, 14, 47, 14, 44, 14, 44, 64 }, { 14, 46, 64, 45, 14, 46, 64, 45, 14 }, { 24, 15, 14, 14, 24, 14, 15, 14, 24 }, { 14, 14, 26, 14, 26, 15, 26, 15, 14 }, { 14, 15, 25, 14, 25, 15, 25, 14, 14 }, { 27, 14, 15, 15, 27, 15, 14, 15, 27 }, { 45, 44, 64, 64, 64, 64, 64, 47, 46 }, { 47, 46, 64, 45, 44, 64, 64, 64, 64 }, { 35, 32, 64, 31, 28, 64, 64, 64, 64 }, { 43, 15, 42, 31, 24, 28, 64, 64, 64 } };
    this.jdField_b_of_type_ArrayOfInt = new int[] { 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16 };
    this.jdField_b_of_type_Byte = 0;
    this.jdField_a_of_type_Array2dOfInt = new int[][] { { 23, 79, 176 }, { 171, 132, 114 }, { 55, 46, 131 }, { 31, 4, 16 }, { 195, 214, 255 }, { 100, 123, 234 } };
    this.jdField_c_of_type_Byte = 110;
    this.jdField_d_of_type_Byte = 8;
    System.out.println("Game started.");
    setFullScreenMode(true);
    imageB.ak = getWidth();
    imageB.al = getHeight();
    imageB.am = imageB.ak / 2;
    imageB.an = imageB.al / 2;
    this.j = (Math.max(imageB.al, imageB.ak) * 3 / 4 / 16);
    this.controls = new byte[11];
    for (int i1 = 0; i1 < 11; i1++) {
      this.controls[i1] = 0;
    }
    this.randomGen = new Random(476543L);
    this.jdField_e_of_type_JavaxMicroeditionLcduiImage = Image.createImage(imageB.ak, imageB.al);
    this.jdField_a_of_type_JavaxMicroeditionLcduiGraphics = this.jdField_e_of_type_JavaxMicroeditionLcduiImage.getGraphics();
    try
    {
      this.version = magneticjoe.display.getAppProperty("MIDlet-Version");
    }
    catch (Exception localException2)
    {
      this.version = "1.0";
    }
    somethingWithAudio();
    i1 = 0;
    try
    {
      for (;;)
      {
        this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i1] = Image.createImage(this.imageC + "/splash" + i1 + ".png");
        i1++;
      }
    }
    catch (Exception localException3)
    {
      System.out.println("Splash count:" + i1);
      this.jdField_a_of_type_Int = i1;
      try
      {
        this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i1] = Image.createImage(this.imageC + "/title.png");
      }
      catch (Exception localException1)
      {
        System.out.println("Error: cannot load image!" + localException1);
      }
      Image.createImage(1, 1);
      a();
      loadRecords(this.jdField_a_of_type_ArrayOfInt, this.jdField_a_of_type_Array2dOfByte[0], this.jdField_a_of_type_Array2dOfByte[1], this.jdField_a_of_type_Array2dOfByte[2]);
      System.out.println("Started data: " + this.jdField_a_of_type_ArrayOfInt[0] + ", " + this.jdField_a_of_type_ArrayOfInt[1] + ", " + this.jdField_a_of_type_ArrayOfInt[2] + ", " + this.jdField_a_of_type_ArrayOfInt[3]);
      this.jdField_d_of_type_Int = this.jdField_a_of_type_ArrayOfInt[0];
      this.N = this.jdField_a_of_type_ArrayOfInt[1];
      this.O = this.jdField_a_of_type_ArrayOfInt[2];
      this.jdField_h_of_type_Int = this.jdField_a_of_type_ArrayOfInt[3];
    }
  }
  
  private void somethingWithAudio()
  {
    String[] arrayOfString1 = { "/mj.mid", "/mj_win.mid", "/mj_lose.mid", "/mj_button1.wav", "/mj_button2.wav", "/mj_button3.wav" };
    String[] arrayOfString2 = { "audio/midi", "audio/midi", "audio/midi", "audio/x-wav", "audio/x-wav", "audio/x-wav" };
    try
    {
      for (int i1 = 0; i1 < this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer.length; i1++)
      {
        if (this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer[i1] != null)
        {
          this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer[i1].close();
          this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer[i1] = null;
        }
        byte[] arrayOfByte = imageB.getSomeResource(this.imageD + arrayOfString1[i1]);
        this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer[i1] = Manager.createPlayer(new ByteArrayInputStream(arrayOfByte), arrayOfString2[i1]);
        this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer[i1].realize();
      }
      return;
    }
    catch (Exception localException)
    {
      System.out.println(localException);
    }
  }
  
  private void aaa(int paramInt)
  {
    int i1 = 0;
    if (this.N == 0) {
      return;
    }
    if (paramInt >= this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer.length) {
      return;
    }
    try
    {
      if ((paramInt != this.jdField_b_of_type_Int) && (this.jdField_b_of_type_Int < this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer.length)) {
        this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer[this.jdField_b_of_type_Int].stop();
      }
      this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer[paramInt].start();
      this.jdField_b_of_type_Int = paramInt;
      return;
    }
    catch (Exception localException1)
    {
      System.out.println(localException1);
      this.jdField_b_of_type_Int = 1000;
      try
      {
        for (i1 = 0; i1 < this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer.length; i1++) {
          this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer[i1].stop();
        }
        return;
      }
      catch (Exception localException2)
      {
        System.out.println(localException2);
      }
    }
  }
  
  private void pauseMusic()
  {
    if (this.jdField_b_of_type_Int >= this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer.length) {
      return;
    }
    try
    {
      this.jdField_a_of_type_ArrayOfJavaxMicroeditionMediaPlayer[this.jdField_b_of_type_Int].stop();
      return;
    }
    catch (Exception localException)
    {
      System.out.println(localException);
    }
  }
  
  private void d()
  {
    this.jdField_a_of_type_ArrayOfInt[0] = this.jdField_d_of_type_Int;
    this.jdField_a_of_type_ArrayOfInt[1] = this.N;
    this.jdField_a_of_type_ArrayOfInt[2] = this.O;
    this.jdField_a_of_type_ArrayOfInt[3] = this.jdField_h_of_type_Int;
    saveRecords(this.jdField_a_of_type_ArrayOfInt, this.jdField_a_of_type_Array2dOfByte[0], this.jdField_a_of_type_Array2dOfByte[1], this.jdField_a_of_type_Array2dOfByte[2]);
  }
  
  private void e()
  {
    for (int i1 = 0; i1 < 11; i1++)
    {
      int tmp13_12 = i1;
      byte[] tmp13_9 = this.controls;
      tmp13_9[tmp13_12] = ((byte)(tmp13_9[tmp13_12] + ((this.controls[i1] & 0x1) << 2)));
    }
    switch (this.gameState)
    {
    case -3: 
      maybeDoExitOrLoad();
      break;
    case Running: 
      doPhysics();
      break;
    case Paused:
      doMenu();
    }
    for (i1 = 0; i1 < 11; i1++) {
      if (this.controls[i1] > 3)
      {
        int tmp105_104 = i1;
        byte[] tmp105_101 = this.controls;
        tmp105_101[tmp105_104] = ((byte)(tmp105_101[tmp105_104] & 0x2));
      }
      else
      {
        int tmp119_118 = i1;
        byte[] tmp119_115 = this.controls;
        tmp119_115[tmp119_118] = ((byte)(tmp119_115[tmp119_118] & 0x3));
      }
    }
  }
  
  private void a(Graphics paramGraphics)
  {
    switch (this.gameState)
    {
    case -3: 
      randSigned(paramGraphics);
      return;
    case -1: 
      q(paramGraphics);
      return;
    case -2: 
      p(paramGraphics);
    }
  }
  
  public final void paint(Graphics paramGraphics)
  {
    paramGraphics.drawImage(this.jdField_e_of_type_JavaxMicroeditionLcduiImage, 0, 0, 20);
  }
  
  public final void hideNotify()
  {
    pauseMusic();
    if ((this.gameState != -3) && (this.gameState != -2) && (this.H == 0))
    {
      this.gameState = -2;
      this.as = 10;
    }
    for (int i1 = 0; i1 < 11; i1++) {
      this.controls[i1] = 0;
    }
  }
  
  public final void run()
  {
    System.out.println("haho SW:" + imageB.ak + " SH:" + imageB.al);
    System.gc();
    System.out.println("gamestart:" + Runtime.getRuntime().freeMemory());
    for (;;)
    {
      this.at += 1;
      try
      {
        this.jdField_a_of_type_Long = System.currentTimeMillis();
        e();
        if (this.jdField_a_of_type_JavaxMicroeditionLcduiGraphics != null) {
          getSomeResource(this.jdField_a_of_type_JavaxMicroeditionLcduiGraphics);
        }
        repaint();
        serviceRepaints();
        this.imageB = (System.currentTimeMillis() - this.jdField_a_of_type_Long);
        if (this.imageB < this.ap) {
          Thread.sleep(this.ap - this.imageB);
        }
      }
      catch (Exception localException) {}
    }
  }
  
  private int weirdMethodReturningInt()
  {
    int i2 = 0;
    byte[] arrayOfByte = new byte[16];
    this.jdField_b_of_type_ArrayOfByte[0] = 0;
    this.jdField_b_of_type_ArrayOfByte[1] = 0;
    this.jdField_b_of_type_ArrayOfByte[2] = 0;
    for (int i1 = 0; i1 < 16; i1++) {
      arrayOfByte[i1] = this.jdField_a_of_type_ArrayOfByte[i1];
    }
    for (i1 = 0; i1 < 16; i1++) {
      this.jdField_a_of_type_ArrayOfByte[i1] = this.jdField_a_of_type_Array2dOfByte[0][i1];
    }
    if (b() == 1)
    {
      i2++;
      this.jdField_b_of_type_ArrayOfByte[0] = 1;
    }
    for (i1 = 0; i1 < 16; i1++) {
      this.jdField_a_of_type_ArrayOfByte[i1] = this.jdField_a_of_type_Array2dOfByte[1][i1];
    }
    if (b() == 1)
    {
      i2++;
      this.jdField_b_of_type_ArrayOfByte[1] = 1;
    }
    for (i1 = 0; i1 < 16; i1++) {
      this.jdField_a_of_type_ArrayOfByte[i1] = this.jdField_a_of_type_Array2dOfByte[2][i1];
    }
    if (b() == 1)
    {
      i2++;
      this.jdField_b_of_type_ArrayOfByte[2] = 1;
    }
    for (i1 = 0; i1 < 16; i1++) {
      this.jdField_a_of_type_ArrayOfByte[i1] = arrayOfByte[i1];
    }
    return i2;
  }
  
  private int b()
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i6 = 0;
    for (i1 = 0; i1 < 16; i1++) {
      i6 += this.jdField_a_of_type_ArrayOfByte[i1] % 16;
    }
    for (i1 = 0; i1 < 16; i1++) {
      if (this.jdField_a_of_type_ArrayOfByte[i1] > 31) {
        return 0;
      }
    }
    int i5 = 1;
    i2 = 0;
    for (i1 = 8; i1 < 16; i1++)
    {
      if (this.jdField_a_of_type_ArrayOfByte[i1] / 16 > 0) {
        i2 += i5;
      }
      i5 *= 2;
    }
    if ((i2 + i6) % 256 != 0) {
      return 0;
    }
    i5 = 1;
    i3 = 0;
    for (i1 = 0; i1 < 4; i1++)
    {
      if (this.jdField_a_of_type_ArrayOfByte[i1] / 16 > 0) {
        i3 += i5;
      }
      i5 *= 2;
    }
    if (i3 == 0) {
      return 0;
    }
    i5 = 1;
    i4 = 0;
    for (i1 = 4; i1 < 8; i1++)
    {
      if (this.jdField_a_of_type_ArrayOfByte[i1] / 16 > 0) {
        i4 += i5;
      }
      i5 *= 2;
    }
    if (i4 == 0) {
      return 0;
    }
    if (i3 * i4 > 16) {
      return 0;
    }
    i2 = 0;
    for (i1 = 0; i1 < 16; i1++) {
      if (this.jdField_a_of_type_ArrayOfByte[i1] % 16 == 1) {
        i2++;
      }
    }
    if (i2 != 1) {
      return 0;
    }
    i2 = 0;
    for (i1 = 0; i1 < 16; i1++) {
      if (this.jdField_a_of_type_ArrayOfByte[i1] % 16 == 2) {
        i2++;
      }
    }
    if (i2 == 0) {
      return 0;
    }
    return 1;
  }
  
  private void f()
  {
    int i3 = 0;
    int i4 = 0;
    int i5 = 1;
    i3 = 0;
    for (int i1 = 0; i1 < 4; i1++)
    {
      if (this.jdField_a_of_type_ArrayOfByte[i1] / 16 > 0) {
        i3 += i5;
      }
      i5 *= 2;
    }
    i5 = 1;
    i4 = 0;
    for (i1 = 0; i1 < 4; i1++)
    {
      if (this.jdField_a_of_type_ArrayOfByte[(i1 + 4)] / 16 > 0) {
        i4 += i5;
      }
      i5 *= 2;
    }
    System.out.println("CODE w:" + i3 + "h:" + i4);
    if (i3 == 0) {
      i3 = 1;
    }
    if (i4 == 0) {
      i4 = 1;
    }
    this.jdField_c_of_type_ArrayOfByte = new byte[(i3 * 3 + 8) * (i4 * 3 + 8)];
    this.k = (i3 * 3 + 8);
    for (i1 = 0; i1 < this.jdField_c_of_type_ArrayOfByte.length; i1++) {
      this.jdField_c_of_type_ArrayOfByte[i1] = 64;
    }
    for (i1 = 0; i1 < 4 * this.k; i1++) {
      this.jdField_c_of_type_ArrayOfByte[i1] = 14;
    }
    for (i1 = this.jdField_c_of_type_ArrayOfByte.length - 1; i1 > this.jdField_c_of_type_ArrayOfByte.length - 1 - 4 * this.k; i1--) {
      this.jdField_c_of_type_ArrayOfByte[i1] = 14;
    }
    i1 = 0;
    while (i1 < this.jdField_c_of_type_ArrayOfByte.length)
    {
      this.jdField_c_of_type_ArrayOfByte[i1] = 14;
      this.jdField_c_of_type_ArrayOfByte[(i1 + 1)] = 14;
      this.jdField_c_of_type_ArrayOfByte[(i1 + 2)] = 14;
      this.jdField_c_of_type_ArrayOfByte[(i1 + 3)] = 14;
      i1 += this.k;
    }
    i1 = this.k - 1;
    while (i1 < this.jdField_c_of_type_ArrayOfByte.length)
    {
      this.jdField_c_of_type_ArrayOfByte[i1] = 14;
      this.jdField_c_of_type_ArrayOfByte[(i1 - 1)] = 14;
      this.jdField_c_of_type_ArrayOfByte[(i1 - 2)] = 14;
      this.jdField_c_of_type_ArrayOfByte[(i1 - 3)] = 14;
      i1 += this.k;
    }
    for (int i2 = 0; i2 < i4; i2++) {
      for (i1 = 0; i1 < i3; i1++)
      {
        i5 = 4 + i1 * 3 + this.k * (4 + i2 * 3);
        this.jdField_c_of_type_ArrayOfByte[i5] = this.jdField_b_of_type_Array2dOfByte[(this.jdField_a_of_type_ArrayOfByte[(i1 + i3 * i2)] % 16)][0];
        this.jdField_c_of_type_ArrayOfByte[(i5 + 1)] = this.jdField_b_of_type_Array2dOfByte[(this.jdField_a_of_type_ArrayOfByte[(i1 + i3 * i2)] % 16)][1];
        this.jdField_c_of_type_ArrayOfByte[(i5 + 2)] = this.jdField_b_of_type_Array2dOfByte[(this.jdField_a_of_type_ArrayOfByte[(i1 + i3 * i2)] % 16)][2];
        i5 += this.k;
        this.jdField_c_of_type_ArrayOfByte[i5] = this.jdField_b_of_type_Array2dOfByte[(this.jdField_a_of_type_ArrayOfByte[(i1 + i3 * i2)] % 16)][3];
        this.jdField_c_of_type_ArrayOfByte[(i5 + 1)] = this.jdField_b_of_type_Array2dOfByte[(this.jdField_a_of_type_ArrayOfByte[(i1 + i3 * i2)] % 16)][4];
        this.jdField_c_of_type_ArrayOfByte[(i5 + 2)] = this.jdField_b_of_type_Array2dOfByte[(this.jdField_a_of_type_ArrayOfByte[(i1 + i3 * i2)] % 16)][5];
        i5 += this.k;
        this.jdField_c_of_type_ArrayOfByte[i5] = this.jdField_b_of_type_Array2dOfByte[(this.jdField_a_of_type_ArrayOfByte[(i1 + i3 * i2)] % 16)][6];
        this.jdField_c_of_type_ArrayOfByte[(i5 + 1)] = this.jdField_b_of_type_Array2dOfByte[(this.jdField_a_of_type_ArrayOfByte[(i1 + i3 * i2)] % 16)][7];
        this.jdField_c_of_type_ArrayOfByte[(i5 + 2)] = this.jdField_b_of_type_Array2dOfByte[(this.jdField_a_of_type_ArrayOfByte[(i1 + i3 * i2)] % 16)][8];
      }
    }
    for (i1 = 0; i1 < this.jdField_c_of_type_ArrayOfByte.length; i1++) {
      if (this.jdField_c_of_type_ArrayOfByte[i1] == 62)
      {
        this.l = (i1 % this.k * this.s + this.s / 2);
        this.m = (i1 / this.k * this.s + this.s / 2);
      }
    }
    this.G = (2 * randUnsigned(3));
  }
  
  private void g()
  {
    int[] arrayOfInt = { 3, 4, 35, 6, 2, 8, 9, 20, 36, 11, 12, 19, 14, 31, 34, 21, 33, 7, 37, 15, 1, 29, 13, 18, 16, 10, 25, 22, 24, 17, 0, 26, 23, 27, 5, 28, 30, 32, 40, 43, 41, 39, 38, 44, 45, 46, 42, 49, 48, 47, 0, 0 };
    byte[] arrayOfByte;
    int i2 = (arrayOfByte = imageB.getSomeResource(this.jdField_e_of_type_JavaLangString + "/level.dat"))[(arrayOfInt[this.jdField_c_of_type_Int] * 4 + 2)];
    int i3 = arrayOfByte[(arrayOfInt[this.jdField_c_of_type_Int] * 4 + 3)];
    int i4 = (i4 = 128 * (arrayOfByte[(arrayOfInt[this.jdField_c_of_type_Int] * 4)] + 100)) + arrayOfByte[(arrayOfInt[this.jdField_c_of_type_Int] * 4 + 1)];
    this.jdField_c_of_type_ArrayOfByte = new byte[i2 * i3];
    this.k = i2;
    for (int i1 = 0; i1 < i2 * i3; i1++)
    {
      this.jdField_c_of_type_ArrayOfByte[i1] = arrayOfByte[(i1 + i4)];
      if (this.jdField_c_of_type_ArrayOfByte[i1] == 62)
      {
        this.l = (i1 % this.k * this.s + this.s / 2);
        this.m = (i1 / this.k * this.s + this.s / 2);
      }
    }
    if ((this.jdField_c_of_type_Int > -1) && (this.jdField_c_of_type_Int < 5)) {
      this.G = 0;
    }
    if ((this.jdField_c_of_type_Int > 4) && (this.jdField_c_of_type_Int < 20)) {
      this.G = 2;
    }
    if ((this.jdField_c_of_type_Int > 19) && (this.jdField_c_of_type_Int < 35)) {
      this.G = 0;
    }
    if (this.jdField_c_of_type_Int > 34) {
      this.G = 4;
    }
  }
  
  private void h()
  {
    this.n = 0;
    this.o = 0;
    this.p = 0;
    this.q = 0;
    this.r = 1;
    this.t = (this.l / this.s);
    this.u = (this.m / this.s);
    this.fireActive = 0;
  }
  
  private void i()
  {
    if (this.jdField_g_of_type_Int == 0) {
      g();
    } else {
      f();
    }
    this.z = 0;
    this.H = 0;
    this.J = 0;
    n();
    m();
    h();
    try
    {
      switch (this.G)
      {
      case 4: 
        this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[2] = Image.createImage(this.imageC + "/set3.png");
        this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[3] = Image.createImage(this.imageC + "/back_3.png");
        break;
      case 2: 
        this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[2] = Image.createImage(this.imageC + "/set2.png");
        this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[3] = Image.createImage(this.imageC + "/back_2.png");
        break;
      case 0: 
      case 1: 
      case 3: 
      default: 
        this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[2] = Image.createImage(this.imageC + "/set1.png");
        this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[3] = Image.createImage(this.imageC + "/back_1.png");
      }
      this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[4] = Image.createImage(this.imageC + "/pause.png");
    }
    catch (Exception localException)
    {
      System.out.println("E Midlet:" + localException.getMessage());
    }
    this.Z = this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[3].getWidth();
    this.aa = this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[3].getHeight();
    this.ad = (imageB.an - this.Z / 2 - 20);
    this.ac = this.ad;
    aaa(0);
  }
  
  private void maybeDoExitOrLoad()
  {
    // Check if 46th string contains on position 36 characters "Thi" for "Thicc"
    if ((this.jdField_a_of_type_ArrayOfJavaLangString[46].charAt(36) != 'T') || (this.jdField_a_of_type_ArrayOfJavaLangString[46].charAt(37) != 'h') || (this.jdField_a_of_type_ArrayOfJavaLangString[46].charAt(38) != 'i'))
    {
      magneticjoe.display.destroyApp(false);
      magneticjoe.display.notifyDestroyed();
    }
    if ((this.at > (this.as + 1) * 20) && (this.as < this.jdField_a_of_type_Int)) {
      this.as += 1;
    }
    if (((this.as >= this.jdField_a_of_type_Int) && (this.controls[10] > this.jdField_e_of_type_Byte)) || (this.at > (this.as + 2) * 20))
    {
      for (int i1 = 0; i1 < this.jdField_a_of_type_Int; i1++) {
        this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i1] = Image.createImage(1, 1);
      }
      try
      {
        this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[1] = Image.createImage(this.imageC + "/fig_s60.png");
        this.jdField_a_of_type_JavaxMicroeditionLcduiImage = Image.createImage(this.imageC + "/arrows.png");
        this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[5] = Image.createImage(this.imageC + "/fig2_s60.png");
        this.jdField_b_of_type_JavaxMicroeditionLcduiImage = Image.createImage(this.imageC + "/title_mini.png");
        this.jdField_c_of_type_JavaxMicroeditionLcduiImage = Image.createImage(this.imageC + "/options.png");
      }
      catch (Exception localException) {}
      this.as = 0;
      this.gameState = State.Paused;
    }
  }
  
  private void doMenu()
  {
    this.P += this.Q;
    if ((this.P >= 255) || (this.P <= 120)) {
      this.Q = (-1 * this.Q);
    }
    if (this.H > 0)
    {
      this.H += 1;
      if (this.H > this.j)
      {
        this.H = 0;
        this.I = this.j;
        this.gameState = State.Running;
      }
      return;
    }
    if (this.I > 0)
    {
      this.I--;
      return;
    }
    if ((this.as != 10) && (this.as != 5) && (this.as != 6) && ((this.controls[5] > this.jdField_e_of_type_Byte) || (this.controls[4] > this.jdField_e_of_type_Byte))) {
      aaa(4);
    }
    if ((this.as != 10) && (this.as != 5) && (this.as != 6) && (this.controls[6] > this.jdField_e_of_type_Byte)) {
      aaa(5);
    }
    switch (this.as)
    {
    case 0: 
      if ((this.controls[0] > this.jdField_e_of_type_Byte) && (this.K > 0)) {
        this.K -= 1;
      }
      if ((this.controls[1] > this.jdField_e_of_type_Byte) && (this.K < 3)) {
        this.K += 1;
      }
      if ((this.controls[5] > this.jdField_e_of_type_Byte) || (this.controls[4] > this.jdField_e_of_type_Byte)) {
        switch (this.K)
        {
        case 0: 
          this.as = 1;
          break;
        case 1: 
          this.as = 14;
          break;
        case 2: 
          this.as = 3;
          break;
        case 3: 
          this.as = 8;
        }
      }
      if (this.controls[6] > this.jdField_e_of_type_Byte)
      {
        d();
        magneticjoe.display.destroyApp(false);
        magneticjoe.display.notifyDestroyed();
        return;
      }
      break;
    case 1: 
      if ((this.controls[0] > this.controlsThreshold) && (this.jdField_c_of_type_Int > 0)) {
        this.jdField_c_of_type_Int -= 1;
      }
      if ((this.controls[1] > this.controlsThreshold) && (this.jdField_c_of_type_Int < this.jdField_d_of_type_Int)) {
        this.jdField_c_of_type_Int += 1;
      }
      if ((this.controls[5] > this.jdField_e_of_type_Byte) || (this.controls[4] > this.jdField_e_of_type_Byte))
      {
        this.jdField_g_of_type_Int = 0;
        i();
        this.H = 1;
      }
      if (this.controls[6] > this.jdField_e_of_type_Byte) {
        this.as = 0;
      }
      if (this.jdField_c_of_type_Int < this.jdField_e_of_type_Int) {
        this.jdField_e_of_type_Int = this.jdField_c_of_type_Int;
      }
      if (this.jdField_e_of_type_Int + 4 - 1 < this.jdField_c_of_type_Int)
      {
        this.jdField_e_of_type_Int = (this.jdField_c_of_type_Int - 4 + 1);
        return;
      }
      break;
    case 2: 
      if (this.controls[2] > this.jdField_e_of_type_Byte) {
        this.Y -= 1;
      }
      if (this.Y < 0) {
        this.Y += 16;
      }
      if (this.controls[3] > this.jdField_e_of_type_Byte) {
        this.Y = ((this.Y + 1) % 16);
      }
      if (this.controls[0] > this.controlsThreshold) {
        this.jdField_a_of_type_ArrayOfByte[this.Y] = ((byte)((this.jdField_a_of_type_ArrayOfByte[this.Y] + 1) % this.alphabet.length()));
      }
      if (this.controls[1] > this.controlsThreshold)
      {
        this.jdField_a_of_type_ArrayOfByte[this.Y] = ((byte)(this.jdField_a_of_type_ArrayOfByte[this.Y] - 1));
        if (this.jdField_a_of_type_ArrayOfByte[this.Y] < 0)
        {
          int tmp804_801 = this.Y;
          byte[] tmp804_797 = this.jdField_a_of_type_ArrayOfByte;
          tmp804_797[tmp804_801] = ((byte)(tmp804_797[tmp804_801] + this.alphabet.length()));
        }
      }
      if (this.controls[6] > this.jdField_e_of_type_Byte) {
        this.as = 14;
      }
      this.jdField_f_of_type_Int = b();
      if (((this.controls[5] > this.jdField_e_of_type_Byte) || (this.controls[4] > this.jdField_e_of_type_Byte)) && (this.jdField_f_of_type_Int == 1))
      {
        l();
        this.jdField_g_of_type_Int = 1;
        i();
        this.H = 1;
        return;
      }
      break;
    case 9: 
      if ((this.controls[0] > this.jdField_e_of_type_Byte) && (this.X > 0)) {
        this.X -= 1;
      }
      if ((this.controls[1] > this.jdField_e_of_type_Byte) && (this.X < this.U - (this.ai - 1))) {
        this.X += 1;
      }
      if (this.controls[6] > this.jdField_e_of_type_Byte)
      {
        this.as = 14;
        return;
      }
      break;
    case 13: 
      int i2 = 1;
      if (this.controls[0] > this.jdField_e_of_type_Byte)
      {
        this.jdField_h_of_type_Int -= 1;
        i2 = -1;
      }
      if (this.controls[1] > this.jdField_e_of_type_Byte)
      {
        this.jdField_h_of_type_Int += 1;
        i2 = 1;
      }
      this.jdField_h_of_type_Int %= 3;
      if (this.jdField_h_of_type_Int < 0) {
        this.jdField_h_of_type_Int += 3;
      }
      this.jdField_i_of_type_Int = weirdMethodReturningInt();
      if (this.jdField_i_of_type_Int > 0)
      {
        while (this.jdField_b_of_type_ArrayOfByte[this.jdField_h_of_type_Int] == 0)
        {
          this.jdField_h_of_type_Int = ((this.jdField_h_of_type_Int + i2) % 3);
          if (this.jdField_h_of_type_Int < 0) {
            this.jdField_h_of_type_Int += 3;
          }
        }
        if ((this.controls[5] > this.jdField_e_of_type_Byte) || (this.controls[4] > this.jdField_e_of_type_Byte))
        {
          for (int i1 = 0; i1 < 16; i1++) {
            this.jdField_a_of_type_ArrayOfByte[i1] = this.jdField_a_of_type_Array2dOfByte[this.jdField_h_of_type_Int][i1];
          }
          this.jdField_g_of_type_Int = 1;
          i();
          this.H = 1;
        }
      }
      if (this.controls[6] > this.jdField_e_of_type_Byte)
      {
        this.as = 14;
        return;
      }
      break;
    case 3: 
      if ((this.jdField_a_of_type_Byte > 0) && (this.controls[10] > this.jdField_e_of_type_Byte)) {
        if (this.controls[2] > this.jdField_e_of_type_Byte) {
          this.jdField_a_of_type_Byte = ((byte)(this.jdField_a_of_type_Byte + 0));
        } else {
          this.jdField_a_of_type_Byte = 0;
        }
      }
      if (this.controls[3] > this.jdField_e_of_type_Byte) {
        this.jdField_a_of_type_Byte = 1;
      }
      if (this.controls[2] > this.jdField_e_of_type_Byte)
      {
        if ((this.jdField_a_of_type_Byte > 0) && (this.jdField_a_of_type_Byte < 4)) {
          this.jdField_a_of_type_Byte = ((byte)(this.jdField_a_of_type_Byte + 1));
        }
        if (this.jdField_a_of_type_Byte == 4)
        {
          aaa(1);
          this.jdField_a_of_type_Byte = 0;
          this.jdField_d_of_type_Int = 49;
          d();
        }
      }
      if ((this.controls[0] > this.jdField_e_of_type_Byte) && (this.L > 0)) {
        this.L -= 1;
      }
      if ((this.controls[1] > this.jdField_e_of_type_Byte) && (this.L < 2)) {
        this.L += 1;
      }
      if ((this.controls[5] > this.jdField_e_of_type_Byte) || (this.controls[4] > this.jdField_e_of_type_Byte)) {
        switch (this.L)
        {
        case 0: 
          this.N = (1 - this.N);
          if (this.N == 0) {
            pauseMusic();
          }
          break;
        case 1: 
          this.O = (1 - this.O);
          break;
        case 2: 
          this.as = 7;
        }
      }
      if (this.controls[6] > this.jdField_e_of_type_Byte)
      {
        this.as = 0;
        return;
      }
      break;
    case 5: 
      if ((this.controls[5] > this.jdField_e_of_type_Byte) || (this.controls[4] > this.jdField_e_of_type_Byte)) {
        if (this.jdField_g_of_type_Int == 1)
        {
          i();
          this.H = 1;
        }
        else if (this.jdField_c_of_type_Int < this.jdField_d_of_type_Int)
        {
          this.jdField_c_of_type_Int += 1;
          i();
          this.H = 1;
        }
        else
        {
          this.as = 12;
        }
      }
      if (this.controls[6] > this.jdField_e_of_type_Byte)
      {
        this.as = 0;
        return;
      }
      break;
    case 6: 
      if ((this.controls[5] > this.jdField_e_of_type_Byte) || (this.controls[4] > this.jdField_e_of_type_Byte))
      {
        i();
        this.H = 1;
      }
      if (this.controls[6] > this.jdField_e_of_type_Byte)
      {
        this.as = 0;
        return;
      }
      break;
    case 12: 
      if (this.controls[6] > this.jdField_e_of_type_Byte)
      {
        this.as = 0;
        return;
      }
      break;
    case 7: 
      if ((this.controls[0] > this.jdField_e_of_type_Byte) && (this.V > 0)) {
        this.V -= 1;
      }
      if ((this.controls[1] > this.jdField_e_of_type_Byte) && (this.V < this.S - (this.ai - 1))) {
        this.V += 1;
      }
      if (this.controls[6] > this.jdField_e_of_type_Byte)
      {
        this.as = 3;
        return;
      }
      break;
    case 8: 
      if ((this.controls[0] > this.jdField_e_of_type_Byte) && (this.W > 0)) {
        this.W -= 1;
      }
      if ((this.controls[1] > this.jdField_e_of_type_Byte) && (this.W < this.T - (this.ai - 1))) {
        this.W += 1;
      }
      if (this.controls[6] > this.jdField_e_of_type_Byte)
      {
        this.as = 0;
        return;
      }
      break;
    case 10: 
      if ((this.controls[0] > this.jdField_e_of_type_Byte) && (this.R > 0)) {
        this.R -= 1;
      }
      if ((this.controls[1] > this.jdField_e_of_type_Byte) && (this.R < 2)) {
        this.R += 1;
      }
      if ((this.controls[5] > this.jdField_e_of_type_Byte) || (this.controls[4] > this.jdField_e_of_type_Byte)) {
        switch (this.R)
        {
        case 0: 
          aaa(0);
          this.gameState = -1;
          break;
        case 1: 
          this.N = (1 - this.N);
          if (this.N == 0) {
            pauseMusic();
          }
          break;
        case 2: 
          i();
          this.H = 1;
        }
      }
      if (this.controls[6] > this.jdField_e_of_type_Byte)
      {
        pauseMusic();
        this.as = 0;
        return;
      }
      break;
    case 14: 
      if ((this.controls[0] > this.jdField_e_of_type_Byte) && (this.M > 0)) {
        this.M -= 1;
      }
      if ((this.controls[1] > this.jdField_e_of_type_Byte) && (this.M < 2)) {
        this.M += 1;
      }
      if ((this.controls[5] > this.jdField_e_of_type_Byte) || (this.controls[4] > this.jdField_e_of_type_Byte)) {
        switch (this.M)
        {
        case 0: 
          this.as = 2;
          break;
        case 1: 
          this.as = 13;
          break;
        case 2: 
          this.as = 9;
        }
      }
      if (this.controls[6] > this.jdField_e_of_type_Byte)
      {
        this.as = 0;
        return;
      }
      break;
    case 4: 
    case 11: 
    default: 
      if ((this.controls[5] > this.jdField_e_of_type_Byte) || (this.controls[4] > this.jdField_e_of_type_Byte)) {
        this.as = 0;
      }
      break;
    }
  }
  
  private void l()
  {
    for (int i1 = 0; (i1 < 16) && (this.jdField_a_of_type_Array2dOfByte[0][i1] == this.jdField_a_of_type_ArrayOfByte[i1]); i1++) {}
    if (i1 == 16) {
      return;
    }
    for (i1 = 0; (i1 < 16) && (this.jdField_a_of_type_Array2dOfByte[1][i1] == this.jdField_a_of_type_ArrayOfByte[i1]); i1++) {}
    if (i1 == 16) {
      return;
    }
    for (i1 = 0; (i1 < 16) && (this.jdField_a_of_type_Array2dOfByte[2][i1] == this.jdField_a_of_type_ArrayOfByte[i1]); i1++) {}
    if (i1 == 16) {
      return;
    }
    this.jdField_h_of_type_Int = ((this.jdField_h_of_type_Int + 1) % 3);
    for (i1 = 0; i1 < 16; i1++) {
      this.jdField_a_of_type_Array2dOfByte[this.jdField_h_of_type_Int][i1] = this.jdField_a_of_type_ArrayOfByte[i1];
    }
  }
  
  private static int c(int paramInt)
  {
    if (paramInt < 48) {
      return 1;
    }
    if ((paramInt == 54) || (paramInt == 55)) {
      return 1;
    }
    if (paramInt == 63) {
      return 1;
    }
    return 0;
  }
  
  private void m()
  {
    int i1 = this.jdField_c_of_type_ArrayOfByte.length;
    this.jdField_d_of_type_ArrayOfByte = new byte[i1];
    for (int i2 = 0; i2 < i1; i2++) {
      this.jdField_d_of_type_ArrayOfByte[i2] = this.jdField_c_of_type_ArrayOfByte[i2];
    }
    for (i2 = 0; i2 < i1; i2++) {
      if (c(this.jdField_c_of_type_ArrayOfByte[i2]) == 1)
      {
        if (i2 < this.jdField_c_of_type_ArrayOfByte.length - 1)
        {
          if (c(this.jdField_c_of_type_ArrayOfByte[(i2 + 1)]) == 0) {
            this.jdField_d_of_type_ArrayOfByte[i2] = -1;
          }
          if ((i2 > this.k) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 + 1)]) == 0) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 - this.k)]) == 0)) {
            this.jdField_d_of_type_ArrayOfByte[i2] = -12;
          }
          if ((i2 < this.jdField_c_of_type_ArrayOfByte.length - this.k) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 + 1)]) == 0) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 + this.k)]) == 0)) {
            this.jdField_d_of_type_ArrayOfByte[i2] = -14;
          }
        }
        if (i2 > 0)
        {
          if (c(this.jdField_c_of_type_ArrayOfByte[(i2 - 1)]) == 0) {
            this.jdField_d_of_type_ArrayOfByte[i2] = -3;
          }
          if ((i2 > this.k) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 - 1)]) == 0) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 - this.k)]) == 0)) {
            this.jdField_d_of_type_ArrayOfByte[i2] = -32;
          }
          if ((i2 < this.jdField_c_of_type_ArrayOfByte.length - this.k) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 - 1)]) == 0) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 + this.k)]) == 0)) {
            this.jdField_d_of_type_ArrayOfByte[i2] = -34;
          }
        }
        if (i2 > this.k)
        {
          if (c(this.jdField_c_of_type_ArrayOfByte[(i2 - this.k)]) == 0) {
            this.jdField_d_of_type_ArrayOfByte[i2] = -2;
          }
          if ((i2 > 0) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 - this.k)]) == 0) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 - 1)]) == 0)) {
            this.jdField_d_of_type_ArrayOfByte[i2] = -23;
          }
          if ((i2 < this.jdField_c_of_type_ArrayOfByte.length - 1) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 - this.k)]) == 0) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 + 1)]) == 0)) {
            this.jdField_d_of_type_ArrayOfByte[i2] = -21;
          }
        }
        if (i2 < this.jdField_c_of_type_ArrayOfByte.length - 1 - this.k)
        {
          if (c(this.jdField_c_of_type_ArrayOfByte[(i2 + this.k)]) == 0) {
            this.jdField_d_of_type_ArrayOfByte[i2] = -4;
          }
          if ((i2 > 0) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 + this.k)]) == 0) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 - 1)]) == 0)) {
            this.jdField_d_of_type_ArrayOfByte[i2] = -43;
          }
          if ((i2 < this.jdField_c_of_type_ArrayOfByte.length - 1) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 + this.k)]) == 0) && (c(this.jdField_c_of_type_ArrayOfByte[(i2 + 1)]) == 0)) {
            this.jdField_d_of_type_ArrayOfByte[i2] = -41;
          }
        }
        if (this.jdField_d_of_type_ArrayOfByte[i2] > 0) {
          this.jdField_d_of_type_ArrayOfByte[i2] = -2;
        }
      }
    }
  }
  
  private void n()
  {
    this.jdField_c_of_type_ArrayOfInt[0] = (128 * this.v >> 8);
    this.jdField_d_of_type_ArrayOfInt[0] = (0 * this.v >> 8);
    this.jdField_c_of_type_ArrayOfInt[1] = (118 * this.v >> 8);
    this.jdField_d_of_type_ArrayOfInt[1] = (49 * this.v >> 8);
    this.jdField_c_of_type_ArrayOfInt[2] = (90 * this.v >> 8);
    this.jdField_d_of_type_ArrayOfInt[2] = (90 * this.v >> 8);
    this.jdField_c_of_type_ArrayOfInt[3] = (49 * this.v >> 8);
    this.jdField_d_of_type_ArrayOfInt[3] = (118 * this.v >> 8);
    this.jdField_c_of_type_ArrayOfInt[4] = (0 * this.v >> 8);
    this.jdField_d_of_type_ArrayOfInt[4] = (128 * this.v >> 8);
    this.jdField_e_of_type_ArrayOfInt[0] = 65280;
    this.jdField_f_of_type_ArrayOfInt[0] = 0;
    this.jdField_e_of_type_ArrayOfInt[1] = 65300;
    this.jdField_f_of_type_ArrayOfInt[1] = 98;
    this.jdField_e_of_type_ArrayOfInt[2] = 65355;
    this.jdField_f_of_type_ArrayOfInt[2] = 181;
    this.jdField_e_of_type_ArrayOfInt[3] = -98;
    this.jdField_f_of_type_ArrayOfInt[3] = 236;
    this.jdField_e_of_type_ArrayOfInt[4] = 0;
    this.jdField_f_of_type_ArrayOfInt[4] = 256;
    for (int i1 = 5; i1 < 9; i1++)
    {
      this.jdField_c_of_type_ArrayOfInt[i1] = (-this.jdField_c_of_type_ArrayOfInt[(8 - i1)]);
      this.jdField_d_of_type_ArrayOfInt[i1] = this.jdField_d_of_type_ArrayOfInt[(8 - i1)];
      this.jdField_e_of_type_ArrayOfInt[i1] = (-this.jdField_e_of_type_ArrayOfInt[(8 - i1)]);
      this.jdField_f_of_type_ArrayOfInt[i1] = this.jdField_f_of_type_ArrayOfInt[(8 - i1)];
    }
    for (i1 = 9; i1 < 13; i1++)
    {
      this.jdField_c_of_type_ArrayOfInt[i1] = (-this.jdField_d_of_type_ArrayOfInt[(12 - i1)]);
      this.jdField_d_of_type_ArrayOfInt[i1] = (-this.jdField_c_of_type_ArrayOfInt[(12 - i1)]);
    }
    for (i1 = 13; i1 < 16; i1++)
    {
      this.jdField_c_of_type_ArrayOfInt[i1] = this.jdField_c_of_type_ArrayOfInt[(16 - i1)];
      this.jdField_d_of_type_ArrayOfInt[i1] = (-this.jdField_d_of_type_ArrayOfInt[(16 - i1)]);
    }
    for (i1 = 9; i1 < 16; i1++)
    {
      this.jdField_e_of_type_ArrayOfInt[i1] = this.jdField_e_of_type_ArrayOfInt[(16 - i1)];
      this.jdField_f_of_type_ArrayOfInt[i1] = (-this.jdField_f_of_type_ArrayOfInt[(16 - i1)]);
    }
  }
  
  private int a(int paramInt1, int paramInt2)
  {
    int i3 = (this.l + paramInt1) / this.s;
    int i4 = (this.m - paramInt2) / this.s;
    int i5 = (this.l + paramInt1) % this.s;
    int i6 = (this.m - paramInt2) % this.s;
    int i1;
    if ((i3 > -1) && (i3 < this.k) && (i4 > -1) && (i4 < this.jdField_c_of_type_ArrayOfByte.length / this.k)) {
      i1 = this.k * i4 + i3;
    } else {
      i1 = this.jdField_c_of_type_ArrayOfByte.length + 1;
    }
    int i2;
    if ((i1 > -1) && (i1 < this.jdField_c_of_type_ArrayOfByte.length)) {
      i2 = this.jdField_d_of_type_ArrayOfByte[i1];
    } else {
      i2 = 64;
    }
    if ((i1 > -1) && (i1 < this.jdField_c_of_type_ArrayOfByte.length)) {
      i1 = this.jdField_c_of_type_ArrayOfByte[i1];
    } else {
      i1 = 64;
    }
    Math.abs(this.n + this.o);
    switch (i1)
    {
    case 14: 
    case 15: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 36: 
    case 37: 
    case 38: 
    case 39: 
    case 54: 
    case 55: 
      switch (i2)
      {
      case -21: 
        if (this.l > (i3 + 1) * this.s) {
          return 8;
        }
        return 12;
      case -41: 
        if (this.l > (i3 + 1) * this.s) {
          return 8;
        }
        return 4;
      case -23: 
        if (this.l < i3 * this.s) {
          return 0;
        }
        return 12;
      case -43: 
        if (this.l < i3 * this.s) {
          return 0;
        }
        return 4;
      case -1: 
        this.q = (-1 * this.q);
        return 8;
      case -2: 
        if ((this.n > 0) && (this.n < 256)) {
          this.q = 1;
        }
        if ((this.n >= 256) && (this.n < 512)) {
          this.q = 2;
        }
        if (this.n >= 512) {
          this.q = 4;
        }
        if ((this.n < 0) && (this.n > 65280)) {
          this.q = -1;
        }
        if ((this.n <= 65280) && (this.n > 65024)) {
          this.q = -2;
        }
        if (this.n <= 65024) {
          this.q = -4;
        }
        return 12;
      case -3: 
        this.q = (-1 * this.q);
        return 0;
      case -4: 
        if ((this.n > 0) && (this.n < 256)) {
          this.q = 1;
        }
        if ((this.n >= 256) && (this.n < 512)) {
          this.q = 2;
        }
        if (this.n >= 512) {
          this.q = 4;
        }
        if ((this.n < 0) && (this.n > 65280)) {
          this.q = -1;
        }
        if ((this.n <= 65280) && (this.n > 65024)) {
          this.q = -2;
        }
        if (this.n <= 65024) {
          this.q = -4;
        }
        return 4;
      }
      return 16;
    case 0: 
      if (i6 < this.s - 2 * i5) {
        return 7;
      }
      return 16;
    case 2: 
      if (i6 < 2 * this.s - 2 * i5) {
        return 7;
      }
      return 16;
    case 1: 
      if (i6 < i5 * 2 - this.s) {
        return 1;
      }
      return 16;
    case 3: 
      if (i6 < i5 * 2) {
        return 1;
      }
      return 16;
    case 4: 
      if (i6 > i5 * 2 - this.s) {
        return 9;
      }
      return 16;
    case 6: 
      if (i6 > i5 * 2) {
        return 9;
      }
      return 16;
    case 7: 
      if (i6 > 2 * this.s - 2 * i5) {
        return 15;
      }
      return 16;
    case 5: 
      if (i6 > this.s - 2 * i5) {
        return 15;
      }
      return 16;
    case 8: 
      if (i6 < this.s - i5 / 2) {
        return 5;
      }
      return 16;
    case 9: 
      if (i6 < this.s / 2 - i5 / 2) {
        return 5;
      }
      return 16;
    case 10: 
      if (i6 < i5 / 2) {
        return 3;
      }
      return 16;
    case 11: 
      if (i6 < this.s / 2 + i5 / 2) {
        return 3;
      }
      return 16;
    case 16: 
      if (i6 > i5 / 2) {
        return 11;
      }
      return 16;
    case 17: 
      if (i6 > i5 / 2 + this.s / 2) {
        return 11;
      }
      return 16;
    case 18: 
      if (i6 > this.s - i5 / 2) {
        return 13;
      }
      return 16;
    case 19: 
      if (i6 > this.s / 2 - i5 / 2) {
        return 13;
      }
      return 16;
    case 20: 
    case 32: 
    case 34: 
      if (i6 > i5)
      {
        this.q = 4;
        return 10;
      }
      return 16;
    case 21: 
    case 33: 
    case 35: 
      if (i6 > this.s - i5)
      {
        this.q = -4;
        return 14;
      }
      return 16;
    case 13: 
    case 29: 
    case 31: 
      if (i6 < i5)
      {
        this.q = -4;
        return 2;
      }
      return 16;
    case 12: 
    case 28: 
    case 30: 
      if (i6 < this.s - i5)
      {
        this.q = 4;
        return 6;
      }
      return 16;
    case 63: 
      this.z = 1;
      return 16;
    case 40: 
    case 41: 
    case 42: 
    case 43: 
      this.z = -1;
      return 16;
    case 44: 
      if (i6 < this.s - i5) {
        this.z = -1;
      }
      return 16;
    case 45: 
      if (i6 < i5) {
        this.z = -1;
      }
      return 16;
    case 47: 
      if (i6 > this.s - i5) {
        this.z = -1;
      }
      return 16;
    case 46: 
      if (i6 > i5) {
        this.z = -1;
      }
      return 16;
    }
    return 16;
  }
  
  private void o()
  {
    int[] arrayOfInt = new int[16];
    int i7 = 0;
    for (int i1 = 0; i1 < 16; i1++)
    {
      int i3 = 0;
      if (this.jdField_g_of_type_ArrayOfInt[i1] < 16)
      {
        for (int i2 = 0; (i2 < i7) && (arrayOfInt[i2] != this.jdField_g_of_type_ArrayOfInt[i1]); i2++) {}
        if (i2 == i7)
        {
          i3 = 1;
          arrayOfInt[i7] = this.jdField_g_of_type_ArrayOfInt[i1];
          i7++;
        }
      }
      if (i3 == 1)
      {
        int i6;
        if ((i6 = (i6 = this.n * this.jdField_e_of_type_ArrayOfInt[this.jdField_g_of_type_ArrayOfInt[i1]] + this.o * this.jdField_f_of_type_ArrayOfInt[this.jdField_g_of_type_ArrayOfInt[i1]]) / 256) < 0)
        {
          int i4 = i6 * this.jdField_e_of_type_ArrayOfInt[this.jdField_g_of_type_ArrayOfInt[i1]];
          int i5 = i6 * this.jdField_f_of_type_ArrayOfInt[this.jdField_g_of_type_ArrayOfInt[i1]];
          this.n -= 448 * i4 / 65536;
          this.o -= 448 * i5 / 65536;
        }
        else
        {
          this.l -= this.jdField_c_of_type_ArrayOfInt[this.jdField_g_of_type_ArrayOfInt[i1]] / 3;
          this.m += this.jdField_d_of_type_ArrayOfInt[this.jdField_g_of_type_ArrayOfInt[i1]] / 3;
        }
      }
    }
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    switch (paramInt1)
    {
    case 24: 
      this.n += 128;
      if (paramInt3 <= 0)
      {
        this.o -= 192;
        return;
      }
      this.o += 64;
      return;
    case 25: 
      this.n -= 128;
      if (paramInt3 <= 0)
      {
        this.o -= 192;
        return;
      }
      this.o += 64;
      return;
    case 26: 
      this.o -= 192;
      if (paramInt2 < 0)
      {
        this.n -= 128;
        return;
      }
      this.n += 128;
      return;
    case 27: 
      this.o += 64;
      if (paramInt2 < 0)
      {
        this.n -= 128;
        return;
      }
      this.n += 128;
      return;
    case 28: 
    case 35: 
      this.n += 128;
      this.o -= 192;
      return;
    case 29: 
    case 34: 
      this.n -= 128;
      this.o -= 192;
      return;
    case 30: 
    case 33: 
      this.n -= 128;
      this.o += 64;
      return;
    case 31: 
    case 32: 
      this.n += 128;
      this.o += 64;
    }
  }
  

  // ! This is important
  // TODO translate the rest

  private void doPhysics()
  {
    if ((this.J > 0) && (this.J < 100))
    {
      this.J--;
      if ((this.J == 0) && (this.O == 1) && (this.jdField_c_of_type_Int < 5) && (this.jdField_g_of_type_Int == 0)) {
        this.J = 160;
      }
      return;
    }
    if (this.J > 100)
    {
      this.J--;
      if (this.J == 101) {
        this.J = 0;
      }
    }
    if ((this.H > 0) && (this.H < this.j + 1) && (this.z != 0))
    {
      this.H += 1;
      return;
    }
    if ((this.H > this.j) && (this.z != 0))
    {
      r();
      return;
    }
    if (this.I > 0)
    {
      this.I--;
      if (this.I == 0) {
        this.J = 10;
      }
      somethingToDoAfterPhysics();
      return;
    }


    if (this.controls[Key.Fire] > this.controlsThreshold)
    {
      this.fireActive = 1;
    }
    else
    {
      this.fireActive = 0;
    }


    if (this.controls[Key.RightSoft] > this.jdField_e_of_type_Byte)
    {
      pauseMusic();
      this.gameState = State.Paused;
      this.as = 10;
      return;
    }


    for (int i1 = -1 - this.w; i1 < 2 + this.w; i1++) {
      for (int i2 = -2 - this.w; i2 < 2 + this.w; i2++)
      {
        int i4;
        if ((this.t + i1 > -1) && (this.t + i1 < this.k) && (this.u + i2 > -1) && (this.u + i2 < this.jdField_c_of_type_ArrayOfByte.length / this.k)) {
          i4 = this.k * (this.u + i2) + (this.t + i1);
        } else {
          i4 = this.jdField_c_of_type_ArrayOfByte.length + 1;
        }
        if ((i4 > -1) && (i4 < this.jdField_c_of_type_ArrayOfByte.length)) {
          i4 = this.jdField_c_of_type_ArrayOfByte[i4];
        } else {
          i4 = 64;
        }
        if ((this.fireActive == 1) && (i4 > 23) && (i4 < 36) && (Math.abs(i1) + Math.abs(i2) < this.w)) {
          a(i4, i1, i2);
        }
      }
    }


    for (i1 = 1; i1 <= this.maybePositionAndVelocity1.length; i1++)
    {
      this.maybePositionAndVelocity1[(i1 - 1)] = (this.n * i1 / 256);
      this.maybePositionAndVelocity1[(i1 - 1)] /= this.maybePositionAndVelocity1.length;
      this.maybePositionAndVelocity2[(i1 - 1)] = (this.o * i1 / 256);
      this.maybePositionAndVelocity2[(i1 - 1)] /= this.maybePositionAndVelocity1.length;
    }

    this.somePhysicsIndex = 0;
    int i3 = 0;
    while ((this.somePhysicsIndex < this.maybePositionAndVelocity1.length) && (i3 == 0))
    {
      i3 = 0;
      for (i1 = 0; i1 < 16; i1++)
      {
        this.jdField_b_of_type_ArrayOfInt[i1] = 16;
        this.jdField_g_of_type_ArrayOfInt[i1] = a(this.maybePositionAndVelocity1[this.somePhysicsIndex] + this.jdField_c_of_type_ArrayOfInt[i1], -this.maybePositionAndVelocity2[this.somePhysicsIndex] + this.jdField_d_of_type_ArrayOfInt[i1]);
        if (this.jdField_g_of_type_ArrayOfInt[i1] != 16)
        {
          this.jdField_b_of_type_ArrayOfInt[i1] = this.jdField_g_of_type_ArrayOfInt[i1];
          i3 = 1;
          if (this.r == 1) {
            this.r = 0;
          }
        }
      }
      if (i3 == 0) {
        this.somePhysicsIndex += 1;
      }
    }
    
    this.p += this.q;
    if (this.p < 0) {
      this.p += 64;
    }
    this.p %= 64;
    if (i3 == 1) {
      o();
    }

    this.o += 96;

    if (this.n > this.v * 128) {
      this.n = (this.v * 128);
    }

    if (this.n < -this.v * 128) {
      this.n = (-this.v * 128);
    }

    if (this.o > this.v * 128) {
      this.o = (this.v * 128);
    }

    if (this.o < -this.v * 128) {
      this.o = (-this.v * 128);
    }

    if (this.somePhysicsIndex > 0)
    {
      this.l += this.maybePositionAndVelocity1[(this.somePhysicsIndex - 1)];
      this.m += this.maybePositionAndVelocity2[(this.somePhysicsIndex - 1)];
    }

    if (this.m > 5000) {
      this.z = -1;
    }

    this.t = (this.l / this.s);
    this.u = (this.m / this.s);

    somethingToDoAfterPhysics();

    if (this.z != 0) {
      this.H = 1;
    }

  }
  
  private void somethingToDoAfterPhysics()
  {
    this.A = (this.l * this.af / this.s);
    this.B = (this.m * this.af / this.s);
    this.C = (this.A % this.af);
    this.D = (this.B % this.af);
    this.E = (this.A / this.af);
    this.F = (this.B / this.af);
    this.ab = (-(this.A / 4) % this.Z);
    this.ac = (this.ad - this.B / 4);
  }
  
  private void r()
  {
    this.jdField_b_of_type_Byte = ((byte)randUnsigned(3));
    if ((this.z == 1) && (this.jdField_d_of_type_Int == this.jdField_c_of_type_Int) && (this.jdField_d_of_type_Int < 49))
    {
      this.jdField_d_of_type_Int += 1;
      d();
    }
    try
    {
      this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[2] = Image.createImage(1, 1);
      this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[3] = Image.createImage(1, 1);
      if (this.z == -1)
      {
        switch (this.jdField_b_of_type_Byte)
        {
        case 0: 
          this.jdField_d_of_type_JavaxMicroeditionLcduiImage = Image.createImage(this.imageC + "/fig_dis.png");
          break;
        case 1: 
          this.jdField_d_of_type_JavaxMicroeditionLcduiImage = Image.createImage(this.imageC + "/fig_over.png");
          break;
        case 2: 
          this.jdField_d_of_type_JavaxMicroeditionLcduiImage = Image.createImage(this.imageC + "/fig_cry.png");
        }
        aaa(2);
        this.as = 6;
      }
      else
      {
        switch (this.jdField_b_of_type_Byte)
        {
        case 0: 
          this.jdField_d_of_type_JavaxMicroeditionLcduiImage = Image.createImage(this.imageC + "/fig_ok.png");
          break;
        case 1: 
          this.jdField_d_of_type_JavaxMicroeditionLcduiImage = Image.createImage(this.imageC + "/fig_king.png");
          break;
        case 2: 
          this.jdField_d_of_type_JavaxMicroeditionLcduiImage = Image.createImage(this.imageC + "/fig_flag.png");
        }
        aaa(1);
        this.as = 5;
      }
    }
    catch (Exception localException) {}
    this.H = 0;
    this.I = this.j;
    this.gameState = State.Paused;
  }
  
  private void b(Graphics paramGraphics)
  {
    if (this.at < 2)
    {
      a(paramGraphics, this.jdField_a_of_type_JavaxMicroeditionLcduiFont, true);
      a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[34] + this.jdField_a_of_type_ArrayOfJavaLangString[46], imageB.am, this.ag, imageB.ak - 10, 0, -1, false, 17);
      this.S = (this.au + 1);
      a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[35], imageB.am, this.ag, imageB.ak - 10, 0, -1, false, 17);
      this.T = this.au;
      a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[41] + this.jdField_a_of_type_ArrayOfJavaLangString[42], imageB.am, this.ag, imageB.ak - 10, 0, -1, false, 17);
      this.U = this.au;
    }
    if (this.as == this.jdField_a_of_type_Int)
    {
      paramGraphics.setColor(255, 255, 255);
      paramGraphics.fillRect(0, 0, imageB.ak, imageB.al);
    }
    else
    {
      for (int i1 = 0; i1 < imageB.ak; i1 += 15) {
        for (int i2 = 0; i2 < imageB.al; i2 += 15)
        {
          paramGraphics.setClip(i1, i2, 15, 15);
          paramGraphics.drawImage(this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[this.as], i1, i2, 20);
        }
      }
    }
    paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
    paramGraphics.drawImage(this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[this.as], imageB.am, imageB.an, 3);
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Graphics paramGraphics, int paramInt5)
  {
    int[] arrayOfInt1 = new int[5];
    int[] arrayOfInt2 = new int[5];
    int i2 = (paramInt3 - paramInt1) / 4;
    int i3 = (paramInt4 - paramInt2) / 4;
    int i4 = 6 + (4 - paramInt5);
    arrayOfInt1[0] = (paramInt1 + randSigned(i4));
    arrayOfInt2[0] = (paramInt2 + randSigned(i4));
    arrayOfInt1[4] = (paramInt3 + randSigned(i4));
    arrayOfInt2[4] = (paramInt4 + randSigned(i4));
    for (int i1 = 1; i1 <= 2; i1++)
    {
      arrayOfInt1[i1] = (arrayOfInt1[(i1 - 1)] + i2 + randSigned(i4));
      arrayOfInt2[i1] = (arrayOfInt2[(i1 - 1)] + i3 + randSigned(i4));
    }
    for (i1 = 3; i1 >= 2; i1--)
    {
      arrayOfInt1[i1] = (arrayOfInt1[(i1 + 1)] - i2 + randSigned(i4));
      arrayOfInt2[i1] = (arrayOfInt2[(i1 + 1)] - i3 + randSigned(i4));
    }
    for (i1 = 0; i1 < 4; i1++)
    {
      paramGraphics.setColor(paramInt5 * 64, paramInt5 * 64, 255);
      paramGraphics.drawLine(arrayOfInt1[i1], arrayOfInt2[i1], arrayOfInt1[(i1 + 1)], arrayOfInt2[(i1 + 1)]);
      if (paramInt5 > 1)
      {
        paramGraphics.setColor((paramInt5 - 1) * 64, (paramInt5 - 1) * 64, 255);
        paramGraphics.drawLine(arrayOfInt1[i1] + 1, arrayOfInt2[i1], arrayOfInt1[(i1 + 1)] + 1, arrayOfInt2[(i1 + 1)]);
        paramGraphics.drawLine(arrayOfInt1[i1] - 1, arrayOfInt2[i1], arrayOfInt1[(i1 + 1)] - 1, arrayOfInt2[(i1 + 1)]);
      }
      if (paramInt5 > 2)
      {
        paramGraphics.setColor((paramInt5 - 2) * 64, (paramInt5 - 2) * 64, 255);
        paramGraphics.drawLine(arrayOfInt1[i1] + 1, arrayOfInt2[i1] + 1, arrayOfInt1[(i1 + 1)] + 1, arrayOfInt2[(i1 + 1)] + 1);
        paramGraphics.drawLine(arrayOfInt1[i1] - 1, arrayOfInt2[i1] - 1, arrayOfInt1[(i1 + 1)] - 1, arrayOfInt2[(i1 + 1)] - 1);
      }
    }
  }
  
  private void a(int paramInt, Graphics paramGraphics)
  {
    int i1 = imageB.ak / 10;
    paramGraphics.setColor(128, 128, 255);
    paramGraphics.drawArc(-1 + i1 - this.ae / 2, -1 - this.ae / 2 + 5 + paramInt, 1 + this.ae, 1 + this.ae, 0, 360);
    paramGraphics.drawArc(-1 + imageB.ak - i1 - this.ae / 2, -1 - this.ae / 2 + 5 + paramInt, 1 + this.ae, 1 + this.ae, 0, 360);
    paramGraphics.setColor(64, 64, 255);
    paramGraphics.drawArc(-2 + i1 - this.ae / 2, -2 - this.ae / 2 + 5 + paramInt, 3 + this.ae, 3 + this.ae, 0, 360);
    paramGraphics.drawArc(-2 + imageB.ak - i1 - this.ae / 2, -2 - this.ae / 2 + 5 + paramInt, 3 + this.ae, 3 + this.ae, 0, 360);
    paramGraphics.setColor(32, 32, 192);
    paramGraphics.drawArc(-3 + i1 - this.ae / 2, -3 - this.ae / 2 + 5 + paramInt, 5 + this.ae, 5 + this.ae, 0, 360);
    paramGraphics.drawArc(-3 + imageB.ak - i1 - this.ae / 2, -3 - this.ae / 2 + 5 + paramInt, 5 + this.ae, 5 + this.ae, 0, 360);
    a(i1, 5 + paramInt, imageB.ak - i1, 5 + paramInt, paramGraphics, 1);
    a(i1, 5 + paramInt, imageB.ak - i1, 5 + paramInt, paramGraphics, 1);
    a(i1, 5 + paramInt, imageB.ak - i1, 5 + paramInt, paramGraphics, 3);
    paramGraphics.setClip(i1 - this.ae / 2, -(this.ae / 2) + 5 + paramInt, this.ae, this.ae);
    paramGraphics.drawImage(this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[1], i1 - this.ae / 2, -(this.ae / 2) + 5 + paramInt, 20);
    paramGraphics.setClip(imageB.ak - i1 - this.ae / 2, -(this.ae / 2) + 5 + paramInt, this.ae, this.ae);
    paramGraphics.drawImage(this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[1], imageB.ak - i1 - this.ae / 2, -(this.ae / 2) + 5 + paramInt, 20);
    paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
  }
  
  private void c(Graphics paramGraphics)
  {
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[30], 1 + imageB.am, this.ag + this.ah * 0, 17);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[11], 1 + imageB.am, this.ag + this.ah * 1, 17);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[6] + " " + this.jdField_a_of_type_ArrayOfJavaLangString[(10 - this.N)], 1 + imageB.am, this.ag + this.ah * 2, 17);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[12], 1 + imageB.am, this.ag + this.ah * 3, 17);
    a(this.ag + this.ah * (this.R + 1), paramGraphics);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[30], imageB.am, this.ag + this.ah * 0, 17);
    if (0 == this.R) {
      paramGraphics.setColor(255, 255, 255);
    } else {
      paramGraphics.setColor(128, 128, 128);
    }
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[11], imageB.am, this.ag + this.ah * 1, 17);
    if (1 == this.R) {
      paramGraphics.setColor(255, 255, 255);
    } else {
      paramGraphics.setColor(128, 128, 128);
    }
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[6] + " " + this.jdField_a_of_type_ArrayOfJavaLangString[(10 - this.N)], imageB.am, this.ag + this.ah * 2, 17);
    if (2 == this.R) {
      paramGraphics.setColor(255, 255, 255);
    } else {
      paramGraphics.setColor(128, 128, 128);
    }
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[12], imageB.am, this.ag + this.ah * 3, 17);
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[4], 3, imageB.al - 1, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[29], imageB.ak - 1, imageB.al - 1, 40);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[4], 2, imageB.al - 2, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[29], imageB.ak - 2, imageB.al - 2, 40);
  }
  
  private void d(Graphics paramGraphics)
  {
    paramGraphics.setColor(0, 0, 0);
    for (int i1 = 0; i1 < 4; i1++)
    {
      paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[i1], 1 + imageB.am, this.ag + this.ah * i1, 17);
      paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[i1], 1 + imageB.am, this.ag + this.ah * i1, 17);
    }
    a(this.ag + this.ah * this.K, paramGraphics);
    for (i1 = 0; i1 < 4; i1++)
    {
      if (i1 == this.K) {
        paramGraphics.setColor(255, 255, 255);
      } else {
        paramGraphics.setColor(128, 128, 128);
      }
      paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[i1], imageB.am, this.ag + this.ah * i1, 17);
    }
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[4], 3, imageB.al - 1, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[5], imageB.ak - 1, imageB.al - 1, 40);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[4], 2, imageB.al - 2, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[5], imageB.ak - 2, imageB.al - 2, 40);
  }
  
  private void e(Graphics paramGraphics)
  {
    for (int i1 = 0; i1 < 4; i1++)
    {
      paramGraphics.setColor(0, 0, 0);
      paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[22] + " " + (1 + i1 + this.jdField_e_of_type_Int), imageB.am + 1, 1 + this.ag + this.ah * i1, 17);
      if (i1 + this.jdField_e_of_type_Int == this.jdField_c_of_type_Int)
      {
        a(this.ag + this.ah * i1, paramGraphics);
        paramGraphics.setColor(255, 255, 255);
      }
      else
      {
        paramGraphics.setColor(128, 128, 128);
      }
      paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[22] + " " + (1 + i1 + this.jdField_e_of_type_Int), imageB.am, this.ag + this.ah * i1, 17);
    }
    if (this.jdField_c_of_type_Int > 0)
    {
      paramGraphics.setClip(0, 3 + this.ag - this.ah + 2 * (this.at % 2), imageB.ak, this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2);
      paramGraphics.drawImage(this.jdField_a_of_type_JavaxMicroeditionLcduiImage, imageB.am, 3 + this.ag - this.ah + 2 * (this.at % 2), 17);
    }
    if (this.jdField_c_of_type_Int < this.jdField_d_of_type_Int)
    {
      paramGraphics.setClip(0, 3 + this.ag + this.ah * 4 + 2 * (this.at % 2), imageB.ak, this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2);
      paramGraphics.drawImage(this.jdField_a_of_type_JavaxMicroeditionLcduiImage, imageB.am, 3 + this.ag + this.ah * 4 + 2 * (this.at % 2) - this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2, 17);
    }
    paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[23], 3, imageB.al - 1, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 1, imageB.al - 1, 40);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[23], 2, imageB.al - 2, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 2, imageB.al - 2, 40);
  }
  
  private void f(Graphics paramGraphics)
  {
    int i1 = 0;
    paramGraphics.setColor(255, 255, 255);
    a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[16], imageB.ak * 2 / 3, this.ag, imageB.am + imageB.am / 4, imageB.al, 0, false, 17);
    a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[17], imageB.ak * 2 / 3, this.ag + this.ah, imageB.am + imageB.am / 4, imageB.al, 0, false, 17);
    paramGraphics.setClip(imageB.ak / 10, this.ag + this.ah / 2, this.jdField_d_of_type_JavaxMicroeditionLcduiImage.getHeight(), this.jdField_d_of_type_JavaxMicroeditionLcduiImage.getHeight());
    if ((this.jdField_b_of_type_Byte == 0) && ((i1 = this.at % 22 / 2) > 5)) {
      i1 = 11 - i1;
    }
    if (this.jdField_b_of_type_Byte == 1) {
      i1 = this.at % 12 / 2;
    }
    if (this.jdField_b_of_type_Byte == 2) {
      i1 = this.at % 12 / 2;
    }
    paramGraphics.drawImage(this.jdField_d_of_type_JavaxMicroeditionLcduiImage, imageB.ak / 10 - i1 * this.jdField_d_of_type_JavaxMicroeditionLcduiImage.getHeight(), this.ag + this.ah / 2, 20);
    if ((this.jdField_c_of_type_Int == this.jdField_d_of_type_Int) && (this.jdField_d_of_type_Int == 49)) {
      i1 = 4;
    } else {
      i1 = 33;
    }
    if (this.jdField_g_of_type_Int == 1) {
      i1 = 12;
    }
    paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[i1], 3, imageB.al - 1, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[29], imageB.ak - 1, imageB.al - 1, 40);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[i1], 2, imageB.al - 2, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[29], imageB.ak - 2, imageB.al - 2, 40);
  }
  
  private void g(Graphics paramGraphics)
  {
    int i1 = 0;
    paramGraphics.setColor(255, 255, 255);
    a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[31] + " " + this.jdField_a_of_type_ArrayOfJavaLangString[32], imageB.ak * 2 / 3, this.ag, imageB.am + imageB.am / 4, imageB.al, 0, false, 17);
    paramGraphics.setClip(imageB.ak / 10, this.ag + this.ah / 2, this.jdField_d_of_type_JavaxMicroeditionLcduiImage.getHeight(), this.jdField_d_of_type_JavaxMicroeditionLcduiImage.getHeight());
    if (this.jdField_b_of_type_Byte == 0) {
      i1 = this.at % 12 / 2;
    }
    if ((this.jdField_b_of_type_Byte == 1) && ((i1 = this.at % 22 / 2) > 5)) {
      i1 = 11 - i1;
    }
    if (this.jdField_b_of_type_Byte == 2) {
      i1 = this.at % 6;
    }
    paramGraphics.drawImage(this.jdField_d_of_type_JavaxMicroeditionLcduiImage, imageB.ak / 10 - i1 * this.jdField_d_of_type_JavaxMicroeditionLcduiImage.getHeight(), this.ag + this.ah / 2, 20);
    paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[12], 3, imageB.al - 1, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[29], imageB.ak - 1, imageB.al - 1, 40);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[12], 2, imageB.al - 2, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[29], imageB.ak - 2, imageB.al - 2, 40);
  }
  
  private void h(Graphics paramGraphics)
  {
    paramGraphics.setColor(0, 0, 0);
    for (int i1 = 0; i1 < 3; i1++) {
      paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[(24 + i1)], 1 + imageB.am, 1 + this.ag + this.ah * i1, 17);
    }
    a(this.ag + this.ah * this.M, paramGraphics);
    for (i1 = 0; i1 < 3; i1++)
    {
      if (i1 == this.M) {
        paramGraphics.setColor(255, 255, 255);
      } else {
        paramGraphics.setColor(128, 128, 128);
      }
      paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[(24 + i1)], imageB.am, this.ag + this.ah * i1, 17);
    }
    paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[4], 3, imageB.al - 1, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 1, imageB.al - 1, 40);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[4], 2, imageB.al - 2, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 2, imageB.al - 2, 40);
  }
  
  private void i(Graphics paramGraphics)
  {
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[6] + " " + this.jdField_a_of_type_ArrayOfJavaLangString[(10 - this.N)], 1 + imageB.am, this.ag + this.ah * 0, 17);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[7] + " " + this.jdField_a_of_type_ArrayOfJavaLangString[(10 - this.O)], 1 + imageB.am, this.ag + this.ah * 1, 17);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[8], 1 + imageB.am, this.ag + this.ah * 2, 17);
    a(this.ag + this.ah * this.L, paramGraphics);
    if (0 == this.L) {
      paramGraphics.setColor(255, 255, 255);
    } else {
      paramGraphics.setColor(128, 128, 128);
    }
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[6] + " " + this.jdField_a_of_type_ArrayOfJavaLangString[(10 - this.N)], imageB.am, this.ag + this.ah * 0, 17);
    if (1 == this.L) {
      paramGraphics.setColor(255, 255, 255);
    } else {
      paramGraphics.setColor(128, 128, 128);
    }
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[7] + " " + this.jdField_a_of_type_ArrayOfJavaLangString[(10 - this.O)], imageB.am, this.ag + this.ah * 1, 17);
    if (2 == this.L) {
      paramGraphics.setColor(255, 255, 255);
    } else {
      paramGraphics.setColor(128, 128, 128);
    }
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[8], imageB.am, this.ag + this.ah * 2, 17);
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[4], 3, imageB.al - 1, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 1, imageB.al - 1, 40);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[4], 2, imageB.al - 2, 36);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 2, imageB.al - 2, 40);
  }
  
  private void j(Graphics paramGraphics)
  {
    int i1 = (imageB.ak - 16 * this.jdField_d_of_type_Byte) / 2;
    paramGraphics.setColor(255, 255, 255);
    a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[43], imageB.am, this.ag, imageB.ak, imageB.al - this.ah - this.ag, 0, false, 17);
    if (this.jdField_i_of_type_Int > 0)
    {
      paramGraphics.setClip(0, this.ag + this.ah * 2 + 2 * (this.at % 2), imageB.ak, this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2);
      paramGraphics.drawImage(this.jdField_a_of_type_JavaxMicroeditionLcduiImage, imageB.am, this.ag + this.ah * 2 + 2 * (this.at % 2), 17);
      paramGraphics.setClip(0, this.aj + this.ag + this.ah * 4 + 2 * (this.at % 2), imageB.ak, this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2);
      paramGraphics.drawImage(this.jdField_a_of_type_JavaxMicroeditionLcduiImage, imageB.am, this.aj + this.ag + this.ah * 4 + 2 * (this.at % 2) - this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2, 17);
      paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
      for (int i3 = 0; i3 < 16; i3++)
      {
        int i2 = this.jdField_a_of_type_Array2dOfByte[this.jdField_h_of_type_Int][i3];
        paramGraphics.setColor(0, 0, 0);
        paramGraphics.drawString(this.alphabet.substring(i2, i2 + 1), 1 + i1 + i3 * this.jdField_d_of_type_Byte, 1 + this.ag + this.ah * 3, 20);
        paramGraphics.setColor(255, 255, 255);
        paramGraphics.drawString(this.alphabet.substring(i2, i2 + 1), i1 + i3 * this.jdField_d_of_type_Byte, this.ag + this.ah * 3, 20);
      }
    }
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[18], imageB.am + 1, 1 + this.ag + this.ah * 3, 17);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[18], imageB.am, this.ag + this.ah * 3, 17);
    paramGraphics.setColor(0, 0, 0);
    if (this.jdField_i_of_type_Int > 0) {
      paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[23], 3, imageB.al - 1, 36);
    }
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 1, imageB.al - 1, 40);
    paramGraphics.setColor(255, 255, 255);
    if (this.jdField_i_of_type_Int > 0) {
      paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[23], 2, imageB.al - 2, 36);
    }
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 2, imageB.al - 2, 40);
  }
  
  private void k(Graphics paramGraphics)
  {
    int i1 = this.aq * this.ai;
    paramGraphics.setColor(255, 255, 255);
    a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[41] + this.jdField_a_of_type_ArrayOfJavaLangString[42], imageB.am, this.jdField_c_of_type_Byte, imageB.ak - 10, i1, this.X, false, 17);
    if (this.X > 0)
    {
      paramGraphics.setClip(0, 3 + this.jdField_c_of_type_Byte - this.ah + 2 * (this.at % 2), imageB.ak, this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2);
      paramGraphics.drawImage(this.jdField_a_of_type_JavaxMicroeditionLcduiImage, imageB.am, 3 + this.jdField_c_of_type_Byte - this.ah + 2 * (this.at % 2), 17);
    }
    if (this.X < this.U - (this.ai - 1))
    {
      paramGraphics.setClip(0, this.aj + this.jdField_c_of_type_Byte + i1 + 2 * (this.at % 2), imageB.ak, this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2);
      paramGraphics.drawImage(this.jdField_a_of_type_JavaxMicroeditionLcduiImage, imageB.am, this.aj + this.jdField_c_of_type_Byte + i1 + 2 * (this.at % 2) - this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2, 17);
    }
    paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 1, imageB.al - 1, 40);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 2, imageB.al - 2, 40);
  }
  
  private void l(Graphics paramGraphics)
  {
    int i2 = (imageB.ak - 16 * (this.jdField_d_of_type_Byte + 1)) / 2;
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[24], 1 + imageB.am, 1 + this.ag, 17);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[24], imageB.am, this.ag, 17);
    paramGraphics.setColor(0, 0, 0);
    int i3;
    for (int i1 = 0; i1 < 16; i1++)
    {
      i3 = this.jdField_a_of_type_ArrayOfByte[i1];
      paramGraphics.drawString(this.alphabet.substring(i3, i3 + 1), 1 + i2 + i1 * (this.jdField_d_of_type_Byte + 1), 1 + this.ag + this.ah * 2, 20);
    }
    paramGraphics.setColor(255, 255, 255);
    for (i1 = 0; i1 < 16; i1++)
    {
      i3 = this.jdField_a_of_type_ArrayOfByte[i1];
      paramGraphics.drawString(this.alphabet.substring(i3, i3 + 1), i2 + i1 * (this.jdField_d_of_type_Byte + 1), this.ag + this.ah * 2, 20);
    }
    paramGraphics.setClip(0, this.ag + this.ah + 2 * (this.at % 2), imageB.ak, this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2);
    paramGraphics.drawImage(this.jdField_a_of_type_JavaxMicroeditionLcduiImage, -1 + i2 + this.Y * (this.jdField_d_of_type_Byte + 1), this.ag + this.ah * 1 + 2 * (this.at % 2), 20);
    paramGraphics.setClip(0, this.ag + this.ah * 3 + 2 * (this.at % 2), imageB.ak, this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2);
    paramGraphics.drawImage(this.jdField_a_of_type_JavaxMicroeditionLcduiImage, -1 + i2 + this.Y * (this.jdField_d_of_type_Byte + 1), this.ag + this.ah * 3 + 2 * (this.at % 2) - this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2, 20);
    paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
    paramGraphics.setColor(0, 0, 0);
    if (this.jdField_f_of_type_Int != 0) {
      paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[23], 3, imageB.al - 1, 36);
    }
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 1, imageB.al - 1, 40);
    paramGraphics.setColor(255, 255, 255);
    if (this.jdField_f_of_type_Int != 0) {
      paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[23], 2, imageB.al - 2, 36);
    }
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 2, imageB.al - 2, 40);
  }
  
  private void m(Graphics paramGraphics)
  {
    int i1 = this.aq * this.ai;
    paramGraphics.setColor(255, 255, 255);
    a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[34] + this.version + this.jdField_a_of_type_ArrayOfJavaLangString[46], imageB.am, this.jdField_c_of_type_Byte, imageB.ak - 10, i1, this.V, false, 17);
    if (this.V > 0)
    {
      paramGraphics.setClip(0, 3 + this.jdField_c_of_type_Byte - this.ah + 2 * (this.at % 2), imageB.ak, this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2);
      paramGraphics.drawImage(this.jdField_a_of_type_JavaxMicroeditionLcduiImage, imageB.am, 3 + this.jdField_c_of_type_Byte - this.ah + 2 * (this.at % 2), 17);
    }
    if (this.V < this.S - (this.ai - 1))
    {
      paramGraphics.setClip(0, this.aj + this.jdField_c_of_type_Byte + i1 + 2 * (this.at % 2), imageB.ak, this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2);
      paramGraphics.drawImage(this.jdField_a_of_type_JavaxMicroeditionLcduiImage, imageB.am, this.aj + this.jdField_c_of_type_Byte + i1 + 2 * (this.at % 2) - this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2, 17);
    }
    paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 1, imageB.al - 1, 40);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 2, imageB.al - 2, 40);
  }
  
  private void n(Graphics paramGraphics)
  {
    int i1 = this.aq * this.ai;
    paramGraphics.setColor(255, 255, 255);
    a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[35], imageB.am, this.jdField_c_of_type_Byte, imageB.ak - 10, i1, this.W, false, 17);
    if (this.W > 0)
    {
      paramGraphics.setClip(0, 3 + this.jdField_c_of_type_Byte - this.ah + 2 * (this.at % 2), imageB.ak, this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2);
      paramGraphics.drawImage(this.jdField_a_of_type_JavaxMicroeditionLcduiImage, imageB.am, 3 + this.jdField_c_of_type_Byte - this.ah + 2 * (this.at % 2), 17);
    }
    if (this.W < this.T - (this.ai - 1))
    {
      paramGraphics.setClip(0, this.aj + this.jdField_c_of_type_Byte + i1 + 2 * (this.at % 2), imageB.ak, this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2);
      paramGraphics.drawImage(this.jdField_a_of_type_JavaxMicroeditionLcduiImage, imageB.am, this.aj + this.jdField_c_of_type_Byte + i1 + 2 * (this.at % 2) - this.jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight() / 2, 17);
    }
    paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 1, imageB.al - 1, 40);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[21], imageB.ak - 2, imageB.al - 2, 40);
  }
  
  private void o(Graphics paramGraphics)
  {
    paramGraphics.setColor(255, 255, 255);
    a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[27], imageB.am, this.ag, imageB.ak, imageB.al, 0, false, 17);
    a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[28], imageB.am, this.ag + 2 * this.ah, imageB.ak, imageB.al, 0, false, 17);
    paramGraphics.setColor(0, 0, 0);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[29], imageB.ak - 1, imageB.al - 1, 40);
    paramGraphics.setColor(255, 255, 255);
    paramGraphics.drawString(this.jdField_a_of_type_ArrayOfJavaLangString[29], imageB.ak - 2, imageB.al - 2, 40);
  }
  
  private void p(Graphics paramGraphics)
  {
    paramGraphics.setColor(174, 37, 16);
    paramGraphics.fillRect(0, 0, imageB.ak, imageB.al);
    paramGraphics.drawImage(this.jdField_c_of_type_JavaxMicroeditionLcduiImage, imageB.am, imageB.an, 3);
    paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
    paramGraphics.drawImage(this.jdField_b_of_type_JavaxMicroeditionLcduiImage, imageB.am, (imageB.al - 118) / 10, 17);
    switch (this.as)
    {
    case 0: 
      d(paramGraphics);
      break;
    case 1: 
      e(paramGraphics);
      break;
    case 2: 
      l(paramGraphics);
      break;
    case 3: 
      i(paramGraphics);
      break;
    case 5: 
      f(paramGraphics);
      break;
    case 6: 
      g(paramGraphics);
      break;
    case 7: 
      m(paramGraphics);
      break;
    case 8: 
      n(paramGraphics);
      break;
    case 9: 
      k(paramGraphics);
      break;
    case 10: 
      c(paramGraphics);
      break;
    case 12: 
      o(paramGraphics);
      break;
    case 13: 
      j(paramGraphics);
      break;
    case 14: 
      h(paramGraphics);
    }
    if (this.H > 0)
    {
      paramGraphics.setColor(216, 216, 216);
      paramGraphics.fillArc(imageB.am - this.H * 16, imageB.an - this.H * 16, 2 * this.H * 16, 2 * this.H * 16, 0, 360);
    }
    if (this.I > 0)
    {
      paramGraphics.setColor(216, 216, 216);
      paramGraphics.fillArc(imageB.am - this.I * 16, imageB.an - this.I * 16, 2 * this.I * 16, 2 * this.I * 16, 0, 360);
    }
  }
  
  private void q(Graphics paramGraphics)
  {
    for (int i1 = -1; i1 < 2 + imageB.ak / this.Z; i1++) {
      paramGraphics.drawImage(this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[3], this.ab + i1 * this.Z, this.ac, 20);
    }
    paramGraphics.setColor(this.jdField_a_of_type_Array2dOfInt[this.G][0], this.jdField_a_of_type_Array2dOfInt[this.G][1], this.jdField_a_of_type_Array2dOfInt[this.G][2]);
    if (this.ac > 0) {
      paramGraphics.fillRect(0, 0, imageB.ak, this.ac);
    }
    paramGraphics.setColor(this.jdField_a_of_type_Array2dOfInt[(this.G + 1)][0], this.jdField_a_of_type_Array2dOfInt[(this.G + 1)][1], this.jdField_a_of_type_Array2dOfInt[(this.G + 1)][2]);
    if (this.ac + this.aa < imageB.al) {
      paramGraphics.fillRect(0, this.ac + this.aa, imageB.ak, imageB.al - this.ac - this.aa);
    }
    paramGraphics.setColor(0, 0, 0);
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    for (i1 = -1 - imageB.am / this.af; i1 < 2 + imageB.am / this.af; i1++) {
      for (i2 = -2 - imageB.an / this.af; i2 < 2 + imageB.an / this.af; i2++)
      {
        i3 = imageB.am - this.C + i1 * this.af;
        i4 = imageB.an - this.D + i2 * this.af;
        if ((this.E + i1 > -1) && (this.E + i1 < this.k) && (this.F + i2 > -1) && (this.F + i2 < this.jdField_c_of_type_ArrayOfByte.length / this.k)) {
          i5 = this.k * (this.F + i2) + (this.E + i1);
        } else {
          i5 = this.jdField_c_of_type_ArrayOfByte.length + 1;
        }
        if ((i5 > -1) && (i5 < this.jdField_c_of_type_ArrayOfByte.length)) {
          i6 = this.jdField_c_of_type_ArrayOfByte[i5];
        } else {
          i6 = 64;
        }
        paramGraphics.setClip(i3, i4, this.af, this.af);
        paramGraphics.drawImage(this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[2], i3 - i6 % 8 * this.af, i4 - i6 / 8 * this.af, 20);
      }
    }
    paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
    for (i1 = -1 - imageB.am / this.af; i1 < 2 + imageB.am / this.af; i1++) {
      for (i2 = -2 - imageB.an / this.af; i2 < 2 + imageB.an / this.af; i2++)
      {
        i3 = imageB.am - this.C + i1 * this.af;
        i4 = imageB.an - this.D + i2 * this.af;
        if ((this.E + i1 > -1) && (this.E + i1 < this.k) && (this.F + i2 > -1) && (this.F + i2 < this.jdField_c_of_type_ArrayOfByte.length / this.k)) {
          i5 = this.k * (this.F + i2) + (this.E + i1);
        } else {
          i5 = this.jdField_c_of_type_ArrayOfByte.length + 1;
        }
        if ((i5 > -1) && (i5 < this.jdField_c_of_type_ArrayOfByte.length)) {
          i6 = this.jdField_c_of_type_ArrayOfByte[i5];
        } else {
          i6 = 64;
        }
        if ((this.fireActive == 1) && (i6 > 23) && (i6 < 36) && (Math.abs(i1) + Math.abs(i2) < this.w))
        {
          a(imageB.am, imageB.an, i3 + this.af / 2, i4 + this.af / 2, paramGraphics, 1);
          a(imageB.am, imageB.an, i3 + this.af / 2, i4 + this.af / 2, paramGraphics, 1);
          a(imageB.am, imageB.an, i3 + this.af / 2, i4 + this.af / 2, paramGraphics, 3);
        }
      }
    }
    if (this.fireActive == 1)
    {
      paramGraphics.setColor(128, 128, 255);
      paramGraphics.drawArc(-1 + imageB.am - this.ae / 2, -1 + imageB.an - this.ae / 2, 1 + this.ae, 1 + this.ae, 0, 360);
      paramGraphics.setColor(64, 64, 255);
      paramGraphics.drawArc(-2 + imageB.am - this.ae / 2, -2 + imageB.an - this.ae / 2, 3 + this.ae, 3 + this.ae, 0, 360);
      paramGraphics.setColor(32, 32, 192);
      paramGraphics.drawArc(-3 + imageB.am - this.ae / 2, -3 + imageB.an - this.ae / 2, 5 + this.ae, 5 + this.ae, 0, 360);
    }
    paramGraphics.setClip(imageB.am - this.ae / 2, imageB.an - this.ae / 2, this.ae, this.ae);
    if (this.p / 4 < 8) {
      paramGraphics.drawImage(this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[1], imageB.am - this.ae / 2 - this.p / 4 * this.ae, imageB.an - this.ae / 2, 20);
    } else {
      paramGraphics.drawImage(this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[5], imageB.am - this.ae / 2 - (this.p / 4 - 8) * this.ae, imageB.an - this.ae / 2, 20);
    }
    paramGraphics.setClip(0, 0, imageB.ak, imageB.al);
    paramGraphics.drawImage(this.jdField_b_of_type_ArrayOfJavaxMicroeditionLcduiImage[4], imageB.ak - 2, imageB.al - 3, 40);
    if ((this.J > 0) || (this.I > 0))
    {
      if (this.at % 2 == 0) {
        paramGraphics.setColor(192, 192, 192);
      } else {
        paramGraphics.setColor(255, 255, 255);
      }
      if (this.J < 100)
      {
        if (this.jdField_g_of_type_Int == 0) {
          a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[13] + " " + (this.jdField_c_of_type_Int + 1), imageB.am + 1, imageB.al / 4, imageB.ak - 10, imageB.al / 2, 0, false, 17);
        } else {
          a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[44], imageB.am + 1, imageB.al / 4, imageB.ak - 10, imageB.al / 2, 0, false, 17);
        }
      }
      else {
        a(paramGraphics, this.jdField_a_of_type_ArrayOfJavaLangString[(36 + this.jdField_c_of_type_Int)], imageB.am + 1, imageB.al / 8, imageB.ak - 10, imageB.al, 0, false, 17);
      }
    }
    if (this.H > 0)
    {
      paramGraphics.setColor(216, 216, 216);
      paramGraphics.fillArc(imageB.am - this.H * 16, imageB.an - this.H * 16, 2 * this.H * 16, 2 * this.H * 16, 0, 360);
    }
    if (this.I > 0)
    {
      paramGraphics.setColor(216, 216, 216);
      paramGraphics.fillArc(imageB.am - this.I * 16, imageB.an - this.I * 16, 2 * this.I * 16, 2 * this.I * 16, 0, 360);
    }
  }
}


/* Location:              /home/m93a/Stažené/magnetic_joe_en.jar!/a.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */