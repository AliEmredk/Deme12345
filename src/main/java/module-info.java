module dk.easvae.demo12345 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easvae.demo12345 to javafx.fxml;
    exports dk.easvae.demo12345;
}