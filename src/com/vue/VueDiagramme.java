package com.vue;

import com.modele.Sujet;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;

public class VueDiagramme extends Pane implements Observateur {

    VueFabriqueClasses vueFabriqueClasses;

    public void actualiser(Sujet sujet) {
        ScrollPane scrollPane = new ScrollPane();
        this.getChildren().clear();
        scrollPane.minWidthProperty().bind(this.widthProperty());
        scrollPane.minHeightProperty().bind(this.heightProperty());
        vueFabriqueClasses = new VueFabriqueClasses();
        vueFabriqueClasses.generer(sujet, sujet.getClasses());
        scrollPane.setContent(vueFabriqueClasses);
        vueFabriqueClasses.generer(sujet, sujet.getClasses());
        this.getChildren().add(scrollPane);
    }


    public VueDiagramme() {
        super();
        this.setStyle("-fx-background-color: #ffffff");
    }

    public void export()
    {
        WritableImage img = this.snapshot(new SnapshotParameters(), null);
    }


    public VueFabriqueClasses getVueFabriqueClasses()
    {
        return this.vueFabriqueClasses;
    }
}
