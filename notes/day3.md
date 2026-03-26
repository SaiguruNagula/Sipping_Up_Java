Day 3 notes

- 1) `methods.java`: method declaration, static vs non-static methods, arguments, return types, overloading
- 2) `oops.java`: class/object basics, encapsulation, constructors, inheritance, overriding
- 3) `array.java`: array declaration/initialization, traversal, modification, `length`
- 4) `jagged_array.java`: 2D irregular arrays (jagged), nested loops, variable row size
- 5) `strings.java`: immutable `String`, concatenation, search, substring, replace, `StringBuilder`

## Quick reference
- `Stack`: method frames, local primitive variables, references (LIFO)
- `Heap`: objects and arrays, garbage-collected, shared across threads

## Practice commands
- `javac Day03/*.java`
- `java -cp . Day03.methods`
- `java -cp . Day03.oops`
"c:\Users\hp\OneDrive\Desktop\Java_core(DSA)"; @'
Day 3 notes

- 1) `methods.java`: method declaration, static vs non-static methods, arguments, return types, overloading
  - `static` belongs to class, uses no object, common utility functions.
  - non-static methods require objects and can access instance variables.
  - method overloading: same name, different params.
  - method signature: name + parameter types.
  - call chain with small unit functions helps code reuse and testability.

- 2) `oops.java`: class/object fundamentals
  - class: blueprint, defines fields+methods.
  - object: runtime instance.
  - constructor: init objects, can be default/parameterized.
  - encapsulation: `private` fields + public getters/setters.
  - inheritance: `extends` shares behavior, `super()` calls parent constructor.
  - polymorphism: parent reference can hold child object, virtual method dispatch.
  - overriding: same method signature + `@Override`, runtime binding.

- 3) `array.java`:
  - fixed-length, indexed from 0.
  - `int[] a = new int[5];` and `int[] b = {1, 2, 3};`
  - use loops: `for`, `for-each`.
  - update by index, read via `a[i]`.
  - `length` always property, not method.
  - bounds check: index < 0 or >= length throws `ArrayIndexOutOfBoundsException`.

- 4) `jagged_array.java`:
  - declare as `int[][] jagged = new int[3][];`
  - each row has own length, e.g. `jagged[0] = new int[2];`
  - iterate using nested loops and `jagged[i].length`.
  - good for variable-length table (like matrix rows with different counts).

- 5) `strings.java`:
  - Strings are immutable; operations create new objects.
  - compare with `.equals()` for value, `==` for reference.
  - `StringBuilder` for efficient mutable sequences in loops.
  - common methods: `substring`, `indexOf`, `contains`, `replace`, `split`, `trim`, `toLowerCase`, `toUpperCase`.
  - avoid repeated `+` in loops, prefer `StringBuilder`/`StringBuffer`.

## Stack vs Heap (deep)
- stack contains method call frames, local primitives, and references.
- heap contains objects and arrays; allocations via `new`.
- object lifetime: address references, GC detects unreachable.
- local ref example:
  - `Person p = new Person("A", 10);` `p` is stored on stack; object in heap.
- call sequence and recursion depth depend on stack size.
- for huge array/lists store in heap (reference in stack only). 

## Example walkthrough
1. compile: `javac Day03/methods.java Day03/oops.java Day03/array.java Day03/jagged_array.java Day03/strings.java`
2. run each class:
   - `java -cp . Day03.methods`
   - `java -cp . Day03.oops`
3. verify:
   - method output + overridden behavior
   - array values, jagged layout
   - string operations results

