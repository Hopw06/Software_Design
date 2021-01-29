# Open Closed Principle
## Define
The Open/Closed Principle (OCP) states that the behaviors of a system can be extended (Open For Extension) without having to modify the existing system (Closed for Modification)
```
Software entities (classes, modules, functions, etc.) should be closed for modifications but open for extensions.
```

![open_closed](Images/open_closed.png)

Let's see an example:
The Student class below has a function called payTuitionFee() is used to calculate tuition fee of multiple kinds of student.

```
public class Student {
    private final float STANDARD_FEE = 1000; 
    private String name;
    private int age;
    private StudentType type;

    public float payTuitionFee() {
        switch (type) {
            case FOREIGN:
                return STANDARD_FEE * 1.3f;
            case TALENTED:
                return STANDARD_FEE * 1.2f;
            default:
                return STANDARD_FEE;
        }
    }
}
```

But when School add other kinds of student, we have to add code to this function to calculate tuition fee. The code in Student will get bigger, and even we may make code that already tested wrong.
So we should not modify the base code, we should extend it. As following:

```
public class Student {
    private final float STANDARD_FEE = 1000;
    private String name;
    private int age;

    public float payTuitionFee() {
        return STANDARD_FEE;
    }
}
```

```
public class TalentStudent extends Student{

    @Override
    public float payTuitionFee() {
        return super.payTuitionFee() * 1.2f;
    }
}
```

```
public class ForeignStudent extends Student{

    @Override
    public float payTuitionFee() {
        return super.payTuitionFee() * 1.3f;
    }
}
```

Then, we even can add more information for ForeignStudent:

```
public class ForeignStudent extends Student{

    private float IELTS_mark;
    
    @Override
    public float payTuitionFee() {
        return super.payTuitionFee() * 1.3f;
    }
    
    public void showIELTS_mark() {
        System.out.println("Student's ielts mark is: " + IELTS_mark);
    }
    
    public boolean isQualifyForEnglish() {
        return IELTS_mark > 8.0;
    }
}
```
## Why we should follow Open Closed Principle:
####Open for extension:
1. Programmers do not have to reinvent the wheel if they can extend upon behaviors that have already been defined.
2. New changes will have to deployed as opposed to making changes to the existing system and redeploying the entire code base back into the production environment. Furthermore, if the business determines that the feature implemented no longer serve user needs then the changes can be easily reverted as opposed to going back into the code base.   
####Closed fo modification:
1. Maybe a bug is introduced in the system, if we change directly to the entities.
2. Adding onto an existing code base increases additional complexity to the system, which can get out of hand fast when compounded over time. The worst case scenario would be to break the existing system.
## SRC:
1. https://nhungdongcodevui.com/2017/03/25/solid-la-gi-nguyen-tac-2-dong-va-mo-open-closed-principle-ocp/
2. https://medium.com/@a.vathanaka/benefits-of-the-open-closed-principle-dc9284d47598