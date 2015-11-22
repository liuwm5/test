package patternState;

public class Context {
//持有一个State 类型的实例对象
	private State state;
	public void setState(State state){
		this.state = state;
	}
	/**
	 * 用户感兴趣的接口方法
	 * @param sampleParameter
	 */
	public void request(String sampleParameter){
		//转调 来处理
		state.handle(sampleParameter);
	}
}
