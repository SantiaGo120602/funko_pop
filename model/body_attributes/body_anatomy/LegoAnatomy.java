package model.body_attributes.body_anatomy;

public class LegoAnatomy extends BodyAnatomyAttribute{
    private String anatomy = "lego";
    
    @Override
    public String getAttribute() {
        return this.anatomy;
    }
}
