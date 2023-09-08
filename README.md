# Java
 - 자바의 특징
    1. 다양한 운영체제에서 운영이 가능하다. (플렛폼의 독립성)
    
    2. 객체 지향언어이다.

    3. 다양한 라이브러리 및 프레임워크를 지원한다.

-------------------------------------------------------------------------------------------------------------

# Java와 JavaScript의 차이점

 컴파일러언어와 인터프리터(비파일러언어)라는 점이다.

 (번역어 vs 통역어)

- 컴파일언어

   장점
  
   - 높은 실행 속도: 소스 코드를 전체적으로 한 번에 기계어로 변환하여 실행하기 때문에 일반적으로 인터프리터언어에 비해 빠른 실행 속도를 가집니다.
   - 최적화 가능: 컴파일 시에 코드를 최적화하여 더 효율적인 실행 코드를 생성할 수 있습니다.
   - 실행 파일 독립성: 컴파일된 실행 파일은 해당 시스템의 컴파일러에 의존하지 않고 독립적으로 실행될 수 있습니다.
  
  단점
  
   - 컴파일 시간: 소스 코드를 컴파일하려면 시간이 필요하며, 큰 프로젝트의 경우 컴파일 시간이 오래 걸릴 수 있습니다.
   - 플랫폼 호환성: 다른 운영 체제나 아키텍처에서 실행하기 위해서는 해당 플랫폼에 맞는 컴파일이 필요합니다.

- 인터프리터언어

  장점
  
   - 간편한 디버깅: 런타임 중에 코드를 해석하므로 디버깅이 간단합니다.
   - 플랫폼 독립성: 인터프리터는 실행 환경에 종속되지 않고, 소스 코드 그대로 실행됩니다.
   - 빠른 개발: 컴파일 단계가 없기 때문에 코드 수정 후 바로 실행 가능하여 개발 속도를 높일 수 있습니다.
   
    단점
  
   - 낮은 실행 속도: 런타임에 코드를 해석하므로 컴파일언어에 비해 상대적으로 느린 실행 속도를 가질 수 있습니다.
   - 보안 문제: 소스 코드가 그대로 노출되므로 보안에 취약할 수 있습니다.
   - 의존성: 사용자가 실행하는 시스템에 인터프리터가 설치되어 있어야 합니다.

-------------------------------------------------------------------------------------------------------------

- 자바 (Java)
  
  - 자바 코드는 .java 확장자를 가진 소스 파일에 작성되며, 이 코드를 자바 컴파일러를 사용하여 바이트 코드(.class 파일)로 컴파일합니다. 이 바이트 코드는 Java Virtual Machine (JVM)에서 실행됩니다.
 
  - JVM은 플랫폼 독립적이며, 각 운영체제에서 JVM이 설치되어 있다면 동일한 바이트 코드가 실행될 수 있습니다.

- 자바스크립트 (JavaScript)
  
  - 자바스크립트는 비컴파일러(인터프리터) 언어입니다. 자바스크립트 코드는 일반적으로 텍스트 파일로 작성되며, 브라우저 내의 자바스크립트 엔진(예: V8 엔진)에 의해 실시간으로 해석되고 실행됩니다. 
  
  - 최근에는 Node.js와 같은 환경을 사용하여 서버 측에서도 자바스크립트 코드를 실행할 수 있게 되었습니다.
  
따라서 자바 코드는 컴파일 단계를 거쳐 실행 파일을 생성하고, 자바스크립트 코드는 인터프리터에 의해 실행되는 것이 주요한 차이점 중 하나입니다.
       
-------------------------------------------------------------------------------------------------------------

 - 1이 가능한 이유 : JVM (자바 가상 머신)이  존재하기 떄문이다.

JVM은 자바소스코드(.java)를 컴파일러(javac)를 이용하여 바이트코드(.class)로 변환한 다음 기계어로 번역하여 실행한다.

JVM의 가동 순서는 다음과 같다.

  1. 컴파일링
  2. 클래스 로딩
  3. 바이트 코드 검증
  4. 바이트 코드 해석
  5. 실행
  6. 가비지 컬렉션
  7. 종료

## 객체지향
- 객체 지향이란?
  
 객체지향 프로그래밍(OOP, Object-Oriented Programming) 언어로,

 객체지향 프로그래밍은 소프트웨어 개발 패러다임 중 하나임.
 
객체지향 프로그래밍은 코드의 구조를 현실 세계의 객체(Object)에 기반하여 설계하고 개발하는 방법론을 의미함.

 이를 통해 코드의 재사용성, 유지보수성, 확장성 등을 향상시킬 수 있음.
 
