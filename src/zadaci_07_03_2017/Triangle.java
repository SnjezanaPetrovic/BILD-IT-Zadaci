package zadaci_07_03_2017;

public class Triangle extends GeometricObject {
	
	double side1,side2,side3;
	
	Triangle(){
		
	}
	Triangle(double side1,double side2,double side3){
		this.side1=1.0;
		this.side2=1.0;
		this.side3=1.0;
	}
	double getSide1(){
		return side1;
	}
	double getSide2(){
		return side2;
	}
	double getSide3(){
		return side3;
	}
	double getArea(){
		return side1+side2+side3;
	}
	double getPerimeter(){
		return side1*side2/side3;
	}
	public String toString(){
		return "Triangle: sid1= "+side1+" side2= "+side2+" side3= "+side3;
		
	}



}
