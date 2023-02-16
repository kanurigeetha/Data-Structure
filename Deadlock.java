// class Test{
//     static String firstName = "Geetha";
//     static String lastName = "kanuri";
//     static class Thread1 extends Thread{
//         public void run(){
//             synchronized(firstName){
//                 System.out.println("firstname is occupied by t1 "+firstName);
//             }

//             synchronized(lastName){
//                 System.out.println("lastname is occupied by t1 "+lastName);
//             }
//             }
//         }
    
//     static class Thread2 extends Thread{
//         public void run(){
//             synchronized(lastName){
//                 System.out.println("lastname is occupied by t2 "+lastName);
//             }
//             synchronized(firstName){
//                 System.out.println("firstname is occupied by t2 "+firstName);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Thread1 t1 = new Thread1();
//         Thread2 t2 = new Thread2();

//         t1.start();
//         t2.start();
//     }
// }
class Test{
    static final String firstName = "Geetha";
    static final String lastName = "kanuri";
    static class Thread1 extends Thread{
        public void run(){
            synchronized(firstName){
                System.out.println("firstname is occupied by t1 "+firstName);
                synchronized(lastName){
                    System.out.println("lastname is occupied by t1 "+lastName);
                }
            }

            }
        }
    static class Thread2 extends Thread{
        public void run(){
            synchronized(lastName){
                System.out.println("lastname is occupied by t2 "+lastName);
                synchronized(firstName){
                    System.out.println("firstname is occupied by t2 "+firstName);
                }
            }

            
        }
    }
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}