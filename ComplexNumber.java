
public class ComplexNumber {
    int real;
    int img;

    public ComplexNumber(int real, int img){
        this.real = real; 
        this.img = img;
    }

    public void print(){
        System.out.println(real+" +"+" i"+img);
    }

    public void plus(ComplexNumber C2){
        this.real = this.real+C2.real;
        this.img = this.img+C2.img;
        
    }

    public void multiply(ComplexNumber C2){
        int newReal = this.real*C2.real - C2.img*this.img;
        int newImg = this.real*C2.img + this.img*C2.real;

        this.real = newReal;
        this.img = newImg;

    }

    public static void main(String[] args){

      
        ComplexNumber C1 = new ComplexNumber(4,6);
        

        ComplexNumber C2 = new ComplexNumber(5,7);
        

        C1.multiply(C2);
        C1.print();
        

       
    }
    
}
