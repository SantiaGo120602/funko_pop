package model.body_gender;

public class Male extends BodyGenderAttribute{
    private String gender = "male";
    @Override
    public String getAttribute() {
        return this.gender;
    }
}
