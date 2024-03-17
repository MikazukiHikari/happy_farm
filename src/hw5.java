import java.util.*;
import java.util.ArrayList;
import java.io.*;
    public class hw5{
	public static void main(String args[]){
       Scanner input=new Scanner(System.in);
	   try{
	   Scanner inputstream=new Scanner(new FileInputStream("environment.txt")); 
	    
//==============================================//
       int x=1;
	   int z=1;
	   int cha=0;
	   int money=2000;
	   int energy=100;
	   int[] day=new int[9];
	   int[] soilday=new int[9];
	   int[] soilnumber=new int[9];
	   int[] plantday=new int[9];
	   int[] plantnumber=new int[9];
	   int[] number=new int[9];
	   int[] starflowery=new int[9];
	   int[] sungrassy=new int[9];
	   int[] penalty=new int[9];
	   int wateringcan=0;
	   int hoe=0;
	   int sickle=0;
	   int heater=0;
	   int watermelon_seed=0;
	   int mulberry_seed=0;
	   int sungrass_seed=0;
	   int starflower_seed=0;
	   int chicken=0;
	   int chicken_counter=0;
	   int watermelon=0;
	   int mulberry=0;
	   int egg=0;
	   int egg_counter=0;
	   int sand=0;
	   int clay=0;
	   int loam=0;
	   int magicdust=0;
	   int wateringcan_durability=100;
	   int hoe_durability=100;
	   int sickle_durability=100;
	   int heater_durability=100;
	   int soil_humid=20;
	   field fs=new field();
	   weather w=new weather();
	   Sunny sun=new Sunny();
	   Normal nor=new Normal();
	   Storm sto=new Storm();
	   Rainy rai=new Rainy();
	   Blizzard bli=new Blizzard();
	   Volcano vol=new Volcano();
	   watermelon wat=new watermelon();
	   mulberry mul=new mulberry();
	   sungrass sungrass=new sungrass();
	   starflower starflower=new starflower();
	   dice dh=new dice();
	   String character="0";
	   System.out.println("歡迎進入遊戲");
	   System.out.println("請輸入玩家名稱:");
	   String name=input.nextLine();
	   while(cha==0){
		   System.out.println("請選擇角色:");
		   character=input.nextLine();
		   switch(character){
			   case "botanist":
		   System.out.println("你已選擇植物學家");
		       cha=1;
			   energy=90;
			   sungrass.call("botanist");
			   starflower.call("botanist");
			   break;
			   case "merchant":
		   System.out.println("你已選擇商人");
		       cha=1;
			   sungrass.call("0");
			   starflower.call("0");
			   break;
			   case "hercules":
		   System.out.println("你已選擇力士");
		       cha=1;
			    sungrass.call("0");
			   starflower.call("0");
			   break;
			   default:
			System.out.println("此角色不存在,請重新選擇!");   
		   }
	   }//while
	   System.out.println("進入遊戲");
    for(int i=1;i<=x;i++){
		int y=1;
	   String today="0";
	   if(i<31){
	   today = inputstream.nextLine();
	   }else{
		   int d100=dh.roll();
		   if(i>=31&&i<=60){
			   if(d100<=30){
				   today="Normal";
			   }
			   if(d100>30&&d100<=50){
				   today="Rainy";
			   }
			   if(d100>50&&d100<=70){
				   today="Sunny";
			   }
			   if(d100>70&&d100<=99){
				   today="Storm";
			   }
			   if(d100>99){
				   today="Blizzard";
			   }
		   }else{
			   if(i>=60&&i<=100){
			  if(d100<=20){
				   today="Normal";
			   }
			   if(d100>20&&d100<=40){
				   today="Rainy";
			   }
			   if(d100>40&&d100<=60){
				   today="Sunny";
			   }
			   if(d100>60&&d100<=80){
				   today="Storm";
			   }
			   if(d100>80&&d100<=99){
				   today="Blizzard";
			   }
			   if(d100>99){
				   today="Volcano";
			   }
			   }else{
				 if(d100<=15){
				   today="Normal";
			   }
			   if(d100>15&&d100<=35){
				   today="Rainy";
			   }
			   if(d100>35&&d100<=55){
				   today="Sunny";
			   }
			   if(d100>55&&d100<=75){
				   today="Storm";
			   }
			   if(d100>75&&d100<=90){
				   today="Blizzard";
			   }
			   if(d100>90){
				   today="Volcano";
			   }  
			}//100days
		   }//60days
	   }//30days
	   for(int ex=1;ex<=9;ex++){
		  
	   switch(fs.emptyp(ex)){
		case "0":	
		break;
		default:
		if(!fs.getplant(ex).equals("0")&&!fs.getstatus(ex).equals("complete")){
	   fs.adc(ex); 
	   }	
		switch(fs.getplant(ex)){
		case"watermelon":
		 if(fs.getdc(ex)>=day[ex-1]){
				 fs.addstatus(ex,"complete");
				 fs.cleardc(ex);
				 System.out.println("News!!!您的植物"+ex+"今早已結果");
			   }
			   break;
			   case"mulberry":
		 if(fs.getdc(ex)>=day[ex-1]){
				 fs.addstatus(ex,"complete");
				 fs.cleardc(ex);
				 System.out.println("News!!!您的植物"+ex+"今早已結果");
			   }
			   break;
			   case "sungrass":
			   if(fs.getdc(ex)>=sungrass.getday(ex)){
				fs.clearp(ex);
			   fs.clears(ex);
			   fs.cleardc(ex);
			   fs.clearstatus(ex);
			   wat.reset(ex);
			   mul.reset(ex);
			   sungrass.reset(ex);
			   starflower.reset(ex);
			   day[ex-1]=0;
	           soilday[ex-1]=0;
	           soilnumber[ex-1]=0;
	           plantday[ex-1]=0;
	           plantnumber[ex-1]=0;
	           number[ex-1]=0;
			   System.out.println("News!!!您的植物"+ex+"今早已自然死亡!");   
			}
			   break;
			    case "starflower":
			   if(fs.getdc(ex)>=starflower.getday(ex)){
				fs.clearp(ex);
			   fs.clears(ex);
			   fs.cleardc(ex);
			   fs.clearstatus(ex);
			   wat.reset(ex);
			   mul.reset(ex);
			   sungrass.reset(ex);
			   starflower.reset(ex);
			   day[ex-1]=0;
	           soilday[ex-1]=0;
	           soilnumber[ex-1]=0;
	           plantday[ex-1]=0;
	           plantnumber[ex-1]=0;
	           number[ex-1]=0;
			   System.out.println("News!!!您的植物"+ex+"今早已自然死亡!");   
			}
			   break;
		}
	   }
	   }
	   for(int ch=0;ch<chicken;ch++){
	   int d100=dh.roll();
	     switch(today){
			 case "Blizzard":
			 if(d100<=30){
				   egg++;
				   egg_counter++;
			   }
			   break;
			 case "Volcano":
			 if(d100<=25){
				   egg++;
				   egg_counter++;
			   }
			   break;  
			 default:
			   if(d100<=40){
				   egg++;
				   egg_counter++;
			   }
		 }
	   }
	   System.out.println("您好,"+name+"~今天是第"+i+"天");
	   System.out.println("今天的天氣是"+today);
	   System.out.println("您現在的體力是"+energy+"又是個活力充沛的新的一天");
	   System.out.println("您現在的金錢是"+money);
	   if(i==31){
		 System.out.println("恭喜您已進入困難模式");
		 System.out.println("News!!!已解鎖加溫器及雞舍(已能購買雞)");
         System.out.println("Warning!!!現在天氣有可能出現暴風雪");		 
	   }
	   if(egg_counter>0){
		  System.out.println("News!!!您的雞今早總共生了"+egg_counter+"顆蛋"); 
		  egg_counter=0;
	   }
	   if(i==61){
		 System.out.println("恭喜您已進入末日模式");
		 System.out.println("News!!!已解鎖天氣預報");
         System.out.println("Warning!!!現在天氣有可能出現火山爆發");		 
	   }
	   if(i==101){
		 System.out.println("恭喜您已進入煉獄模式");
		 System.out.println("News!!!已解鎖投降");
       }
	   for(int a=1;a<=9;a++){
	   if(!fs.getsoil(a).equals("0")){
    switch(today){
		case "Normal":
		nor.humidcheck(a,w.gethumid(a));
		w.humids(a,nor.gethumid(a));
		wat.humids(a,w.gethumid(a));
		mul.humids(a,w.gethumid(a));
		sungrass.humids(a,w.gethumid(a));
		starflower.humids(a,w.gethumid(a));
		break;
		case "Sunny":
		sun.humidcheck(a,w.gethumid(a));
		w.humids(a,sun.gethumid(a));
		wat.humids(a,w.gethumid(a));
		mul.humids(a,w.gethumid(a));
		sungrass.humids(a,w.gethumid(a));
		starflower.humids(a,w.gethumid(a));
		break;
		case "Rainy":
		rai.humidcheck(a,w.gethumid(a));
		w.humids(a,rai.gethumid(a));
		wat.humids(a,w.gethumid(a));
		mul.humids(a,w.gethumid(a));
		sungrass.humids(a,w.gethumid(a));
		starflower.humids(a,w.gethumid(a));
		break;
		case "Storm":
		sto.humidcheck(a,w.gethumid(a));
		w.humids(a,sto.gethumid(a));
		wat.humids(a,w.gethumid(a));
		mul.humids(a,w.gethumid(a));
		sungrass.humids(a,w.gethumid(a));
		starflower.humids(a,w.gethumid(a));
		break;
		case "Blizzard":
		bli.humidcheck(a,w.gethumid(a));
		w.humids(a,bli.gethumid(a));
		wat.humids(a,w.gethumid(a));
		mul.humids(a,w.gethumid(a));
		sungrass.humids(a,w.gethumid(a));
		starflower.humids(a,w.gethumid(a));
		if(!fs.getstatus(a).equals("complete")){
			fs.addstatus(a,bli.frozencheck());
		}
		break;
		case "Volcano":
		vol.humidcheck(a,w.gethumid(a));
		w.humids(a,vol.gethumid(a));
		wat.humids(a,w.gethumid(a));
		mul.humids(a,w.gethumid(a));
		sungrass.humids(a,w.gethumid(a));
		starflower.humids(a,w.gethumid(a));
		fs.addstatus(a,vol.burningcheck());
		break;
	}
	   
	if(fs.getstatus(a).equals("burning")){
		       fs.clearp(a);
			   fs.clears(a);
			   fs.cleardc(a);
			   fs.clearstatus(a);
			   wat.reset(a);
			   mul.reset(a);
			   sungrass.reset(a);
			   starflower.reset(a);
			   day[a-1]=0;
	           soilday[a-1]=0;
	           soilnumber[a-1]=0;
	           plantday[a-1]=0;
	           plantnumber[a-1]=0;
	           number[a-1]=0;
			   sungrassy[a-1]=0;
			   starflowery[a-1]=0;
			   penalty[a-1]=0;
			  System.out.println("News!!!您的植物"+a+"被岩漿燒掉了");
	}
	   }
	   }//for a
	for(int j=0;j<y;j++){
			//刷新//
			
	   System.out.println("請輸入指令:");	
	   String s=input.nextLine();
	   String[] d=s.split(" ");
				
	   switch(d[0]){
		 case "water":
        String[] water=s.split(" ");
        int e=0;
        int	t=0;	
        if(water.length!=2){ 
	   e++;
		}else{
	   switch(water[0]){
		   case "water":
		   e=0;
		   break;
		   default:
		   e++;
	   }
	   switch(water[1]){
		 case "1":
		 if(fs.emptyp(1).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
               if(energy>=10){
			      t++;
			   }else{
				System.out.println("體力不足");}
				if(wateringcan==1){
					t++;
			   }else{
			   System.out.println("未持有澆水器");}
			   if(t==2){
			   w.waterhumids(1);
		       wat.waterhumids(1);
		       mul.waterhumids(1);
		       sungrass.waterhumids(1);
		       starflower.waterhumids(1);
			   energy-=10;
			   wateringcan_durability-=5;
			   System.out.println("您已成功澆水");}
			 }
		   break;
		 case "2":
		 if(fs.emptyp(2).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
               if(energy>=10){
			      t++;
			   }else{
				System.out.println("體力不足");}
				if(wateringcan==1){
					t++;
			   }else{
			   System.out.println("未持有澆水器");}
			   if(t==2){
			   w.waterhumids(2);
		       wat.waterhumids(2);
		       mul.waterhumids(2);
		       sungrass.waterhumids(2);
		       starflower.waterhumids(2);
			   energy-=10;
			   wateringcan_durability-=5;
			   System.out.println("您已成功澆水");}
			 }
		   break;
		   case "3":
		 if(fs.emptyp(3).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
               if(energy>=10){
			      t++;
			   }else{
				System.out.println("體力不足");}
				if(wateringcan==1){
					t++;
			   }else{
			   System.out.println("未持有澆水器");}
			   if(t==2){
			   w.waterhumids(3);
		       wat.waterhumids(3);
		       mul.waterhumids(3);
		       sungrass.waterhumids(3);
		       starflower.waterhumids(3);
			   energy-=10;
			   wateringcan_durability-=5;
			   System.out.println("您已成功澆水");}
			 }
		   break;
		   case "4":
		 if(fs.emptyp(4).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
               if(energy>=10){
			      t++;
			   }else{
				System.out.println("體力不足");}
				if(wateringcan==1){
					t++;
			   }else{
			   System.out.println("未持有澆水器");}
			   if(t==2){
			   w.waterhumids(4);
		       wat.waterhumids(4);
		       mul.waterhumids(4);
		       sungrass.waterhumids(4);
		       starflower.waterhumids(4);
			   energy-=10;
			   wateringcan_durability-=5;
			   System.out.println("您已成功澆水");}
			 }
		   break;
		   case "5":
		 if(fs.emptyp(5).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
               if(energy>=10){
			      t++;
			   }else{
				System.out.println("體力不足");}
				if(wateringcan==1){
					t++;
			   }else{
			   System.out.println("未持有澆水器");}
			   if(t==2){
			   w.waterhumids(5);
		       wat.waterhumids(5);
		       mul.waterhumids(5);
		       sungrass.waterhumids(5);
		       starflower.waterhumids(5);
			   energy-=10;
			   wateringcan_durability-=5;
			   System.out.println("您已成功澆水");}
			 }
		   break;
		   case "6":
		 if(fs.emptyp(6).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
               if(energy>=10){
			      t++;
			   }else{
				System.out.println("體力不足");}
				if(wateringcan==1){
					t++;
			   }else{
			   System.out.println("未持有澆水器");}
			   if(t==2){
			   w.waterhumids(6);
		       wat.waterhumids(6);
		       mul.waterhumids(6);
		       sungrass.waterhumids(6);
		       starflower.waterhumids(6);
			   energy-=10;
			   wateringcan_durability-=5;
			   System.out.println("您已成功澆水");}
			 }
		   break;
		   case "7":
		 if(fs.emptyp(7).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
               if(energy>=10){
			      t++;
			   }else{
				System.out.println("體力不足");}
				if(wateringcan==1){
					t++;
			   }else{
			   System.out.println("未持有澆水器");}
			   if(t==2){
			   w.waterhumids(7);
		       wat.waterhumids(7);
		       mul.waterhumids(7);
		       sungrass.waterhumids(7);
		       starflower.waterhumids(7);
			   energy-=10;
			   wateringcan_durability-=5;
			   System.out.println("您已成功澆水");}
			 }
		   break;
		   case "8":
		 if(fs.emptyp(8).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
               if(energy>=10){
			      t++;
			   }else{
				System.out.println("體力不足");}
				if(wateringcan==1){
					t++;
			   }else{
			   System.out.println("未持有澆水器");}
			   if(t==2){
			   w.waterhumids(8);
		       wat.waterhumids(8);
		       mul.waterhumids(8);
		       sungrass.waterhumids(8);
		       starflower.waterhumids(8);
			   energy-=10;
			   wateringcan_durability-=5;
			   System.out.println("您已成功澆水");}
			 }
		   break;
		   case "9":
		 if(fs.emptyp(9).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
               if(energy>=10){
			      t++;
			   }else{
				System.out.println("體力不足");}
				if(wateringcan==1){
					t++;
			   }else{
			   System.out.println("未持有澆水器");}
			   if(t==2){
			   w.waterhumids(9);
		       wat.waterhumids(9);
		       mul.waterhumids(9);
		       sungrass.waterhumids(9);
		       starflower.waterhumids(9);
			   energy-=10;
			   wateringcan_durability-=5;
			   System.out.println("您已成功澆水");}
			 }
		   break;
		   default:
		   e++;
	  }
		}//water length
		if(e!=0){
		   System.out.println("輸入錯誤");
		   y++;
	   }else{   
		 y++;
		}
		if(wateringcan_durability==0){
			wateringcan=0;
			wateringcan_durability=100;
		}
		System.out.println("現在您目前持有:");
	   System.out.println("金錢"+money+"元");
	   System.out.println("體力:"+energy);
	   break;//water
	   
	   case "fill":
	   String[] fill=s.split(" ");
        int error=0;
        int tr=0;		
        if(fill.length!=5){ 
	   error++;
		}else{
	   switch(fill[0]){
		   case "fill":
		   error=0;
		   break;
		   default:
		   error++;
	   }
	   switch(fill[1]){
		 case "and":
           break;
		default:
		error++;
	   }
	   switch(fill[2]){
		 case "loosen":
           break;
		default:
		error++;
	   }
	   if(error==0){
	   if(hoe==1){
		   tr++;
	   }else{
	   System.out.println("未持有鋤頭");}
	   if(character.equals("hercules")){
		   tr++;
	   }else{
	   if(character.equals("merchant")){
					if(energy>=10){
		       tr++;
		    }else{
				System.out.println("體力不足");}
				}else{
		    if(energy>=5){
		       tr++;
		    }else{
				System.out.println("體力不足");}
				}
	   }
	   switch(fill[3]){
		   case "sand":
		  if(sand>=1){
		  tr++;
		   }else{
		   System.out.println("未持有砂土");}
		   break;
		   case "clay":
		   if(clay>=1){
			  tr++;
          }else{
		   System.out.println("未持有黏土");}
           break;
		   case "loam":
		   if(loam>=1){
			   tr++;
			  }else{
		   System.out.println("未持有壤土");}
		   break;
		   case "magicdust":
		   if(magicdust>=1){
			   tr++;
			  }else{
		   System.out.println("未持有魔法土");}
		   break;
		   default:
		   error++;
	   }
	    if(tr==3){
		  switch(fill[4]){ 
		   case "1":
		   if(fs.getplant(1).equals("0")){
		   w.humids(1,20);
		   switch(today){
		case "Normal":
		nor.humidcheck(1,w.gethumid(1));
		w.humids(1,nor.gethumid(1));
		wat.humids(1,w.gethumid(1));
		mul.humids(1,w.gethumid(1));
		sungrass.humids(1,w.gethumid(1));
		starflower.humids(1,w.gethumid(1));
		break;
		case "Sunny":
		sun.humidcheck(1,w.gethumid(1));
		w.humids(1,sun.gethumid(1));
		wat.humids(1,w.gethumid(1));
		mul.humids(1,w.gethumid(1));
		sungrass.humids(1,w.gethumid(1));
		starflower.humids(1,w.gethumid(1));
		break;
		case "Rainy":
		rai.humidcheck(1,w.gethumid(1));
		w.humids(1,rai.gethumid(1));
		wat.humids(1,w.gethumid(1));
		mul.humids(1,w.gethumid(1));
		sungrass.humids(1,w.gethumid(1));
		starflower.humids(1,w.gethumid(1));
		break;
		case "Storm":
		sto.humidcheck(1,w.gethumid(1));
		w.humids(1,sto.gethumid(1));
		wat.humids(1,w.gethumid(1));
		mul.humids(1,w.gethumid(1));
		sungrass.humids(1,w.gethumid(1));
		starflower.humids(1,w.gethumid(1));
		break;
		case "Blizzard":
		bli.humidcheck(1,w.gethumid(1));
		w.humids(1,bli.gethumid(1));
		wat.humids(1,w.gethumid(1));
		mul.humids(1,w.gethumid(1));
		sungrass.humids(1,w.gethumid(1));
		starflower.humids(1,w.gethumid(1));
		if(!fs.getstatus(1).equals("complete")){
			fs.addstatus(1,bli.frozencheck());
		}
		break;
		case "Volcano":
		vol.humidcheck(1,w.gethumid(1));
		w.humids(1,vol.gethumid(1));
		wat.humids(1,w.gethumid(1));
		mul.humids(1,w.gethumid(1));
		sungrass.humids(1,w.gethumid(1));
		starflower.humids(1,w.gethumid(1));
		break;
	}
		  hoe_durability-=10;
		  energy-=5;
		  if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		  switch(fill[3]){
			  case "sand":
			  fs.adds(1,"sand");
			  sand--;
			  break;
			  case "clay":
			  fs.adds(1,"clay");
			  soilday[0]=-3;
			  soilnumber[0]=-1;
			  clay--;
			  break;
			  case "loam":
			  fs.adds(1,"loam");
			  soilday[0]=+3;
			  soilnumber[0]=+1;
			  loam--;
			  break;
			  case "magicdust":
			  fs.adds(1,"magicdust");
			  magicdust--;
			  break;
		  }
		   System.out.println("您已成功加入新的土壤並使其鬆軟");
		   }else{
		   System.out.println("此地已有種植作物,需要無種植作物才能執行");} 
		   break;//case1
		    case "2":
			if(fs.getplant(2).equals("0")){
		   w.humids(2,20);
		   switch(today){
		case "Normal":
		nor.humidcheck(2,w.gethumid(2));
		w.humids(2,nor.gethumid(2));
		wat.humids(2,w.gethumid(2));
		mul.humids(2,w.gethumid(2));
		sungrass.humids(2,w.gethumid(2));
		starflower.humids(2,w.gethumid(2));
		break;
		case "Sunny":
		sun.humidcheck(2,w.gethumid(2));
		w.humids(2,sun.gethumid(2));
		wat.humids(2,w.gethumid(2));
		mul.humids(2,w.gethumid(2));
		sungrass.humids(2,w.gethumid(2));
		starflower.humids(2,w.gethumid(2));
		break;
		case "Rainy":
		rai.humidcheck(2,w.gethumid(2));
		w.humids(2,rai.gethumid(2));
		wat.humids(2,w.gethumid(2));
		mul.humids(2,w.gethumid(2));
		sungrass.humids(2,w.gethumid(2));
		starflower.humids(2,w.gethumid(2));
		break;
		case "Storm":
		sto.humidcheck(2,w.gethumid(2));
		w.humids(2,sto.gethumid(2));
		wat.humids(2,w.gethumid(2));
		mul.humids(2,w.gethumid(2));
		sungrass.humids(2,w.gethumid(2));
		starflower.humids(2,w.gethumid(2));
		break;
		case "Blizzard":
		bli.humidcheck(2,w.gethumid(2));
		w.humids(2,bli.gethumid(2));
		wat.humids(2,w.gethumid(2));
		mul.humids(2,w.gethumid(2));
		sungrass.humids(2,w.gethumid(2));
		starflower.humids(2,w.gethumid(2));
		if(!fs.getstatus(2).equals("complete")){
			fs.addstatus(2,bli.frozencheck());
		}
		break;
		case "Volcano":
		vol.humidcheck(2,w.gethumid(2));
		w.humids(2,vol.gethumid(2));
		wat.humids(2,w.gethumid(2));
		mul.humids(2,w.gethumid(2));
		sungrass.humids(2,w.gethumid(2));
		starflower.humids(2,w.gethumid(2));
		break;
	}
		  hoe_durability-=10;
		  energy-=5;
		  if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		  switch(fill[3]){
			  case "sand":
			  fs.adds(2,"sand");
			  sand--;
			  break;
			  case "clay":
			  fs.adds(2,"clay");
			  soilday[1]=-3;
			  soilnumber[1]=-1;
			  clay--;
			  break;
			  case "loam":
			  fs.adds(2,"loam");
			  soilday[1]=+3;
			  soilnumber[1]=+1;
			  loam--;
			  break;
			  case "magicdust":
			  fs.adds(2,"magicdust");
			  magicdust--;
			  break;
		  }
		   System.out.println("您已成功加入新的土壤並使其鬆軟");
		   }else{
		   System.out.println("此地已有種植作物,需要無種植作物才能執行");} 
		   break;//case2
		   case "3":
		   if(fs.getplant(3).equals("0")){
		   w.humids(3,20);
		   switch(today){
		case "Normal":
		nor.humidcheck(3,w.gethumid(3));
		w.humids(3,nor.gethumid(3));
		wat.humids(3,w.gethumid(3));
		mul.humids(3,w.gethumid(3));
		sungrass.humids(3,w.gethumid(3));
		starflower.humids(3,w.gethumid(3));
		break;
		case "Sunny":
		sun.humidcheck(3,w.gethumid(3));
		w.humids(3,sun.gethumid(3));
		wat.humids(3,w.gethumid(3));
		mul.humids(3,w.gethumid(3));
		sungrass.humids(3,w.gethumid(3));
		starflower.humids(3,w.gethumid(3));
		break;
		case "Rainy":
		rai.humidcheck(3,w.gethumid(3));
		w.humids(3,rai.gethumid(3));
		wat.humids(3,w.gethumid(3));
		mul.humids(3,w.gethumid(3));
		sungrass.humids(3,w.gethumid(3));
		starflower.humids(3,w.gethumid(3));
		break;
		case "Storm":
		sto.humidcheck(3,w.gethumid(3));
		w.humids(3,sto.gethumid(3));
		wat.humids(3,w.gethumid(3));
		mul.humids(3,w.gethumid(3));
		sungrass.humids(3,w.gethumid(3));
		starflower.humids(3,w.gethumid(3));
		break;
		case "Blizzard":
		bli.humidcheck(3,w.gethumid(3));
		w.humids(3,bli.gethumid(3));
		wat.humids(3,w.gethumid(3));
		mul.humids(3,w.gethumid(3));
		sungrass.humids(3,w.gethumid(3));
		starflower.humids(3,w.gethumid(3));
		if(!fs.getstatus(3).equals("complete")){
			fs.addstatus(3,bli.frozencheck());
		}
		break;
		case "Volcano":
		vol.humidcheck(3,w.gethumid(3));
		w.humids(3,vol.gethumid(3));
		wat.humids(3,w.gethumid(3));
		mul.humids(3,w.gethumid(3));
		sungrass.humids(3,w.gethumid(3));
		starflower.humids(3,w.gethumid(3));
		break;
	}
		  hoe_durability-=10;
		  energy-=5;
		   if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		  switch(fill[3]){
			  case "sand":
			  fs.adds(3,"sand");
			  sand--;
			  break;
			  case "clay":
			  fs.adds(3,"clay");
			  soilday[2]=-3;
			  soilnumber[2]=-1;
			  clay--;
			  break;
			  case "loam":
			  fs.adds(3,"loam");
			  soilday[2]=+3;
			  soilnumber[2]=+1;
			  loam--;
			  break;
			  case "magicdust":
			  fs.adds(3,"magicdust");
			  magicdust--;
			  break;
		  }
		   System.out.println("您已成功加入新的土壤並使其鬆軟");
		   }else{
		   System.out.println("此地已有種植作物,需要無種植作物才能執行");} 
		   break;//case3
		   case "4":
		   if(fs.getplant(4).equals("0")){
		   w.humids(4,20);
		   switch(today){
		case "Normal":
		nor.humidcheck(4,w.gethumid(4));
		w.humids(4,nor.gethumid(4));
		wat.humids(4,w.gethumid(4));
		mul.humids(4,w.gethumid(4));
		sungrass.humids(4,w.gethumid(4));
		starflower.humids(4,w.gethumid(4));
		break;
		case "Sunny":
		sun.humidcheck(4,w.gethumid(4));
		w.humids(4,sun.gethumid(4));
		wat.humids(4,w.gethumid(4));
		mul.humids(4,w.gethumid(4));
		sungrass.humids(4,w.gethumid(4));
		starflower.humids(4,w.gethumid(4));
		break;
		case "Rainy":
		rai.humidcheck(4,w.gethumid(4));
		w.humids(4,rai.gethumid(4));
		wat.humids(4,w.gethumid(4));
		mul.humids(4,w.gethumid(4));
		sungrass.humids(4,w.gethumid(4));
		starflower.humids(4,w.gethumid(4));
		break;
		case "Storm":
		sto.humidcheck(4,w.gethumid(4));
		w.humids(4,sto.gethumid(4));
		wat.humids(4,w.gethumid(4));
		mul.humids(4,w.gethumid(4));
		sungrass.humids(4,w.gethumid(4));
		starflower.humids(4,w.gethumid(4));
		break;
		case "Blizzard":
		bli.humidcheck(4,w.gethumid(4));
		w.humids(4,bli.gethumid(4));
		wat.humids(4,w.gethumid(4));
		mul.humids(4,w.gethumid(4));
		sungrass.humids(4,w.gethumid(4));
		starflower.humids(4,w.gethumid(4));
		if(!fs.getstatus(4).equals("complete")){
			fs.addstatus(4,bli.frozencheck());
		}
		break;
		case "Volcano":
		vol.humidcheck(4,w.gethumid(4));
		w.humids(4,vol.gethumid(4));
		wat.humids(4,w.gethumid(4));
		mul.humids(4,w.gethumid(4));
		sungrass.humids(4,w.gethumid(4));
		starflower.humids(4,w.gethumid(4));
		break;
	}
		  hoe_durability-=10;
		  energy-=5;
		  if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		  switch(fill[3]){
			  case "sand":
			  fs.adds(4,"sand");
			  sand--;
			  break;
			  case "clay":
			  fs.adds(4,"clay");
			  soilday[3]=-3;
			  soilnumber[3]=-1;
			  clay--;
			  break;
			  case "loam":
			  fs.adds(4,"loam");
			  soilday[3]=+3;
			  soilnumber[3]=+1;
			  loam--;
			  break;
			  case "magicdust":
			  fs.adds(4,"magicdust");
			  magicdust--;
			  break;
		  }
		   System.out.println("您已成功加入新的土壤並使其鬆軟");
		   }else{
		   System.out.println("此地已有種植作物,需要無種植作物才能執行");} 
		   break;//case4
		   case "5":
		   if(fs.getplant(5).equals("0")){
		   w.humids(5,20);
		   switch(today){
		case "Normal":
		nor.humidcheck(5,w.gethumid(5));
		w.humids(5,nor.gethumid(5));
		wat.humids(5,w.gethumid(5));
		mul.humids(5,w.gethumid(5));
		sungrass.humids(5,w.gethumid(5));
		starflower.humids(5,w.gethumid(5));
		break;
		case "Sunny":
		sun.humidcheck(5,w.gethumid(5));
		w.humids(5,sun.gethumid(5));
		wat.humids(5,w.gethumid(5));
		mul.humids(5,w.gethumid(5));
		sungrass.humids(5,w.gethumid(5));
		starflower.humids(5,w.gethumid(5));
		break;
		case "Rainy":
		rai.humidcheck(5,w.gethumid(5));
		w.humids(5,rai.gethumid(5));
		wat.humids(5,w.gethumid(5));
		mul.humids(5,w.gethumid(5));
		sungrass.humids(5,w.gethumid(5));
		starflower.humids(5,w.gethumid(5));
		break;
		case "Storm":
		sto.humidcheck(5,w.gethumid(5));
		w.humids(5,sto.gethumid(5));
		wat.humids(5,w.gethumid(5));
		mul.humids(5,w.gethumid(5));
		sungrass.humids(5,w.gethumid(5));
		starflower.humids(5,w.gethumid(5));
		break;
		case "Blizzard":
		bli.humidcheck(5,w.gethumid(5));
		w.humids(5,bli.gethumid(5));
		wat.humids(5,w.gethumid(5));
		mul.humids(5,w.gethumid(5));
		sungrass.humids(5,w.gethumid(5));
		starflower.humids(5,w.gethumid(5));
		if(!fs.getstatus(5).equals("complete")){
			fs.addstatus(5,bli.frozencheck());
		}
		break;
		case "Volcano":
		vol.humidcheck(5,w.gethumid(5));
		w.humids(5,vol.gethumid(5));
		wat.humids(5,w.gethumid(5));
		mul.humids(5,w.gethumid(5));
		sungrass.humids(5,w.gethumid(5));
		starflower.humids(5,w.gethumid(5));
		break;
	}
		  hoe_durability-=10;
		  energy-=5;
		  if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		  switch(fill[3]){
			  case "sand":
			  fs.adds(5,"sand");
			  sand--;
			  break;
			  case "clay":
			  fs.adds(5,"clay");
			  soilday[4]=-3;
			  soilnumber[4]=-1;
			  clay--;
			  break;
			  case "loam":
			  fs.adds(5,"loam");
			  soilday[4]=+3;
			  soilnumber[4]=+1;
			  loam--;
			  break;
			  case "magicdust":
			  fs.adds(5,"magicdust");
			  magicdust--;
			  break;
		  }
		   System.out.println("您已成功加入新的土壤並使其鬆軟");
		   }else{
		   System.out.println("此地已有種植作物,需要無種植作物才能執行");} 
		   break;//case5
		   case "6":
		   if(fs.getplant(6).equals("0")){
		   w.humids(6,20);
		   switch(today){
		case "Normal":
		nor.humidcheck(6,w.gethumid(6));
		w.humids(6,nor.gethumid(6));
		wat.humids(6,w.gethumid(6));
		mul.humids(6,w.gethumid(6));
		sungrass.humids(6,w.gethumid(6));
		starflower.humids(6,w.gethumid(6));
		break;
		case "Sunny":
		sun.humidcheck(6,w.gethumid(6));
		w.humids(6,sun.gethumid(6));
		wat.humids(6,w.gethumid(6));
		mul.humids(6,w.gethumid(6));
		sungrass.humids(6,w.gethumid(6));
		starflower.humids(6,w.gethumid(6));
		break;
		case "Rainy":
		rai.humidcheck(6,w.gethumid(6));
		w.humids(6,rai.gethumid(6));
		wat.humids(6,w.gethumid(6));
		mul.humids(6,w.gethumid(6));
		sungrass.humids(6,w.gethumid(6));
		starflower.humids(6,w.gethumid(6));
		break;
		case "Storm":
		sto.humidcheck(6,w.gethumid(6));
		w.humids(6,sto.gethumid(6));
		wat.humids(6,w.gethumid(6));
		mul.humids(6,w.gethumid(6));
		sungrass.humids(6,w.gethumid(6));
		starflower.humids(6,w.gethumid(6));
		break;
		case "Blizzard":
		bli.humidcheck(6,w.gethumid(6));
		w.humids(6,bli.gethumid(6));
		wat.humids(6,w.gethumid(6));
		mul.humids(6,w.gethumid(6));
		sungrass.humids(6,w.gethumid(6));
		starflower.humids(6,w.gethumid(6));
		if(!fs.getstatus(6).equals("complete")){
			fs.addstatus(6,bli.frozencheck());
		}
		break;
		case "Volcano":
		vol.humidcheck(6,w.gethumid(6));
		w.humids(6,vol.gethumid(6));
		wat.humids(6,w.gethumid(6));
		mul.humids(6,w.gethumid(6));
		sungrass.humids(6,w.gethumid(6));
		starflower.humids(6,w.gethumid(6));
		break;
	}
		  hoe_durability-=10;
		  energy-=5;
		   if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		  switch(fill[3]){
			 case "sand":
			  fs.adds(6,"sand");
			  sand--;
			  break;
			  case "clay":
			  fs.adds(6,"clay");
			  soilday[5]=-3;
			  soilnumber[5]=-1;
			  clay--;
			  break;
			  case "loam":
			  fs.adds(6,"loam");
			  soilday[5]=+3;
			  soilnumber[5]=+1;
			  loam--;
			  break;
			  case "magicdust":
			  fs.adds(6,"magicdust");
			  magicdust--;
			  break;
		  }
		   System.out.println("您已成功加入新的土壤並使其鬆軟");
		   }else{
		   System.out.println("此地已有種植作物,需要無種植作物才能執行");} 
		   break;//case6
		   case "7":
		   if(fs.getplant(7).equals("0")){
		   w.humids(7,20);
		   switch(today){
		case "Normal":
		nor.humidcheck(7,w.gethumid(7));
		w.humids(7,nor.gethumid(7));
		wat.humids(7,w.gethumid(7));
		mul.humids(7,w.gethumid(7));
		sungrass.humids(7,w.gethumid(7));
		starflower.humids(7,w.gethumid(7));
		break;
		case "Sunny":
		sun.humidcheck(7,w.gethumid(7));
		w.humids(7,sun.gethumid(7));
		wat.humids(7,w.gethumid(7));
		mul.humids(7,w.gethumid(7));
		sungrass.humids(7,w.gethumid(7));
		starflower.humids(7,w.gethumid(7));
		break;
		case "Rainy":
		rai.humidcheck(7,w.gethumid(7));
		w.humids(7,rai.gethumid(7));
		wat.humids(7,w.gethumid(7));
		mul.humids(7,w.gethumid(7));
		sungrass.humids(7,w.gethumid(7));
		starflower.humids(7,w.gethumid(7));
		break;
		case "Storm":
		sto.humidcheck(7,w.gethumid(7));
		w.humids(7,sto.gethumid(7));
		wat.humids(7,w.gethumid(7));
		mul.humids(7,w.gethumid(7));
		sungrass.humids(7,w.gethumid(7));
		starflower.humids(7,w.gethumid(7));
		break;
		case "Blizzard":
		bli.humidcheck(7,w.gethumid(7));
		w.humids(7,bli.gethumid(7));
		wat.humids(7,w.gethumid(7));
		mul.humids(7,w.gethumid(7));
		sungrass.humids(7,w.gethumid(7));
		starflower.humids(7,w.gethumid(7));
		if(!fs.getstatus(7).equals("complete")){
			fs.addstatus(7,bli.frozencheck());
		}
		break;
		case "Volcano":
		vol.humidcheck(7,w.gethumid(7));
		w.humids(7,vol.gethumid(7));
		wat.humids(7,w.gethumid(7));
		mul.humids(7,w.gethumid(7));
		sungrass.humids(7,w.gethumid(7));
		starflower.humids(7,w.gethumid(7));
		break;
	}
		  hoe_durability-=10;
		  energy-=5;
		   if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		  switch(fill[3]){
			  case "sand":
			  fs.adds(7,"sand");
			  sand--;
			  break;
			  case "clay":
			  fs.adds(7,"clay");
			  soilday[6]=-3;
			  soilnumber[6]=-1;
			  clay--;
			  break;
			  case "loam":
			  fs.adds(7,"loam");
			  soilday[6]=+3;
			  soilnumber[6]=+1;
			  loam--;
			  break;
			  case "magicdust":
			  fs.adds(7,"magicdust");
			  magicdust--;
			  break;
		  }
		   System.out.println("您已成功加入新的土壤並使其鬆軟");
		   }else{
		   System.out.println("此地已有種植作物,需要無種植作物才能執行");} 
		   break;//case7
		   case "8":
		   if(fs.getplant(8).equals("0")){
		   w.humids(8,20);
		   switch(today){
		case "Normal":
		nor.humidcheck(8,w.gethumid(8));
		w.humids(8,nor.gethumid(8));
		wat.humids(8,w.gethumid(8));
		mul.humids(8,w.gethumid(8));
		sungrass.humids(8,w.gethumid(8));
		starflower.humids(8,w.gethumid(8));
		break;
		case "Sunny":
		sun.humidcheck(8,w.gethumid(8));
		w.humids(8,sun.gethumid(8));
		wat.humids(8,w.gethumid(8));
		mul.humids(8,w.gethumid(8));
		sungrass.humids(8,w.gethumid(8));
		starflower.humids(8,w.gethumid(8));
		break;
		case "Rainy":
		rai.humidcheck(8,w.gethumid(8));
		w.humids(8,rai.gethumid(8));
		wat.humids(8,w.gethumid(8));
		mul.humids(8,w.gethumid(8));
		sungrass.humids(8,w.gethumid(8));
		starflower.humids(8,w.gethumid(8));
		break;
		case "Storm":
		sto.humidcheck(8,w.gethumid(8));
		w.humids(8,sto.gethumid(8));
		wat.humids(8,w.gethumid(8));
		mul.humids(8,w.gethumid(8));
		sungrass.humids(8,w.gethumid(8));
		starflower.humids(8,w.gethumid(8));
		break;
		case "Blizzard":
		bli.humidcheck(8,w.gethumid(8));
		w.humids(8,bli.gethumid(8));
		wat.humids(8,w.gethumid(8));
		mul.humids(8,w.gethumid(8));
		sungrass.humids(8,w.gethumid(8));
		starflower.humids(8,w.gethumid(8));
		if(!fs.getstatus(8).equals("complete")){
			fs.addstatus(8,bli.frozencheck());
		}
		break;
		case "Volcano":
		vol.humidcheck(8,w.gethumid(8));
		w.humids(8,vol.gethumid(8));
		wat.humids(8,w.gethumid(8));
		mul.humids(8,w.gethumid(8));
		sungrass.humids(8,w.gethumid(8));
		starflower.humids(8,w.gethumid(8));
		break;
	}
		  hoe_durability-=10;
		  energy-=5;
		  if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		  switch(fill[3]){
			  case "sand":
			  fs.adds(8,"sand");
			  sand--;
			  break;
			  case "clay":
			  fs.adds(8,"clay");
			  soilday[7]=-3;
			  soilnumber[7]=-1;
			  clay--;
			  break;
			  case "loam":
			  fs.adds(8,"loam");
			  soilday[7]=+3;
			  soilnumber[7]=+1;
			  loam--;
			  break;
			  case "magicdust":
			  fs.adds(8,"magicdust");
			  magicdust--;
			  break;
		  }
		   System.out.println("您已成功加入新的土壤並使其鬆軟");
		   }else{
		   System.out.println("此地已有種植作物,需要無種植作物才能執行");} 
		   break;//case8
		   case "9":
		   if(fs.getplant(9).equals("0")){
		   w.humids(9,20);
		   switch(today){
		case "Normal":
		nor.humidcheck(9,w.gethumid(9));
		w.humids(9,nor.gethumid(9));
		wat.humids(9,w.gethumid(9));
		mul.humids(9,w.gethumid(9));
		sungrass.humids(9,w.gethumid(9));
		starflower.humids(9,w.gethumid(9));
		break;
		case "Sunny":
		sun.humidcheck(9,w.gethumid(9));
		w.humids(9,sun.gethumid(9));
		wat.humids(9,w.gethumid(9));
		mul.humids(9,w.gethumid(9));
		sungrass.humids(9,w.gethumid(9));
		starflower.humids(9,w.gethumid(9));
		break;
		case "Rainy":
		rai.humidcheck(9,w.gethumid(9));
		w.humids(9,rai.gethumid(9));
		wat.humids(9,w.gethumid(9));
		mul.humids(9,w.gethumid(9));
		sungrass.humids(9,w.gethumid(9));
		starflower.humids(9,w.gethumid(9));
		break;
		case "Storm":
		sto.humidcheck(9,w.gethumid(9));
		w.humids(9,sto.gethumid(9));
		wat.humids(9,w.gethumid(9));
		mul.humids(9,w.gethumid(9));
		sungrass.humids(9,w.gethumid(9));
		starflower.humids(9,w.gethumid(9));
		break;
		case "Blizzard":
		bli.humidcheck(9,w.gethumid(9));
		w.humids(9,bli.gethumid(9));
		wat.humids(9,w.gethumid(9));
		mul.humids(9,w.gethumid(9));
		sungrass.humids(9,w.gethumid(9));
		starflower.humids(9,w.gethumid(9));
		if(!fs.getstatus(9).equals("complete")){
			fs.addstatus(9,bli.frozencheck());
		}
		break;
		case "Volcano":
		vol.humidcheck(9,w.gethumid(9));
		w.humids(9,vol.gethumid(9));
		wat.humids(9,w.gethumid(9));
		mul.humids(9,w.gethumid(9));
		sungrass.humids(9,w.gethumid(9));
		starflower.humids(9,w.gethumid(9));
		break;
	}
		  hoe_durability-=10;
		  energy-=5;
		  if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		  switch(fill[3]){
			  case "sand":
			  fs.adds(9,"sand");
			  sand--;
			  break;
			  case "clay":
			  fs.adds(9,"clay");
			  soilday[8]=-3;
			  soilnumber[8]=-1;
			  clay--;
			  break;
			  case "loam":
			  fs.adds(9,"loam");
			  soilday[8]=+3;
			  soilnumber[8]=+1;
			  loam--;
			  break;
			  case "magicdust":
			  fs.adds(9,"magicdust");
			  magicdust--;
			  break;
		  }
		   System.out.println("您已成功加入新的土壤並使其鬆軟");
		   }else{
		   System.out.println("此地已有種植作物,需要無種植作物才能執行");}   
		   break;//case9
		   default:
		   error++;
		  }
		   }//tr=3
		}//if error
		}//fill length
		if(error!=0){
		   System.out.println("輸入錯誤");
		   y++;
	   }else{   
		 y++;
		}
		if(hoe_durability==0){
			hoe=0;
			hoe_durability=100;
		}
		System.out.println("現在您目前持有:");
	   System.out.println("金錢"+money+"元");
	   System.out.println("體力:"+energy);
	   for(int b=0;b<=8;b++){
		   if(character.equals("botanist")){
			 day[b]=plantday[b]+soilday[b];
	   number[b]=plantnumber[b]+soilnumber[b]+1;  
		   }else{
	    day[b]=plantday[b]+soilday[b];
	   number[b]=plantnumber[b]+soilnumber[b];}
	   }
	   break;//fill
	   
	   case "plant":
        String[] plant=s.split(" ");
        int err=0;
        int tru=0;		
        if(plant.length!=3){ 
	   err++;
		}else{
	   switch(plant[0]){
		   case "plant":
		   err=0;
		   break;
		   default:
		   err++;
	   }
	   switch(plant[1]){
		 case "watermelon":
		 switch(character){
			 case "hercules":
			 if(energy>=10){
		     tru++;
		   }else{
				System.out.println("體力不足");}
				break;
				case "merchant":
			 if(energy>=20){
		     tru++;
		   }else{
				System.out.println("體力不足");}
				break;
			 default:
          if(energy>=15){
		     tru++;
		   }else{
				System.out.println("體力不足");}
		 }
				if(watermelon_seed>=1){
					tru++;
		   }else{
		   System.out.println("未持有西瓜種子");}
		   break;
		 case "mulberry":
		 switch(character){
			 case "hercules":
			 if(energy>=10){
		     tru++;
		   }else{
				System.out.println("體力不足");}
				break;
				case "merchant":
			 if(energy>=20){
		     tru++;
		   }else{
				System.out.println("體力不足");}
				break;
			 default:
		if(energy>=15){
		  tru++;
		   }else{
				System.out.println("體力不足");}
		 }
				if(mulberry_seed>=1){
					tru++;
		   }else{
		   System.out.println("未持有桑樹種子");}
		   break;
		   case "sungrass":
		   switch(character){
			 case "hercules":
			 if(energy>=10){
		     tru++;
		   }else{
				System.out.println("體力不足");}
				break;
				case "merchant":
			 if(energy>=20){
		     tru++;
		   }else{
				System.out.println("體力不足");}
				break;
			 default:
		if(energy>=15){
		  tru++;
		   }else{
				System.out.println("體力不足");}
		   }
				if(sungrass_seed>=1){
					tru++;
		   }else{
		   System.out.println("未持有太陽草種子");}
		   
		   break;
		   case "starflower":
		   switch(character){
			 case "hercules":
			 if(energy>=10){
		     tru++;
		   }else{
				System.out.println("體力不足");}
				break;
				case "merchant":
			 if(energy>=20){
		     tru++;
		   }else{
				System.out.println("體力不足");}
				break;
			 default:
		if(energy>=15){
		  tru++;
		   }else{
				System.out.println("體力不足");}
		   }
				if(starflower_seed>=1){
					tru++;
		   }else{
		   System.out.println("未持有星辰花種子");}
		   break;
		   default:
		   err++;
	   }
	   if(tru==2){
	   switch(plant[2]){
		  case "1": 
		   switch(fs.getsoil(1)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤沒有養分");
		break;
		default:
		switch(plant[1]){
			case "watermelon":
			if(fs.getsoil(1).equals("magicdust")){
			System.out.println("西瓜不能種在魔法土裡!");	
			}else{
				fs.addp(1,"watermelon");
				plantday[0]=12;
			  plantnumber[0]=4;
			  energy-=15;
		   watermelon_seed--;
		   System.out.println("您已成功將西瓜種子種進土壤中");
			}
			break;
			case "mulberry":
			if(fs.getsoil(1).equals("magicdust")){
			System.out.println("桑樹不能種在魔法土裡!");	
			}else{
				fs.addp(1,"mulberry");
				plantday[0]=16;
			  plantnumber[0]=8;
			  energy-=15;
		   mulberry_seed--;
		   System.out.println("您已成功將桑樹種子種進土壤中");
			}
			break;
			case "sungrass":
			if(!fs.getsoil(1).equals("magicdust")){
			System.out.println("太陽草只能種在魔法土裡!");	
			}else{
				fs.addp(1,"sungrass");
				plantday[0]=6;
				energy-=15;
		   sungrass_seed--;
		   System.out.println("您已成功將太陽草種子種進土壤中");
				
			  }
			break;
			case "starflower":
			if(!fs.getsoil(1).equals("magicdust")){
			System.out.println("星辰花只能種在魔法土裡!");	
			}else{
				fs.addp(1,"starflower");
				plantday[0]=8;
				energy-=15;
		   starflower_seed--;
		   System.out.println("您已成功將星辰花種子種進土壤中");
				
			  }
			break;
		}//plant[1]
		 if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		 }
		 break;//case1
		  case "2": 
		   switch(fs.getsoil(2)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤沒有養分");
		break;
		default:
		switch(plant[1]){
			case "watermelon":
			if(fs.getsoil(2).equals("magicdust")){
			System.out.println("西瓜不能種在魔法土裡!");	
			}else{
				fs.addp(2,"watermelon");
				plantday[1]=12;
			  plantnumber[1]=4;
			  energy-=15;
		   watermelon_seed--;
		   System.out.println("您已成功將西瓜種子種進土壤中");
			}
			break;
			case "mulberry":
			if(fs.getsoil(2).equals("magicdust")){
			System.out.println("桑樹不能種在魔法土裡!");	
			}else{
				fs.addp(2,"mulberry");
				plantday[1]=16;
			  plantnumber[1]=8;
			  energy-=15;
		   mulberry_seed--;
		   System.out.println("您已成功將桑樹種子種進土壤中");
			}
			break;
			case "sungrass":
			if(!fs.getsoil(2).equals("magicdust")){
			System.out.println("太陽草只能種在魔法土裡!");	
			}else{
				fs.addp(2,"sungrass");
				plantday[1]=6;
				energy-=15;
		   sungrass_seed--;
		   System.out.println("您已成功將太陽草種子種進土壤中");
				
			  }
			break;
			case "starflower":
			if(!fs.getsoil(2).equals("magicdust")){
			System.out.println("星辰花只能種在魔法土裡!");	
			}else{
				fs.addp(2,"starflower");
				plantday[1]=8;
				energy-=15;
		   starflower_seed--;
		   System.out.println("您已成功將星辰花種子種進土壤中");
				
			  }
			break;
		}//plant[1]
		 if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		 }
		 break;//case2
		  case "3": 
		   switch(fs.getsoil(3)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤沒有養分");
		break;
		default:
		switch(plant[1]){
			case "watermelon":
			if(fs.getsoil(3).equals("magicdust")){
			System.out.println("西瓜不能種在魔法土裡!");	
			}else{
				fs.addp(3,"watermelon");
				plantday[2]=12;
			  plantnumber[2]=4;
			  energy-=15;
		   watermelon_seed--;
		   System.out.println("您已成功將西瓜種子種進土壤中");
			}
			break;
			case "mulberry":
			if(fs.getsoil(3).equals("magicdust")){
			System.out.println("桑樹不能種在魔法土裡!");	
			}else{
				fs.addp(3,"mulberry");
				plantday[2]=16;
			  plantnumber[2]=8;
			  energy-=15;
		   mulberry_seed--;
		   System.out.println("您已成功將桑樹種子種進土壤中");
			}
			break;
			case "sungrass":
			if(!fs.getsoil(3).equals("magicdust")){
			System.out.println("太陽草只能種在魔法土裡!");	
			}else{
				fs.addp(3,"sungrass");
				plantday[2]=6;
				energy-=15;
		   sungrass_seed--;
		   System.out.println("您已成功將太陽草種子種進土壤中");
				
			  }
			break;
			case "starflower":
			if(!fs.getsoil(3).equals("magicdust")){
			System.out.println("星辰花只能種在魔法土裡!");	
			}else{
				fs.addp(3,"starflower");
				plantday[2]=8;
				energy-=15;
		   starflower_seed--;
		   System.out.println("您已成功將星辰花種子種進土壤中");
				
			  }
			break;
		}//plant[1]
		 if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		 }
		 break;//case3
		  case "4": 
		   switch(fs.getsoil(4)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤沒有養分");
		break;
		default:
		switch(plant[1]){
			case "watermelon":
			if(fs.getsoil(4).equals("magicdust")){
			System.out.println("西瓜不能種在魔法土裡!");	
			}else{
				fs.addp(4,"watermelon");
				plantday[3]=12;
			  plantnumber[3]=4;
			  energy-=15;
		   watermelon_seed--;
		   System.out.println("您已成功將西瓜種子種進土壤中");
			}
			break;
			case "mulberry":
			if(fs.getsoil(4).equals("magicdust")){
			System.out.println("桑樹不能種在魔法土裡!");	
			}else{
				fs.addp(4,"mulberry");
				plantday[3]=16;
			  plantnumber[3]=8;
			  energy-=15;
		   mulberry_seed--;
		   System.out.println("您已成功將桑樹種子種進土壤中");
			}
			break;
			case "sungrass":
			if(!fs.getsoil(4).equals("magicdust")){
			System.out.println("太陽草只能種在魔法土裡!");	
			}else{
				fs.addp(4,"sungrass");
				plantday[3]=6;
				energy-=15;
		   sungrass_seed--;
		   System.out.println("您已成功將太陽草種子種進土壤中");
				
			  }
			break;
			case "starflower":
			if(!fs.getsoil(4).equals("magicdust")){
			System.out.println("星辰花只能種在魔法土裡!");	
			}else{
				fs.addp(4,"starflower");
				plantday[3]=8;
				energy-=15;
		   starflower_seed--;
		   System.out.println("您已成功將星辰花種子種進土壤中");
				
			  }
			break;
		}//plant[1]
		 if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		 }
		 break;//case4
		   case "5": 
		   switch(fs.getsoil(5)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤沒有養分");
		break;
		default:
		switch(plant[1]){
			case "watermelon":
			if(fs.getsoil(5).equals("magicdust")){
			System.out.println("西瓜不能種在魔法土裡!");	
			}else{
				fs.addp(5,"watermelon");
				plantday[4]=12;
			  plantnumber[4]=4;
			  energy-=15;
		   watermelon_seed--;
		   System.out.println("您已成功將西瓜種子種進土壤中");
			}
			break;
			case "mulberry":
			if(fs.getsoil(5).equals("magicdust")){
			System.out.println("桑樹不能種在魔法土裡!");	
			}else{
				fs.addp(5,"mulberry");
				plantday[4]=16;
			  plantnumber[4]=8;
			  energy-=15;
		   mulberry_seed--;
		   System.out.println("您已成功將桑樹種子種進土壤中");
			}
			break;
			case "sungrass":
			if(!fs.getsoil(5).equals("magicdust")){
			System.out.println("太陽草只能種在魔法土裡!");	
			}else{
				fs.addp(5,"sungrass");
				plantday[4]=6;
				energy-=15;
		   sungrass_seed--;
		   System.out.println("您已成功將太陽草種子種進土壤中");
				
			  }
			break;
			case "starflower":
			if(!fs.getsoil(5).equals("magicdust")){
			System.out.println("星辰花只能種在魔法土裡!");	
			}else{
				fs.addp(5,"starflower");
				plantday[4]=8;
				energy-=15;
		   starflower_seed--;
		   System.out.println("您已成功將星辰花種子種進土壤中");
				
			  }
			break;
		}//plant[1]
		 if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		 }
		 break;//case5
		  case "6": 
		   switch(fs.getsoil(6)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤沒有養分");
		break;
		default:
		switch(plant[1]){
			case "watermelon":
			if(fs.getsoil(6).equals("magicdust")){
			System.out.println("西瓜不能種在魔法土裡!");	
			}else{
				fs.addp(6,"watermelon");
				plantday[5]=12;
			  plantnumber[5]=4;
			  energy-=15;
		   watermelon_seed--;
		   System.out.println("您已成功將西瓜種子種進土壤中");
			}
			break;
			case "mulberry":
			if(fs.getsoil(6).equals("magicdust")){
			System.out.println("桑樹不能種在魔法土裡!");	
			}else{
				fs.addp(6,"mulberry");
				plantday[5]=16;
			  plantnumber[5]=8;
			  energy-=15;
		   mulberry_seed--;
		   System.out.println("您已成功將桑樹種子種進土壤中");
			}
			break;
			case "sungrass":
			if(!fs.getsoil(6).equals("magicdust")){
			System.out.println("太陽草只能種在魔法土裡!");	
			}else{
				fs.addp(6,"sungrass");
				plantday[5]=6;
				energy-=15;
		   sungrass_seed--;
		   System.out.println("您已成功將太陽草種子種進土壤中");
				
			  }
			break;
			case "starflower":
			if(!fs.getsoil(6).equals("magicdust")){
			System.out.println("星辰花只能種在魔法土裡!");	
			}else{
				fs.addp(6,"starflower");
				plantday[5]=8;
				energy-=15;
		   starflower_seed--;
		   System.out.println("您已成功將星辰花種子種進土壤中");
				
			  }
			break;
		}//plant[1]
		 if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		 }
		 break;//case6
		  case "7": 
		   switch(fs.getsoil(7)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤沒有養分");
		break;
		default:
		switch(plant[1]){
			case "watermelon":
			if(fs.getsoil(7).equals("magicdust")){
			System.out.println("西瓜不能種在魔法土裡!");	
			}else{
				fs.addp(7,"watermelon");
				plantday[6]=12;
			  plantnumber[6]=4;
			  energy-=15;
		   watermelon_seed--;
		   System.out.println("您已成功將西瓜種子種進土壤中");
			}
			break;
			case "mulberry":
			if(fs.getsoil(7).equals("magicdust")){
			System.out.println("桑樹不能種在魔法土裡!");	
			}else{
				fs.addp(7,"mulberry");
				plantday[6]=16;
			  plantnumber[6]=8;
			  energy-=15;
		   mulberry_seed--;
		   System.out.println("您已成功將桑樹種子種進土壤中");
			}
			break;
			case "sungrass":
			if(!fs.getsoil(7).equals("magicdust")){
			System.out.println("太陽草只能種在魔法土裡!");	
			}else{
				fs.addp(7,"sungrass");
				plantday[6]=6;
				energy-=15;
		   sungrass_seed--;
		   System.out.println("您已成功將太陽草種子種進土壤中");
				
			  }
			break;
			case "starflower":
			if(!fs.getsoil(7).equals("magicdust")){
			System.out.println("星辰花只能種在魔法土裡!");	
			}else{
				fs.addp(7,"starflower");
				plantday[6]=8;
				energy-=15;
		   starflower_seed--;
		   System.out.println("您已成功將星辰花種子種進土壤中");
				
			  }
			break;
		}//plant[1]
		 if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		 }
		 break;//case7
		  case "8": 
		   switch(fs.getsoil(8)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤沒有養分");
		break;
		default:
		switch(plant[1]){
			case "watermelon":
			if(fs.getsoil(8).equals("magicdust")){
			System.out.println("西瓜不能種在魔法土裡!");	
			}else{
				fs.addp(8,"watermelon");
				plantday[7]=12;
			  plantnumber[7]=4;
			  energy-=15;
		   watermelon_seed--;
		   System.out.println("您已成功將西瓜種子種進土壤中");
			}
			break;
			case "mulberry":
			if(fs.getsoil(8).equals("magicdust")){
			System.out.println("桑樹不能種在魔法土裡!");	
			}else{
				fs.addp(8,"mulberry");
				plantday[7]=16;
			  plantnumber[7]=8;
			  energy-=15;
		   mulberry_seed--;
		   System.out.println("您已成功將桑樹種子種進土壤中");
			}
			break;
			case "sungrass":
			if(!fs.getsoil(8).equals("magicdust")){
			System.out.println("太陽草只能種在魔法土裡!");	
			}else{
				fs.addp(8,"sungrass");
				plantday[7]=6;
				energy-=15;
		   sungrass_seed--;
		   System.out.println("您已成功將太陽草種子種進土壤中");
				
			  }
			break;
			case "starflower":
			if(!fs.getsoil(8).equals("magicdust")){
			System.out.println("星辰花只能種在魔法土裡!");	
			}else{
				fs.addp(8,"starflower");
				plantday[7]=8;
				energy-=15;
		   starflower_seed--;
		   System.out.println("您已成功將星辰花種子種進土壤中");
				
			  }
			break;
		}//plant[1]
		 if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		 }
		 break;//case8
		  case "9": 
		   switch(fs.getsoil(9)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤沒有養分");
		break;
		default:
		switch(plant[1]){
			case "watermelon":
			if(fs.getsoil(9).equals("magicdust")){
			System.out.println("西瓜不能種在魔法土裡!");	
			}else{
				fs.addp(9,"watermelon");
				plantday[8]=12;
			  plantnumber[8]=4;
			  energy-=15;
		   watermelon_seed--;
		   System.out.println("您已成功將西瓜種子種進土壤中");
			}
			break;
			case "mulberry":
			if(fs.getsoil(9).equals("magicdust")){
			System.out.println("桑樹不能種在魔法土裡!");	
			}else{
				fs.addp(9,"mulberry");
				plantday[8]=16;
			  plantnumber[8]=8;
			  energy-=15;
		   mulberry_seed--;
		   System.out.println("您已成功將桑樹種子種進土壤中");
			}
			break;
			case "sungrass":
			if(!fs.getsoil(9).equals("magicdust")){
			System.out.println("太陽草只能種在魔法土裡!");	
			}else{
				fs.addp(9,"sungrass");
				plantday[8]=6;
				energy-=15;
		   sungrass_seed--;
		   System.out.println("您已成功將太陽草種子種進土壤中");
				
			  }
			break;
			case "starflower":
			if(!fs.getsoil(9).equals("magicdust")){
			System.out.println("星辰花只能種在魔法土裡!");	
			}else{
				fs.addp(9,"starflower");
				plantday[8]=8;
				energy-=15;
		   starflower_seed--;
		   System.out.println("您已成功將星辰花種子種進土壤中");
				
			  }
			break;
		}//plant[1]
		 if(character.equals("merchant")){
					energy-=5;
				}
				 if(character.equals("hercules")){
					energy+=5;
				}
		 }
		 break;//case9
		 default:
		 err++;
		}//plant[2]
	   }//tru
	}//plant length
		if(err!=0){
		   System.out.println("輸入錯誤");
		   y++;
	   }else{   
		 y++;
		}
		
		System.out.println("現在您目前持有:");
	   System.out.println("金錢"+money+"元");
	   System.out.println("體力:"+energy);
	   for(int c=0;c<=8;c++){
		   if(character.equals("botanist")){
			 day[c]=plantday[c]+soilday[c];
	   number[c]=plantnumber[c]+soilnumber[c]+1;  
		   }else{
	    day[c]=plantday[c]+soilday[c];
	   number[c]=plantnumber[c]+soilnumber[c];}
	   }
	   break;//plant
	   
	   case "reap":
        String[] reap=s.split(" ");
        int er=0;
        int trut=0;		
        if(reap.length!=5){ 
	   er++;
		}else{
	   switch(reap[0]){
		   case "reap":
		   er=0;
		   break;
		   default:
		   er++;
	   }
	   switch(reap[1]){
		   case "and":
           break;
		   default:
		   er++;
	   }
	   switch(reap[2]){
		   case "sell":
           break;
		   default:
		   er++;
	   }
	   if(er==0){
	   if(sickle==1){
		   trut++;
		   }else{
	   System.out.println("未持有鐮刀");}
	   if(energy>=5){
		   trut++;
		  }else{
				System.out.println("體力不足");} 
	   switch(reap[3]){
		 case "watermelon":
           trut++;
		break;
		 case "mulberry":
		  trut++;
			break;  
		   default:
		   System.out.println("此植物不能收割!");
	   }
	    if(trut==3){
			switch(reap[4]){
				case "1":
				if(fs.getstatus(1).equals("complete")){
					if(reap[3].equals(fs.getplant(1))){
						sickle_durability-=20;
			        
			        fs.clears(1);
			        fs.cleardc(1);
			        fs.clearstatus(1);
			        wat.reset(1);
			        mul.reset(1);
			        sungrass.reset(1);
			        starflower.reset(1);
			        day[0]=0;
	                soilday[0]=0;
	                soilnumber[0]=0;
	                plantday[0]=0;
	                plantnumber[0]=0;
					sungrassy[0]=0;
			   starflowery[0]=0;
			   penalty[0]=0;
	                energy-=5;
			   System.out.println("您已成功採收並販賣至商店");
						switch(fs.getplant(1)){
				case "watermelon":
			    money+=(35*number[0]);
				if(character.equals("merchant")){
					money+=(1*number[0]);
				}
				break;
				case "mulberry":
				 money+=(10*number[0]);
				 if(character.equals("merchant")){
					money+=(1*number[0]);
				}
				 break;
						}
						number[0]=0;
						fs.clearp(1);
					}else{
					System.out.println("可採收的作物與輸入指令不同!");}
				}else{
				System.out.println("作物尚未成熟!");}
				break;
				case "2":
				if(fs.getstatus(2).equals("complete")){
					if(reap[3].equals(fs.getplant(2))){
						sickle_durability-=20;
			        
			        fs.clears(2);
			        fs.cleardc(2);
			        fs.clearstatus(2);
			        wat.reset(2);
			        mul.reset(2);
			        sungrass.reset(2);
			        starflower.reset(2);
			        day[1]=0;
	                soilday[1]=0;
	                soilnumber[1]=0;
	                plantday[1]=0;
	                plantnumber[1]=0;
					sungrassy[1]=0;
					penalty[1]=0;
			   starflowery[1]=0;
	                energy-=5;
			   System.out.println("您已成功採收並販賣至商店");
						switch(fs.getplant(2)){
					case "watermelon":
			    money+=(35*number[1]);
				if(character.equals("merchant")){
					money+=(1*number[1]);
				}
				break;
				case "mulberry":
				 money+=(10*number[1]);
				 if(character.equals("merchant")){
					money+=(1*number[1]);
				}
				 break;
						}
						number[1]=0;
						fs.clearp(2);
					}else{
					System.out.println("可採收的作物與輸入指令不同!");}
				}else{
				System.out.println("作物尚未成熟!");}
				break;
				case "3":
				if(fs.getstatus(3).equals("complete")){
					if(reap[3].equals(fs.getplant(3))){
						sickle_durability-=20;
			        
			        fs.clears(3);
			        fs.cleardc(3);
			        fs.clearstatus(3);
			        wat.reset(3);
			        mul.reset(3);
			        sungrass.reset(3);
			        starflower.reset(3);
			        day[2]=0;
	                soilday[2]=0;
	                soilnumber[2]=0;
	                plantday[2]=0;
	                plantnumber[2]=0;
					sungrassy[2]=0;
					penalty[2]=0;
			   starflowery[2]=0;
	                energy-=5;
			   System.out.println("您已成功採收並販賣至商店");
						switch(fs.getplant(3)){
					case "watermelon":
			    money+=(35*number[2]);
				if(character.equals("merchant")){
					money+=(1*number[2]);
				}
				break;
				case "mulberry":
				 money+=(10*number[2]);
				 if(character.equals("merchant")){
					money+=(1*number[2]);
				}
				 break;
						}
						number[2]=0;
						fs.clearp(3);
					}else{
					System.out.println("可採收的作物與輸入指令不同!");}
				}else{
				System.out.println("作物尚未成熟!");}
				break;
				case "4":
				if(fs.getstatus(4).equals("complete")){
					if(reap[3].equals(fs.getplant(4))){
						sickle_durability-=20;
			       
			        fs.clears(4);
			        fs.cleardc(4);
			        fs.clearstatus(4);
			        wat.reset(4);
			        mul.reset(4);
			        sungrass.reset(4);
			        starflower.reset(4);
			        day[3]=0;
	                soilday[3]=0;
	                soilnumber[3]=0;
	                plantday[3]=0;
	                plantnumber[3]=0;
					sungrassy[3]=0;
					penalty[3]=0;
			   starflowery[3]=0;
	                energy-=5;
			   System.out.println("您已成功採收並販賣至商店");
						switch(fs.getplant(4)){
				case "watermelon":
			    money+=(35*number[3]);
				if(character.equals("merchant")){
					money+=(1*number[3]);
				}
				break;
				case "mulberry":
				 money+=(10*number[3]);
				 if(character.equals("merchant")){
					money+=(1*number[3]);
				}
				 break;
						}
						number[3]=0;
						 fs.clearp(4);
					}else{
					System.out.println("可採收的作物與輸入指令不同!");}
				}else{
				System.out.println("作物尚未成熟!");}
				break;
				case "5":
				if(fs.getstatus(5).equals("complete")){
					if(reap[3].equals(fs.getplant(5))){
						sickle_durability-=20;
			        
			        fs.clears(5);
			        fs.cleardc(5);
			        fs.clearstatus(5);
			        wat.reset(5);
			        mul.reset(5);
			        sungrass.reset(5);
			        starflower.reset(5);
			        day[4]=0;
	                soilday[4]=0;
	                soilnumber[4]=0;
	                plantday[4]=0;
	                plantnumber[4]=0;
					sungrassy[4]=0;
			   starflowery[4]=0;
			   penalty[4]=0;
	                energy-=5;
			   System.out.println("您已成功採收並販賣至商店");
						switch(fs.getplant(5)){
					case "watermelon":
			    money+=(35*number[4]);
				if(character.equals("merchant")){
					money+=(1*number[4]);
				}
				break;
				case "mulberry":
				 money+=(10*number[4]);
				 if(character.equals("merchant")){
					money+=(1*number[4]);
				}
				 break;
						}
						number[4]=0;
						fs.clearp(5);
					}else{
					System.out.println("可採收的作物與輸入指令不同!");}
				}else{
				System.out.println("作物尚未成熟!");}
				break;
				case "6":
				if(fs.getstatus(6).equals("complete")){
					if(reap[3].equals(fs.getplant(6))){
						sickle_durability-=20;
			        
			        fs.clears(6);
			        fs.cleardc(6);
			        fs.clearstatus(6);
			        wat.reset(6);
			        mul.reset(6);
			        sungrass.reset(6);
			        starflower.reset(6);
			        day[5]=0;
	                soilday[5]=0;
	                soilnumber[5]=0;
	                plantday[5]=0;
	                plantnumber[5]=0;
					sungrassy[5]=0;
			   starflowery[5]=0;
			   penalty[5]=0;
	                energy-=5;
			   System.out.println("您已成功採收並販賣至商店");
						switch(fs.getplant(6)){
					case "watermelon":
			    money+=(35*number[5]);
				if(character.equals("merchant")){
					money+=(1*number[5]);
				}
				break;
				case "mulberry":
				 money+=(10*number[5]);
				 if(character.equals("merchant")){
					money+=(1*number[5]);
				}
				 break;
						}
						number[5]=0;
						fs.clearp(6);
					}else{
					System.out.println("可採收的作物與輸入指令不同!");}
				}else{
				System.out.println("作物尚未成熟!");}
				break;
				case "7":
				if(fs.getstatus(7).equals("complete")){
					if(reap[3].equals(fs.getplant(7))){
						sickle_durability-=20;
			        
			        fs.clears(7);
			        fs.cleardc(7);
			        fs.clearstatus(7);
			        wat.reset(7);
			        mul.reset(7);
			        sungrass.reset(7);
			        starflower.reset(7);
			        day[6]=0;
	                soilday[6]=0;
	                soilnumber[6]=0;
	                plantday[6]=0;
	                plantnumber[6]=0;
					sungrassy[6]=0;
			   starflowery[6]=0;
			   penalty[6]=0;
	                energy-=5;
			   System.out.println("您已成功採收並販賣至商店");
						switch(fs.getplant(7)){
					case "watermelon":
			    money+=(35*number[6]);
				if(character.equals("merchant")){
					money+=(1*number[6]);
				}
				break;
				case "mulberry":
				 money+=(10*number[6]);
				 if(character.equals("merchant")){
					money+=(1*number[6]);
				}
				 break;
						}
						number[6]=0;
						fs.clearp(7);
					}else{
					System.out.println("可採收的作物與輸入指令不同!");}
				}else{
				System.out.println("作物尚未成熟!");}
				break;
				case "8":
				if(fs.getstatus(8).equals("complete")){
					if(reap[3].equals(fs.getplant(8))){
						sickle_durability-=20;
			        
			        fs.clears(8);
			        fs.cleardc(8);
			        fs.clearstatus(8);
			        wat.reset(8);
			        mul.reset(8);
			        sungrass.reset(8);
			        starflower.reset(8);
			        day[7]=0;
	                soilday[7]=0;
	                soilnumber[7]=0;
	                plantday[7]=0;
	                plantnumber[7]=0;
					sungrassy[7]=0;
			   starflowery[7]=0;
			   penalty[7]=0;
	                energy-=5;
			   System.out.println("您已成功採收並販賣至商店");
						switch(fs.getplant(8)){
				case "watermelon":
			    money+=(35*number[7]);
				if(character.equals("merchant")){
					money+=(1*number[7]);
				}
				break;
				case "mulberry":
				 money+=(10*number[7]);
				 if(character.equals("merchant")){
					money+=(1*number[7]);
				}
				 break;
						}
						number[7]=0;
						fs.clearp(8);
					}else{
					System.out.println("可採收的作物與輸入指令不同!");}
				}else{
				System.out.println("作物尚未成熟!");}
				break;
				case "9":
				if(fs.getstatus(9).equals("complete")){
					if(reap[3].equals(fs.getplant(9))){
						sickle_durability-=20;
			       
			        fs.clears(9);
			        fs.cleardc(9);
			        fs.clearstatus(9);
			        wat.reset(9);
			        mul.reset(9);
			        sungrass.reset(9);
			        starflower.reset(9);
			        day[8]=0;
	                soilday[8]=0;
	                soilnumber[8]=0;
	                plantday[8]=0;
	                plantnumber[8]=0;
					sungrassy[8]=0;
			   starflowery[8]=0;
			   penalty[8]=0;
	                energy-=5;
			   System.out.println("您已成功採收並販賣至商店");
						switch(fs.getplant(9)){
					case "watermelon":
			    money+=(35*number[8]);
				if(character.equals("merchant")){
					money+=(1*number[8]);
				}
				break;
				case "mulberry":
				 money+=(10*number[8]);
				 if(character.equals("merchant")){
					money+=(1*number[8]);
				}
				 break;
						}
						number[8]=0;
						 fs.clearp(9);
					}else{
					System.out.println("可採收的作物與輸入指令不同!");}
				}else{
				System.out.println("作物尚未成熟!");}
				break;
			}
		}//trut
	   }//if er
		}//reap length
		if(er!=0){
		   System.out.println("輸入錯誤");
		   y++;
	   }else{   
		 y++;
		}
		if(sickle_durability==0){
			sickle=0;
			sickle_durability=100;
		}
		System.out.println("現在您目前持有:");
	   System.out.println("金錢"+money+"元");
	   System.out.println("體力:"+energy);
	   break;//reap
	   
	    case "heat":
		if(i>30){
        String[] heat=s.split(" ");
        int errorr=0;
        int	truthh=0;	
        if(heat.length!=2){ 
	   errorr++;
		}else{
	   switch(heat[0]){
		   case "heat":
		   errorr=0;
		   break;
		   default:
		   errorr++;
	   }
	   switch(heat[1]){
		 case "1":
		 if(fs.getplant(1).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
                if(energy>=5){
			      truthh++;
			   }else{
				System.out.println("體力不足");}
				if(heater==1){
					truthh++;
			   }else{
			   System.out.println("未持有加溫器");}
			   if(fs.getstatus(1).equals("frozen")){
				 truthh++;
			   }else{
			   System.out.println("不需要解凍!");}  
			   if(truthh==3){
			   fs.addstatus(1,"0");
			  energy-=5;
			   heater_durability-=15;
			   System.out.println("您已成功將植物解凍");}
		 }
		   break;
		  case "2":
		 if(fs.getplant(2).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
                if(energy>=5){
			      truthh++;
			   }else{
				System.out.println("體力不足");}
				if(heater==1){
					truthh++;
			   }else{
			   System.out.println("未持有加溫器");}
			   if(fs.getstatus(2).equals("frozen")){
				 truthh++;
			   }else{
			   System.out.println("不需要解凍!");}  
			   if(truthh==3){
			   fs.addstatus(2,"0");
			  energy-=5;
			   heater_durability-=15;
			   System.out.println("您已成功將植物解凍");}
		 }
		   break;
		    case "3":
		 if(fs.getplant(3).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
                if(energy>=5){
			      truthh++;
			   }else{
				System.out.println("體力不足");}
				if(heater==1){
					truthh++;
			   }else{
			   System.out.println("未持有加溫器");}
			   if(fs.getstatus(3).equals("frozen")){
				 truthh++;
			   }else{
			   System.out.println("不需要解凍!");}  
			   if(truthh==3){
			   fs.addstatus(3,"0");
			  energy-=5;
			   heater_durability-=15;
			   System.out.println("您已成功將植物解凍");}
		 }
		   break;
		    case "4":
		 if(fs.getplant(4).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
                if(energy>=5){
			      truthh++;
			   }else{
				System.out.println("體力不足");}
				if(heater==1){
					truthh++;
			   }else{
			   System.out.println("未持有加溫器");}
			   if(fs.getstatus(4).equals("frozen")){
				 truthh++;
			   }else{
			   System.out.println("不需要解凍!");}  
			   if(truthh==3){
			   fs.addstatus(4,"0");
			  energy-=5;
			   heater_durability-=15;
			   System.out.println("您已成功將植物解凍");}
		 }
		   break;
		    case "5":
		 if(fs.getplant(5).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
                if(energy>=5){
			      truthh++;
			   }else{
				System.out.println("體力不足");}
				if(heater==1){
					truthh++;
			   }else{
			   System.out.println("未持有加溫器");}
			   if(fs.getstatus(5).equals("frozen")){
				 truthh++;
			   }else{
			   System.out.println("不需要解凍!");}  
			   if(truthh==3){
			   fs.addstatus(5,"0");
			  energy-=5;
			   heater_durability-=15;
			   System.out.println("您已成功將植物解凍");}
		 }
		   break;
		    case "6":
		 if(fs.getplant(6).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
                if(energy>=5){
			      truthh++;
			   }else{
				System.out.println("體力不足");}
				if(heater==1){
					truthh++;
			   }else{
			   System.out.println("未持有加溫器");}
			   if(fs.getstatus(6).equals("frozen")){
				 truthh++;
			   }else{
			   System.out.println("不需要解凍!");}  
			   if(truthh==3){
			   fs.addstatus(6,"0");
			  energy-=5;
			   heater_durability-=15;
			   System.out.println("您已成功將植物解凍");}
		 }
		   break;
		    case "7":
		 if(fs.getplant(7).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
                if(energy>=5){
			      truthh++;
			   }else{
				System.out.println("體力不足");}
				if(heater==1){
					truthh++;
			   }else{
			   System.out.println("未持有加溫器");}
			   if(fs.getstatus(7).equals("frozen")){
				 truthh++;
			   }else{
			   System.out.println("不需要解凍!");}  
			   if(truthh==3){
			   fs.addstatus(7,"0");
			  energy-=5;
			   heater_durability-=15;
			   System.out.println("您已成功將植物解凍");}
		 }
		   break;
		    case "8":
		 if(fs.getplant(8).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
                if(energy>=5){
			      truthh++;
			   }else{
				System.out.println("體力不足");}
				if(heater==1){
					truthh++;
			   }else{
			   System.out.println("未持有加溫器");}
			   if(fs.getstatus(8).equals("frozen")){
				 truthh++;
			   }else{
			   System.out.println("不需要解凍!");}  
			   if(truthh==3){
			   fs.addstatus(8,"0");
			  energy-=5;
			   heater_durability-=15;
			   System.out.println("您已成功將植物解凍");}
		 }
		   break;
		    case "9":
		 if(fs.getplant(9).equals("0")){
			System.out.println("田地中目前無種植作物");
			}else{
                if(energy>=5){
			      truthh++;
			   }else{
				System.out.println("體力不足");}
				if(heater==1){
					truthh++;
			   }else{
			   System.out.println("未持有加溫器");}
			   if(fs.getstatus(9).equals("frozen")){
				 truthh++;
			   }else{
			   System.out.println("不需要解凍!");}  
			   if(truthh==3){
			   fs.addstatus(9,"0");
			  energy-=5;
			   heater_durability-=15;
			   System.out.println("您已成功將植物解凍");}
		 }
		   break;
		   default:
		   errorr++;
	  }
		}//heat length
		if(errorr!=0){
		   System.out.println("輸入錯誤");
		   y++;
	   }else{   
		 y++;
		}
		if(heater_durability==0){
			heater=0;
			heater_durability=100;
		}
		}else{
		System.out.println("未解鎖加溫器");}
		System.out.println("現在您目前持有:");
	   System.out.println("金錢"+money+"元");
	   System.out.println("體力:"+energy);
	   break;//heat
	   
	   case "buy":
	   String[] buy=s.split(" ");
        int erro=0;	
		int truth=0;
        if(buy.length!=2&&buy.length!=3){ 
	   erro++;
		}else{
	   switch(buy[0]){
		   case "buy":
		   erro=0;
		   break;
		   default:
		   erro++;
	   }
	   switch(buy[1]){
		 case "watering":
		 switch(buy[2]){
			case "can":
			if(character.equals("merchant")){
				if(money>=40){
                 truth++;
				}else{
				System.out.println("金額不足");}
			}else{
			if(money>=50){
                 truth++;
				}else{
				System.out.println("金額不足");}
			}
            if(wateringcan==0){
              truth++;				
			}else{
			System.out.println("已持有澆水器");}
			if(truth==2){
			wateringcan=1;
			money-=50;
			if(character.equals("merchant")){
					money+=10;
				}
			System.out.println("您已成功購買澆水器");
			}
			break;
			default:
			erro++; 
		 }	 
		 break;
		 case "hoe":
		 if(character.equals("merchant")){
				if(money>=410){
                 truth++;
				}else{
				System.out.println("金額不足");}
			}else{
            if(money>=420){
               truth++;
			}else{
				System.out.println("金額不足");}
			}
				if(hoe==0){
					truth++;
			}else{
			System.out.println("已持有鋤頭");}
			if(truth==2){
			 hoe=1;
			money-=420;
			if(character.equals("merchant")){
					money+=10;
				}
			System.out.println("您已成功購買鋤頭");
			}
		   break;
		 case "sickle":
		 if(character.equals("merchant")){
				if(money>=200){
                 truth++;
				}else{
				System.out.println("金額不足");}
			}else{
           if(money>=210){
              truth++;
			}else{
				System.out.println("金額不足");}
			}
				if(sickle==0){
					truth++;
			}else{
			System.out.println("已持有鐮刀");}
			if(truth==2){
			sickle=1;
			money-=210;
			if(character.equals("merchant")){
					money+=10;
				}
			System.out.println("您已成功購買鐮刀");
			}
		   break;
		   case "heater":
		   if(i>30){
			   if(character.equals("merchant")){
				if(money>=130){
                 truth++;
				}else{
				System.out.println("金額不足");}
			}else{
           if(money>=140){
              truth++;
			}else{
				System.out.println("金額不足");}
			}
				if(heater==0){
					truth++;
			}else{
			System.out.println("已持有加溫器");}
			if(truth==2){
			heater=1;
			money-=140;
			if(character.equals("merchant")){
					money+=10;
				}
			System.out.println("您已成功購買加溫器");
			}
		   }else{
		   System.out.println("未解鎖加溫器");}
		   break;
		 case "watermelon":
		 if(money>=10){
           watermelon_seed++;
		   money-=10;
		   System.out.println("您已成功購買西瓜種子");
		   }else{
				System.out.println("金額不足");}
			 break;
		 case "mulberry":
		 if(money>=5){
		   mulberry_seed++;
		   money-=5;
		   System.out.println("您已成功購買桑樹種子");
		   }else{
				System.out.println("金額不足");}
	       break;
		   case "chicken":
		 if(money>=200){
		   chicken++;
		   money-=200;
		   System.out.println("您已成功購買雞");
		   }else{
				System.out.println("金額不足");}
	       break;
		   case "sungrass":
		   if(money>=15){
           sungrass_seed++;
		   money-=15;
		   System.out.println("您已成功購買太陽草種子");
		   }else{
				System.out.println("金額不足");}
		   break;
		   case "starflower":
		   if(money>=20){
           starflower_seed++;
		   money-=20;
		   System.out.println("您已成功購買星辰花種子");
		   }else{
				System.out.println("金額不足");}
		   break;
		   case "sand":
		   if(money>=15){
           sand++;
		   money-=15;
		   System.out.println("您已成功購買砂土");
		   }else{
				System.out.println("金額不足");}
		   break;
		   case "clay":
		   if(money>=20){
           clay++;
		   money-=20;
		   System.out.println("您已成功購買黏土");
		   }else{
				System.out.println("金額不足");}
		   break;
		   case "loam":
		   if(money>=20){
           loam++;
		   money-=20;
		   System.out.println("您已成功購買壤土");
		   }else{
				System.out.println("金額不足");}
		   break;
		   case "magicdust":
		   if(money>=30){
           magicdust++;
		   money-=30;
		   System.out.println("您已成功購買魔法土");
		   }else{
				System.out.println("金額不足");}
		   break;
		   default:
		   erro++;
	   }
		}//buy length
		if(erro!=0){
		   System.out.println("輸入錯誤");
		   y++;
	   }else{   
		 y++;
		}
		System.out.println("現在您目前持有:");
	   System.out.println("金錢"+money+"元");
	   System.out.println("體力:"+energy);
	   break;//buy
	   
	   case "sell":
	   String[] sell=s.split(" ");
        int errorrr=0;
		if(sell.length!=2){ 
	   errorrr++;
		}else{
	   switch(sell[0]){
		   case "sell":
		   errorrr=0;
		   break;
		   default:
		   errorrr++;
	   }
	   switch(sell[1]){
		   case "egg":
           break;
		   default:
		   errorrr++;
	   }
	   if(errorrr==0){
		   if(egg>0){
			   money+=(20*egg);
			   egg=0;
			   System.out.println("您已成功販賣蛋至商店");
		   }else{
		   System.out.println("未持有蛋"); 
		   }
	   }else{
		   System.out.println("輸入錯誤");
	   }
		}//sell length 
        y++;
		System.out.println("現在您目前持有:");
	   System.out.println("金錢"+money+"元");
	   System.out.println("體力:"+energy);
		break;//sell egg
		
	   case "check":
	   String[] check=s.split(" ");
	   if(check.length==2){
	   switch(check[1]){
		   case "1":
	   if(energy>=5){
		   System.out.println("田地編號1");
		   switch(fs.getsoil(1)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤缺少養分!");
		break;
		default:
	   switch(fs.emptyp(1)){
		case "0":	
		System.out.println("田地中目前種植無");
		System.out.println("土壤為"+fs.getsoil(1));
		System.out.println("濕度為"+w.gethumid(1));
		if(fs.getstatus(1).equals("frozen")){
		System.out.println("您的土壤目前是凍傷狀態");	
		}
		break;
		default:
       System.out.println("田地中目前種植"+fs.getplant(1));
	   System.out.println("土壤為"+fs.getsoil(1));
	   System.out.println("濕度為"+w.gethumid(1));
     if(!fs.getstatus(1).equals("complete")){	   
	   System.out.println("已生長"+fs.getdc(1)+"天");
	   switch(fs.getplant(1)){
		   case "watermelon":
		   System.out.println("預計再過"+(day[0]-fs.getdc(1))+"天結成果實");
		   System.out.println("預計結果數量"+number[0]+"顆");
		   break;
		   case "mulberry":
		   System.out.println("預計再過"+(day[0]-fs.getdc(1))+"天結成果實");
		   System.out.println("預計結果數量"+number[0]+"顆");
		   break;
		   case "sungrass":
		   System.out.println("預計再過"+(sungrass.getday(1)-fs.getdc(1))+"天自然死亡");
		   break;
		   case "starflower":
		   System.out.println("預計再過"+(starflower.getday(1)-fs.getdc(1))+"天自然死亡");
		   break;
	   }
	 }else{
	 System.out.println("已生長完成");
	 System.out.println("預計結果數量"+number[0]+"顆");} 
	   if(fs.getstatus(1).equals("frozen")){
	   System.out.println("您的植物與土壤目前是凍傷狀態");}
	   }
		  }
		   }else{
				System.out.println("體力不足");}
				break;
	    case "2":
	   if(energy>=5){
		   System.out.println("田地編號2");
		   switch(fs.getsoil(2)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤缺少養分!");
		break;
		default:
	   switch(fs.emptyp(2)){
		case "0":	
		System.out.println("田地中目前種植無");
		System.out.println("土壤為"+fs.getsoil(2));
		System.out.println("濕度為"+w.gethumid(2));
		if(fs.getstatus(2).equals("frozen")){
		System.out.println("您的土壤目前是凍傷狀態");	
		}
		break;
		default:
       System.out.println("田地中目前種植"+fs.getplant(2));
	   System.out.println("土壤為"+fs.getsoil(2));
	   System.out.println("濕度為"+w.gethumid(2));
     if(!fs.getstatus(2).equals("complete")){	   
	   System.out.println("已生長"+fs.getdc(2)+"天");
	   switch(fs.getplant(2)){
		   case "watermelon":
		   System.out.println("預計再過"+(day[1]-fs.getdc(2))+"天結成果實");
		   System.out.println("預計結果數量"+number[1]+"顆");
		   break;
		   case "mulberry":
		   System.out.println("預計再過"+(day[1]-fs.getdc(2))+"天結成果實");
		   System.out.println("預計結果數量"+number[1]+"顆");
		   break;
		   case "sungrass":
		   System.out.println("預計再過"+(sungrass.getday(2)-fs.getdc(2))+"天自然死亡");
		   break;
		   case "starflower":
		   System.out.println("預計再過"+(starflower.getday(2)-fs.getdc(2))+"天自然死亡");
		   break;
	   }
	 }else{
	 System.out.println("已生長完成");
	 System.out.println("預計結果數量"+number[1]+"顆");} 
	   if(fs.getstatus(2).equals("frozen")){
	   System.out.println("您的植物與土壤目前是凍傷狀態");}
	   }
		  }
		   }else{
				System.out.println("體力不足");}
				break;
				 case "3":
	   if(energy>=5){
		   System.out.println("田地編號3");
		   switch(fs.getsoil(3)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤缺少養分!");
		break;
		default:
	   switch(fs.emptyp(3)){
		case "0":	
		System.out.println("田地中目前種植無");
		System.out.println("土壤為"+fs.getsoil(3));
		System.out.println("濕度為"+w.gethumid(3));
		if(fs.getstatus(3).equals("frozen")){
		System.out.println("您的土壤目前是凍傷狀態");	
		}
		break;
		default:
       System.out.println("田地中目前種植"+fs.getplant(3));
	   System.out.println("土壤為"+fs.getsoil(3));
	   System.out.println("濕度為"+w.gethumid(3));
     if(!fs.getstatus(3).equals("complete")){	   
	   System.out.println("已生長"+fs.getdc(3)+"天");
	   switch(fs.getplant(3)){
		   case "watermelon":
		   System.out.println("預計再過"+(day[2]-fs.getdc(3))+"天結成果實");
		   System.out.println("預計結果數量"+number[2]+"顆");
		   break;
		   case "mulberry":
		   System.out.println("預計再過"+(day[2]-fs.getdc(3))+"天結成果實");
		   System.out.println("預計結果數量"+number[2]+"顆");
		   break;
		   case "sungrass":
		   System.out.println("預計再過"+(sungrass.getday(3)-fs.getdc(3))+"天自然死亡");
		   break;
		   case "starflower":
		   System.out.println("預計再過"+(starflower.getday(3)-fs.getdc(3))+"天自然死亡");
		   break;
	   }
	 }else{
	 System.out.println("已生長完成");
	 System.out.println("預計結果數量"+number[2]+"顆");} 
	   if(fs.getstatus(3).equals("frozen")){
	   System.out.println("您的植物與土壤目前是凍傷狀態");}
	   }
		  }
		   }else{
				System.out.println("體力不足");}
				break;
				 case "4":
	   if(energy>=5){
		   System.out.println("田地編號4");
		   switch(fs.getsoil(4)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤缺少養分!");
		break;
		default:
	   switch(fs.emptyp(4)){
		case "0":	
		System.out.println("田地中目前種植無");
		System.out.println("土壤為"+fs.getsoil(4));
		System.out.println("濕度為"+w.gethumid(4));
		if(fs.getstatus(4).equals("frozen")){
		System.out.println("您的土壤目前是凍傷狀態");	
		}
		break;
		default:
       System.out.println("田地中目前種植"+fs.getplant(4));
	   System.out.println("土壤為"+fs.getsoil(4));
	   System.out.println("濕度為"+w.gethumid(4));
     if(!fs.getstatus(4).equals("complete")){	   
	   System.out.println("已生長"+fs.getdc(4)+"天");
	   switch(fs.getplant(4)){
		   case "watermelon":
		   System.out.println("預計再過"+(day[3]-fs.getdc(4))+"天結成果實");
		   System.out.println("預計結果數量"+number[3]+"顆");
		   break;
		   case "mulberry":
		   System.out.println("預計再過"+(day[3]-fs.getdc(4))+"天結成果實");
		   System.out.println("預計結果數量"+number[3]+"顆");
		   break;
		   case "sungrass":
		   System.out.println("預計再過"+(sungrass.getday(4)-fs.getdc(4))+"天自然死亡");
		   break;
		   case "starflower":
		   System.out.println("預計再過"+(starflower.getday(4)-fs.getdc(4))+"天自然死亡");
		   break;
	   }
	 }else{
	 System.out.println("已生長完成");
	 System.out.println("預計結果數量"+number[3]+"顆");} 
	   if(fs.getstatus(4).equals("frozen")){
	   System.out.println("您的植物與土壤目前是凍傷狀態");}
	   }
		  }
		   }else{
				System.out.println("體力不足");}
				break;
				 case "5":
	   if(energy>=5){
		   System.out.println("田地編號5");
		   switch(fs.getsoil(5)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤缺少養分!");
		break;
		default:
	   switch(fs.emptyp(5)){
		case "0":	
		System.out.println("田地中目前種植無");
		System.out.println("土壤為"+fs.getsoil(5));
		System.out.println("濕度為"+w.gethumid(5));
		if(fs.getstatus(5).equals("frozen")){
		System.out.println("您的土壤目前是凍傷狀態");	
		}
		break;
		default:
       System.out.println("田地中目前種植"+fs.getplant(5));
	   System.out.println("土壤為"+fs.getsoil(5));
	   System.out.println("濕度為"+w.gethumid(5));
     if(!fs.getstatus(5).equals("complete")){	   
	   System.out.println("已生長"+fs.getdc(5)+"天");
	   switch(fs.getplant(5)){
		   case "watermelon":
		   System.out.println("預計再過"+(day[4]-fs.getdc(5))+"天結成果實");
		   System.out.println("預計結果數量"+number[4]+"顆");
		   break;
		   case "mulberry":
		   System.out.println("預計再過"+(day[4]-fs.getdc(5))+"天結成果實");
		   System.out.println("預計結果數量"+number[4]+"顆");
		   break;
		   case "sungrass":
		   System.out.println("預計再過"+(sungrass.getday(5)-fs.getdc(5))+"天自然死亡");
		   break;
		   case "starflower":
		   System.out.println("預計再過"+(starflower.getday(5)-fs.getdc(5))+"天自然死亡");
		   break;
	   }
	 }else{
	 System.out.println("已生長完成");
	 System.out.println("預計結果數量"+number[4]+"顆");} 
	   if(fs.getstatus(5).equals("frozen")){
	   System.out.println("您的植物與土壤目前是凍傷狀態");}
	   }
		  }
		   }else{
				System.out.println("體力不足");}
				break;
				 case "6":
	   if(energy>=5){
		   System.out.println("田地編號6");
		   switch(fs.getsoil(6)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤缺少養分!");
		break;
		default:
	   switch(fs.emptyp(6)){
		case "0":	
		System.out.println("田地中目前種植無");
		System.out.println("土壤為"+fs.getsoil(6));
		System.out.println("濕度為"+w.gethumid(6));
		if(fs.getstatus(6).equals("frozen")){
		System.out.println("您的土壤目前是凍傷狀態");	
		}
		break;
		default:
       System.out.println("田地中目前種植"+fs.getplant(6));
	   System.out.println("土壤為"+fs.getsoil(6));
	   System.out.println("濕度為"+w.gethumid(6));
     if(!fs.getstatus(6).equals("complete")){	   
	   System.out.println("已生長"+fs.getdc(6)+"天");
	   switch(fs.getplant(6)){
		   case "watermelon":
		   System.out.println("預計再過"+(day[5]-fs.getdc(6))+"天結成果實");
		   System.out.println("預計結果數量"+number[5]+"顆");
		   break;
		   case "mulberry":
		   System.out.println("預計再過"+(day[5]-fs.getdc(6))+"天結成果實");
		   System.out.println("預計結果數量"+number[5]+"顆");
		   break;
		   case "sungrass":
		   System.out.println("預計再過"+(sungrass.getday(6)-fs.getdc(6))+"天自然死亡");
		   break;
		   case "starflower":
		   System.out.println("預計再過"+(starflower.getday(6)-fs.getdc(6))+"天自然死亡");
		   break;
	   }
	 }else{
	 System.out.println("已生長完成");
	 System.out.println("預計結果數量"+number[5]+"顆");} 
	   if(fs.getstatus(6).equals("frozen")){
	   System.out.println("您的植物與土壤目前是凍傷狀態");}
	   }
		  }
		   }else{
				System.out.println("體力不足");}
				break;
				 case "7":
	   if(energy>=5){
		   System.out.println("田地編號7");
		   switch(fs.getsoil(7)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤缺少養分!");
		break;
		default:
	   switch(fs.emptyp(7)){
		case "0":	
		System.out.println("田地中目前種植無");
		System.out.println("土壤為"+fs.getsoil(7));
		System.out.println("濕度為"+w.gethumid(7));
		if(fs.getstatus(7).equals("frozen")){
		System.out.println("您的土壤目前是凍傷狀態");	
		}
		break;
		default:
       System.out.println("田地中目前種植"+fs.getplant(7));
	   System.out.println("土壤為"+fs.getsoil(7));
	   System.out.println("濕度為"+w.gethumid(7));
     if(!fs.getstatus(7).equals("complete")){	   
	   System.out.println("已生長"+fs.getdc(7)+"天");
	   switch(fs.getplant(7)){
		   case "watermelon":
		   System.out.println("預計再過"+(day[6]-fs.getdc(7))+"天結成果實");
		   System.out.println("預計結果數量"+number[6]+"顆");
		   break;
		   case "mulberry":
		   System.out.println("預計再過"+(day[6]-fs.getdc(7))+"天結成果實");
		   System.out.println("預計結果數量"+number[6]+"顆");
		   break;
		   case "sungrass":
		   System.out.println("預計再過"+(sungrass.getday(7)-fs.getdc(7))+"天自然死亡");
		   break;
		   case "starflower":
		   System.out.println("預計再過"+(starflower.getday(7)-fs.getdc(7))+"天自然死亡");
		   break;
	   }
	 }else{
	 System.out.println("已生長完成");
	 System.out.println("預計結果數量"+number[6]+"顆");} 
	   if(fs.getstatus(7).equals("frozen")){
	   System.out.println("您的植物與土壤目前是凍傷狀態");}
	   }
		  }
		   }else{
				System.out.println("體力不足");}
				break;
				 case "8":
	   if(energy>=5){
		   System.out.println("田地編號8");
		   switch(fs.getsoil(8)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤缺少養分!");
		break;
		default:
	   switch(fs.emptyp(8)){
		case "0":	
		System.out.println("田地中目前種植無");
		System.out.println("土壤為"+fs.getsoil(8));
		System.out.println("濕度為"+w.gethumid(8));
		if(fs.getstatus(8).equals("frozen")){
		System.out.println("您的土壤目前是凍傷狀態");	
		}
		break;
		default:
       System.out.println("田地中目前種植"+fs.getplant(8));
	   System.out.println("土壤為"+fs.getsoil(8));
	   System.out.println("濕度為"+w.gethumid(8));
     if(!fs.getstatus(8).equals("complete")){	   
	   System.out.println("已生長"+fs.getdc(8)+"天");
	   switch(fs.getplant(8)){
		   case "watermelon":
		   System.out.println("預計再過"+(day[7]-fs.getdc(8))+"天結成果實");
		   System.out.println("預計結果數量"+number[7]+"顆");
		   break;
		   case "mulberry":
		   System.out.println("預計再過"+(day[7]-fs.getdc(8))+"天結成果實");
		   System.out.println("預計結果數量"+number[7]+"顆");
		   break;
		   case "sungrass":
		   System.out.println("預計再過"+(sungrass.getday(8)-fs.getdc(8))+"天自然死亡");
		   break;
		   case "starflower":
		   System.out.println("預計再過"+(starflower.getday(8)-fs.getdc(8))+"天自然死亡");
		   break;
	   }
	 }else{
	 System.out.println("已生長完成");
	 System.out.println("預計結果數量"+number[7]+"顆");} 
	   if(fs.getstatus(8).equals("frozen")){
	   System.out.println("您的植物與土壤目前是凍傷狀態");}
	   }
		  }
		   }else{
				System.out.println("體力不足");}
				break;
				 case "9":
	   if(energy>=5){
		   System.out.println("田地編號9");
		   switch(fs.getsoil(9)){
		case "0":	
		System.out.println("There's no soil now.");
		break;
		case "-1":	
		System.out.println("土壤缺少養分!");
		break;
		default:
	   switch(fs.emptyp(9)){
		case "0":	
		System.out.println("田地中目前種植無");
		System.out.println("土壤為"+fs.getsoil(9));
		System.out.println("濕度為"+w.gethumid(9));
		if(fs.getstatus(9).equals("frozen")){
		System.out.println("您的土壤目前是凍傷狀態");	
		}
		break;
		default:
       System.out.println("田地中目前種植"+fs.getplant(9));
	   System.out.println("土壤為"+fs.getsoil(9));
	   System.out.println("濕度為"+w.gethumid(9));
     if(!fs.getstatus(9).equals("complete")){	   
	   System.out.println("已生長"+fs.getdc(9)+"天");
	   switch(fs.getplant(9)){
		   case "watermelon":
		   System.out.println("預計再過"+(day[8]-fs.getdc(9))+"天結成果實");
		   System.out.println("預計結果數量"+number[8]+"顆");
		   break;
		   case "mulberry":
		   System.out.println("預計再過"+(day[8]-fs.getdc(9))+"天結成果實");
		   System.out.println("預計結果數量"+number[8]+"顆");
		   break;
		   case "sungrass":
		   System.out.println("預計再過"+(sungrass.getday(9)-fs.getdc(9))+"天自然死亡");
		   break;
		   case "starflower":
		   System.out.println("預計再過"+(starflower.getday(9)-fs.getdc(9))+"天自然死亡");
		   break;
	   }
	 }else{
	 System.out.println("已生長完成");
	 System.out.println("預計結果數量"+number[8]+"顆");} 
	   if(fs.getstatus(9).equals("frozen")){
	   System.out.println("您的植物與土壤目前是凍傷狀態");}
	   }
		  }
		   }else{
				System.out.println("體力不足");}
				break;
				default:
				System.out.println("輸入錯誤");
	   }//check[1]
	   if(i>30){
		System.out.println("目前雞舍中有"+chicken+"隻雞");
		}
	  energy-=5;
	   }else{
	   System.out.println("輸入錯誤");}
	   y++;
		System.out.println("現在您目前持有:");
	   System.out.println("金錢"+money+"元");
	   System.out.println("體力:"+energy);		
	   break;//check
	   
	   case "backpack":
	   System.out.println("現在您目前持有:");
	   if(wateringcan==0){
	   System.out.println("澆水器"+wateringcan+"個");
	   }else{
	   System.out.println("澆水器"+wateringcan+"個,耐久值為:"+wateringcan_durability);}
	   if(hoe==0){
	   System.out.println("鋤頭"+hoe+"個");
	   }else{
	   System.out.println("鋤頭"+hoe+"個,耐久值為:"+hoe_durability);}
	   if(sickle==0){
	   System.out.println("鐮刀"+sickle+"個");
	   }else{
	   System.out.println("鐮刀"+sickle+"個,耐久值為:"+sickle_durability);}
	   if(heater==0){
	   System.out.println("加溫器"+heater+"個");
	   }else{
	   System.out.println("加溫器"+heater+"個,耐久值為:"+heater_durability);}
	   System.out.println("西瓜種子"+watermelon_seed+"個");
	   System.out.println("桑樹種子"+mulberry_seed+"個");
	   System.out.println("太陽草種子"+sungrass_seed+"個");
	   System.out.println("星辰花種子"+starflower_seed+"個");
	   System.out.println("砂土"+sand+"個");
	   System.out.println("黏土"+clay+"個"); 
	   System.out.println("壤土"+loam+"個");
	   System.out.println("魔法土"+magicdust+"個");
	   System.out.println("蛋"+egg+"顆");
	   System.out.println("金錢"+money+"元");
	   System.out.println("體力:"+energy);
	   y++;
	   break;//backpack
	   
	   case "weather":
	   if(i>60){
	   String[] weather=s.split(" ");
        int errorrrr=0;
		if(weather.length!=2){ 
	   errorrrr++;
		}else{
	   switch(weather[0]){
		   case "weather":
		   errorrrr=0;
		   break;
		   default:
		   errorrrr++;
	   }
	   switch(weather[1]){
		   case "forecast":
           break;
		   default:
		   errorrrr++;
	   }
	   if(errorrrr==0){
		   if(i<=99){
		 System.out.println("明天的天氣分別是:");
		 System.out.println("Normal   20%");
		 System.out.println("Rainy    20%");
		 System.out.println("Sunny    20%");
		 System.out.println("Storm    20%");
		 System.out.println("Blizzard 19%");
		 System.out.println("Volcano  1%");
		   }else{
         System.out.println("明天的天氣分別是:");
		 System.out.println("Normal   15%");
		 System.out.println("Rainy    20%");
		 System.out.println("Sunny    20%");
		 System.out.println("Storm    20%");
		 System.out.println("Blizzard 15%");
		 System.out.println("Volcano  10%");
		   }
	   }else{
		   System.out.println("輸入錯誤");
	   }
		}//weather length 
        y++;	
	   }else{
	   System.out.println("未解鎖天氣預報"); 
	   y++;}
	   System.out.println("現在您目前持有:");
	   System.out.println("金錢"+money+"元");
	   System.out.println("體力:"+energy);
		break;//weather forecast
		
		case "surrender":
	   if(i>100){
	   y=0;
	   x=-100;
	   System.out.println("遊戲結束!您已選擇投降");
	   }else{
	   System.out.println("未解鎖投降"); 
	   y++;}
		break;//surrender
	   
	   case "sleep":
	   System.out.println("您已成功睡覺並回復體力");
	   if(character.equals("hercules")){
		  energy=100; 
	   }
	   if(character.equals("botanist")){
		 if(energy<=20){
	   energy+=70;
	   }else{
	   energy=90;}  
	   }else{
	   if(energy<=30){
	   energy+=70;
	   }else{
	   energy=100;}
	   }
	   for(int r=1;r<=9;r++){
		   if(fs.getstatus(r).equals("frozen")){
	           fs.clearp(r);
			   fs.clears(r);
			   fs.cleardc(r);
			   fs.clearstatus(r);
			   wat.reset(r);
			   mul.reset(r);
			   sungrass.reset(r);
			   starflower.reset(r);
			   day[r-1]=0;
	           soilday[r-1]=0;
	           soilnumber[r-1]=0;
	           plantday[r-1]=0;
	           plantnumber[r-1]=0;
	           number[r-1]=0;
			    sungrassy[r-1]=0;
			   starflowery[r-1]=0;
			   penalty[r-1]=0;
			   System.out.println("News!!!您的植物"+r+"昨晚被凍死");}
	   switch(fs.getplant(r)){
		   case "watermelon":
		   if(fs.getstatus(r).equals("0")){
	   wat.check(r);
		   switch(wat.death_check(r)){
			   case "0":
			   fs.clearp(r);
			   fs.clears(r);
			   fs.cleardc(r);
			   fs.clearstatus(r);
			   wat.reset(r);
			   mul.reset(r);
			   sungrass.reset(r);
			   starflower.reset(r);
			   day[r-1]=0;
	           soilday[r-1]=0;
	           soilnumber[r-1]=0;
	           plantday[r-1]=0;
	           plantnumber[r-1]=0;
	           number[r-1]=0;
			    sungrassy[r-1]=0;
			   starflowery[r-1]=0;
			   penalty[r-1]=0;
			   System.out.println("News!!!您的植物"+r+"昨晚因水土不服而死");
			   break;
			   default:
			   if(wat.getdeath_counter(r)>3){
				   penalty[r-1]++;
			   }
			  } 
	   }break;
		  case "mulberry":
		   if(fs.getstatus(r).equals("0")){
	   mul.check(r);
		   switch(mul.death_check(r)){
			   case "0":
			   fs.clearp(r);
			   fs.clears(r);
			   fs.cleardc(r);
			   fs.clearstatus(r);
			   wat.reset(r);
			   mul.reset(r);
			   sungrass.reset(r);
			   starflower.reset(r);
			   day[r-1]=0;
	           soilday[r-1]=0;
	           soilnumber[r-1]=0;
	           plantday[r-1]=0;
	           plantnumber[r-1]=0;
	           number[r-1]=0;
			    sungrassy[r-1]=0;
			   starflowery[r-1]=0;
			   penalty[r-1]=0;
			   System.out.println("News!!!您的植物"+r+"昨晚因水土不服而死");
			   break;
			   default:
			   if(mul.getdeath_counter(r)>3){
				   penalty[r-1]++;
			   }
			  } 
	   }break;
		   case "sungrass":
		   if(fs.getstatus(r).equals("0")){
	   sungrass.check(r);
		    }break;
		   case "starflower":
		   if(fs.getstatus(r).equals("0")){
	   starflower.check(r);
		    }break;
	   }
	   }
	   for(int chd=0;chd<chicken;chd++){
	   int d100=dh.roll();
	     switch(today){
			 case "Blizzard":
			 if(d100>80){
				   chicken--;
				   chicken_counter++;
			   }
			   break;
			 case "Volcano":
			 if(d100>70){
				   chicken--;
				   chicken_counter++;
			   }
			   break;  
			 }
			 if(chicken_counter>0){
		  System.out.println("News!!!您的雞今昨晚死了"+chicken_counter+"隻"); 
		  chicken_counter=0;
	   }
	   }
	   y=0;
	   break;//sleep
	   default:
	   System.out.println("輸入錯誤");
	   y++;
	   }//switch 
	   if(money>0||fs.allplant()!="000"||chicken!=0){
	}else{
		if(watermelon_seed+mulberry_seed==0||sand+clay+loam==0||egg+chicken==0||watermelon+mulberry==0||wateringcan==0
		||hoe==0||sickle==0){
		y=0;}
	}
      if(energy==0){
		  if(character.equals("hercules")){
		  energy=100; 
	   }else{
	   energy+=70;
	   }
	    for(int rr=1;rr<=9;rr++){
		   if(fs.getstatus(rr).equals("frozen")){
	           fs.clearp(rr);
			   fs.clears(rr);
			   fs.cleardc(rr);
			   fs.clearstatus(rr);
			   wat.reset(rr);
			   mul.reset(rr);
			   sungrass.reset(rr);
			   starflower.reset(rr);
			   day[rr-1]=0;
	           soilday[rr-1]=0;
	           soilnumber[rr-1]=0;
	           plantday[rr-1]=0;
	           plantnumber[rr-1]=0;
	           number[rr-1]=0;
			   sungrassy[rr-1]=0;
			   starflowery[rr-1]=0;
			   penalty[rr-1]=0;
			   System.out.println("News!!!您的植物"+rr+"昨晚被凍死");}
	   switch(fs.getplant(rr)){
		   case "watermelon":
		   if(fs.getstatus(rr).equals("0")){
	   wat.check(rr);
		   switch(wat.death_check(rr)){
			   case "0":
			   fs.clearp(rr);
			   fs.clears(rr);
			   fs.cleardc(rr);
			   fs.clearstatus(rr);
			   wat.reset(rr);
			   mul.reset(rr);
			   sungrass.reset(rr);
			   starflower.reset(rr);
			   day[rr-1]=0;
	           soilday[rr-1]=0;
	           soilnumber[rr-1]=0;
	           plantday[rr-1]=0;
	           plantnumber[rr-1]=0;
	           number[rr-1]=0;
			    sungrassy[rr-1]=0;
			   starflowery[rr-1]=0;
			   penalty[rr-1]=0;
			   System.out.println("News!!!您的植物"+rr+"昨晚因水土不服而死");
			   break;
			   default:
			   if(wat.getdeath_counter(rr)>3){
				  penalty[rr-1]++;
			   }
			  } 
	   }break;
		  case "mulberry":
		   if(fs.getstatus(rr).equals("0")){
	   mul.check(rr);
		   switch(mul.death_check(rr)){
			   case "0":
			   fs.clearp(rr);
			   fs.clears(rr);
			   fs.cleardc(rr);
			   fs.clearstatus(rr);
			   wat.reset(rr);
			   mul.reset(rr);
			   sungrass.reset(rr);
			   starflower.reset(rr);
			   day[rr-1]=0;
	           soilday[rr-1]=0;
	           soilnumber[rr-1]=0;
	           plantday[rr-1]=0;
	           plantnumber[rr-1]=0;
	           number[rr-1]=0;
			    sungrassy[rr-1]=0;
			   starflowery[rr-1]=0;
			   penalty[rr-1]=0;
			   System.out.println("News!!!您的植物"+rr+"昨晚因水土不服而死");
			   break;
			   default:
			   if(mul.getdeath_counter(rr)>3){
				   penalty[rr-1]++;
			   }
			  } 
	   }break;
		   case "sungrass":
		   if(fs.getstatus(rr).equals("0")){
	   sungrass.check(rr);
		    }break;
		   case "starflower":
		   if(fs.getstatus(rr).equals("0")){
	   starflower.check(rr);
		    }break;
	   }
	   }
	   for(int chd=0;chd<chicken;chd++){
	   int d100=dh.roll();
	     switch(today){
			 case "Blizzard":
			 if(d100>80){
				   chicken--;
				   chicken_counter++;
			   }
			   break;
			 case "Volcano":
			 if(d100>70){
				   chicken--;
				   chicken_counter++;
			   }
			   break;  
			 }
			 if(chicken_counter>0){
		  System.out.println("News!!!您的雞今昨晚死了"+chicken_counter+"隻"); 
		  chicken_counter=0;
	   }
	   }
	   y=0;
			}	   
	}//deal
	for(int l=1;l<=9;l++){
		switch(fs.getplant(l)){
			case "sungrass":
			switch(l){
			case 1:
			if(fs.getplant(2).equals("watermelon")||fs.getplant(2).equals("mulberry")){
			sungrassy[1]=-3;}
			if(fs.getplant(4).equals("watermelon")||fs.getplant(4).equals("mulberry")){
			sungrassy[3]=-3;}
			break;
			case 3:
			if(fs.getplant(2).equals("watermelon")||fs.getplant(2).equals("mulberry")){
			sungrassy[1]=-3;}
			if(fs.getplant(6).equals("watermelon")||fs.getplant(6).equals("mulberry")){
			sungrassy[5]=-3;}
			break;
			case 7:
			if(fs.getplant(8).equals("watermelon")||fs.getplant(8).equals("mulberry")){
			sungrassy[7]=-3;}
			if(fs.getplant(4).equals("watermelon")||fs.getplant(4).equals("mulberry")){
			sungrassy[3]=-3;}
			break;
			case 9:
			if(fs.getplant(6).equals("watermelon")||fs.getplant(6).equals("mulberry")){
			sungrassy[5]=-3;}
			if(fs.getplant(8).equals("watermelon")||fs.getplant(8).equals("mulberry")){
			sungrassy[7]=-3;}
			break;
			case 2:
			if(fs.getplant(1).equals("watermelon")||fs.getplant(1).equals("mulberry")){
			sungrassy[0]=-3;}
			if(fs.getplant(3).equals("watermelon")||fs.getplant(3).equals("mulberry")){
			sungrassy[2]=-3;}
			if(fs.getplant(5).equals("watermelon")||fs.getplant(5).equals("mulberry")){
			sungrassy[4]=-3;}
			break;
			case 4:
			if(fs.getplant(1).equals("watermelon")||fs.getplant(1).equals("mulberry")){
			sungrassy[0]=-3;}
			if(fs.getplant(7).equals("watermelon")||fs.getplant(7).equals("mulberry")){
			sungrassy[6]=-3;}
			if(fs.getplant(5).equals("watermelon")||fs.getplant(5).equals("mulberry")){
			sungrassy[4]=-3;}
			break;
			case 6:
			if(fs.getplant(9).equals("watermelon")||fs.getplant(9).equals("mulberry")){
			sungrassy[8]=-3;}
			if(fs.getplant(3).equals("watermelon")||fs.getplant(3).equals("mulberry")){
			sungrassy[2]=-3;}
			if(fs.getplant(5).equals("watermelon")||fs.getplant(5).equals("mulberry")){
			sungrassy[4]=-3;}
			break;
			case 8:
			if(fs.getplant(7).equals("watermelon")||fs.getplant(7).equals("mulberry")){
			sungrassy[6]=-3;}
			if(fs.getplant(9).equals("watermelon")||fs.getplant(9).equals("mulberry")){
			sungrassy[8]=-3;}
			if(fs.getplant(5).equals("watermelon")||fs.getplant(5).equals("mulberry")){
			sungrassy[4]=-3;}
			break;
			case 5:
			if(fs.getplant(2).equals("watermelon")||fs.getplant(2).equals("mulberry")){
			sungrassy[1]=-3;}
			if(fs.getplant(4).equals("watermelon")||fs.getplant(4).equals("mulberry")){
			sungrassy[3]=-3;}
			if(fs.getplant(6).equals("watermelon")||fs.getplant(6).equals("mulberry")){
			sungrassy[5]=-3;}
			if(fs.getplant(8).equals("watermelon")||fs.getplant(8).equals("mulberry")){
			sungrassy[7]=-3;}
			break;
			}
			break;
			case "starflower":
			switch(l){
			case 1:
			if(fs.getplant(2).equals("watermelon")||fs.getplant(2).equals("mulberry")){
			starflowery[1]=-3;}
			if(fs.getplant(4).equals("watermelon")||fs.getplant(4).equals("mulberry")){
			starflowery[3]=-3;}
			break;
			case 3:
			if(fs.getplant(2).equals("watermelon")||fs.getplant(2).equals("mulberry")){
			starflowery[1]=-3;}
			if(fs.getplant(6).equals("watermelon")||fs.getplant(6).equals("mulberry")){
			starflowery[5]=-3;}
			break;
			case 7:
			if(fs.getplant(8).equals("watermelon")||fs.getplant(8).equals("mulberry")){
			starflowery[7]=-3;}
			if(fs.getplant(4).equals("watermelon")||fs.getplant(4).equals("mulberry")){
			starflowery[3]=-3;}
			break;
			case 9:
			if(fs.getplant(6).equals("watermelon")||fs.getplant(6).equals("mulberry")){
			starflowery[5]=-3;}
			if(fs.getplant(8).equals("watermelon")||fs.getplant(8).equals("mulberry")){
			starflowery[7]=-3;}
			break;
			case 2:
			if(fs.getplant(1).equals("watermelon")||fs.getplant(1).equals("mulberry")){
			starflowery[0]=-3;}
			if(fs.getplant(3).equals("watermelon")||fs.getplant(3).equals("mulberry")){
			starflowery[2]=-3;}
			if(fs.getplant(5).equals("watermelon")||fs.getplant(5).equals("mulberry")){
			starflowery[4]=-3;}
			break;
			case 4:
			if(fs.getplant(1).equals("watermelon")||fs.getplant(1).equals("mulberry")){
			starflowery[0]=-3;}
			if(fs.getplant(7).equals("watermelon")||fs.getplant(7).equals("mulberry")){
			starflowery[6]=-3;}
			if(fs.getplant(5).equals("watermelon")||fs.getplant(5).equals("mulberry")){
			starflowery[4]=-3;}
			break;
			case 6:
			if(fs.getplant(9).equals("watermelon")||fs.getplant(9).equals("mulberry")){
			starflowery[8]=-3;}
			if(fs.getplant(3).equals("watermelon")||fs.getplant(3).equals("mulberry")){
			starflowery[2]=-3;}
			if(fs.getplant(5).equals("watermelon")||fs.getplant(5).equals("mulberry")){
			starflowery[4]=-3;}
			break;
			case 8:
			if(fs.getplant(7).equals("watermelon")||fs.getplant(7).equals("mulberry")){
			starflowery[6]=-3;}
			if(fs.getplant(9).equals("watermelon")||fs.getplant(9).equals("mulberry")){
			starflowery[8]=-3;}
			if(fs.getplant(5).equals("watermelon")||fs.getplant(5).equals("mulberry")){
			starflowery[4]=-3;}
			break;
			case 5:
			if(fs.getplant(2).equals("watermelon")||fs.getplant(2).equals("mulberry")){
			starflowery[1]=-3;}
			if(fs.getplant(4).equals("watermelon")||fs.getplant(4).equals("mulberry")){
			starflowery[3]=-3;}
			if(fs.getplant(6).equals("watermelon")||fs.getplant(6).equals("mulberry")){
			starflowery[5]=-3;}
			if(fs.getplant(8).equals("watermelon")||fs.getplant(8).equals("mulberry")){
			starflowery[7]=-3;}
			break;
			}
			break;
		}
	}//for l
	for(int m=1;m<=9;m++){
		 if(character.equals("botanist")){
		 if(!fs.getstatus(m).equals("complete")&&!fs.getplant(m).equals("0")){
		day[m-1]=plantday[m-1]+soilday[m-1]+sungrassy[m-1];
	   number[m-1]=plantnumber[m-1]+soilnumber[m-1]+starflowery[m-1]-penalty[m-1]+1;
		}
		 }else{
		if(!fs.getstatus(m).equals("complete")&&!fs.getplant(m).equals("0")){
		day[m-1]=plantday[m-1]+soilday[m-1]+sungrassy[m-1];
	   number[m-1]=plantnumber[m-1]+soilnumber[m-1]+starflowery[m-1]-penalty[m-1];
		}
	}
	}
	if(money>0||fs.allplant()!="000"||chicken!=0){
		x++;
		z++;
	}else{
		if(watermelon_seed+mulberry_seed==0||sand+clay+loam==0||egg+chicken==0||watermelon+mulberry==0||wateringcan==0
		||hoe==0||sickle==0){
		System.out.println("遊戲結束!您已經破產了");	
		x=0;
		z++;}else{
		x++;
		z++;}
	}
	
	}//day
	System.out.println("遊戲結算:您已生存了"+(z-1)+"天,您還剩下"+money+"元");
     }catch(FileNotFoundException e){ 
	   System.out.println("IO Exception Happened"); 
	   }	
	}//main
	}