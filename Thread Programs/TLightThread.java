// public class thread2{
//     private static boolean greenLight = true;
//     private static Object lock = new Object();

//     public static void main(String[] args) {
//         Thread trafficLight = new Thread(new TrafficLightRunnable());
//         Thread vehicleStream = new Thread(new VehicleStreamRunnable());

//         trafficLight.start();
//         vehicleStream.start();
//     }

//     private static class TrafficLightRunnable implements Runnable {
//         public void run() {
//             while (true) {
//                 synchronized (lock) {
//                     try {
//                         System.out.println("Green light is on");
//                         lock.wait(5000); // Green light lasts for 5 seconds
//                         greenLight = false;
//                         System.out.println("Red light is on");
//                         lock.wait(3000); // Red light lasts for 3 seconds
//                         greenLight = true;
//                     } catch (InterruptedException e) {
//                         e.printStackTrace();
//                     }
//                 }
//             }
//         }
//     }

//     private static class VehicleStreamRunnable implements Runnable {
//         public void run() {
//             while (true) {
//                 synchronized (lock) {
//                     try {
//                         if (greenLight) {
//                             System.out.println("Vehicles are moving");
//                             lock.wait(2000); // Vehicles move for 2 seconds
//                         } else {
//                             System.out.println("Vehicles are stopped");
//                             lock.wait(3000); // Vehicles stop for 3 seconds
//                         }
//                     } catch (InterruptedException e) {
//                         e.printStackTrace();
//                     }
//                 }
//             }
//         }
//     }
// }



public class TLightThread{
    private static boolean green=true;
    private static Object task=new Object();
    public static void main(String[] args){
        Thread signalInfo=new Thread(new signalInfoRun());
        Thread moveInfo=new Thread(new moveRun());
        signalInfo.start();
        moveInfo.start();
    }
    private static class signalInfoRun implements Runnable{
        public void run(){
            while (true) {
                synchronized(task){
                    try{
                        System.out.println("signal is green");
                        task.wait(5000);
                        green=false;
                        System.out.println("signal is red");
                        task.wait(3000);
                        green=true;
                    }catch(Exception e){
                        System.out.print("arror");
                    }
                   

                }
                
            }
        }
    }
    private static class moveRun implements Runnable{
        public void run(){
            while (true) {
                synchronized(task){
                    
                    try{
                        if(green){
                            System.out.println("moving");
                            task.wait(5000);
                        }else{

                            System.out.println("stop");
                            task.wait(3000);
                        }
                        
                    }catch(InterruptedException e){
                        System.out.print("arror");
                    }
                }
                
            }
        }
    }
}