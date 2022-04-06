/**
 * Provide a counter for a participant in the simulation. This includes an identifying string and a count of how
 * many participants of this type currently exist within the simulation.
 * 
 * @author David J. Barnes, Michael Kölling, Ali Alkhars (K20055566) and Anton Sirgue (K21018741).
 * @version 2022.02.28
 */
public class Counter
{
    // A name for this type of simulation participant
    private String name;
    // How many of this type exist in the simulation.
    private int count;

    /**
     * Provide a name for one of the animals taking part in the simulation.
     *
     * @param name (String) A name, e.g. "Fox".
     */
    public Counter(String name)
    {
        this.name = name;
        count = 0;
    }
    
    /**
     * @return (String) The short description of this type.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return (int) The current count for this type.
     */
    public int getCount()
    {
        return count;
    }

    /**
     * Increment the current count by one.
     */
    public void increment()
    {
        count++;
    }
    
    /**
     * Reset the current count to zero.
     */
    public void reset()
    {
        count = 0;
    }
}
