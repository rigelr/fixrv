package jb3;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();
        
        motor.nyalakanMesin();
        motor.printStatus();
        
       for(int i=0; i<22; i++){
        motor.tambahKecepatan();
        motor.printStatus();
        
       }
        
        motor.matikanMesin();
        motor.printStatus();
    }

}
