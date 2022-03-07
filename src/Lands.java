import javax.swing.*;
import java.util.*;

public class Lands {
    String[][] map = new String[10][9];
    Humans human = new Humans();
    Goblins goblin = new Goblins();

    public Lands(){

    }

    public String[][] createMap() {
        for (int row = 0; row < 10; row++) {
            for (int column = 0; column < 9; column++) {
                if(row==0){
                    map[row][column]=" ";
                    if(column==4)
                        map[row][column]=">>>Enchanted Forest<<<";
                }
                else if(column==0){
                    map[row][column]="| ";
                }
                else if(column==map[column].length-1)
                {
                    map[row][column]=" |";
                }
                else if (row == 1) {
                    map[row][column] =" - ";
                }
                else if(row==map[row].length)
                {
                    map[row][column] =" - ";
                }
                else map[row][column]=" ~ ";
            }
        }
        return map;
    }

    public void printMap() {
            map[goblin.getRow()][goblin.getColumn()] = " g ";
            map[human.getRow()][human.getColumn()]=" H ";
            for (String[] strings : map) {
                for (String string : strings) {
                    System.out.print(string);
                }
            System.out.println();
        }
    }





    @Override
    public String toString() {
        return "Location: Enchanted Forest";
    }
}
