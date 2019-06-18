import java.util.EnumMap; 
  
public class EnumMapExample
{ 
    public enum Hardware 
    { 
        MONITOR, MOUSE, KEYBOARD;
    } 
  
    public static void main(String args[])  
    {     
        EnumMap<Hardware, String> hardwareMapInstance = new 
                     EnumMap<Hardware, String>(Hardware.class); 

        /* hardwareMapInstance is empty. Let's populate it. */
  
        hardwareMapInstance.put(Hardware.MONITOR, "Samsung"); 
        hardwareMapInstance.put(Hardware.MOUSE, "Logitech g403"); 
        hardwareMapInstance.put(Hardware.KEYBOARD, "Razer"); 
          
        /* After having put items, let's see the map size. */
        System.out.println("Size: " + hardwareMapInstance.size()); // we could use .size() to loop through an enummap
       
        /* This would print the EnumMap in natural order. (MONITOR => MOUSE => KEYBOARD) */
        System.out.println("EnumMap: " + hardwareMapInstance); 
       
        /* Getting a specific value from an EnumMap. */
        System.out.println("Key: " + Hardware.MONITOR +" Value: " + hardwareMapInstance.get(Hardware.MONITOR)); 
       
        /* Checking if the EnumMap contains a particular key. */
        System.out.println("Does Hardware has " + Hardware.MOUSE + ": " + hardwareMapInstance.containsKey(Hardware.MOUSE)); 
       
        /* Checking if EnumMap contains a particular value */
        System.out.println("Does Hardware has " + Hardware.KEYBOARD + " : " + hardwareMapInstance.containsValue("Razer")); 

        /* Let's clear the EnumMap */
        System.out.println("Clearing the map...");
        hardwareMapInstance.clear();

        /* Let's get the size now again */
        System.out.println("The size after clear() is: " + hardwareMapInstance.size());
    } 
} 
