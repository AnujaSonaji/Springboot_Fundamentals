# Spring Boot Fundamentals

## Core Concepts

### 1. @Component
Tells Spring to manage this class as a Bean.
Spring creates and manages the object — no need for `new` keyword.

```java
@Component
public class PaymentService {
    public void pay() {
        System.out.println("Payment done!");
    }
}
```

### 2. @Autowired
Tells Spring to inject the managed Bean automatically.
No manual object creation needed.

```java
// Field Injection — for learning only
@Autowired
PaymentService paymentService;

// Constructor Injection — recommended in production
private final PaymentService paymentService;

public Module1IntroApplication (PaymentService paymentService) {
    this.paymentService = paymentService;
}
```

### 3. Component Scan
Spring automatically scans all classes with @Component
in the main application package and sub-packages.

```java
@SpringBootApplication // includes @ComponentScan internally!
public class Module1IntroApplication {
}
```

## Key Takeaways
- @Component = Register class with Spring
- @Autowired = Inject registered class
- @SpringBootApplication = Auto scans all @Component classes
- Constructor Injection > Field Injection always
- @Component is the base annotation. Spring has specialized versions:
  @Service → for business logic
  @Repository → for database layer
  @Controller → for web layer