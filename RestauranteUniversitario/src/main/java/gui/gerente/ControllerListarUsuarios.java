package gui.gerente;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import view.ScreenManager;
import view.TelasEnum;

public class ControllerListarUsuarios {

    @FXML
    private Button buttonAlterarUsuario;

    @FXML
    private Button buttonCadastrarUsuario;

    @FXML
    private Button buttonVoltarPagina;

    @FXML
    void bttnAlterarUsuarioOn(ActionEvent event) {
        ScreenManager.changeScreen(TelasEnum.ALTERAR_USUARIO.name());
    }

    @FXML
    void bttnCadastrarUsuarioOn(ActionEvent event) {
        ScreenManager.changeScreen(TelasEnum.CADASTRAR_USUARIO.name());
    }

    @FXML
    void bttnVoltarPaginaOn(ActionEvent event) {
        ScreenManager.changeScreen(TelasEnum.PRINCIPAL_GERENTE.name());
    }

}
