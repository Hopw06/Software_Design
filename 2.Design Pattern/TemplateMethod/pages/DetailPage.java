package TemplateMethod.pages;

import TemplateMethod.PageTemplate;

public class DetailPage extends PageTemplate {

    @Override
    protected void showBody() {
        System.out.println("Content of detail");
    }
}
