package xml;
import jakarta.xml.bind.JAXB;
import structure.Root;

import java.io.InputStream;
public class XML_Access {

    private static XML_Access theInstance;

    private XML_Access() {

    }

    public static XML_Access getTheInstance() {
        if (theInstance == null) {
            theInstance = new XML_Access();
        }
        return theInstance;
    }

    public static Root loadData() {
        InputStream is = Main.class.getClassLoader().getResourceAsStream("data.xml");
        Root root = JAXB.unmarshal(is, Root.class);
        return root;
    }
}

