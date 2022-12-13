package Factory;

public class TitleCaseChanger implements CaseChanger{
    @Override
    public String ChangeCase(String target) {
        String[] words = target.split(" ");
        for(int i = 0; i<words.length;i++){
            if(words[i].length() > 0){
                words[i] = words[i].substring(0,1).toUpperCase() +
                           words[i].substring(1).toLowerCase();
            }
        }
        StringBuilder builder = new StringBuilder(target.length());
        for(int i=0;i<words.length;i++){
            if(i>0){
                builder.append(" "); // separating the sentence
            }
            builder.append(words[i]);
        }
        return builder.toString();
    }
}
