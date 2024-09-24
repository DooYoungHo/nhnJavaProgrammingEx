import java.lang.annotation.*;

//
// To-do: add Annotations here
//
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DeviceInformation {
    //
    // To-do: add fields here
    //
    String type() default "device";
    String model();
}