import org.example.model.DocInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/17 9:33
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<DocInfo> list = init();
        DocInfo doc = new DocInfo();
        doc.setId(1);
        doc.setTitle("A");
        System.out.println(list.contains(doc));
    }

    private static List<DocInfo> init() {
        ArrayList<DocInfo> docInfos = new ArrayList<>();
        DocInfo doc1 = new DocInfo();
        doc1.setId(1);
        doc1.setTitle("A");
        DocInfo doc2 = new DocInfo();
        doc2.setId(2);
        doc2.setTitle("B");
        DocInfo doc3 = new DocInfo();
        doc3.setId(3);
        doc3.setTitle("C");
        DocInfo doc4 = new DocInfo();
        doc4.setId(4);
        doc4.setTitle("D");
        docInfos.add(doc1);
        docInfos.add(doc2);
        docInfos.add(doc3);
        docInfos.add(doc4);
        return docInfos;
    }
}
