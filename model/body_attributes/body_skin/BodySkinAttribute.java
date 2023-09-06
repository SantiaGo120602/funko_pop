package model.body_attributes.body_skin;

import model.body_attributes.IBodyAttribute;

public abstract class BodySkinAttribute implements IBodyAttribute{
    private String skinColor;

    @Override
    public String getAttribute() {
        return skinColor;
    }

    
    
}
