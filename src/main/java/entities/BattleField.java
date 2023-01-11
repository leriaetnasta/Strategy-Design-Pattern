package entities;

public class BattleField {
    public static void main(String[] args) {
        StarwarsCharacter starwarsCharacter=new StarwarsCharacter("Jedi",new Lightsaber());
        starwarsCharacter.playerAttack();
        starwarsCharacter.setWeapon(new Blaster());
        starwarsCharacter.playerAttack();

    }
}
