package Factory;

import Factory.CaseUtilities.CaseType;
import java.util.HashMap;
import java.util.Map;

public class CaseChangerFactory {

    private static Map<CaseType, CaseChanger> map = new HashMap<>();
    public static CaseChanger createCaseChanger(CaseType type) {
        CaseChanger cc = map.get(type);
        if (cc == null) {
            switch (type) {
                case UPPER:
                    cc = new UpperCaseChanger();
                    break;
                case LOWER:
                    cc = new LowerCaseChanger();
                    break;
                case TITLE:
                    cc = new TitleCaseChanger();
                    break;
                case SENTENCE:
                    cc = new SentenceCaseChanger();
                    break;
            }
            map.put(type, cc);
        }
        return cc;
    }
}
