package view;

import org.controlsfx.control.action.Action;
import org.controlsfx.dialog.Dialogs;

/** 
 * Klasa do łatwego wywoływania róznego rodzaju okien dialogowych w różnych miejscach aplikacji
 */
public class DialogFactory {
    private final static DialogFactory ourInstance = new DialogFactory();
    
    private DialogFactory(){
    }
    
    public static DialogFactory getInstance(){
        return ourInstance;
    }
    
    /**
     * Wyświetl okno z informacją o błędzie o zadanym tytule i wiadomości
     * @param title
     * @param message 
     */
    public void showError(String title, String message){
        Action response = Dialogs.create()
      .title(title)
      .message(message)
      .masthead(null)
      .nativeTitleBar()
      .showError();
    }
}
