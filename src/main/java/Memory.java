import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Memory {
    private static final Memory INSTANCE = new Memory();
    private Memory() {}
    public static Memory getInstance() { return INSTANCE; }

    private Set<String> listVarSet = new HashSet<>();
    private Set<String> elementVarSet = new HashSet<>();
    private List<Set<String>> stack = new ArrayList<>();
    private Set<String> functionSet = new HashSet<>();

    public void incrementStack() {
        Set<String> set = new HashSet<>();
        stack.add(set);
    }
    public void decrementStack() {
        for (String s : stack.get(stack.size() - 1)) {
            listVarSet.remove(s);
            elementVarSet.remove(s);
        }
        stack.remove(stack.size() - 1);
    }
    public void addElement(String var) {
        stack.get(stack.size() - 1).add(var);
        elementVarSet.add(var);
    }
    public void addList(String var) {
        stack.get(stack.size() - 1).add(var);
        listVarSet.add(var);
    }
    public boolean containsList(String var) {
        return listVarSet.contains(var);
    }
    public boolean containsElement(String var) {
        return elementVarSet.contains(var);
    }
    public void addFunction(String var) {
        functionSet.add(var);
    }
    public boolean containsFunction(String var) {
        return functionSet.contains(var);
    }
}