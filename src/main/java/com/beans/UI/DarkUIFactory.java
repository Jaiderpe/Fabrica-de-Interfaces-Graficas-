package com.beans.UI;

public class DarkUIFactory implements UIFactory {
    public Button createStyledButton() {
        return new DarkButton();
    }

    public NavBar createNavBar() {
        return new DarkNavBar();
    }
}