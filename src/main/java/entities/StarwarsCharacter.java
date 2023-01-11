package entities;


public class StarwarsCharacter {
    String name;
    IWeapon weapon;
    public StarwarsCharacter(String name, IWeapon weapon){
        this.name=name;
        this.weapon=weapon;
    }
    public void playerAttack(){
        System.out.println(name+ " is now using "+weapon.attack());

    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }
}
