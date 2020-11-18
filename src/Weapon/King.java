package Weapon;

public class King  extends Character{

    public King(){
        weaponBehavior = new SwordBehavoir();
        weaponBehavior.useWeapon();
    }


    @Override
    public void perFormIntroduce(){
        System.out.println("내가 왕이 될 상인");
    }
}
