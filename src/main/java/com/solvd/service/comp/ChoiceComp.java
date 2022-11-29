package com.solvd.service.comp;

public class ChoiceComp {
    public Comp choiceCompModel(String compModel) {
            switch (compModel) {
                case "note":
                    return new Notebook();
                case "desk":
                    return new DesktopComp();
                case "mono":
                    return new Monoblock();
                default:
                    return null;
            }
    }
}
