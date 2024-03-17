import java.util.*;
import java.util.ArrayList;
import java.io.*;
     
 public class field{
	 public String soil1="0";
	  public String plant1="0";
	  public String soil2="0";
	  public String plant2="0";
	  public String soil3="0";
	  public String plant3="0";
	  public String soil4="0";
	  public String plant4="0";
	  public String soil5="0";
	  public String plant5="0";
	  public String soil6="0";
	  public String plant6="0";
	  public String soil7="0";
	  public String plant7="0";
	  public String soil8="0";
	  public String plant8="0";
	  public String soil9="0";
	  public String plant9="0";
	  public String status1="0";
	  public String status2="0";
	  public String status3="0";
	  public String status4="0";
	  public String status5="0";
	  public String status6="0";
	  public String status7="0";
	  public String status8="0";
	  public String status9="0";
	  public int dc1=0;
	  public int dc2=0;
	  public int dc3=0;
	  public int dc4=0;
	  public int dc5=0;
	  public int dc6=0;
	  public int dc7=0;
	  public int dc8=0;
	  public int dc9=0;
	  
	 public void adds(int c,String a){
		 switch(c){
		 case 1:
		 this.soil1=a;
		 break;
		 case 2:
		 this.soil2=a;
		 break;
		 case 3:
		 this.soil3=a;
		 break;
		 case 4:
		 this.soil4=a;
		 break;
		 case 5:
		 this.soil5=a;
		 break;
		 case 6:
		 this.soil6=a;
		 break;
		 case 7:
		 this.soil7=a;
		 break;
		 case 8:
		 this.soil8=a;
		 break;
		 case 9:
		 this.soil9=a;
		 break;
		 }
	 }
	 public void addp(int d,String b){
		 switch(d){
		 case 1:
		 this.plant1=b;
		 break;
		 case 2:
		 this.plant2=b;
		 break;
		 case 3:
		 this.plant3=b;
		 break;
		 case 4:
		 this.plant4=b;
		 break;
		 case 5:
		 this.plant5=b;
		 break;
		 case 6:
		 this.plant6=b;
		 break;
		 case 7:
		 this.plant7=b;
		 break;
		 case 8:
		 this.plant8=b;
		 break;
		 case 9:
		 this.plant9=b;
		 break;
		 }
	 }
	 public void addstatus(int x,String y){
		 switch(x){
		 case 1:
		 this.status1=y;
		 break;
		 case 2:
		 this.status2=y;
		 break;
		 case 3:
		 this.status3=y;
		 break;
		 case 4:
		 this.status4=y;
		 break;
		 case 5:
		 this.status5=y;
		 break;
		 case 6:
		 this.status6=y;
		 break;
		 case 7:
		 this.status7=y;
		 break;
		 case 8:
		 this.status8=y;
		 break;
		 case 9:
		 this.status9=y;
		 break;
		 }
	 }
	 public void adc(int day){
		 switch(day){
		 case 1:
		 dc1++;
		 break;
		 case 2:
		 dc2++;
		 break;
		 case 3:
		 dc3++;
		 break;
		 case 4:
		 dc4++;
		 break;
		 case 5:
		 dc5++;
		 break;
		 case 6:
		 dc6++;
		 break;
		 case 7:
		 dc7++;
		 break;
		 case 8:
		 dc8++;
		 break;
		 case 9:
		 dc9++;
		 break;
		 }
	 }
	 public String getplant(int e){
		 switch(e){
		 case 1:
		 return this.plant1;
		 
		 case 2:
		 return this.plant2;
		
		 case 3:
		 return this.plant3;
		
		 case 4:
		 return this.plant4;
		 
		 case 5:
		 return this.plant5;
		 
		 case 6:
		 return this.plant6;
		 
		 case 7:
		 return this.plant7;
		 
		 case 8:
		 return this.plant8;
		
		 case 9:
		 return this.plant9;
		 default:
		 return "0";
		 } 
	}
	public String getsoil(int f){
		switch(f){
		 case 1:
		 return this.soil1;
		 
		 case 2:
		 return this.soil2;
		 
		 case 3:
		 return this.soil3;
		
		 case 4:
		 return this.soil4;
		 
		 case 5:
		 return this.soil5;
		 
		 case 6:
		 return this.soil6;
		 
		 case 7:
		 return this.soil7;
		 
		 case 8:
		 return this.soil8;
		
		 case 9:
		 return this.soil9;
		 default:
		 return "0";
		 } 
	}
	public String getstatus(int z){
		 switch(z){
		 case 1:
		 return this.status1;
		 
		 case 2:
		 return this.status2;
		 
		 case 3:
		 return this.status3;
		
		 case 4:
		 return this.status4;
		 
		 case 5:
		 return this.status5;
		
		 case 6:
		 return this.status6;
		 
		 case 7:
		 return this.status7;
		 
		 case 8:
		 return this.status8;
		 
		 case 9:
		 return this.status9;
		 default:
		 return "0";
		 } 
	}
	public int getdc(int da){
		 switch(da){
		 case 1:
		 return dc1;
		 
		 case 2:
		 return dc2;
		 
		 case 3:
		 return dc3;
		
		 case 4:
		 return dc4;
		 
		 case 5:
		 return dc5;
		 
		 case 6:
		 return dc6;
		 
		 case 7:
		 return dc7;
		
		 case 8:
		 return dc8;
		 
		 case 9:
		 return dc9;
		default:
		 return 0;
		 } 
	}
	 public String emptys(int g){
		 switch(g){
		 case 1:
		 if(soil1.equals("0")){
           return "0";
			}else{
				return "1";
			}
		 
		 case 2:
		 if(soil2.equals("0")){
           return "0";
			}else{
				return "1";
			}
		
		 case 3:
		 if(soil3.equals("0")){
           return "0";
			}else{
				return "1";
			}
		 
		 case 4:
		 if(soil4.equals("0")){
           return "0";
			}else{
				return "1";
			}
		 
		 case 5:
		 if(soil5.equals("0")){
           return "0";
			}else{
				return "1";
			}
		
		 case 6:
		 if(soil6.equals("0")){
           return "0";
			}else{
				return "1";
			}
		
		 case 7:
		 if(soil7.equals("0")){
           return "0";
			}else{
				return "1";
			}
		
		 case 8:
		 if(soil8.equals("0")){
           return "0";
			}else{
				return "1";
			}
		 
		 case 9:
		 if(soil9.equals("0")){
           return "0";
			}else{
				return "1";
			}
		default:
		 return "0";
		 } 
	}
     public String emptyp(int i){
			switch(i){
		 case 1:
		 if(plant1.equals("0")){
           return "0";
			}else{
				return "1";
			}
		 
		 case 2:
		 if(plant2.equals("0")){
           return "0";
			}else{
				return "1";
			}
		
		 case 3:
		 if(plant3.equals("0")){
           return "0";
			}else{
				return "1";
			}
		 
		 case 4:
		 if(plant4.equals("0")){
           return "0";
			}else{
				return "1";
			}
		
		 case 5:
		 if(plant5.equals("0")){
           return "0";
			}else{
				return "1";
			}
		
		 case 6:
		 if(plant6.equals("0")){
           return "0";
			}else{
				return "1";
			}
		
		 case 7:
		 if(plant7.equals("0")){
           return "0";
			}else{
				return "1";
			}
		 
		 case 8:
		 if(plant8.equals("0")){
           return "0";
			}else{
				return "1";
			}
		 
		 case 9:
		 if(plant9.equals("0")){
           return "0";
			}else{
				return "1";
			}
		 default:
		 return "0";
		 }
		}			
		public void clears(int j){
			switch(j){
		 case 1:
		 this.soil1="-1";
		 break;
		 case 2:
		 this.soil2="-1";
		 break;
		 case 3:
		 this.soil3="-1";
		 break;
		 case 4:
		 this.soil4="-1";
		 break;
		 case 5:
		 this.soil5="-1";
		 break;
		 case 6:
		 this.soil6="-1";
		 break;
		 case 7:
		 this.soil7="-1";
		 break;
		 case 8:
		 this.soil8="-1";
		 break;
		 case 9:
		 this.soil9="-1";
		 break;
		 }
	}
	 public void clearp(int k){
		   switch(k){
		 case 1:
		 this.plant1="0";
		 break;
		 case 2:
		 this.plant2="0";
		 break;
		 case 3:
		 this.plant3="0";
		 break;
		 case 4:
		 this.plant4="0";
		 break;
		 case 5:
		 this.plant5="0";
		 break;
		 case 6:
		 this.plant6="0";
		 break;
		 case 7:
		 this.plant7="0";
		 break;
		 case 8:
		 this.plant8="0";
		 break;
		 case 9:
		 this.plant9="0";
		 break;
		 }
	   }
	   public void clearstatus(int w){
			switch(w){
		 case 1:
		 this.status1="0";
		 break;
		 case 2:
		 this.status2="0";
		 break;
		 case 3:
		 this.status3="0";
		 break;
		 case 4:
		 this.status4="0";
		 break;
		 case 5:
		 this.status5="0";
		 break;
		 case 6:
		 this.status6="0";
		 break;
		 case 7:
		 this.status7="0";
		 break;
		 case 8:
		 this.status8="0";
		 break;
		 case 9:
		 this.status9="0";
		 break;
		 }
	}
	public void cleardc(int dd){
			switch(dd){
		 case 1:
		 dc1=0;
		 break;
		 case 2:
		 dc2=0;
		 break;
		 case 3:
		 dc3=0;
		 break;
		 case 4:
		 dc4=0;
		 break;
		 case 5:
		 dc5=0;
		 break;
		 case 6:
		 dc6=0;
		 break;
		 case 7:
		 dc7=0;
		 break;
		 case 8:
		 dc8=0;
		 break;
		 case 9:
		 dc9=0;
		 break;
		 }
	}
	public String allplant(){
		if(this.plant1=="0"&&this.plant2=="0"&&this.plant3=="0"&&this.plant4=="0"&&this.plant5=="0"
		&&this.plant6=="0"&&this.plant7=="0"&&this.plant8=="0"&&this.plant9=="0"){
			return "000";
			}else{
				return "1";
			}
	}
 }