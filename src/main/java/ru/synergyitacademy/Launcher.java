package ru.synergyitacademy;

import ru.synergyitacademy.util.InputChecker;
import ru.synergyitacademy.util.ResourceUtil;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * This funny java-program tries to predict the digit which is randomly chosen by computer/jvm.
 */
public class Launcher {

    /**
     * Minimum threshold for randomizer
     */
    private static final Integer MIN_BOUND = 1;

    /**
     * Maximum threshold for randomizer
     */
    private static final Integer MAX_BOUND = 5;

    /**
     * Main method which starts this program
     * @param args      input parameters which can be defined in command line during running
     */
    public static void main(String[] args) throws Exception {
        System.out.println(ResourceUtil.getText("startTitle.alt"));
        int attempts = 1; // the first attempt
        final int computerDigit = new Random().nextInt(MAX_BOUND + 1);
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            // I should get the user number from console
            int inputDigit;
            try {
                inputDigit = scanner.nextInt();
                if (InputChecker.inRange(inputDigit, MIN_BOUND, MAX_BOUND)) {
                    if (inputDigit == computerDigit) {
                        //Good job
                        break;
                    }
                }
                else {
                    System.out.printf(ResourceUtil.getText("input.incorrectIntValue.alt"), MIN_BOUND, MAX_BOUND);
                }
            }
            catch (InputMismatchException ime) {
                System.out.printf(ResourceUtil.getText("input.prohibitedValue.alt"), MIN_BOUND, MAX_BOUND);
                scanner.next(); // to make it possible for ask new input
            }
            attempts++;
            System.out.println(ResourceUtil.getText("tryAgain.alt"));
        }
        System.out.printf(ResourceUtil.getText("success.alt"), attempts, computerDigit);
        scanner.close();
    }
}
