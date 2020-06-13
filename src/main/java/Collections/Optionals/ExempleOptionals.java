package Collections.Optionals;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExempleOptionals {

    public static void main(String[] args) {

        Optional<String> optionalPresent = Optional.of("Valor presente");
        System.out.println("Optional.of");
        optionalPresent.ifPresentOrElse(System.out::println, () -> System.out.println("Valor nao presente"));

        System.out.println("Optional.null");
        Optional<String> optionalNull = Optional.empty();
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Valor nao presente"));

        System.out.println("Optional.ofNullable");
        Optional<String> optionalNullable = Optional.ofNullable("Valor presente");
        optionalNullable.ifPresentOrElse(System.out::println, () -> System.out.println("Valor nao presente"));


        System.out.println("Optioanl Int");
        OptionalInt.of(12).ifPresent(System.out::println);
        System.out.println("Optional Double");
        OptionalDouble.of(5.4).ifPresent(System.out::println);
        System.out.println("Optional Long");
        OptionalLong.of(12L).ifPresent(System.out::println);



    }

}
