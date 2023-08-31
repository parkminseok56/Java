## 예외

  - 정의

   예외처리는 프로그램이 실행 중에 예외 상황이나 오류가 발생했을 때 이를 처리하거나 전파하는 메커니즘을 의미합니다.
   
   예외는 프로그램이 예상치 못한 상황에 대처할 수 있도록 도와주며, 프로그램의 안정성을 높이는 역할을 합니다. 
   
   자바에서 예외처리는 try, catch, finally, throw, throws 등의 키워드와 예외 클래스 계층 구조를 기반으로 동작합니다.

- 종류
     
  - Checked 예외 (Checked Exception):
   
      컴파일러가 체크하며, 반드시 처리되어야 하는 예외입니다.
    
       이 예외를 처리하지 않으면 컴파일 오류가 발생합니다.
    
      대표적으로  IOException이나 SQLException이 있습니다.

   - Unchecked 예외 (Unchecked Exception):
 
       컴파일러가 체크하지 않으며, 개발자의 경험과 주의로 예방하거나 처리해야 합니다.
    
       대표적으로 NullPointerException,  ArrayIndexOutOfBoundsException, ArithmeticException 등이 있습니다.

 -------------------------------------------------------------------------------------------------------------------------------

##  throw

  throw 문은 자바에서 예외를 프로그래머가 의도적으로 발생시킬 때 사용되는 구문입니다.
   
   이를 통해 프로그램의 특정 상황에서 예외를 강제로 발생시켜야 할 때 사용할 수 있습니다.
  
 - 사용하는 이유
  
   - 사용자 정의 예외 발생
   
     개발자가 직접 정의한 예외 클래스의 인스턴스를 생성하여 발생시킬 수 있습니다.
  
      이렇게 하면 프로그램에서 자신만의 예외를 정의하고 발생시킬 수 있어, 특정 상황에서 예외를 더 정확하게 표현할 수 있습니다.
  
   -  의미 있는 예외 발생
     
     특정 조건이 충족되지 않았을 때 예외를 발생시키면, 프로그램의 논리적 오류나 버그를 더 쉽게 발견할 수 있습니다.

-------------------------------------------------------------------------------------------------------------------------------

## try-catch

 try-Catch 문은 프로그래밍에서 예외 처리를 구현하는데 사용되는 구조입니다.
 
 예외(Exception)는 프로그램 실행 중에 예상치 못한 상황이 발생했을 때 발생하며, 이러한 예외를 처리하는 것은 프로그램의 안정성과 신뢰성을 높이는 데 도움이 됩니다.

다양한 상황에서 프로그램 실행 중에 오류나 예외 상황이 발생할 수 있습니다. 

이런 상황을 처리하기 위해 try-Catch 문은 코드 블록 내에 예외가 발생할 수 있는 코드를 넣고, 이 코드를 실행하는 동안 발생하는 예외를 캐치해서 처리할 수 있도록 도와줍니다.

아래는 Try-Catch 문의 기본적인 구조입니다:
 
``` java
try {
    // 예외가 발생할 수 있는 코드
} catch (예외의_종류1 예외_변수1) {
    // 예외1 처리 코드
} catch (예외의_종류2 예외_변수2) {
    // 예외2 처리 코드
} finally {
    // 항상 실행되는 코드 (선택 사항)
}

```

위의 구조에서 각각의 catch 블록은 특정 종류의 예외를 처리하는 데 사용됩니다. 

프로그램 실행 중에 해당하는 예외가 발생하면, 해당하는 catch 블록이 실행됩니다.

여러 종류의 예외를 처리하려면 여러 개의 catch 블록을 사용할 수 있습니다. 

만약 어떤 catch 블록도 해당되지 않는 예외가 발생한다면, 예외는 해당 try-catch 블록 외부로 전달됩니다.

또한, finally 블록은 선택 사항으로서 예외의 발생 여부와 관계없이 항상 실행되는 코드를 넣을 수 있습니다.

이 블록은 주로 리소스 해제나 정리 작업을 수행하는 데 사용됩니다.