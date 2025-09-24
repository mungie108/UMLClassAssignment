import java.util.Random;

// Not visible to user 'class' showing inheritance
class CombatShip extends StarShip {
    CombatShip(String name, int hull, int phasers) { super(name, hull, phasers); }

    void attack(Random rng, StarShip target) {
        int dmg = rng.nextInt(phasers) + 1;
        target.hull -= dmg;
        System.out.println(name + " hits " + target.name + " for " + dmg + " damage!");
    }
}
