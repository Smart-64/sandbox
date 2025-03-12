# Prescreening Technical Questions

During the review process, we will pay attention to the code's neatness, proper variable naming,
and solution correctness. Syntax accuracy will be considered to a lesser extent.
If you have any comments or additional details, please include them as well.

## Chapter 1 - SQL

We have the following tables:

- `books` table with the fields: book_id, book_title, author_id
- `authors` table with the fields: author_id, author_name

#### 1. Write an SQL query that retrieves the names of authors who have authored more than 2 books along with the total number of books they have written.

```sql
-- Answer:

SELECT a.author_name, COUNT(a.author_name) FROM authors AS a
LEFT JOIN books AS b ON a.author_id = b.author_id
GROUP BY a.author_name
HAVING COUNT(a.author_name) > 2;


```

#### 2. What changes or additions in schema do we need to make to allow a book to have multiple authors?

```
Answer:
The first, we delete author_id from books.
The second, we create new table "book_authors" with columns (book_id, author_id).

```

## Chapter 2 - Unit Tests

Please add unit tests for the divide function. For simplicity, let's assume we are working only with integer numbers.

#### Modify `answer` function below with new assertions. Feel free to add additional assert functions if necessary.

```java
int divide(int a, int b) {
  if (b == 0) {
    throw RuntimeException("divided by 0")
  }

  return a / b;
}

void assertEquals(int a, int b) {
  if (a == b) {
    println("passed");
    return;
  }

  throw RuntimeException("failed: expected " + a + ", actual " + b)
}

void answer() {
	assertEquals(divide(1, 1), 1);


}
```

## Chapter 3 - Algorithm

Please write a function that `efficiently` returns the length of the last word. For simplicity, assume that the input contains only English letters and white spaces.

Example:

```
input: " thank you   for solving the tests  "
output: 5 (length of the word "tests")
```

#### Modify the code block below. You can choose any programming language, but using `python` will be a plus.

```python
## answer:


```

## Chapter 4 - Refactoring

Please refactor the following code.
You are free to make any updates, such as changing variable and function names,
modifying the function, or adding new functions.
The goal is to improve the clarity and potentially enhance efficiency of the code,
but stay in the same level of abstraction (e.g not explicitly add Map).
Let's begin by giving special attention to the processListAndFindCountry function interface, and feel free to modify it as needed.

```typescript
function refactorThis() {
  const COUNTRY_ARRAY_LIST = ["Russia", "Vietnam", "India", "China"];
  let country1 = processListAndFindCountry(COUNTRY_ARRAY_LIST, "rub");
  console.log("result is " + country1);
  let country2 = processListAndFindCountry(COUNTRY_ARRAY_LIST, "dong");
  console.log("result is " + country2);
}
```

#### Modify `answer` function below. You can choose any programming language, but using `typescript\javascript` will be a plus.

```typescript
function answer() {
  // put you code here:

}

```
