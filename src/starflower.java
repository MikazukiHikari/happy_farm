import java.util.*;
import java.util.ArrayList;
import java.io.*;

public class starflower extends weather{
	int s=0;
	 public int day_counter1=8+s;
	 public int day_counter2=8+s;
		 public int day_counter3=8+s;
		 public int day_counter4=8+s;
		 public int day_counter5=8+s;
		 public int day_counter6=8+s;
		 public int day_counter7=8+s;
		 public int day_counter8=8+s;
		 public int day_counter9=8+s;
	public void call(String t){
		switch(t){
			case "botanist":
			s=1;
			day_counter1=8+s;
			day_counter2=8+s;
			day_counter3=8+s;
			day_counter4=8+s;
			day_counter5=8+s;
			day_counter6=8+s;
			day_counter7=8+s;
			day_counter8=8+s;
			day_counter9=8+s;
			break;
			default:
			
		}
	}
	     
		 
	   
		  public void reset(int c){
			  switch(c){
		 case 1:
		day_counter1=8+s;
		 break;
		 case 2:
		day_counter2=8+s;
		 break;
		 case 3:
		 day_counter3=8+s;
		 break;
		 case 4:
		day_counter4=8+s;
		 break;
		 case 5:
		 day_counter5=8+s;
		 break;
		 case 6:
		 day_counter6=8+s;
		 break;
		 case 7:
		 day_counter7=8+s;
		 break;
		 case 8:
		 day_counter8=8+s;
		 break;
		 case 9:
		 day_counter9=8+s;
		 break;
		 }
	 }
		 public void check(int d){
			  switch(d){
		 case 1:
		if(humid_point1>40||humid_point1<30){
				 day_counter1--;}
		 break;
		 case 2:
		if(humid_point2>40||humid_point2<30){
				 day_counter2--;}
		 break;
		 case 3:
		 if(humid_point3>40||humid_point3<30){
				 day_counter3--;}
		 break;
		 case 4:
		if(humid_point4>40||humid_point4<30){
				 day_counter4--;}
		 break;
		 case 5:
		 if(humid_point5>40||humid_point5<30){
				 day_counter5--;}
		 break;
		 case 6:
		 if(humid_point6>40||humid_point6<30){
				 day_counter6--;}
		 break;
		 case 7:
		 if(humid_point7>40||humid_point7<30){
				 day_counter7--;}
		 break;
		 case 8:
		 if(humid_point8>40||humid_point8<30){
				 day_counter8--;}
		 break;
		 case 9:
		 if(humid_point9>40||humid_point9<30){
				 day_counter9--;}
		 break;
		 }
	}
         public	int getday(int e){
			 switch(e){
		 case 1:
		 return day_counter1;
		 
		 case 2:
		return day_counter2;
		 
		 case 3:
		 return day_counter3;
		
		 case 4:
		return day_counter4;
		 
		 case 5:
		 return day_counter5;
		 
		 case 6:
		 return day_counter6;
		 
		 case 7:
		 return day_counter7;
		
		 case 8:
		 return day_counter8;
		 
		 case 9:
		 return day_counter9;
		 default:
		 return 0;
		 }
	}
}