package model.body_attributes.body_gender;

public class Female extends BodyGenderAttribute{
    private String gender = "female";
    @Override
    public String getAttribute() {
        return this.gender;
    }
}
