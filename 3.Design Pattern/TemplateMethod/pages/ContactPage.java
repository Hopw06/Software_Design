package TemplateMethod.pages;

import TemplateMethod.PageTemplate;

public class ContactPage extends PageTemplate {

    @Override
    protected void showNavigation() {
        // do nothing
    }

    @Override
    protected void showBody() {
        System.out.println("Content of contact page.");
    }
}
