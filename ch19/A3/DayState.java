public class DayState implements State {
    private static DayState singleton = new DayState();
    private DayState() {                                // �����ڴ� private
    }
    public static State getInstance() {                 // ������ �ϳ��� �ν��Ͻ��� ��´�
        return singleton;
    }
    public void doClock(Context context, int hour) {    // �ð�����
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        } else if (12 <= hour && hour < 13) {                   
            context.changeState(NoonState.getInstance());       
        }                                                       
    }
    public void doUse(Context context) {                // �ݰ���
        context.recordLog("�ݰ���(�ְ�)");
    }
    public void doAlarm(Context context) {              //  ���
        context.callSecurityCenter("���(�ְ�)");
    }
    public void doPhone(Context context) {              // �Ϲ� ��ȭ
        context.callSecurityCenter("�Ϲ� ��ȭ(�ְ�))");
    }
    public String toString() {                          //���ڿ� ǥ��
        return "[�ְ�]";
    }
}
