/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 * 
 * @author Jon Cooper
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2 
{
    
    /**make the first line of the verse when eieio() is called
     * 
     */
    public static void eieio() 
    { 
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }


    /** param animal animal on the farm
     * pusts animal into second line of the verse
     * 
     */
    public static void hadA(String animal) 
    { 
        System.out.println("And on that farm he had a " + animal + ", E I E I O.");
    }


    /** param sound animal sound
     * puts animal sound into third and fourth line of verse
     * 
     */public static void withA(String sound) 
    { 
        System.out.println("With a " + sound + " " + sound +  " here and a " + sound + " " + sound +  " there.");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + ", " + sound + ".");  
    }

    
    /** param animal animal on the farm
     * param sound animal sound
     * passes strings into verse functions and calls them in order
     * prints a blank line between each verse
     * 
     */public static void singIt(String animal, String sound) 
    {
        eieio();
        hadA(animal);
        withA(sound);
        eieio();
        System.out.println();
    }

    
    /**titles the song
     * makes strings with animals and their sounds to be played latrer sk83r
     * 
     */public static void main(String[] args) 
    {
        System.out.println("Old MacDonald Had A Farm\n"); // Give our song a title

        singIt("duck", "quack");
        singIt("cow", "moo");
        singIt("horse", "neigh");
        singIt("platypus","gdggdggddgdg");
        
        // now see how easy it is to add some more animals  
        
        
        // modify the methods above to get quotation marks around the animal sounds
    }
    
}
