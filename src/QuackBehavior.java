public interface QuackBehavior {
    // 오리가 우는 관련된 행동에 대해 반드시 구현해야 하는 quack() 메소드가 들어있는 인터페이스
    // 인터페이스를 통해 상속을 쓸 때 떠안게 되는 부담을 지지 않아도 재사용의 장점을 그대로 누릴수 있다/
    void quack();
}
