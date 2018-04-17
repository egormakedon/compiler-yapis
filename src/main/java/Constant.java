public class Constant {
    public static final String PROGRAM = "import java.util.Collections;\n" +
            "import java.util.ArrayList;\n" +
            "\n" +
            "public class Program {\n" +
            "    public class Element {\n" +
            "        private String element;\n" +
            "\n" +
            "        public Element(String element) {\n" +
            "            this.element = element;\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        public String toString() {\n" +
            "            return element;\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public class List {\n" +
            "        private java.util.List<Element> list;\n" +
            "\n" +
            "        public List() {\n" +
            "            list = new ArrayList<>();\n" +
            "        }\n" +
            "\n" +
            "        public List(java.util.List<Element> list) {\n" +
            "            this.list = list;\n" +
            "        }\n" +
            "\n" +
            "        public List(Element[] elements) {\n" +
            "            this();\n" +
            "            Collections.addAll(list, elements);\n" +
            "        }\n" +
            "\n" +
            "        public java.util.List<Element> getList() {\n" +
            "            return list;\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        public String toString() {\n" +
            "            return list.toString();\n" +
            "        }\n" +
            "\n" +
            "        public void clear() {\n" +
            "            list.clear();\n" +
            "        }\n" +
            "\n" +
            "        public void add(Element element) {\n" +
            "            list.add(element);\n" +
            "        }\n" +
            "\n" +
            "        public void add(int index, Element element) {\n" +
            "            list.add(index, element);\n" +
            "        }\n" +
            "\n" +
            "        public Element get(int index) {\n" +
            "            return list.get(index);\n" +
            "        }\n" +
            "\n" +
            "        public void remove(Element element) {\n" +
            "            list.remove(element);\n" +
            "        }\n" +
            "\n" +
            "        public void remove(int index) {\n" +
            "            list.remove(index);\n" +
            "        }\n" +
            "\n" +
            "        public boolean contains(Element element) {\n" +
            "            return list.contains(element);\n" +
            "        }\n" +
            "\n" +
            "        public boolean isEmptry() {\n" +
            "            return list.isEmpty();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public static void main(String[] args) {\n" +
            "        try {\n" +
            "            new Program().start();\n" +
            "        } catch (Exception e) {\n" +
            "            e.printStackTrace();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    private void start() throws Exception";
}