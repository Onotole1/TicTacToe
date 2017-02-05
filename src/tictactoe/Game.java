/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author anatoliy
 */
public class Game {
    
    //Игровое поле в виде матрицы
    private int[][][] field = new int[3][3][1];
  
    public static enum ORDER {
        TIC(79), //Нолик
        TAC(88); //Крестик
        
        public int value;
        ORDER(int value) {
            this.value = value;
        }
    }
    
    ORDER currentOrder = ORDER.TAC;
    
    //Состояния объекта game
    static enum STATUS {
        STARTED,
        FINISHED_TIC,
        FINISHED_TAC,
        FINISHED_STANDOFF,
        CHECKED
    }
    
    private STATUS currentState = STATUS.STARTED;
    
    public Game() {
        InitGameTable();
    }
    
    private void InitGameTable() {
       for (int x = 0; x < 3; x++) {
           for (int y = 0; y < 3; y++) {
               field[x][y][0] = 0;
           }
       }
    }
    
    /**
     * Заполнение массива в зависимости от переданных параметров
     * @param x - номер строки
     * @param y - номер столбца
     */
    public void gameStep(int x, int y) {
        if (x == 0 && y == 0 && field[x][y][0] == 0) {
                field[x][y][0] = currentOrder.value;
            }
            if (x == 0 && y == 1 && field[x][y][0] == 0) {
                field[x][y][0] = currentOrder.value;
            }
            if (x == 0 && y == 2 && field[x][y][0] == 0) {
                field[x][y][0] = currentOrder.value;
            }
            if (x == 1 && y == 0 && field[x][y][0] == 0) {
                field[x][y][0] = currentOrder.value;
            }
            if (x == 1 && y == 1 && field[x][y][0] == 0) {
                field[x][y][0] = currentOrder.value;
            }
            if (x == 1 && y == 2 && field[x][y][0] == 0) {
                field[x][y][0] = currentOrder.value;
            }
            if (x == 2 && y == 0 && field[x][y][0] == 0) {
                field[x][y][0] = currentOrder.value;
            }
            if (x == 2 && y == 1 && field[x][y][0] == 0) {
                field[x][y][0] = currentOrder.value;
            }
            if (x == 2 && y == 2 && field[x][y][0] == 0) {
                field[x][y][0] = currentOrder.value;
            }
            checkWinner();
            currentState = checkForStandOff();
    }
    
    /**
     * Ход компьютера. Последовательно вызываются различные алгоритмы ИИ
     */
    public void compStep() {
        changeOrder();
        checkRowsForStepToWin();
        checkColumnsForStepToWin();
        checkDiagonalsForStepToWin();
        checkRowsForNoLose();
        checkColumnsForNoLose();
        checkDiagonalsForNoLose();
        stepUp();
        changeOrder();
        checkWinner();
        if (currentState != STATUS.FINISHED_TIC && currentState != STATUS.FINISHED_TAC)
            currentState = checkForStandOff();
    }
    
    private void checkWinner() {
        checkRowsForWin();
        checkColumnsForWin();
        checkDiagonalsForWin();
    }
    
    /**
     * Выбор центральной, либо угловой, либо любой оставшейся свободной точки
     */
    private void stepUp() {
        if (currentState != STATUS.STARTED) return; 
        if (field[1][1][0] == 0) {
            gameStep(1, 1);
            currentState = STATUS.CHECKED;
            return;
        }
        for (int i = 0; i <= 2; i+=2) {
            for (int j = 0; j <= 2; j+=2) {
                if (field[i][j][0] == 0) {
                    gameStep(i, j);
                    currentState = STATUS.CHECKED;
                    return;
                }
            }
        }
        if (field[0][1][0] == 0) {
            gameStep(0, 1);
            currentState = STATUS.CHECKED;
        }
        else if (field[1][2][0] == 0) {
            gameStep(1, 2);
            currentState = STATUS.CHECKED;
        }
        else if (field[2][1][0] == 0) {
            gameStep(2, 1);
            currentState = STATUS.CHECKED;
        }
        else if (field[1][0][0] == 0) {
            gameStep(1, 0);
            currentState = STATUS.CHECKED;
        }
    }
    
    /**
     * Узнать Ascii код опонента
     * @return - Ascii код 79, либо 88
     */
    private int getOpponent(){
        return (currentOrder == ORDER.TIC ? ORDER.TAC : ORDER.TIC).value;
    }
    
