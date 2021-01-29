package Adapter.Translators;

public class VietnameseClient {
    public static void main(String[] args) {
        JapaneseAdaptee japaneseAdaptee = new JapaneseAdaptee();
        TranslatorAdapter translatorAdapter = new TranslatorAdapter(japaneseAdaptee);
        translatorAdapter.send("Hello");
    }
}
