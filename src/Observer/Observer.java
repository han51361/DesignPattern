package Observer;

import java.util.Observable;

public interface Observer {

    // 옵저버 인터페이스 모든 옵저버 클래스에서 구현해야한다.
    // 따라서 모든 옵저버는 update() 메소드를 구현해야 합니다. 여기에서는 옵저버한테 측정한 값들을 전달한다.
    // 기상 정보가 변경되었을 떄 옵저버한테 전달되는 상태 값
    public void update(Observable o,Object arg);
}
