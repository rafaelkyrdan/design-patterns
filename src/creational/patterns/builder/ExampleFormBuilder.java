package creational.patterns.builder;

/**
 * In this example a client only needs to provide the mandatory fields
 * and the fields which are important to him. To create the object,
 * we invoke the FormBuilder constructor which takes the mandatory fields
 * and then we need to call the set of optional methods on it and finally the build method to get the form object.
 */

public class ExampleFormBuilder {
    public static void main(String[] args) {
        Form form = new Form.FormBuilder("Dave", "Carter", "DavCarter", "DAvCaEr123")
                .passwordHint("MyName")
                .city("NY")
                .language("English")
                .build();
        System.out.println(form);
    }
}

