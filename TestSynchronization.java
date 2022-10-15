import java.io.*;
import java.util.*;
import java.lang.*;

class OddEven{  
    synchronized void print(){//synchronized method  
      for(int i=1;i<=101;i++){  
           if (i%2==0)
              System.out.println("Even"+i); 
        else 
              System.out.println("Odd"+i);
        try{  
         Thread.sleep(400);  
        }catch(Exception e){System.out.println(e);}  
      }  
     
    }  
   }  
     
   class MyThread1 extends Thread{  
   OddEven oe;  
   MyThread1(OddEven oe){  
   this.oe=oe;  
   }  
   public void run(){  
   oe.print();  
   }  
     
   }  
   class MyThread2 extends Thread{  
   OddEven oe;  
   MyThread2(OddEven oe){  
   this.oe=oe;  
   }  
   public void run(){  
   oe.print();  
   }  
   }  
     
   public class TestSynchronization{  
   public static void main(String args[]){  
   OddEven obj = new OddEven();//only one object  
   MyThread1 t1=new MyThread1(obj);
   t1.start();  
   MyThread2 t2=new MyThread2(obj);  
   t2.start();  
   }  
   }  