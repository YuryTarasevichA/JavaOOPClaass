package org.example.Lesson5.Task2.PhoneBook.UI;

public class NewConsoleView extends ConsoleView {

    public NewConsoleView() {
        super();
    }

    @Override
    public void setDescription(String value) {
        super.setDescription(value);
        System.out.println();
    }

}
