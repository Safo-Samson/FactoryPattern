package Factory;

public class UpperCaseChanger implements CaseChanger{
    @Override
    public String ChangeCase(String target) {
        return target.toUpperCase();
    }
}
