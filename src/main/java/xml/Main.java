package xml;

import structure.Root;

public class Main {

    public static void main(String[] args) {
        Root root = XML_Access.loadData();

        System.out.println(root);
    }
}
