# Variable Types
|Types|Width|
| --- | --- |
| long   | 64   |
| int  | 32    |
| short   | 16   |
| byte   | 8   |
| double | 64 |
| float | 32 |


```java

int binary = 0b01001 
// or 
int binary = 0B01001

```

> [!NOTE]
> ***BITMASK:*** operators of binary number

> [!TIP]
> Can use one or more ***Underscore*** to represent the large integer or float number easily

```java
int largeNum = 123_456_789; // also = 123456789
```

## ***Character escape sequences***
|escape|Sequence|
|---| ---|
|\ddd|Octal character|
|\uxxxx|Hexadecimal Unicode character|
|\"|single quote|
|\\|backslash|
|\r|Carriage return|
|\n|New line|
|\f|Form feed|
|\t|tab|
|\t|Vertical Tab|

## Type conversion and casting

> [!WARNING]
> ***One type can assgin to another:***
> - Two types are compatible
> - The destination type is larger than the source types

## Automatic Type Promotion in Expression

> [!NOTE]
> ***ONLY:*** *byte,short,char* ***->*** ***Int***    

## Introducing Type Inference with Local Variables

> [!NOTE]
> ***VAR:*** Reversed type name

> [!EXAMPLE]
> ```java
> var avg = 10.0;
> // Instead of
> double avg = 10.0;
> ```

> [!WARNING]
> ***Some Var Restriction***
> ```var myArray = new int[10];``` -> **Valid** 
> ```var myArray = { 1, 2, 3 };``` -> **Wrong** 

> [!ATTENTION]
> **Var cannot be used as**
> - class 
> - reference 
> - enumeration  
> - annotation
> - the name of generic type paramater 
