import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;

import java.util.List;

/**
 * @author FMM
 * @version 7.0
 * @date 2021/4/15 15:04
 */
public class TestAnsi {
    public static void main(String[] args) {
        String str = "小明毕业于清华大学";
        List<Term> terms = ToAnalysis.parse(str).getTerms();
        for (Term term : terms) {
            System.out.println(term.getName() + "/");
        }
    }
}
