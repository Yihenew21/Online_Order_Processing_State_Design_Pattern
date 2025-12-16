# State Design Pattern — Online Order Processing (Java)

This repository demonstrates the State design pattern with a simple Online Order Processing example. An `Order` moves through states (Pending → Paid → Shipped → Delivered or Cancelled) and behavior is delegated to concrete state objects instead of using conditionals inside the `Order` class.

---

## Project layout

All source files are in `src/StatePattern/` and use the `StatePattern` package.

- `src/StatePattern/Order.java` — the context that holds a reference to an `OrderState`.
- `src/StatePattern/OrderState.java` — the state interface (`payOrder`, `shipOrder`, `deliverOrder`, `cancelOrder`).
- `src/StatePattern/PendingState.java`
- `src/StatePattern/PaidState.java`
- `src/StatePattern/ShippedState.java`
- `src/StatePattern/DeliveredState.java`
- `src/StatePattern/CancelledState.java`
- `src/StatePattern/StatePatternDemo.java` — small runner with `main` demonstrating state transitions.

Note: the class with the `main` method is `StatePattern.StatePatternDemo` (not `Main`).

---

## Key concepts

- Context (`Order`) delegates actions to the current `OrderState`.
- Concrete states implement `OrderState` and decide how to handle each action and whether to transition to another state.
- Transitions are performed by calling `order.setState(new SomeState())` inside a state implementation.

---

## Typical state transitions

- Pending: can be `payOrder()` -> Paid, or `cancelOrder()` -> Cancelled.
- Paid: can be `shipOrder()` -> Shipped.
- Shipped: can be `deliverOrder()` -> Delivered.
- Delivered / Cancelled: terminal states; actions are rejected.

---

## How to build & run (detailed)

Requirements
- Java JDK 8 or newer installed and `java`/`javac` available on PATH.

From Windows PowerShell (project root `C:\Users\hp\IdeaProjects\StatePattern`):

```powershell
# 1) Compile all Java sources into an output directory (creates 'out' folder)
javac -d out src/StatePattern/*.java

# 2) Run the demo by specifying the package-qualified main class
java -cp out StatePattern.StatePatternDemo
```

Notes:
- Because the sources are in the `StatePattern` package, you must run the main class using its fully-qualified name `StatePattern.StatePatternDemo` and point the classpath to the `out` directory where `javac` wrote the `.class` files.
- If you prefer an IDE (IntelliJ, Eclipse or similar) you can import the folder as a project, mark `src` as source root (if needed) and run `StatePatternDemo` directly.

Example output (expected)

```
Order created. Current state: Pending
Payment successful. Order is now Paid.
Order shipped.
Order delivered.
Delivered order cannot be cancelled.
```

---

## Extensibility ideas

- Add logging or timestamps rather than printing to stdout.
- Record a transition history inside `Order` for auditing.
- Introduce singletons for state objects to avoid repeated object creation.
- Expose the model via a simple CLI or REST API for interactive testing.

---

If you want, I can also:
- run the demo here and paste the actual console output,
- add a small unit test, or
- add an ASCII/UML state diagram to this README.

---
Generated: enhanced README with detailed run instructions.