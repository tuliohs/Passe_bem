package Package.app;

import Package.Commons.MenuOpcoes;

public class Menu extends MenuOpcoes {

    private int OpcaoId;
    private boolean UserAuthorize;

    public int getOpcaoId() {
        return OpcaoId;
    }

    public void setOpcaoId(int OpcaoId) {
        this.OpcaoId = OpcaoId;
    }

    public boolean isUserAuthorize() {
        return UserAuthorize;
    }

    public void setUserAuthorize(boolean UserAuthorize) {
        this.UserAuthorize = UserAuthorize;
    }

    @SuppressWarnings("empty-statement")
    public boolean AcessarOpcao(int OpcaoId, boolean UserAuthorize) {
        if( UserAuthorize &&  this.OpcaoId == OpcaoId){
            return true;
        }
        return false;
    }

}
