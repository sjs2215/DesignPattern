public class NoonState implements State {
    private static NoonState singleton = new NoonState();
    private NoonState() {                                // �����ڴ� private
    }
    public static State getInstance() {                 // ������ �ϳ��� �ν��Ͻ��� ��´�.
        return singleton;
    }
    public void doClock(Context context, int hour) {    // �ð� ����
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        } else if (9 <= hour && hour < 12 || 13 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }
    public void doUse(Context context) {                // �ݰ� ���
        context.callSecurityCenter("���:���ɽð� ���� �ݰ���!");
    }
    public void doAlarm(Context context) {              // ���
        context.callSecurityCenter("���(���ɽð� ��)");
    }
    public void doPhone(Context context) {              // �Ϲ���ȭ
        context.recordLog("���ɽð�  ���� ��ȭ ����");
    }
    public String toString() {                          // ���ڿ� ǥ��
        return "[���ɽð� ��]";
    }
}
