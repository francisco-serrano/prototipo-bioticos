package sample;

import javafx.fxml.FXML;

public class Controller {

    private Model model = new Model();

    @FXML
    public void click_subgrupo_1() {
        System.out.println("Click subgrupo 1");
        model.run_command("subgrupo_1");
    }

    @FXML
    public void click_subgrupo_2() {
        System.out.println("Click subgrupo 2");
        model.run_command("subgrupo_2");
    }

    @FXML
    public void click_subgrupo_3() {
        System.out.println("Click subgrupo 3");
        model.run_command("subgrupo_3");
    }

    @FXML
    public void click_subgrupo_4() {
        System.out.println("Click subgrupo 4");
        model.run_command("subgrupo_4");
    }
}
