package com.beans;
import com.beans.UI.*;

public class Main {
    public static void main(String[] args) {
        // Cambia entre DarkUIFactory y LightUIFactory según el tema
        UIFactory factory = new DarkUIFactory(); // Puedes cambiar a LightUIFactory

        Button button = factory.createStyledButton();
        NavBar navBar = factory.createNavBar();

        button.render();
        navBar.render();
    }
}