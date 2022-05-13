package model;

public class Notesubject {

    private String nameNote;
    private double valuenote;
    private String nameSubject;
    private int creditsSubject;

    public Notesubject(String nameNote, double valuenote, String nameSubject, int creditsSubject) {
        this.nameNote = nameNote;
        this.valuenote = valuenote;
        this.nameSubject = nameSubject;
        this.creditsSubject = creditsSubject;
    }


    

    /**
     * @return String return the nameNote
     */
    public String getNameNote() {
        return nameNote;
    }

    /**
     * @param nameNote the nameNote to set
     */
    public void setNameNote(String nameNote) {
        this.nameNote = nameNote;
    }

    /**
     * @return double return the valuenote
     */
    public double getValuenote() {
        return valuenote;
    }

    /**
     * @param valuenote the valuenote to set
     */
    public void setValuenote(double valuenote) {
        this.valuenote = valuenote;
    }

    /**
     * @return String return the nameSubject
     */
    public String getNameSubject() {
        return nameSubject;
    }

    /**
     * @param nameSubject the nameSubject to set
     */
    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    /**
     * @return int return the creditsSubject
     */
    public int getCreditsSubject() {
        return creditsSubject;
    }

    /**
     * @param creditsSubject the creditsSubject to set
     */
    public void setCreditsSubject(int creditsSubject) {
        this.creditsSubject = creditsSubject;
    }

}
