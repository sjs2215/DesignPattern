package ch23.Sample;

// <primitive command> ::= go | right | left���� < primitive command >�� ��Ÿ��
// ��: go
public class PrimitiveCommandNode extends Node {
	private String name;

	// �ٸ� parse( ) �޼ҵ带 ȣ������ �ʴ´�.
	public void parse(Context context) throws ParseException {
		name = context.currentToken();
		// ���� ��ū�� name�ϰ� ������ Ȯ���ϰ� ���� ��ū���� �ǳʶ���.
		context.skipToken(name); 
		// ���� ��ū�� ��go��, ��right��, ��left�� �߿� �ϳ��� �ƴϸ�, 
		if (!name.equals("go") && !name.equals("right") && !name.equals("left")) { 
			throw new ParseException(name + " is undefined"); // ���ܸ� �߻���Ų��.
		}
	}

	public String toString() {
		return name;
	}
}
