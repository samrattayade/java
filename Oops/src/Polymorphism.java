class Shape1{  
void draw(){System.out.println("drawing...");}  
}  
class Rectangle1 extends Shape1{  
void draw(){System.out.println("drawing rectangle...");}  
}  
class Circle extends Shape1{  
void draw(){System.out.println("drawing circle...");}  
}  
class Triangle extends Shape1{  
void draw(){System.out.println("drawing triangle...");}  
}  
class Polymorphism{  
public static void main(String args[]){  
Shape1 s;  
s=new Rectangle1();  
s.draw();  
s=new Circle();  
s.draw();  
s=new Triangle();  
s.draw();  
}  
}  