    /**
     * Изменить порядок игры. Игроки меняются (крестики на нолики)
     */
    public void changeOrder(){
        currentOrder = (currentOrder == ORDER.TIC ? ORDER.TAC : ORDER.TIC);
        currentState = STATUS.STARTED;
    }
    
    /**
     * Рассмотреть варианты хода по строкам с избеганием проигрыша
     */
    private void checkRowsForNoLose() {
        if (currentState != STATUS.STARTED)
            return;
        for (int i = 0; i < 3; i++) {
            if (field[i][0][0] + field[i][1][0] == getOpponent()*2 && field[i][2][0] == 0) {
                gameStep(i, 2);
                currentState = STATUS.CHECKED;
                return;
            }
            else if (field[i][2][0] + field[i][1][0] == getOpponent()*2 && field[i][0][0] == 0) {
                gameStep(i, 0);
                currentState = STATUS.CHECKED;
                return;
            }
            else if (field[i][0][0] + field[i][2][0] == getOpponent()*2 && field[i][1][0] == 0) {
                gameStep(i, 1);
                currentState = STATUS.CHECKED;
                return;
            }
        }
    }
    /**
     * Рассмотреть варианты хода по колонкам с избеганием проигрыша
     */
    private void checkColumnsForNoLose() {
        if (currentState != STATUS.STARTED)
            return;
        for (int i = 0; i < 3; i++) {
            if (field[0][i][0] + field[1][i][0] == getOpponent()*2 && field[2][i][0] == 0) {
                gameStep(2, i);
                currentState = STATUS.CHECKED;
                return;
            }
            else if (field[0][i][0] + field[2][i][0] == getOpponent()*2 && field[1][i][0] == 0) {
                gameStep(1, i);
                currentState = STATUS.CHECKED;
                return;
            }
            else if (field[1][i][0] + field[2][i][0] == getOpponent()*2 && field[0][i][0] == 0) {
                gameStep(0, i);
                currentState = STATUS.CHECKED;
                return;
            }
        }
    }
    
    /**
     * Рассмотреть варианты хода по диагонали с избеганием проигрыша
     */
    private void checkDiagonalsForNoLose() {
        if (currentState != STATUS.STARTED)
            return;
        if (field[0][0][0] + field[1][1][0] == getOpponent()*2 && field[2][2][0] == 0) {
            gameStep(2, 2);
            currentState = STATUS.CHECKED;
        }
        else if (field[2][2][0] + field[1][1][0] == getOpponent()*2 && field[0][0][0] == 0) {
            gameStep(0, 0);
            currentState = STATUS.CHECKED;
        }
        else if (field[2][2][0] + field[0][0][0] == getOpponent()*2 && field[1][1][0] == 0) {
            gameStep(1, 1);
            currentState = STATUS.CHECKED;
        }
        else if (field[2][0][0] + field[1][1][0] == getOpponent()*2 && field[0][2][0] == 0) {
            gameStep(0, 2);
            currentState = STATUS.CHECKED;
        }
        else if (field[1][1][0] + field[0][2][0] == getOpponent()*2 && field[2][0][0] == 0) {
            gameStep(2, 0);
            currentState = STATUS.CHECKED;
        }
        else if (field[2][0][0] + field[0][2][0] == getOpponent()*2 && field[1][1][0] == 0) {
            gameStep(1, 1);
            currentState = STATUS.CHECKED;
        }
    }
    
    /**
     * Варианты хода по строкам с целью победы
     */
    private void checkRowsForStepToWin() {
        if (currentState != STATUS.STARTED)
            return;
        for (int i = 0; i < 3; i++) {
            if (field[i][0][0] + field[i][1][0] == currentOrder.value*2 && field[i][2][0] == 0) {
                gameStep(i, 2);
                currentState = STATUS.CHECKED;
                return;
            }
            else if (field[i][2][0] + field[i][1][0] == currentOrder.value*2 && field[i][0][0] == 0) {
                gameStep(i, 0);
                currentState = STATUS.CHECKED;
                return;
            }
            else if (field[i][0][0] + field[i][2][0] == currentOrder.value*2 && field[i][1][0] == 0) {
                gameStep(i, 1);
                currentState = STATUS.CHECKED;
                return;
            }
        }
    }
    
