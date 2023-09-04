package model.body_gender;

import model.IBodyAttribute;

public class BodyGenderAttribute implements IBodyAttribute{
    private String gender;

    @Override
    public String getAttribute() {
        return this.gender;
    }
}
