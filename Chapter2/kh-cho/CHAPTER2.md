# CHAPTER 2

### 1. 객체는 모든 곳에 존재

- 클래스 : 새로운 데이터 타입의 기초가 될 `프로퍼티`와 함수를 정의
- 멤버 : 클래스에 속한 `프로퍼티`나 함수
- 멤버 함수 : 특정 클래스에 속한 객체가 있어야만 사용될 수 있는 함수
- 객체 생성 : 클래스에 해당하는 `val이나 var` 값을 만드는 과정, `클래스의 인스턴스를 생성`

`클래스`는 상태와 행동을 정의하기 때문에 `Double이나 Boolean` 같은 내장 타입의 값도 `인스턴스`로 가리키기 가능

### 2. 클래스 만들기

> `IntRange`나 `String`처럼 미리 정의된 타입을 사용할 수 있을 뿐만 아니라, 직접 원하는 객체의 타입을 직접 원하는 객체의 타입을 정의할 수도 있다.
>

클래스를 `정의`함으로써 새로운 타입을 정의할 수 있다.

`코틀린`에서는 `class라는 키워드`를 사용해 새로운 유형의 객체를 만들어낸다.

클래스를 정의할 때는 `class 키워드`다음에 클래스 이름으로 쓸 `식별자`를 넣는다.

더 복잡한 클래스를 정의할 때는 `중괄호 {}` 를 사용해 `클래스의 특성`이나 행동 양식을 포함하는 `클래스 본문`을 정의한다.

`코틀린`에서는 `메서드`라는 용어보다는 `함수`라는 표현을 한다.

- 멤버 함수 : 클래스에 속한 함수
- 최상위 함수 : 클래스에 속하지 않은 함수

코드에서 `불필요`한데도 `this`를 사용한 경우가 있지만 사용하지 않는 것이 좋다.

### 3. `프로퍼티`

> `프로퍼티`는 클래스에 속한 `var이나 val`이다.
`프로퍼티`를 `정의`함으로써 클래스 안에서 상태를 유지한다.
>

멤버 함수는 `점 표기법`을 쓰지 않고 (즉, 해당 `프로퍼티`를 한정하지 않고) 자신이 속한 객체의 `프로퍼티`에 접근할 수 있다.

변경할 수 없으므로 최상위 수준에 `val`을 정의해도 안전하다.
하지만 가변(즉, `var`)인 `최상위 프로퍼티`를 선언하는 일을 `안티패턴`으로 간주된다.

프로그램이 `복잡`해질수록 공유된 가변 상태에 대해 제대로 추론하기 `워려워`지기 때문이다.

### 4. 생성자

> `생성자`에 정보를 전달해 새 객체를 `초기화`할 수 있다.
각각의 객체는 `서로 독립된 세계`다.
>

`val` 로 정의한 생성자 `파라미터`는 변경할 수 없고, `var` 로 정의한 `생성자 파라미터`는 `가변 프로퍼티`가 된다.

`override`라는 키워드는 이미 정의된 `toString() 메서드`의 정의를 대신할 진짜 새 정의를 제공하겠다는 뜻을 `코틀린`에게 전달한다. `override`를 `명시`함으로써 코드의 의도를 더 명확히 할 수 있고, (의도치 않게 같은 이름의 함수를 정의하는 등의) 실수를 줄일 수 있다.

### 5. 가시성 제한하기

> 작성한 `코드`르 며칠 또는 몇 주 동안 보지 않다가 다시 살펴보면 그 코드를 작성하는 더 좋은 방법이 보일 수도 있다.

변화해야 하는 요소와 동일하게 유지되어야 하는 요소를 분리하라.
>

가시성을 제어하기 위해 `코틀린`이나 다른 언어는 접근 변경자를 제공한다.

- `private` : 클래스 밖에서는 접근이 불가능
- `public` : 누구나 접근 가능

한 객체에 대해 참조를 여러 개 유지하는 경우를 `에일리어싱(aliasing)`이라고 하며, 이로 인해 `놀랄만한` 동작을 수행할 수 도 있다.

### 6. 패키지

> 프로그래밍에서 근본적인 원칙은 DRY, 즉 ‘반복하지 말라(Don’t Repeat Yourself)’는 의미를 지닌 약자로 나타낼 수 있다.
>

import 키워드를 사용해 다른 파일에 정의된 코드를 재사용할 수 있다.

import를 쓰는 방법 중 하나는 클래스, 함수, 프로퍼티 이름을 지정.

패키지는 연관 있는 코드를 모아둔 것이다.

as 키워드를 사용해 임포트하면서 이름을 변경할 수 있다.

관례적으로 패키지 이름은 소문자만 사용.

파일 이름이 항상 클래스 이름과 같아야하는 자바와 달리 코틀린에서는 소스 코드 파일 이름으로 아무 이름이나 붙여도 좋다

### 7. 테스트

> 프로그램을 빠르게 개발하려면 지속적인 테스트가 필수다.
>

테스트를 진행하지 않는다면 문제가 누적되고 어떤 변경으로 인해 문제가 발생했는지 더 이상 알 수 없게 된다.

그래서 문제의 원인을 찾기 위해 훨씬 더 오랜 시간을 들여야한다.

테스트는 중요한 개발 습관, 익숙해지자!

테스트 시스템

- 식의 예상 결괏값을 보여준다.
- 프로그램이 실행되고 있음을 알 수 있도록 출력을 제공한다.
- 개발을 배우는 과정에서 더 빨리 테스트의 개념을 몸에 익히게 된다.

테스트는 개발 과정에 포함되어야 가장 효과적

테스트 주도 개발(TDD)는 자신이 생각하는 대상을 정말로 테스트하고 있는지 확실히 확인할 수 있는 방법이다.

### 8. 예외

> ‘Exception’ 은 ‘ I take exception to that’에 있는 exception과 같은 뜻으로 쓰인다.
>

예외 상황은 현재 함수나 현재 영역의 진행을 막는다.
문제가 발생하면 그 위치에서 무슨 일을 해야 할지 알 수 없어 현재 맥락에서 계속 처리를 진행할 수 없다.

- 예외는 오류가 발생한 지점에서 ‘던져지는’ 객체이다.
- 예외가 던져지면 실행경로가 중단되고, 예외 객체는 현재 문맥을 벗어 난다.
- 예외를 잡아내지 않으면 중단되며 상세정보인 스택 트레이스가 출력된다.

목표는 향후 애플리케이션을 더 쉽게 지원할 수 있도록 가장 유요한 메시지를 제공하는 것.

### 9. 리스트

> List는 컨테이너(컬렉션이라고도 함), 즉 다른 객체를 담는 객체에 속한다.
>

코틀린은  List의 마지막 원소의 인덱스보다 더 큰 인덱스를 사용하면 항상 ArrayIndexOutOfBoundException을 던진다.

### 파라미터화한 타입

타입 추론을 사용하자! 코드를 더 깔끔하고 읽기 쉽게 만들어 주기 때문이다.

하지만 코틀린이 어떤 타입을 적용해야 할지 모르겠다는 불만을 표시하거나 코드를 더 이해하기 쉽게 작성하고 싶은 경우에는 직접 타입을 명시해야 한다.

자바와 같이 타입 파라미터를 표시한다.

list.add 와 같은 `+=`

List는 읽기 전용, 그래서 내용을 읽을 수는 있어도 안에 값을 쓸 수는 없다.