package com.example.pc.transexpress;
class Users {
    String login;
    String mdp;
    String nom;
    String prenom;

    @Override
    public boolean equals(Object v) {
        boolean retVal = false;

        if (v instanceof Users){
            Users ptr = (Users) v;
            retVal = ptr.login == this.login && ptr.mdp == this.mdp;
        }

        return retVal;
    }

    public Users(String login, String mdp) {
        this.login = login;
        this.mdp = mdp;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
