/**
 * This class reads from "animals.csv" the information about all the animals
 * that are available to be put in the simulation.
 *
 * @author Ali Alkhars (K20055566) and Anton Sirgue (K21018741).
 * @version 2022.02.28
 */

public class AnimalCSVReader extends CSVReader
{
    // Path to the file holding the animal related data.
    private static final String FILE_NAME = "animals.csv";
    // String to be recognized as a boolean value of true.
    private static final String TRUE_SYMBOL = "true";
    // tru if the animal is a predator.
    private boolean isPredator;
    // Animal's name.
    private String name;
    // Maximum temperature the animal can survive to.
    private int maximumTemperature;
    // Minimum temperature the animal can survive to.
    private int minimumTemperature;
    // Maximum Age animal can live for.
    private int maximumAge;
    // Minimum age at which animal can breed.
    private int breedingAge;
    // Probability to see animal breed at each step.
    private double breedingProbability;
    // Maximum litter size brought by animal in one reproduction.
    private int maxLitterSize;
    // Nutritional value brought when animal is eaten.
    private int nutritionalValue;
    // Animal's strength (0 if not a predator).
    private int strength;
    // Whether an animal can hibernate.
    private boolean hibernates;
    // Whether an animal is nocturnal.
    private boolean isNocturnal;
    // Tool to alert user about any potential error.
    private ErrorThrower errorThrower;

    /**
     * Builds an AnimalCSVReader and initializes field.
     */
    public AnimalCSVReader() {
        errorThrower = new ErrorThrower();
        isPredator = false;
        name = null;
        maximumTemperature = 0;
        minimumTemperature = 0;
        maximumAge = 0;
        breedingAge = 0;
        breedingProbability = 0;
        maxLitterSize = 0;
        nutritionalValue = 0;
        strength = 0;
        hibernates = false;
        isNocturnal = false;

    }

    /**
     * Populated fields with the data read from the files. This method overrides
     * a method of the CSVReader parent class and is therefore called after reading the data.
     *
     * @param extractedData (String[]) The data read.
     */
    protected void populateFields(String[] extractedData)
    {
        if (extractedData.length != 12) {
            errorThrower.throwMessage("Animal .csv issue, please restart.");
        }
        name = extractedData[0];
        if (extractedData[1].equals(TRUE_SYMBOL)) {
            isPredator = true;
        }
        maximumTemperature = Integer.valueOf(extractedData[2]);
        minimumTemperature = Integer.valueOf(extractedData[3]);
        maximumAge = Integer.valueOf(extractedData[4]);
        breedingAge = Integer.valueOf(extractedData[5]);
        breedingProbability = Double.valueOf(extractedData[6]);
        maxLitterSize = Integer.valueOf(extractedData[7]);
        nutritionalValue = Integer.valueOf(extractedData[8]);
        strength = Integer.valueOf(extractedData[9]);
        if (extractedData[10].equals(TRUE_SYMBOL)) {
            hibernates = true;
            // By default, value is false
        }
        if (extractedData[11].equals(TRUE_SYMBOL)) {
            isNocturnal = true;
            // By default, value is false
        }
    }

    /**
     * Set all parameters back to their initial values before reading data for another animal.
     */
    protected void resetParameters()
    {
        isPredator = false;
        name = null;
        maximumTemperature = 0;
        minimumTemperature = 0;
        maximumAge = 0;
        breedingAge = 0;
        breedingProbability = 0;
        maxLitterSize = 0;
        nutritionalValue = 0;
        strength = 0;
        hibernates = false;
        isNocturnal = false;

    }

    /**
     * @return (String) The name of the file containing habitat data.
     */
    protected String getFileName() {
        return FILE_NAME;
    }

    /**
     * @return (String) The animal's name.
     */
    public String getName() {
        return name;
    }

    /**
     * @return (double) Probability that the animal breeds at a given step.
     */
    public double getBreedingProbability() {
        return breedingProbability;
    }

    /**
     * @return (int) Maximum age animal can live for.
     */
    public int getMaximumAge() {
        return maximumAge;
    }

    /**
     * @return (int) Maximum temperature animal can survive to.
     */
    public int getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * @return (int) Minimum age for animal to start breeding.
     */
    public int getBreedingAge() {
        return breedingAge;
    }

    /**
     * @return (int) Minimum temperature animal can survive to.
     */
    public int getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * @return (int) Maximum litter size brought by animal in one reproduction.
     */
    public int getMaxLitterSize() {
        return maxLitterSize;
    }

    /**
     * @return (int) Nutritional value brought when animal is eaten.
     */
    public int getNutritionalValue() {
        return nutritionalValue;
    }

    /**
     * @return (int) Animal's strength (0 if not a predator).
     */
    public int getStrength() {
        return strength;
    }

    /**
     * @return (boolean) If animal is a predator.
     */
    public boolean isPredator() {
        return isPredator;
    }

    /**
     * @return (boolean) Whether or not animal can hibernate.
     */
    public boolean canHibernate() {
        return hibernates;
    }

    /**
     * @return (boolean) Whether or not animal is nocturnal.
     */
    public boolean isNocturnal()
    {
        return isNocturnal;
    }
}
