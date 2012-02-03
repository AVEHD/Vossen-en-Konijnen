package logic;
import java.util.Random;

/**
 * Provide control over the randomization of the simulation.
 * 
 * @author Ieme, Jermo, Yisong
 * @version 2012.01.29
 */
public class Randomizer
{
    // The default seed for control of randomization.
    private static final int SEED = 1111;
    // A shared Random object, if required.
    private static final Random rand = new Random(SEED);
    // Determine whether a shared random generator is to be provided.
    private static final boolean useShared = false;		// tijdelijk op random gezet

    /**
     * Constructor for objects of class Randomizer
     */
    public Randomizer()
    {
    	
    }

    /**
     * Provide a random generator.
     * @return A random object.
     */
    public static Random getRandom()
    {
        if(useShared) {
        	return rand;
        }
        else {
            return new Random();
        }
    }
    
    /**
     * Reset the randomization.
     * This will have no effect if randomization is not through
     * a shared Random generator.
     */
    public static void reset()
    {
        if(useShared) {
            rand.setSeed(SEED);
        }
    }
}