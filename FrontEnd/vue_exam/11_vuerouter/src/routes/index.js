import {createRouter, createWebHashHistory} from 'vue-router'
import Home from './Home'
import About from './About'

export default createRouter ({
    // Hash(createWebHashHistory()), History(createWebHistory())
    // https://google.com/#/login => Hash (페이지 새로고침을 하지 않는다.)
    // https://google.com/login => History (페이지가 없을 경우 404에러를 볼 수 있음) (페이지가 없을 때 보여줄 수 있는 오류 페이지를 만들어야 함 -> 서버가 필요함)
    history: createWebHashHistory(),
    // 실제 어떤 경로가 들어왔을 때 연결 시켜줌
    routes: [
        {
            path: "/", // https://google.com
            component: Home
        },
        {
            path: "/about", // https://google.com/about
            component: About
        }
    ]
})