import java.util.Collections;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Program {
    private static final Logger LOGGER = LoggerFactory.getLogger(Program.class);

    public class Element {
        private String element;

        public Element(String element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return element;
        }
    }

    public class List {
        private java.util.List<Element> list;

        public List() {
            list = new ArrayList<>();
        }

        public List(java.util.List<Element> list) {
            this.list = list;
        }

        public List(Element[] elements) {
            this();
            Collections.addAll(list, elements);
        }

        public java.util.List<Element> getList() {
            return list;
        }

        @Override
        public String toString() {
            return list.toString();
        }

        public void clear() {
            list.clear();
        }

        public void add(Element element) {
            list.add(element);
        }

        public void add(int index, Element element) {
            list.add(index, element);
        }

        public Element get(int index) {
            return list.get(index);
        }

        public void remove(Element element) {
            list.remove(element);
        }

        public void remove(int index) {
            list.remove(index);
        }

        public boolean contains(Element element) {
            return list.contains(element);
        }

        public boolean isEmptry() {
            return list.isEmpty();
        }
    }

    public static void main(String[] args) {
        try {
            new Program().start();
        } catch (Exception e) {
            LOGGER.error("", e);
        }
    }

    private void start() throws Exception