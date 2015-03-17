import java.util.List;
import java.util.ArrayList;
/**
 * The Khyah is a short, fuzzy, ape-like creature that crouches in Nepalese homes.
 * 
 * @author Glenda 
 * @version (a version number or a date)
 */
public class Khyah extends Animal
{
    private String appearance;
    private List<String> toys;
    /**
     * Constructor for objects of class Khyah
     */
    public Khyah()
    {
        appearance = "This a standard looking bear in all respects. Use your imagination.";
        toys = new ArrayList<String>();
        toys.add("Plush Fish");
    }

    public String roar()
    {
        return "RAAAAAAAAAAWR";
    }
    
    public String sleep()
    {
        return "zzzzzzzzz";
    }
    
    public String play()
    {
        String playing = "";
        for(String toy : toys)
        {
            playing += "The khyah plays with his "+ toy +".\n";
        }
        return playing;
    }
    
    public String eat()
    {
        return "The bear reaches through the bars and eats a volunteer";
    }
}
