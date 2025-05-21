// SudokuGame.java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SudokuGame extends Application {

    // Tamanho do tabuleiro (9x9)
    private static final int SIZE = 9;
    // Matriz de campos de texto que serão exibidos na interface
    private TextField[][] cells = new TextField[SIZE][SIZE];

    // Um tabuleiro simples (0 representa célula vazia)
    private int[][] puzzle = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();

        // Criando os campos de texto com base na matriz puzzle
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                TextField cell = new TextField();
                cell.setPrefWidth(40);
                cell.setPrefHeight(40);
                cell.setStyle("-fx-font-size: 18px; -fx-alignment: center;");

                // Se já houver um número no puzzle, fixa ele e desativa o campo
                if (puzzle[row][col] != 0) {
                    cell.setText(String.valueOf(puzzle[row][col]));
                    cell.setDisable(true);
                }

                cells[row][col] = cell;
                grid.add(cell, col, row);
            }
        }

        // Botão para validar o Sudoku
        Button validar = new Button("Validar Sudoku");
        validar.setOnAction(e -> validarSudoku());
        grid.add(validar, 0, SIZE, SIZE, 1); // Adiciona abaixo da grade

        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Sudoku - JavaFX");
        stage.show();
    }

    // Função para validar o preenchimento do Sudoku
    private void validarSudoku() {
        int[][] board = new int[SIZE][SIZE];

        // Lê os valores digitados
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                String text = cells[row][col].getText();
                if (!text.isEmpty()) {
                    try {
                        int value = Integer.parseInt(text);
                        board[row][col] = value;
                    } catch (NumberFormatException e) {
                        showAlert("Erro", "Valores inválidos no campo!");
                        return;
                    }
                } else {
                    board[row][col] = 0;
                }
            }
        }

        if (isValidSudoku(board)) {
            showAlert("Sucesso", "O Sudoku está válido!");
        } else {
            showAlert("Erro", "O Sudoku está incorreto!");
        }
    }

    // Verifica se o tabuleiro é válido
    private boolean isValidSudoku(int[][] board) {
        for (int i = 0; i < SIZE; i++) {
            boolean[] rowCheck = new boolean[SIZE + 1];
            boolean[] colCheck = new boolean[SIZE + 1];
            boolean[] boxCheck = new boolean[SIZE + 1];

            for (int j = 0; j < SIZE; j++) {
                int rowVal = board[i][j];
                int colVal = board[j][i];
                int boxVal = board[3 * (i / 3) + j / 3][3 * (i % 3) + j % 3];

                if (rowVal != 0) {
                    if (rowCheck[rowVal]) return false;
                    rowCheck[rowVal] = true;
                }
                if (colVal != 0) {
                    if (colCheck[colVal]) return false;
                    colCheck[colVal] = true;
                }
                if (boxVal != 0) {
                    if (boxCheck[boxVal]) return false;
                    boxCheck[boxVal] = true;
                }
            }
        }
        return true;
    }

    // Mostra mensagens de alerta na tela
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

