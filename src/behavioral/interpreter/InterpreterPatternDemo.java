package behavioral.interpreter;

public class InterpreterPatternDemo {

    public static Expression getMaleExpression() {
        TerminalExpression john = new TerminalExpression("John");
        TerminalExpression jack = new TerminalExpression("Jack");
        return new OrExpression(jack, john);
    }

    public static Expression getMarriedWomanExpression() {
        TerminalExpression julie = new TerminalExpression("Julie");
        TerminalExpression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
