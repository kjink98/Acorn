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

# 4. 리액트 매뉴얼 설치
[*]Eslint & Prettier : Linter & Formatter
- JS 코드 작성 시 놓치는 부분을 도와주는 툴
- 주로 코드 컨벤션, 문법적 오류, 포매팅 등을 도와준다.
    - Eslint : https://eslint.org
        - npm init @eslint/config

    - Prettier : https://prettier.io
        - npm install --save-dev --save-exact prettier

    - eslint-plugin-prettier 플러그인
        - npm install --save-dev eslint-plugin-prettier
[*] TypeScript : Static Typechecker
- https://www.typescriptlang.org
    - npm i typescript --save-dev
- tsconfig.json

[*] Babel : Transpiler
- 최신 문법의 JS를 특정 버전의 JS로 변화해주는 툴
- 현재 작성된 코드가 다양한 환경에서 호환될 수 있도록 도와준다.
- 특히 리액트에서는 JSX문법을 JS로 변환해주는 역할
- https://babeljs.io
    - npm install --save-dev @babel/core @babel/cli
    - npm install --save-dev babel-loader
    - npm install @babel/preset-env --save-dev
    - babel.config.json 파일 생성

[*] Webpack : bundler
- 방대해진 JS 프로젝트 코드를 최적의 조건으로 전달할 수 있도록 프로젝트 코드를 모아서 적절한 기준으로 나눠 파일에 담는 역할
- https://webpack.js.org
    - npm install webpack webpack-cli --save-dev
    - npm install ts-loader --save-dev

[*] 리액트
- npm i react react-dom
- npm i -D @types/react @types/react-dom

[] webpack-dev-server
- npm install --save-dev webpack-dev-server
- npx webpack serve
- devServer.static
    - This option allows configuring options for serving static files from the directory (by default 'public' directory). To disable set it to false:
    - webpack.config.js

# 5. CRA 사용법
- https://create-react-app.dev
    - npx create-react-app my-app

- typescript 사용 시
    - npx create-react-app my-app --template typescript

# 6. Online Code Tool 이용
- https://codesandbox.io

# 7. Virtual DOM, ReactElement, JSX, ReactComponent

## (1) Virtual DOM
- 화면에 렌더링이 되지 않고, 메모리에만 존재하는 DOM
- DOM 변경 사항 => Virtual DOM => Real DOM

## (2) ReactElement
자기가 표현하고 싶은 무언가를 담고있는 내용
- React.createElement(type, [props], [...child])