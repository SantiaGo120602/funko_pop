package model.body_skin;

import model.IBodyAttribute;

public abstract class BodySkinAttribute implements IBodyAttribute{
    private String skinColor;

    @Override
    public String getAttribute() {
        return skinColor;
    }

    
    
}
