import com.Hashtables.ClosedHashTable;
import com.Hashtables.OpenHashTable;

public class Main {
    public static void main(String[] args) {

/*        ClosedHashTable theFunc1 = new ClosedHashTable(3);
        theFunc1.addBy("2","2");
        theFunc1.displayTheStack();
        theFunc1.addBy("5","5");
        theFunc1.displayTheStack();
        theFunc1.addBy("8", "8");
        theFunc1.displayTheStack();
        theFunc1.addBy("1", "1");
        theFunc1.displayTheStack();
        theFunc1.addBy("10", "10");
        theFunc1.displayTheStack();
        theFunc1.addBy("11", "11");
        theFunc1.displayTheStack();
        theFunc1.addBy("24", "24");
        theFunc1.displayTheStack();*/
        OpenHashTable theFunc2 = new OpenHashTable(3);
        theFunc2.addByKey("1");
        theFunc2.displayTheStack();
        theFunc2.addByKey("2");
        theFunc2.displayTheStack();
        theFunc2.addByKey("3");
        theFunc2.displayTheStack();
        theFunc2.addByKey("4");
        theFunc2.displayTheStack();
        theFunc2.addByKey("5");
        theFunc2.displayTheStack();
        theFunc2.addByKey("7");
        theFunc2.displayTheStack();
        theFunc2.deleteKey("4");
        theFunc2.displayTheStack();
        theFunc2.deleteKey("1");
        theFunc2.displayTheStack();
        theFunc2.deleteKey("5");
        theFunc2.displayTheStack();
        theFunc2.deleteKey("3");
        theFunc2.displayTheStack();
        theFunc2.findKey("7");
        theFunc2.findKey("3");
    }
}
