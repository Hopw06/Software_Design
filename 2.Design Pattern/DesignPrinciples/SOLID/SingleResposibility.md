# Single Responsibility Principle
## Define
A class should have only a single responsibility. We should have only one reason to change a class.  
Uncle Bob's Single Responsibility Principle states that:
```  
A class should have one, and only one, reason to change.
```
And:
```
In the context of the Single Responsibility Principle (SRP) we define a responsibility to be “a reason for change.” If you can think of more than one motive for changing a class, then that class has more than one responsibility.
```

Let's look at an example:
```
public class Employee {
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // format employee
    public String getEmployeeJson() {
        return "Employee: {\n" + "id: " + id + "\nname: " + name + "\n}";
    }

    public String getEmployeeXml() {
        return "<Employee>\n"
                + "<id> " + id + "</id>"
                + "<name> " + name + "</name>"
                + "</Employee>";
    }

    // save data
    public void saveToDatabase() {
        dbContext.save(this);
    }
    
    public void saveToFile() {
        Files.save(this, "filename.txt");
    }
}
```
Class Employee has many functions include format, save data and represent information of an employee. When source code of project become bigger, there will be other models class such as Manager or Staff... And the format code, save to database code will be multi places, so when have any changes, we have to change in all these places.


So we should separate the Employee class into model class, format class and store class:
```
public class Employee {
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

}

public class Format {
    public String getJsonFormat() {
    }

    public String getXmlFormat() {
    }
}

public class Store {
    // save data
    public void saveToDatabase() {
        dbContext.save(this);
    }

    public void saveToFile() {
        Files.save(this, "filename.txt");
    }
}
```

It's just simple example. The SRP also apply for method and module. 
## Why we should follow SRP:
1. Readable  
Reading code that abides by the SRP is easier to follow because it is focused and concise. A function or class that is doing too many things outside the realm of its responsibilities creates unnecessary entanglements that makes it harder to read and debug.  
2. Testable
It is easier to test functions that are performing one basic operation.   
If one method do more than one job, we can not testing smallest possible unit.
3. Changeable
It is inevitable that external factors such as new business requirements or updates to libraries would require changes to be made to the code base. Therefore, code that is decoupled will make life easier for the programmer implementing the change. The last thing any programmer wants is to make one change and create a cascading effect to the rest of the system
4. Reusable
When behaviors are abstracted and defined into functions that have one sole purpose, the functions are more likely to be used in other parts of the application. 

The SRP is the simplest principle in SOLID, but It is also the hardest one to get right.

## Src:
1. https://toidicodedao.com/2016/05/03/series-solid-cho-thanh-nien-code-cung-single-responsibility-principle/
2. https://medium.com/@a.vathanaka/benefits-of-writing-code-that-adheres-to-the-single-responsibility-principle-54e8ef1d7e30