# Gang of Four (GoF) Design Patterns Implementation

Educational implementations of classic Gang of Four (GoF) design patterns in Java with comprehensive examples and unit tests.

> [!NOTE]
> Built for educational reference and object-oriented software engineering practice.

---

## Implemented Patterns

### Creational Patterns: Singleton Variations

Located in `src/main/java/com/saurabh254/gof/creational/`:

| Implementation | Description | Thread-Safe | Lazy Initialized |
| :--- | :--- | :---: | :---: |
| **Eager Initialization** (`EagerInitializedSingleton`) | Instance created when the class is loaded into memory. | Yes | No |
| **Static Block** (`StaticBlockSingleton`) | Similar to eager initialization with custom exception handling logic. | Yes | No |
| **Lazy Initialization** (`LazyInitializedSingleton`) | Created only when requested; suitable for single-threaded environments. | No | Yes |
| **Thread-Safe** (`ThreadSafeSingleton`) | Synchronized accessor and double-checked locking idiom. | Yes | Yes |
| **Bill Pugh Singleton** (`BillPughSingleton`) | Uses a static inner helper class (`SingletonHelper`) for zero synchronization overhead. | Yes | Yes |
| **Enum Singleton** (`EnumSingleton`) | JVM-guaranteed singleton immunity against serialization and reflection attacks. | Yes | No |
| **Serialized Singleton** (`SerializedSingleton`) | Implements `readResolve()` to preserve singleton state across deserialization. | Yes | Yes |
| **Reflection Destruction Test** (`ReflectionSingletonTest`) | Test demonstration showing how Java Reflection can compromise constructor access. | — | — |

---

## Project Structure

```
gof_implementation/
├── pom.xml
└── src/
    ├── main/java/com/saurabh254/gof/
    │   └── creational/         # Singleton pattern implementations
    └── test/java/com/saurabh254/gof/
        └── AppTest.java        # Unit test suite
```

---

## Build & Test

Prerequisites:
- Java JDK 17+
- Apache Maven

```bash
# Clone the repository
git clone https://github.com/Saurabh254/gof_implementation.git
cd gof_implementation

# Compile and run unit tests
mvn clean test
```

---

## License

Educational / Personal Reference.
