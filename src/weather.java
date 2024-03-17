import java.util.*;
import java.util.ArrayList;
import java.io.*;
     
 public class weather{
	 public int humid_point1;
	 public int humid_point2;
	 public int humid_point3;
	 public int humid_point4;
	 public int humid_point5;
	 public int humid_point6;
	 public int humid_point7;
	 public int humid_point8;
	 public int humid_point9;
	 public int gethumid(int a){
		 switch(a){
		 case 1:
		 
		 return humid_point1;
		
		 case 2:
		
		 return humid_point2;
		 
		 case 3:
		 
		 return humid_point3;
		 
		 case 4:
		
		 return humid_point4;
		 
		 case 5:
		 
		 return humid_point5;
		 
		 case 6:
		 
		 return humid_point6;
		 
		 case 7:
		 
		 return humid_point7;
		 
		 case 8:
		 
		 return humid_point8;
		 
		 case 9:
		 
		 return humid_point9;
		 default:
		 return 0;
		 }
     }
	 public void humids(int b,int h){
		 switch(b){
		 case 1:
		 this.humid_point1=h;
		 
		 break;
		 case 2:
		 this.humid_point2=h;
		 
		 break;
		 case 3:
		 this.humid_point3=h;
		 
		 break;
		 case 4:
		 this.humid_point4=h;
		 
		 break;
		 case 5:
		 this.humid_point5=h;
		 
		 break;
		 case 6:
		 this.humid_point6=h;
		 
		 break;
		 case 7:
		 this.humid_point7=h;
		 
		 break;
		 case 8:
		 this.humid_point8=h;
		 
		 break;
		 case 9:
		 this.humid_point9=h;
		 
		 break;
		 }
     }
	 public void waterhumids(int q){
		 switch(q){
		 case 1:
		 if(humid_point1<=95){
		this.humid_point1+=5;
		 }
		 break;
		 case 2:
		  if(humid_point2<=95){
		 this.humid_point2+=5;
		  }
		 break;
		 case 3:
		  if(humid_point3<=95){
		 this.humid_point3+=5;
		  }
		 break;
		 case 4:
		  if(humid_point4<=95){
		 this.humid_point4+=5;
		  }
		 break;
		 case 5:
		  if(humid_point5<=95){
		 this.humid_point5+=5;
		  }
		 break;
		 case 6:
		  if(humid_point6<=95){
		 this.humid_point6+=5;
		  }
		 break;
		 case 7:
		  if(humid_point7<=95){
		 this.humid_point7+=5;
		  }
		 break;
		 case 8:
		  if(humid_point8<=95){
		 this.humid_point8+=5;
		  }
		 break;
		 case 9:
		  if(humid_point9<=95){
		 this.humid_point9+=5;
		  }
		 break;
		 }
     }
 }





