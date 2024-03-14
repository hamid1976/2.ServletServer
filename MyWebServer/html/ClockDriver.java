public class ClockDriver
{
   public static void main(String[]  args){
      Clock clock1 = new Clock(2,4,7);
      Clock clock2 = new Clock(8,26,57);
      clock1.tick();
      int newSeconds = clock1.getSeconds();
      //validate it should be 8 now

      clock2.tickDown();
      newSeconds = clock1.getSeconds();
      //validate it should be 56 now

      clock1.addClock(clock2);
      //get Hour, minute and second from clock1 and validate
      int newHour = clock1.getHours();
      int nuwMinute = clock1.getMinutes();
      newSeconds = clock1.getSeconds();
      //validate if they are with the right expected value or not
	  System.out.println(newHour+" "+ nuwMinute+" "+newSeconds);
  }
}