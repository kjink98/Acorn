        // 로그라는 함수를 이용해
        // debugConsole이라는 id를 가진 요소의 콘텐츠에 덧붙임
        // msg 매개변수를 출력
        function log(msg) {
            const debug = document.getElementById("debugConsole");
            // debug에 debugConsole을 찾아 할당

            if(debug !== null){
                debug.innerHTML += msg + "<br/>";
            } // log의 값이 null이 아니라면 테두리안에 내용 입력
        }