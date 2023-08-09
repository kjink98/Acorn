const searchEl = document.querySelector('.search');
const searchInputEl = document.querySelector('input');

// 돋보기 아이콘 눌러도 검색이 되게 구현
searchEl.addEventListener('click',()=>{
    searchInputEl.focus();
});

searchInputEl.addEventListener("focus",()=>{
    // input에 focus가 됐으면 focused라는 클래스 추가
    searchEl.classList.add('focused')
    // 통합검색 placeholder 속성 추가
    searchInputEl.setAttribute("placeholder", "통합 검색");
});

// focus를 잃었을 때
searchInputEl.addEventListener("blur",()=>{
    // input에 focus가 사라지면 focused라는 클래스 제거
    searchEl.classList.remove('focused')
    // 통합검색 placeholder 속성 제거
    searchInputEl.setAttribute("placeholder", "");
});

const badgeE1 = document.querySelector('header .badges')

// lodash cdn 검색
// 열, 객체 및 문자열 반복 / 복합적인 함수 생성
// throttle : 속도 조절
// 0.3초 간격으로 함수를 호출하겠다.
// window.addEventListener('scroll', _.throttle(()=>{
//     // console.log(window.scrollY);
//     if(window.scrollY > 500)
//         badgeE1.style.display = 'none';
//     else badgeE1.style.display = 'block';
// }, 300))

// gsap cdn 검색
// 애니메이션 자연스럽게
window.addEventListener('scroll', _.throttle(()=>{
    // console.log(window.scrollY);
    if(window.scrollY > 500 )
        // gsap.to(요소, 지속시간, 옵션)
        gsap.to(badgeE1, .6, {opacity:0, display:'none'})
    else gsap.to(badgeE1, .6, {opacity:1, display:'block'})
}, 300))

// Visual Image를 순차적으로 나타나게 하는 기능
const fadeEls = document.querySelectorAll('.visual .fade-in');
// forEach 반복으로 실행
// delay : 각각의 요소들을 개별적으로 따로따로
// cnt가 1증가 할때마다 .7초 씩 지연
fadeEls.forEach((el, cnt)=>{
    gsap.to(el, 1, {opacity:1, delay:(cnt + 1) * .7})
})

// 슬라이드 요소 관리
new Swiper('.notice-line .swiper', {
    direction: 'vertical',
    loop: true,
    autoplay: true
})

new Swiper('.promotion .swiper', {
    direction: 'horizontal', // horizontal이 기본값, 생략 가능
    slidesPerView: 3, // 한번에 보여줄 슬라이드 개수
    loop: true,
    spaceBetween: 10, // 슬라이드 간의 여백
    centeredSlides: true, // true 인 경우 1번 슬라이드는 항상 왼쪽이 아닌 가운데에 배치
    // autoplay: {
    //     delay: 5000
    // }

    // If we need pagination. 페이지 나누고 구현
    pagination: {
        el: '.swiper-pagination',
        clickable: true
      },
    
      // Navigation arrows. 화살표
      navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
      }
})