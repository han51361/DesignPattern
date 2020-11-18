package Weapon;

public class Queen extends Character{

    public Queen(){
        weaponBehavior = new KnifeBehavior();
        weaponBehavior.useWeapon();
    }

    @Override
    public void perFormIntroduce() {
        System.out.println("내가 이나라의 국모다.");
    }


}
