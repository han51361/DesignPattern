package Weapon;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() {

    }
    public void changeWeapon(){
        weaponBehavior.useWeapon();
        //행동 클래스에게 위임
    }

    public abstract void perFormIntroduce();

    public void setWeapon(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior ;//무기를 정한다.
    }
}
