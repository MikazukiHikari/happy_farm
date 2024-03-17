import java.util.*;
import java.util.ArrayList;
import java.io.*;

 public class Normal extends weather{
	public void humidcheck(int c,int h){
		switch(c){
		 case 1:
		  if(h>=5){
		 h-=5;}else{
		 h=0;}
		  this.humid_point1=h;
		 break;
		 case 2:
		 if(h>=5){
		h-=5;}else{
		 h=0;}
		 this.humid_point2=h;
		 break;
		 case 3:
		 if(h>=5){
		 h-=5;}else{
		 h=0;}
		 this.humid_point3=h;
		 break;
		 case 4:
		 if(h>=5){
		h-=5;}else{
		 h=0;}
		 this.humid_point4=h;
		 break;
		 case 5:
		 if(h>=5){
		 h-=5;}else{
		 h=0;}
		 this.humid_point5=h;
		 break;
		 case 6:
		 if(h>=5){
		 h-=5;}else{
		 h=0;}
		 this.humid_point6=h;
		 break;
		 case 7:
		 if(h>=5){
		 h-=5;}else{
		 h=0;}
		 this.humid_point7=h;
		 break;
		 case 8:
		 if(h>=5){
		 h-=5;}else{
		 h=0;}
		 this.humid_point8=h;
		 break;
		 case 9:
		 if(h>=5){
		 h-=5;}else{
		 h=0;}
		 this.humid_point9=h;
		 break;
		 }
	}
	
 }