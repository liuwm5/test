package patternState;
/**
 * 状态模式
 * @author liuweimin
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		State state = new ConcreteStateB();
		Context context = new Context();
		context.setState(state);
		context.request("test");
	}

}
