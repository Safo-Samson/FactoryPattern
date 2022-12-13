package Factory;

public class CaseUtilities {

    public enum CaseType{ LOWER, UPPER, TITLE, SENTENCE}

    public static String changeCase(String word, CaseType type){
        switch (type){
            case LOWER :
                return word.toLowerCase();
            case UPPER:
                return word.toUpperCase();
            case TITLE:
                return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            default:
                throw new RuntimeException("Unknown case type: " + type);
        }
    }



    public static void main(String[] args) {
        String[] strings = new String[]{"HELLO", "Goodbye","the killer pigeon", "OOPS!"};

        //todo without factories
//        for(CaseType type: CaseType.values()){
//            System.out.println("=" + type + "=");
//            for (String s: strings)
//                System.out.println(changeCase(s,type));
//            System.out.println();
//        }

        //todo using factories
        for(CaseType type: CaseType.values()){
            System.out.println("=" + type + "=");
            CaseChanger changer = CaseChangerFactory.createCaseChanger(type);
            for (String s: strings)
                System.out.println(changer.ChangeCase(s));
            System.out.println();
        }
    }

}
