package com.beans.UI;

public class LightUIFactory implements UIFactory {
    public Button createStyledButton() {
        return new LightButton();
    }

    public NavBar createNavBar() {
        return new LightNavBar();
    }
}