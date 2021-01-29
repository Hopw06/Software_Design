package Adapter.Translators;

public class TranslatorAdapter implements VietnameseTarget{
    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String word) {
        System.out.println("Sending word: " + word);
        adaptee.receive(translate(word));
    }

    private String translate(String vietnameseWords) {
        System.out.println("Translated");
        return "Japan words";
    }
}
