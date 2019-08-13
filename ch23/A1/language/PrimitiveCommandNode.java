package ch23.A1.language;

// <primitive command> ::= go | right | left
public class PrimitiveCommandNode extends Node {
	private String name;

	private Executor executor;

	public void parse(Context context) throws ParseException {
		name = context.currentToken();
		context.skipToken(name);
		// �Ľ��� ��, �ش� executor�� �����.
		executor = context.createExecutor(name);
	}

	public void execute() throws ExecuteException {
		if (executor == null) {
			throw new ExecuteException(name + ": is not defined");
		} else {
			// �� ��, executor���� ������ ����Ѵ�.
			// => �׷���, executor�� execute( ) �� ����ȴ�.
			executor.execute();
		}
	}

	public String toString() {
		return name;
	}
}
