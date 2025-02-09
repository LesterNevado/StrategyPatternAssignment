public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new KnightAttack(), new KnightDefense());
        knight.attack();
        knight.defend();

        System.out.println();

        Character wizard = new Character(new WizardAttack(), new WizardDefense());
        wizard.attack();
        wizard.defend();

        System.out.println();
        
        Character archer = new Character(new ArcherAttack(), new ArcherDefense());
        archer.attack();
        archer.defend();
    }
}