    /**
     * Варианты хода по столбцам с целью победы
     */
    private void checkColumnsForStepToWin() {
        if (currentState != STATUS.STARTED)
            return;
        for (int i = 0; i < 3; i++) {
            if (field[0][i][0] + field[1][i][0] == currentOrder.value*2 && field[2][i][0] == 0) {
                gameStep(2, i);
                currentState = STATUS.CHECKED;
                return;
            }
            else if (field[0][i][0] + field[2][i][0] == currentOrder.value*2 && field[1][i][0] == 0) {
                gameStep(1, i);
                currentState = STATUS.CHECKED;
                return;
            }
            else if (field[1][i][0] + field[2][i][0] == currentOrder.value*2 && field[0][i][0] == 0) {
                gameStep(0, i);
                currentState = STATUS.CHECKED;
                return;
            }
        }
    }
    
    /**
     * Варианты хода по диагонали с целью победы
     */
    private void checkDiagonalsForStepToWin() {
        if (currentState != STATUS.STARTED)
            return;
        if (field[0][0][0] + field[1][1][0] == currentOrder.value*2 && field[2][2][0] == 0) {
            gameStep(2, 2);
            currentState = STATUS.CHECKED;
        }
        else if (field[2][2][0] + field[1][1][0] == currentOrder.value*2 && field[0][0][0] == 0) {
            gameStep(0, 0);
            currentState = STATUS.CHECKED;
        }
        else if (field[2][2][0] + field[0][0][0] == currentOrder.value*2 && field[1][1][0] == 0) {
            gameStep(1, 1);
            currentState = STATUS.CHECKED;
        }
    }
    
    /**
     * Проверить, есть ли победитель по строкам
     */
    private void checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (field[i][0][0] + field[i][1][0] + field[i][2][0] == ORDER.TAC.value*3) {
                currentState = STATUS.FINISHED_TAC;
                return;
            }
            else if (field[i][0][0] + field[i][1][0] + field[i][2][0] == ORDER.TIC.value*3) {
                currentState = STATUS.FINISHED_TIC;
                return;
            }
        }
    }

    /**
     * Проверить, есть ли победитель по столбцам
     */
    private void checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (field[0][i][0] + field[1][i][0] + field[2][i][0] == ORDER.TAC.value*3) {
                currentState = STATUS.FINISHED_TAC;
                return;
            }
            else if (field[0][i][0] + field[1][i][0] + field[2][i][0] == ORDER.TIC.value*3) {
                currentState = STATUS.FINISHED_TIC;
                return;
            }
        }
    }

    /**
     * Проверить, есть ли победитель по диагоналям
     */
    private void checkDiagonalsForWin() {
        if (field[0][0][0] + field[1][1][0] + field[2][2][0] == ORDER.TAC.value*3 || 
            field[0][2][0] + field[1][1][0] + field[2][0][0] == ORDER.TAC.value*3)
            currentState =  STATUS.FINISHED_TAC;
        else if (field[0][0][0] + field[1][1][0] + field[2][2][0] == ORDER.TIC.value*3 || 
            field[0][2][0] + field[1][1][0] + field[2][0][0] == ORDER.TIC.value*3)
        currentState = STATUS.FINISHED_TIC;
    }

    /**
     * Проверка на ничью
     * @return - состояние объекта game
     */
    private STATUS checkForStandOff() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j][0] == 0)
                    return currentState;
            }
        }
        return STATUS.FINISHED_STANDOFF;
    }

    /**
     * Очистить ячейку
     * @param x - строка
     * @param y - столбец
     */
    private void deleteStep(int x, int y) {
        if (x == 0 && y == 0) field[x][y][0] = 0;
        if (x == 0 && y == 1) field[x][y][0] = 0;
        if (x == 0 && y == 2) field[x][y][0] = 0;
        if (x == 1 && y == 0) field[x][y][0] = 0;
        if (x == 1 && y == 1) field[x][y][0] = 0;
        if (x == 1 && y == 2) field[x][y][0] = 0;
        if (x == 2 && y == 0) field[x][y][0] = 0;
        if (x == 2 && y == 1) field[x][y][0] = 0;
        if (x == 2 && y == 2) field[x][y][0] = 0;
    }

    /**
     * Начать заново
     */
    void startAgain() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                deleteStep(i, j);
            }
        }
        if (currentOrder == ORDER.TIC)
            compStep();
        currentState = STATUS.STARTED;
    }
   
    
    public int[][][] getField() {
        return this.field;
    }
    
    public STATUS getStatus() {
        return currentState;
    }
    
    public void setOrder(ORDER order) {
        this.currentOrder = order;
    }
}
