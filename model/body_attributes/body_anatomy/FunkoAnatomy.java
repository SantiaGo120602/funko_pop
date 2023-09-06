package model.body_attributes.body_anatomy;

public class FunkoAnatomy extends BodyAnatomyAttribute{
    private String anatomy = "funko";
    
    @Override
    public String getAttribute() {
        return this.anatomy;
    }
}
