module ies.losmontecillos.introspeccion_reflexion {
    requires javafx.controls;
    requires javafx.fxml;


    opens ies.losmontecillos.introspeccion_reflexion to javafx.fxml;
    exports ies.losmontecillos.introspeccion_reflexion;
}