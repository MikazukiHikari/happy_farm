import java.util.*;
import java.util.ArrayList;
import java.io.*;

public class mulberry extends weather{
	     public int x=16;
	     public int y=8;
	     public int death_counter1=0;
		 public int death_counter2=0;
		 public int death_counter3=0;
		 public int death_counter4=0;
		 public int death_counter5=0;
		 public int death_counter6=0;
		 public int death_counter7=0;
		 public int death_counter8=0;
		 public int death_counter9=0;
	     
	     public int day(){
             
			 return x;
		 }
		  public int number(){
             
			 return y;
		 }
		 public void reset(int c){
			  switch(c){
		 case 1:
		death_counter1=0;
		 break;
		 case 2:
		death_counter2=0;
		 break;
		 case 3:
		 death_counter3=0;
		 break;
		 case 4:
		death_counter4=0;
		 break;
		 case 5:
		 death_counter5=0;
		 break;
		 case 6:
		 death_counter6=0;
		 break;
		 case 7:
		 death_counter7=0;
		 break;
		 case 8:
		 death_counter8=0;
		 break;
		 case 9:
		 death_counter9=0;
		 break;
		 }
	 }
		 public void check(int d){
			  switch(d){
		 case 1:
		if(humid_point1>35||humid_point1<25){
				 death_counter1++;
		}else{
			death_counter1=0;}
		 break;
		 case 2:
		if(humid_point2>35||humid_point2<25){
				 death_counter2++;
		}else{
			death_counter2=0;}
		 break;
		 case 3:
		 if(humid_point3>35||humid_point3<25){
				 death_counter3++;
		}else{
			death_counter3=0;}
		 break;
		 case 4:
		if(humid_point4>35||humid_point4<25){
				 death_counter4++;
		}else{
			death_counter4=0;}
		 break;
		 case 5:
		 if(humid_point5>35||humid_point5<25){
				 death_counter5++;
		}else{
			death_counter5=0;}
		 break;
		 case 6:
		 if(humid_point6>35||humid_point6<25){
				 death_counter6++;
		}else{
			death_counter6=0;}
		 break;
		 case 7:
		 if(humid_point7>35||humid_point7<25){
				 death_counter7++;
		}else{
			death_counter7=0;}
		 break;
		 case 8:
		 if(humid_point8>35||humid_point8<25){
				 death_counter8++;
		}else{
			death_counter8=0;}
		 break;
		 case 9:
		 if(humid_point9>35||humid_point9<25){
				 death_counter9++;
		}else{
			death_counter9=0;}
		 break;
		 }
	}
         public	int getdeath_counter(int e){
			 switch(e){
		 case 1:
		 return death_counter1;
		 
		 case 2:
		return death_counter2;
		
		 case 3:
		 return death_counter3;
		 
		 case 4:
		return death_counter4;
		 
		 case 5:
		 return death_counter5;
		
		 case 6:
		 return death_counter6;
		
		 case 7:
		 return death_counter7;
		 
		 case 8:
		 return death_counter8;
		
		 case 9:
		 return death_counter9;
		default:
		 return 0;
		 }
	}
		 public String death_check(int f){
			 switch(f){
		 case 1:
		if(death_counter1==5){
				return "0";
			}else{
			return "1";}
		 
		 case 2:
		if(death_counter2==5){
				return "0";
			}else{
			return "1";}
		 
		 case 3:
		 if(death_counter3==5){
				return "0";
			}else{
			return "1";}
		 
		 case 4:
		if(death_counter4==5){
				return "0";
			}else{
			return "1";}
		 
		 case 5:
		 if(death_counter5==5){
				return "0";
			}else{
			return "1";}
		 
		 case 6:
		 if(death_counter6==5){
				return "0";
			}else{
			return "1";}
		 
		 case 7:
		if(death_counter7==5){
				return "0";
			}else{
			return "1";}
		 
		 case 8:
		 if(death_counter8==5){
				return "0";
			}else{
			return "1";}
		 
		 case 9:
		 if(death_counter9==5){
				return "0";
			}else{
			return "1";}
		 default:
		 return "0";
		 }
			
		 }
 }




