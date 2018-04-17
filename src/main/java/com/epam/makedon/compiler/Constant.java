package com.epam.makedon.compiler;

public class Constant {
    public static final String PROGRAM = "import java.util.Collections;\n" +
            "import java.util.ArrayList;\n" +
            "import org.slf4j.Logger;\n" +
            "import org.slf4j.LoggerFactory;\n" +
            "\n" +
            "public class Program {\n" +
            "    private static final Logger LOGGER = LoggerFactory.getLogger(Program.class);\n" +
            "\n" +
            "    public static void main(String[] args) {\n" +
            "        try {\n" +
            "            new Program().start();\n" +
            "        } catch (Exception e) {\n" +
            "            LOGGER.error(\"\", e);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    private void start() throws Exception";

    public static final String ELEMENT = "public class Element {\n" +
            "    private String element;\n" +
            "\n" +
            "    public Element() {}\n" +
            "\n" +
            "    public Element(String element) {\n" +
            "        this.element = element;\n" +
            "    }\n" +
            "\n" +
            "    public void setElement(String element) {\n" +
            "        this.element = element;\n" +
            "    }\n" +
            "\n" +
            "    public String getElement() {\n" +
            "        return element;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public String toString() {\n" +
            "        return element;\n" +
            "    }\n" +
            "}";

    public static final String LIST = "public class List {\n" +
            "    private java.util.List<Element> list = new ArrayList<>();\n" +
            "\n" +
            "    public List() {}\n" +
            "\n" +
            "    public List(java.util.List<Element> list) {\n" +
            "        this.list = list;\n" +
            "    }\n" +
            "\n" +
            "    public List(Element[] elements) {\n" +
            "        Collections.addAll(list, elements);\n" +
            "    }\n" +
            "\n" +
            "    public void setList(java.util.List<Element> list) {\n" +
            "        this.list = list;\n" +
            "    }\n" +
            "\n" +
            "    public void setList(Element[] elements) {\n" +
            "        Collections.addAll(list, elements);\n" +
            "    }\n" +
            "\n" +
            "    public java.util.List<Element> getList() {\n" +
            "        return list;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public String toString() {\n" +
            "        return list.toString();\n" +
            "    }\n" +
            "\n" +
            "    public void clear() {\n" +
            "        list.clear();\n" +
            "    }\n" +
            "\n" +
            "    public void add(Element element) {\n" +
            "        list.add(element);\n" +
            "    }\n" +
            "\n" +
            "    public void add(int index, Element element) {\n" +
            "        list.add(index, element);\n" +
            "    }\n" +
            "\n" +
            "    public Element get(int index) {\n" +
            "        return list.get(index);\n" +
            "    }\n" +
            "\n" +
            "    public void remove(Element element) {\n" +
            "        list.remove(element);\n" +
            "    }\n" +
            "\n" +
            "    public void remove(int index) {\n" +
            "        list.remove(index);\n" +
            "    }\n" +
            "\n" +
            "    public int size() {\n" +
            "        return list.size();\n" +
            "    }\n" +
            "\n" +
            "    public boolean contains(Element element) {\n" +
            "        return list.contains(element);\n" +
            "    }\n" +
            "\n" +
            "    public boolean isEmptry() {\n" +
            "        return list.isEmpty();\n" +
            "    }\n" +
            "}";
}
