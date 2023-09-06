package model.body_attributes.body_anatomy;

import model.body_attributes.IBodyAttribute;

public abstract class BodyAnatomyAttribute implements IBodyAttribute{
    private String anatomy;
    
    @Override
    public String getAttribute() {
        return this.anatomy;
    }
    
}