--------------------------------------------------------------------------------------------------

  - 주요 특징
   
     - 클래스(Class)와 객체(Object)
      
       클래스 = 객체를 정의하기 위한 틀 또는 설계도
       
       객체 = 연관된 변수와 메서드의 묶음
       
       인스턴스 = 객체를 메모리에 할당시켜 실제하는 값으로 사용하는 상태
       
       
       클래스는 속성(멤버 변수)과 메서드(함수)를 포함하며, 객체는 해당 클래스에서 정의된 속성과 메서드를 이용하여 동작함.

       
-------------------------------------------------------------------------------------------------------------

  - 객체를 생성하는 방법

     - 클래스이름 객체이름 = new 클래스이름();

     만들고자 하는 객체를 생성하면 된다.

      ex)

      ``` java

     ClassExample objectExample = new ClassExample();
     (ClassClassExample 라는 이름의 클래스에서 objectExample 이라는 이름의 객체를 new 연산자를 통해서 생성했음)

      ```
       
- 생성자(Constructor))

   - 객체(인스턴스) 초기화 메서드
   - 클래스 내부에 정의된 특별한 메서드로, 객체가 생성될 때 호출되어 객체의 초기 상태를 설정하거나 필요한 작업을 수행합니다.
   - 객체를 생성할 때는 생성자를 통해 초기화해야만 해당 객체를 사용할 수 있습니다.
   - 파라미터가 없는 기본 생성자(default constructor)부터 매개변수를 가진 생성자까지 클래스에 정의할 수 있습니다.
     
     (파라미터가 없으면 따로 생성을 안 해도 기본 생성자가 자동으로 생성된다)
   -  생성자는 객체 생성 과정 중에 자동으로 호출되며, 생성자 호출이 완료되면 초기화된 객체를 사용할 수 있게 됩니다.
 

     생성하는 방법

  ``` java

  public class Person {
      private String name;
      private int age;
 
     // 생성자
     public Person(String name, int age) {
         this.name = name;  // this.name은 인스턴스의 name 변수를 가리킴
         this.age = age;    // this.age는 인스턴스의 age 변수를 가리킴
     }
  }


 - this 키워드를 사용하여 파라미터 값을 인스턴스 변수에 할당하는 것은 일반적인 관행입니다.
 - 이렇게 하면 생성자 내에서 파라미터로 받은 값들을 객체의 속성(인스턴스 변수)에 초기화할 수 있습니다.
 - 하지만 변수 이름이 충돌하지 않는 경우 this를 사용하지 않아도 됩니다. (생략 가능)

--------------------------------------------------------------------------------------------------

   - 캡슐화(Encapsulation)
    
      캡슐화는 관련된 데이터와 메서드를 하나의 단위로 묶어 외부에서의 접근을 제어하는 개념임.
       
      이를 통해 데이터의 무결성을 보호하고, 객체 간의 상호 작용을 정교하게 제어할 수 있음.

      ex) 접근제어자, Getter & Setter

        - 접근제어자 종류
          - public: 접근 제한이 없음
          - protected: 같은 클래스, 자손클래스
          - (default): 같은 패키지 
          - private: 같은 클래스
--------------------------------------------------------------------------------------------------

    
   - 상속(Inheritance)
    
       상속은 이미 존재하는 클래스의 속성과 메서드를 다른 클래스가 물려받아 사용할 수 있게 해줌.
     
      이를 통해 코드의 재사용성을 증가시키고, 클래스 간의 계층 구조를 형성할 수 있음.

      ex) 오버라이드

--------------------------------------------------------------------------------------------------

   - 추상화
     - 추상화는 복잡한 현실 세계를 단순화하고 핵심적인 부분에 초점을 맞추어 이해하기 쉽게 만드는 것을 목표로 함.
     -  일반적인 개념을 만들어서 여러 객체를 포함할 수 있도록 설계함.
       
       이를 통해 여러 다양한 객체를 동일한 추상 클래스나 인터페이스로 다룰 수 있습니다.

       예를 들어, "자동차" 클래스는 모든 종류의 자동차를 나타내는 일반적인 개념이며, "승용차"나 "트럭"과 같은 특수한 자동차 클래스는 이를 상속받아 특정 유형의 자동차를 표현함.

--------------------------------------------------------------------------------------------------

- 추상 클래스와 인터페이스의 정의
  
  - 추상 클래스 (Abstract Class)
 
  추상 클래스는 하나 이상의 추상 메서드(abstract method)를 포함할 수 있습니다.
  
  추상 메서드는 메서드의 시그니처(이름, 매개변수, 반환 유형)만을 정의하고 실제 구현은 하위 클래스에서 해야 합니다.
  
  추상 클래스는 추상 메서드 뿐만 아니라 일반 메서드(concrete method)도 포함할 수 있습니다. 즉, 일반적인 메서드를 구현할 수 있습니다.
  
  추상 클래스는 객체를 직접 생성할 수 없으며, 이를 상속받는 하위 클래스에서만 인스턴스화할 수 있습니다.
  
  추상 클래스는 상속 관계를 형성하며, 하위 클래스에서 추상 메서드를 반드시 구현해야 합니다.
  
--------------------------------------------------------------------------------------------------


  - 인터페이스 (Interface)
 
 인터페이스는 추상 메서드만을 가질 수 있습니다. 즉, 메서드의 시그니처만을 정의하고 실제 구현은 인터페이스를 구현하는 클래스에서 제공해야 합니다.
 
 모든 메서드는 기본적으로 public이며, 메서드 몸체가 없으므로 구현을 강제합니다.
 
 클래스는 여러 개의 인터페이스를 동시에 구현할 수 있습니다. 다중 상속의 기능을 제공합니다.
 
 인터페이스는 다양한 클래스들 간에 공통된 동작을 정의하고, 이를 일관성 있게 보장하는데 사용됩니다.
 
 객체를 직접 생성할 수 없으며, 인터페이스를 구현한 클래스의 객체를 생성하여 사용합니다.

--------------------------------------------------------------------------------------------------

- 차이점

 추상 클래스는 일반 메서드를 가질 수 있지만, 인터페이스는 추상 메서드만을 가질 수 있습니다.
 
 추상 클래스는 상속을 통해 확장하고 인스턴스화할 수 있지만, 인터페이스는 구현하는 클래스에서만 사용됩니다.
 
 하나의 클래스는 여러 개의 인터페이스를 구현할 수 있지만, 추상 클래스는 단일 상속만을 허용합니다.
 
 추상 클래스는 상속 관계를 형성하고, 추상 메서드를 구현하도록 강제하지만, 인터페이스는 다중 상속과 클래스 간에 공통 동작을 정의하는 목적에 중점을 두며, 여러 클래스에서 동일한 인터페이스를 구현하여 일관성을 유지합니다.
 
 추상 클래스는 클래스의 일부 동작을 공유하는 데 사용되고, 인터페이스는 다양한 클래스 간에 공통된 동작을 정의하기 위해 사용됩니다.
 
 어떤 것을 선택해야 하는지는 상황과 설계 목표에 따라 다릅니다. 일반적으로는 추상 클래스는 공통된 구현을 가지는 클래스들 간에 사용되고, 인터페이스는 동작을 표준화하고 클래스 간에 유연한 상호 작용을 제공하기 위해 사용됩니다.



--------------------------------------------------------------------------------------------------
    
   - 다형성(Polymorphism)

       다형성은 같은 이름의 메서드를 다양한 방식으로 구현하고 사용할 수 있는 능력을 나타냅니다.
       
      이를 통해 동일한 인터페이스를 가진 다양한 클래스들을 유연하게 사용할 수 있음.

      ex) 인터페이스, 오버로드

  
 ## 라이브러리 & 프레임워크
     

라이브러리(Library)와 프레임워크(Framework)는 소프트웨어 개발에서 자주 사용되는 개념이지만, 서로 다른 역할과 특징을 가지고 있습니다.

--------------------------------------------------------------------------------------------------

- 라이브러리 (Library):

 재사용 가능한 코드의 집합으로, 특정 기능을 수행하기 위한 함수, 클래스, 모듈 등의 모음입니다.
 
라이브러리를 사용하려면 개발자가 원하는 기능을 호출하여 사용할 수 있습니다.

라이브러리는 개발자가 필요한 기능을 선택하여 사용하고, 나머지 부분은 직접 구현해야 합니다.

ex: 문자열 처리를 위한 문자열 처리 라이브러리, 그래픽 처리를 위한 그래픽 라이브러리 등.

--------------------------------------------------------------------------------------------------

- 프레임워크 (Framework):

  개발자가 어플리케이션을 구축할 때 기본적인 구조, 디자인 패턴, 규칙 등을 제공하는 플랫폼입니다.
  
  프레임워크는 개발자가 프레임워크의 규칙과 구조를 따라 코드를 작성해야 합니다. 개발자는 프레임워크에 의해 정의된 방식에 따라 코드를 작성하고 확장할 수 있습니다.
  
  프레임워크는 개발자의 코드가 프레임워크에 의해 호출되는 형태로 작동하며, 제어 역전(Inversion of Control)이라는 개념이 적용됩니다.
  
 ex:  스프링(Spring) , mybatis Angular 등

  
  요약하자면, 라이브러리는 개발자가 필요한 기능을 **선택적으로** 사용할 수 있는 도구 모음이며, 
  
  프레임워크는 개발자에게 애플리케이션의 기본 구조와 규칙을 제공하고 **정해진 방식으로** 개발을 진행하도록 도와주는 플랫폼입니다.
