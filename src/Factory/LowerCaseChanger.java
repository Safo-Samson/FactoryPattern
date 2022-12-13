package Factory;

public class LowerCaseChanger implements CaseChanger{
    @Override
    public String ChangeCase(String target) {
        return target.toLowerCase();
    }
}
