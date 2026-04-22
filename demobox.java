class box{
    double height;
    double width;
    double length;
void volume(){
System.out.println("the volume will be :"+(height)*(length)*(width));
}
double vol(){
return length*height*width;
}
void sol(double w,double h,double l){
    width=w;
    height=h;
    length=l;
}
}



public class demobox {
    public static void main(String[] args) {
        box m1=new box();
        box m2=new box();
         box m3=new box();
          box m4=new box();
          box m5 =new box();
        double volume;
        m1.height=10;
        m1.width=50;
        m1.length=23;
        volume= m1.height*m1.width*    m1.length;
        System.out.println("the volume will be :" +volume);
         m2.height=100;
        m2.width=500;
        m2.length=230;
        volume= m2.height*m2.width*    m2.length;
        System.out.println("the volume will be :" +volume);
         m3.height=14;
        m3.width=10;
        m3.length=23;
        System.out.println("volume is calculated by using method");
        m3.volume();
          System.out.println("volume is calculated by using  return type method");
           m4.height=4;
        m4.width=15;
        m4.length=27;
        System.out.println("the volume :" + m4.vol());
        System.out.println("function call by passing arguement");
        m5.sol(23,98,65);
        m5.volume();
    }
}
