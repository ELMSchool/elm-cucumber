package utils;

public class WaitUtils {

    /**
     * Wait for -> milliseconds = 100*seconds
     * @param milliseconds
     */
    public static void pauseFor(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
