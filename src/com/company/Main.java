package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.util.Scanner;

import static javafx.application.Application.launch;

public class Main extends Application {

    Stage BreakIt;
    Scene Dis, Dat;

    public static void main(String[] args) {
        launch(args);
    }

    // write your code her

    TableView<product> table;

    @Override
    public void start(Stage primaryStage) throws Exception {

        BreakIt = primaryStage;


        //Kollonerne
        TableColumn<product, String> nameColumn = new TableColumn<>("FakturaNr");
        nameColumn.setMinWidth(100);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("faktura"));

        //Kollonerne
        TableColumn<product, String> DateColumn = new TableColumn<>("Dato");
        DateColumn.setMinWidth(100);
        DateColumn.setCellValueFactory(new PropertyValueFactory<>("dato"));

        //Kollonerne
        TableColumn<product, String> KundeNrColumn = new TableColumn<>("Kunde Nummer");
        KundeNrColumn.setMinWidth(100);
        KundeNrColumn.setCellValueFactory(new PropertyValueFactory<>("kundenr"));

        //Kollonerne
        TableColumn<product, String> DebitorColumn = new TableColumn<>("Debitor");
        DebitorColumn.setMinWidth(100);
        DebitorColumn.setCellValueFactory(new PropertyValueFactory<>("debitor"));

        //Kollonerne
        TableColumn<product, String> NameColumn = new TableColumn<>("Navn");
        NameColumn.setMinWidth(100);
        NameColumn.setCellValueFactory(new PropertyValueFactory<>("navn"));

        //Kollonerne
        TableColumn<product, String> AdressColumn = new TableColumn<>("Adresse");
        AdressColumn.setMinWidth(100);
        AdressColumn.setCellValueFactory(new PropertyValueFactory<>("adresse"));

        //Table
        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, DateColumn, KundeNrColumn, DebitorColumn, AdressColumn);

        VBox layout = new VBox();
        layout.getChildren().addAll(table);


        Dis = new Scene(layout, 700, 300);
        //Dis.getStylesheets().add("Viper.css");

        BreakIt.setScene(Dis);
        BreakIt.show();

    }


    public ObservableList<product> getProduct() {

        TextField text = new TextField();

        Scanner scan1 = new Scanner(System.in);


        System.out.println("Indsæt informationer");


        System.out.println("Faktura nr.");
        int faktura = scan1.nextInt();

        System.out.println("Dato");
        int dato = scan1.nextInt();

        System.out.println("Kunde nummer");
        int kundenr = scan1.nextInt();

        System.out.println("Debitor");
        int debitor = scan1.nextInt();

        System.out.println("Navn");
        String navn = scan1.nextLine();

        System.out.println("Adresse");
        String adresse = scan1.nextLine();

        System.out.println("Beløb");
        double beløb = scan1.nextDouble();


        ObservableList<product> kunder = FXCollections.observableArrayList();
        //indsæt kundeinformationer her
        kunder.add(new product(faktura, dato, kundenr, debitor, navn, adresse, beløb));
        return kunder;


    }
}



