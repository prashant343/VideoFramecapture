/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prashantkaushik
 */
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;

public class videocap
{
   public static void main( String[] args )
   {
      System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
     // System.out.println(System.getProperty("java.library.path"));
     // Mat mat = Mat.eye( 3, 3, CvType.CV_8UC1 );
     // System.out.println( "mat = " + mat.dump() );
   VideoCapture camera =  new VideoCapture(0);
   
   if(!camera.isOpened()){
       System.out.println("error");
   }
   else{
       Mat frame = new Mat();
       while(true){
           if(camera.read(frame)){
               System.out.println("Frame captured");
               System.out.println(frame.width() + "Height" + frame.height());
               
               Highgui.imwrite("Camera.jpg",frame);
               System.out.println("OK");
               break;
           }
       }
   }
   
   //camera.release();
   
   
   
   }
}