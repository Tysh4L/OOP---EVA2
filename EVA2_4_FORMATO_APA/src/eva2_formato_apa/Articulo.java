package eva2_formato_apa;

/**
 *
 * @author danna
 */
public class Articulo extends Documents {
        private String journalName;
        private int pages;

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
