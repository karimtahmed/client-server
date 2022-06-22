package double_server;

import java.util.Scanner;

/**
 *
 * @author Remon
 */
public class Double_server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     Scanner sc=new Scanner (System.in);
    System.out.println("Enter size of your customers");
    int n = sc.nextInt();
    int [] st= new int [n+1];
    int [] iat= new int [n+1];
    int as=11,cs=43,ms=100;
    int at=0,tis=0;
    int ssta=0,sta=0,cta=0;
    int sstb=0,stb=0,ctb=0;
      st[0]=27;
      for(int i=1;i<=n;i++){
    
        st[i]=(((as*st[i-1])+cs)%ms);
    }
    int ai=14,ci=45,mi=100;
      iat[0]=27;
      for(int i=1;i<=n;i++){
    
        iat[i]=(((ai*iat[i-1])+ci)%mi);
    }
  for(int i=1;i<=n;i++){
      if(iat[i]>=1&&iat[i]<=25){
      iat[i]=1;
      }
      else if(iat[i]>=26&&iat[i]<=65){
      iat[i]=2;
      }
     else if(iat[i]>=66&&iat[i]<=85){
      iat[i]=3;
      }
     else{
      iat[i]=4;
      }
      
      }
  System.out.println("NO "+"IAT "+"AT "+"SSTA "+"CTA "+"ST "+"SSTB "+"CTB "+"TIS ");
  for(int i = 1; i <=n; i++)
{
 
  at=at+iat[i];
  if(cta==ctb){
  ssta=Math.max(at,cta);
 if(st[i]>=1&&iat[i]<=30){
      st[i]=2;
      }
      else if(st[i]>=31&&st[i]<=58){
      st[i]=3;
      }
     else if(st[i]>=59&&st[i]<=83){
      st[i]=4;
      }
     else{
      st[i]=5;
      }
 cta=ssta+st[i];
 tis=st[i];
  }
  else if(cta<ctb || at>=cta){
  ssta=Math.max(at,cta);
 if(st[i]>=1&&iat[i]<=30){
      st[i]=2;
      }
      else if(st[i]>=31&&st[i]<=58){
      st[i]=3;
      }
     else if(st[i]>=59&&st[i]<=83){
      st[i]=4;
      }
     else{
      st[i]=5;
      }
 if(cta>at){
 tis=(cta-at)+st[i];
 }
 else{
     tis=st[i];
 }
 cta=ssta+st[i];
  }
  else{
 sstb=Math.max(at,ctb);
 if(st[i]>=1&&iat[i]<=35){
      st[i]=3;
      }
      else if(st[i]>=36&&st[i]<=60){
      st[i]=4;
      }
     else if(st[i]>=61&&st[i]<=80){
      st[i]=5;
      }
     else{
      st[i]=6;
      }
 if(ctb>at){
 tis=(ctb-at)+st[i];
 }
 else{
     tis=st[i];
 }
 ctb=sstb+st[i];
  }
  System.out.println(i +" "+iat[i]+" "+at+" "+ssta+" "+cta+" "+st[i]+" "+sstb+" "+ctb+" "+tis+" ");
  
  }
  
  
}
    }
