import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Memory {
    private static final Memory INSTANCE = new Memory();
    private Memory() {}
    public static Memory getInstance() { return INSTANCE; }

    public enum TypeBlock {
        FUNCTION, NON_FUNCTION
    }
    private TypeBlock t = TypeBlock.NON_FUNCTION;
    public void setTypeBlock(TypeBlock t) {
        this.t = t;
    }
    public TypeBlock getTypeBlock() {
        return t;
    }

    private List<Set<String>> stack = new ArrayList<>();
    public void incrementStack() {
        Set<String> set = new HashSet<>();
        stack.add(set);
    }
    public void decrementStack() {
        for (String s : stack.get(stack.size() - 1)) {
            totalVarSet.remove(s);
        }
        stack.remove(stack.size() - 1);
    }

    private Set<String> totalVarSet = new HashSet<>();
    public void addVar(String var) {
        totalVarSet.add(var);
        stack.get(stack.size() - 1).add(var);
    }
    public boolean containsVar(String var) { return totalVarSet.contains(var); }
    public boolean canUse(String var) { return stack.get(stack.size() - 1).contains(var); }

    private Set<String> funcSet = new HashSet<>();
    public void addFunc(String func) { funcSet.add(func); }
    public boolean containsFunc(String func) { return funcSet.contains(func); }
}