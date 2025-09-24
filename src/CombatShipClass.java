// Hierarchy showing child inheritance - CombatShip as a child of StarShip
class Constitution extends CombatShip {
    Constitution(String name) { super(name, 50, 10); }
}

// child of child
class BirdOfPrey extends CombatShip {
    BirdOfPrey(String name) { super(name, 40, 12); }
}