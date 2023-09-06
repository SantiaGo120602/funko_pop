package model.body_attributes.body_gender;

import model.body_attributes.IBodyAttribute;

public class BodyGenderAttribute implements IBodyAttribute{
    private String gender;

    @Override
    public String getAttribute() {
        return this.gender;
    }
}
