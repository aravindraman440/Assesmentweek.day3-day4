package multipleinheritprogram;

public class Desktop implements Softwere,Hardwere{

public void harawereResorces() {
	// TODO Auto-generated method stub
	System.out.println("hardwere 1 interface");
}

public void softwereRosorces() {
	// TODO Auto-generated method stub
	System.out.println("softwere 2 interface");
}
public static void main(String[] args) {
	
Desktop interFaceImplement= new Desktop();
interFaceImplement.harawereResorces();
interFaceImplement.softwereRosorces();


}
}