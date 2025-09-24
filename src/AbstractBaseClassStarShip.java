// 1) ABSTRACT base class
abstract class StarShip {
    String name;
    int hull, phasers;

    StarShip(String name, int hull, int phasers) {
        this.name = name; this.hull = hull; this.phasers = phasers;
    }
    boolean alive() { return hull > 0; }
}