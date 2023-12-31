## 컬렉션 프레임워크(collection framework)
자바에서 컬렉션 프레임워크(collection framework)란 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합을 의미합니다

즉, 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓은 것입니다.

 

이러한 컬렉션 프레임워크는 자바의 인터페이스(interface)를 사용하여 구현됩니다.

![0_uunOsk05Y0QEA6nP](https://github.com/parkminseok56/Java/assets/133790403/66611db9-1a91-4264-8e53-6148fc27dbae)

## 컬렉션 프레임워크 주요 인터페이스
컬렉션 프레임워크에서는 데이터를 저장하는 자료 구조에 따라 다음과 같은 핵심이 되는 주요 인터페이스를 정의하고 있습니다.

 

1. List 인터페이스

2. Set 인터페이스

3. Map 인터페이스

 

이 중에서 List와 Set 인터페이스는 모두 Collection 인터페이스를 상속받지만, 구조상의 차이로 인해 Map 인터페이스는 별도로 정의됩니다.

따라서 List 인터페이스와 Set 인터페이스의 공통된 부분을 Collection 인터페이스에서 정의하고 있습니다. 

 



 


주요 인터페이스 간의 상속 관계
자바에서 컬렉션 프레임워크를 구성하고 있는 인터페이스 간의 상속 관계는 다음 그림과 같습니다.

![img_java_collection_interface_diagram](https://github.com/parkminseok56/Java/assets/133790403/ca748d39-bdf1-4d42-8f3f-db86051a39a8)

 

컬렉션 프레임워크 인터페이스 다이어그램

 

위의 그림에서 <E>나 <K, V>라는 것은 컬렉션 프레임워크를 구성하는 모든 클래스가 제네릭으로 표현되어 있음을 알려줍니다.



## 주요 인터페이스의 간략한 특징
자바에서 컬렉션 프레임워크를 구성하고 있는 주요 인터페이스의 간략한 특징은 다음과 같습니다.

##### 인터페이스	설명	구현 클래스
- List<E> :	순서가 있는 데이터의 집합으로, 데이터의 중복을 허용함.	Vector, ArrayList, LinkedList, Stack, Queue

- Set<E>	: 순서가 없는 데이터의 집합으로, 데이터의 중복을 허용하지 않음.	HashSet, TreeSet
  
- Map<K, V>	: 키와 값의 한 쌍으로 이루어지는 데이터의 집합으로, 순서가 없음.

이때 키는 중복을 허용하지 않지만, 값은 중복될 수 있음.

###### 컬렉션 클래스(collection class)

컬렉션 프레임워크에 속하는 인터페이스를 구현한 클래스를 컬렉션 클래스(collection class)라고 합니다.

HashMap, TreeMap, Hashtable, Properties


 

컬렉션 프레임워크의 모든 컬렉션 클래스는 List와 Set, Map 인터페이스 중 하나의 인터페이스를 구현하고 있습니다.

또한, 클래스 이름에도 구현한 인터페이스의 이름이 포함되므로 바로 구분할 수 있습니다.

 

Vector나 Hashtable과 같은 컬렉션 클래스는 예전부터 사용해 왔으므로, 기존 코드와의 호환을 위해 아직도 남아 있습니다.

하지만 기존에 사용하던 컬렉션 클래스를 사용하는 것보다는 새로 추가된 ArrayList나 HashMap 클래스를 사용하는 것이 성능 면에서도 더 나은 결과를 얻을 수 있습니다.

 

ArrayList 클래스를 이용하여 리스트를 생성하고 조작하는 예제입니다.


```
import java.util.*;

 

public class Collection01 {

    public static void main(String[] args) {

        // 리스트 생성

        ArrayList<String> arrList = new ArrayList<String>();

 

        // 리스트에 요소의 저장

        arrList.add("넷");

        arrList.add("둘");

        arrList.add("셋");

        arrList.add("하나");

 

        // 리스트 요소의 출력

        for(int i = 0; i < arrList.size(); i++) {

            System.out.println(arrList.get(i));

        }

    }

}
```

** Array(배열)와 ArrayList의 차이점 

 - 크기 고정 vs. 동적 크기
 
    배열: 배열의 크기는 생성 시에 정해지며 나중에 크기를 변경하기 어렵습니다. 크기를 초과하는 데이터를 저장하려면 새 배열을 만들고 기존 데이터를 복사다.
    
    ArrayList: ArrayList는 동적으로 크기를 조절할 수 있으며 요소를 추가하거나 제거할 때 크기가 자동으로 조절됩니다.
   
 - 타입 제한
     배열: 배열은 특정 데이터 타입(예: int, String, 사용자 지정 클래스 등)으로 제한됩니다.
     
     ArrayList: ArrayList은 제네릭을 지원하여 어떤 데이터 타입이든 저장할 수 있습니다.

 - 속도
    배열: 배열은 고정 크기이며 원소에 직접 접근할 수 있어 빠른 읽기 및 쓰기 작업이 가능합니다.
   
    ArrayList: ArrayList는 배열에 비해 약간의 오버헤드가 있어 더 복잡한 데이터 구조이므로 일반적으로 배열보다 약간 느릴 수 있습니다.

- 메서드 및 유틸리티
  
    배열: 배열은 기본적인 길이 및 배열 요소를 다루는 메서드만 제공됩니다.
    
    ArrayList: ArrayList은 다양한 편리한 메서드 및 유틸리티를 제공하여 데이터를 쉽게 조작할 수 있습니다.

- 선언 및 초기화
  
   배열: 배열은 크기를 지정하고 직접 초기화해야 합니다.
  
   ArrayList: ArrayList은 생성자를 사용하여 초기화하며 크기 조절이 필요하지 않습니다.

- 가변성
배열: 한 번 크기가 정해지면 변경하기 어렵고 다른 배열로 복사해야 합니다.
ArrayList: 크기를 동적으로 조절할 수 있으므로 데이터 추가 및 삭제가 편리합니다.


## Collection 인터페이스
List와 Set 인터페이스의 많은 공통된 부분을 Collection 인터페이스에서 정의하고, 두 인터페이스는 그것을 상속받습니다.

따라서 Collection 인터페이스는 컬렉션을 다루는데 가장 기본적인 동작들을 정의하고, 그것을 메소드로 제공하고 있습니다.

 

Collection 인터페이스에서 제공하는 주요 메소드

## 메소드	설명
 - boolean add(E e)	: 해당 컬렉션(collection)에 전달된 요소를 추가함. (선택적 기능)
  
 - void clear()	: 해당 컬렉션의 모든 요소를 제거함. (선택적 기능)
  
 - boolean contains(Object o)	: 해당 컬렉션이 전달된 객체를 포함하고 있는지를 확인함.
  
 - boolean equals(Object o)	: 해당 컬렉션과 전달된 객체가 같은지를 확인함.
  
 - boolean isEmpty() : 해당 컬렉션이 비어있는지를 확인함.
  
 - Iterator<E> iterator() :	해당 컬렉션의 반복자(iterator)를 반환함.
  
 - boolean remove(Object o) :	해당 컬렉션에서 전달된 객체를 제거함. (선택적 기능)
  
 - int size()	: 해당 컬렉션의 요소의 총 개수를 반환함.
  
 - Object[] toArray()	 : 해당 컬렉션의 모든 요소를 Object 타입의 배열로 반환함.
