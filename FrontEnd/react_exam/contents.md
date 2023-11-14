# 1. 리액트란?
사용자 인터페이스를 만들기 위한 JavaScript 라이브러리이다.
- Virtual DOM
- Component
    - 리액트로 만들어진앱을 이루는 최소한의 단위
    - 클래스형 컴퍼넌트, 함수형 컴퍼넌트

# 2. 프로젝트 구성 방법
## (1) 손수 작성하는 방법
    - babel, webpack, 그 외 툴 설치
## (2) CRA (Create React App)
## (3) Online Code Tool
    - CodeSandBox 사용

# 3. TypeScript
## (1) 특징
    - JS Static TypeChecker
    - 자바스크립트의 Superset
    - MS에서 만든 오픈소스
## (2) 실습 준비
### 1) 프로젝트 만들기
    - npm init
    - npm i -D typescript
### 2) 코드 작성 및 실행
    - ts파일을 작성하고 tsc로 컴파일
    - npx tsc practice.ts
        - js 파일로 만들어줌
    - tsconfig.json 설정파일
    - npx tsc -p ./tsconfig.json 
        - 만든 설정파일을 읽어서 실행할 수 있게
## (3) 기본 타입들
    - number
    - string
    - boolean
    - array
    - object
    - enum
    - any
    - unknown
    - void
    - never
    - undefined
## (4) Function
    - Parameter type
    - Return type

## (5) Union & Intersection
    - union
        + 여러 타입들 중 하나
        + Or(|) 연산자
    - Intersection
        + 여러 타입들을 하나로 결합
        + And(&) 연산자

## (6) Type Alias & Interface
타입에 대한 정의를 저장하여 재사용성을 높이는 타입 정의