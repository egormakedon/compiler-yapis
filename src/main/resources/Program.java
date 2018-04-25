//import java.util.Collections;
//import java.util.ArrayList;
//
//public class Program {
//    public class Element {
//        private String element;
//
//        public Element(String element) {
//            this.element = element;
//        }
//
//        @Override
//        public String toString() {
//            return element;
//        }
//    }
//
//    public class List {
//        private java.util.List<Element> list;
//
//        public List() {
//            list = new ArrayList<>();
//        }
//
//        public List(java.util.List<Element> list) {
//            this.list = new ArrayList<>(list);
//        }
//
//        public java.util.List<Element> getList() {
//            return list;
//        }
//
//        @Override
//        public String toString() {
//            return list.toString();
//        }
//
//        public void clear() {
//            list.clear();
//        }
//
//        public void add(Element element) {
//            list.add(element);
//        }
//
//        public Element get(int index) {
//            return list.get(index);
//        }
//
//        public void remove(Element element) {
//            list.remove(element);
//        }
//
//        public void remove(int index) {
//            list.remove(index);
//        }
//
//        public boolean contains(Element element) {
//            return list.contains(element);
//        }
//
//        public boolean isEmpty() {
//            return list.isEmpty();
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            new Program().start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void start() throws Exception