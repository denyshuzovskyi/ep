package controller.commands;

import service.ServiceBooks;
import util.InputUtility;
import util.ResourceManager;
import util.Validator;
import view.BookView;

public class SearchBooksByAuthor extends Command{
    private ResourceManager manager;
    private ServiceBooks serviceBooks;
    private BookView view;
    private InputUtility inputUtility;

    public SearchBooksByAuthor(ResourceManager manager, ServiceBooks serviceBooks, BookView view, InputUtility inputUtility) {
        this.manager = manager;
        this.serviceBooks = serviceBooks;
        this.view = view;
        this.inputUtility = inputUtility;
    }

    @Override
    public void execute() {
        view.printMessage(serviceBooks.searchBooksByAuthor(inputUtility.inputString(manager.getMessage("INPUT_STRING_DATA"), manager.getMessage("WRONG_INPUT_DATA"), Validator.TEXT)));
    }
}
