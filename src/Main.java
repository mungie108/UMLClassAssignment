import java.util.Random;

// attack while loop aka main game loop
public class Main {
    public static void main(String[] args) {

        Random rng = new Random();
        StarShip a = new Constitution("Enterprise");
        StarShip b = new BirdOfPrey("Klingon Raider");

        System.out.println("StarShip Fight");

        while (a.alive() && b.alive()) {

            ((CombatShip)a).attack(rng, b);
            if (!b.alive()) break;
            ((CombatShip)b).attack(rng, a);

            System.out.printf("Status: %s[%d] vs %s[%d]\n", a.name, a.hull, b.name, b.hull);
            System.out.println();
        }
        System.out.println((a.alive() ? a.name : b.name) + " wins!");
    }
}