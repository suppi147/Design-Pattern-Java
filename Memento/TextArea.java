package DP.Memento;

public class TextArea {
    private String text;

    public void SetText(String text){
        this.text=text;
    }

    public String GetText(){
        return this.text;
    }

    public Memento TakeSnapshot(){
        return new Memento(this.text);
    }

    
    public void Restore(Memento memento){
        this.text=memento.GetSavedText();
    }

    public static class Memento{
        private String text;

        private Memento(String text2Save){
            this.text=text2Save;
        }
        
        public String GetSavedText(){
            return this.text;
        }
    }
}
