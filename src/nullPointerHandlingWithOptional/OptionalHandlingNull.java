package nullPointerHandlingWithOptional;

import java.util.Optional;

public class OptionalHandlingNull {
    public static void main(String[] args) {
        String dave = "Godwin";
        Optional<String> optional = Optional.ofNullable(dave);
        System.out.println(optional.isEmpty());
        if (optional.isEmpty()){
            System.out.println("Is empty");
        }else {
            System.out.println(optional.get());
        }
        optional.ifPresentOrElse(d ->{
            System.out.println(dave.toUpperCase());
        }, ()-> {
            System.out.println("Name is empty");
        });
    }
}
