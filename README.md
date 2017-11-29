# JavaBlankTutorial

> Java Programming basic tutorial with JUnit test.


# Example

### 1. Check question

Open question java file.
`src/_02Statements/StatementIf.java`

let's try Q1.

```java
public class StatementIf {

  // Q1
  static String lagerThan0(int v) {
    if (true) { // FIXME: if larger than 0
      return "OK";
    }
    return "NG";
  }

```

### 2. Run test

Open this test file. src/_02Statements/StatementIf**Test**.java


![statementiftest_java_-_java-blank-tutorial_-_____ghq_github_com_elzup_java-blank-tutorial_](https://user-images.githubusercontent.com/2284908/33125005-5f4aaae4-cfc2-11e7-8313-0a7a122a7f38.png)


Test will failed at **line 10**.

```
 9    Assert.assertEquals("OK", StatementIf.lagerThan0(1));
10    Assert.assertEquals("NG", StatementIf.lagerThan0(0));      // ← failed!
11    Assert.assertEquals("NG", StatementIf.lagerThan0(-1));
```

if received `0`:

Expected return "NG";

but

Actual returned "OK";

### 3. **Fix Start!**


```diff
   static String lagerThan0(int v) {
-    if (true) { // FIXME: if larger than 0
+    if (v > 0) {
       return "OK";
     }
```


### 4. Retry test

![statementiftest_java_-_java-blank-tutorial_-_____ghq_github_com_elzup_java-blank-tutorial_](https://user-images.githubusercontent.com/2284908/33125699-e7ce7e20-cfc4-11e7-9029-f1040592dfdd.png)

Congratuation!



## java table of contents

* Statements(if/switch)
* Object, Class
* Array
* tips
