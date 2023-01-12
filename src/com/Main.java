package com;

import com.controlleur.ControlleurAjouterClasse;
import com.controlleur.ControlleurDeplacerClasse;
import com.controlleur.ControlleurMenu;
import com.controlleur.ControlleurSouris;
import com.modele.Modele;
import com.vue.VueGlobal;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Main extends Application {
    public static ControlleurSouris controlleurSouris;
    public static EventHandler<MouseEvent> controllerDeplacerClasse;
    public static EventHandler<ActionEvent> controlleurMenu;
    public static ControlleurAjouterClasse controlleurAjouterClasse;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Modele modele = new Modele();
        VueGlobal vueGlobal = new VueGlobal(modele);
        controllerDeplacerClasse = new ControlleurDeplacerClasse();
        controlleurMenu = new ControlleurMenu(modele, vueGlobal);
        controlleurSouris = new ControlleurSouris(modele);
        controlleurAjouterClasse = new ControlleurAjouterClasse(modele);

        primaryStage.setTitle("Diagramme de classe");
        primaryStage.setScene(new Scene(vueGlobal, 800, 600));
        primaryStage.show();
    }
}