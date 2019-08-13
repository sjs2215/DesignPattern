package ch23.A1.language;

public class InterpreterFacade {
    private ExecutorFactory factory;
    private Context context;
    private Node programNode;
    public InterpreterFacade(ExecutorFactory factory) {
        this.factory = factory;
    }
    
    // ProgramNode��ü�� parse( ) ȣ��
    public boolean parse(String text) {
        boolean ok = true;
        this.context = new Context(text);
        this.context.setExecutorFactory(factory);
        this.programNode = new ProgramNode();
        try {
            programNode.parse(context);
            System.out.println("" + programNode);
        } catch (ParseException e) {
            e.printStackTrace();
            ok = false;
        }
        return ok;
    }
    
    // ProgramNode��ü�� execute( ) ȣ��
    public boolean execute() {
        boolean ok = true;
        try {
            programNode.execute();
        } catch (ExecuteException e) {
            e.printStackTrace();
            ok = false;
        }
        return ok;
    }
}
