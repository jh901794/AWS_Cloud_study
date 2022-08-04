package j20220805.Board;

public abstract class Navigater implements Auth, Board{
    @Override
    public void Sign(){
        Sign sign = new Sign();
    }
    @Override
    public void Login() {
        Login login = new Login();
    }
    @Override
    public void First_Page(){
        First_Page first_page = new First_Page();
    }

    @Override
    public void Board_List(){
        Board_List board_list = new Board_List();
    }
}
