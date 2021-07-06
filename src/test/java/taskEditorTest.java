

import org.junit.jupiter.api.Test;

public class taskEditorTest {
    @Test
    void editTask() {
        // choose edit
        // ask for new item title
        // ask for new description
        // ask for new due date
        // assert values into item
        // display item and check if true
    }
    @Test
    void deleteTask() {
        // generate new list with an item to be deleted
        // fill item with random values
        // show task to be deleted
        // remove the item
        // display list and check to see if it was deleted
    }
    @Test
    void isTaskChecked() {
        // check box
        // check if box has a check
        // if the box is checked you are good return
    }
    @Test
    void saveTask() {
        // generate new item to be saved
        // get each item title, description, due date
        // find if each item is completed
        // make a new file called saveTaskTest.txt
        // write item and info to file to prove it was saved
    }
    @Test
    void newTask() {
        // generate new task
        // ask for task title
        // ask for description
        // ask for due date
        // leave completed unchecked cause it is brand new
        // display new task
    }
    @Test
    void completedTask() {
        // click complete box
        // if not checked, return completed as true, because that means you just changed it from complete
        // if already checked, return completed as false because you changed it from incomplete
        // display item and completed and compare
    }
}
