const searchEl = document.querySelector('.search');
const searchInputEl = document.querySelector('input');

// 돋보기 아이콘 눌러도 검색이 되게 구현
searchEl.addEventListener('click', () => {
    searchInputEl.focus();
});

searchInputEl.addEventListener("focus", () => {
    // input에 focus가 됐으면 focused라는 클래스 추가
    searchEl.classList.add('focused')
    // 통합검색 placeholder 속성 추가
    searchInputEl.setAttribute("placeholder", "통합 검색");
});

// focus를 잃었을 때
searchInputEl.addEventListener("blur", () => {
    // input에 focus가 사라지면 focused라는 클래스 제거
    searchEl.classList.remove('focused')
    // 통합검색 placeholder 속성 제거
    searchInputEl.setAttribute("placeholder", "");
});

const badgeE1 = document.querySelector('header .badges')

const toTopEl = document.querySelector('#to-top')
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
window.addEventListener('scroll', _.throttle(() => {
    // console.log(window.scrollY);
    if (window.scrollY > 500){
        gsap.to(badgeE1, .6, { opacity: 0, display: 'none' })
        // 상단으로 스크롤 버튼 보이기!
        gsap.to(toTopEl, .2, {
            x: 0
          })
    }
        // gsap.to(요소, 지속시간, 옵션)
        
    else {
        gsap.to(badgeE1, .6, { opacity: 1, display: 'block' })
        // 상단으로 스크롤 버튼 숨기기!
        gsap.to(toTopEl, .2, {
            x: 100
          })
    }
}, 300))

// 상단으로 스크롤 버튼을 클릭하면,
toTopEl.addEventListener('click', function () {
    // 페이지 위치를 최상단으로 부드럽게(0.7초 동안) 이동.
    gsap.to(window, .7, {
      scrollTo: 0
    })
  })

// Visual Image를 순차적으로 나타나게 하는 기능
const fadeEls = document.querySelectorAll('.visual .fade-in');
// forEach 반복으로 실행
// delay : 각각의 요소들을 개별적으로 따로따로
// cnt가 1증가 할때마다 .7초 씩 지연
fadeEls.forEach((el, cnt) => {
    gsap.to(el, 1, { opacity: 1, delay: (cnt + 1) * .7 })
})

// 슬라이드 요소 관리
new Swiper('.notice-line .swiper-container', {
    direction: 'vertical',
    loop: true,
    autoplay: true
})

new Swiper('.promotion .swiper-container', {
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
        nextEl: '.swiper-next',
        prevEl: '.swiper-prev',
    }
})

new Swiper('.awards .swiper-container', {
    // direction: 'horizontal', // 수평 슬라이드
    autoplay: true, // 자동 재생 여부
    loop: true, // 반복 재생 여부
    spaceBetween: 30, // 슬라이드 사이 여백
    slidesPerView: 5, // 한 번에 보여줄 슬라이드 개수
    // slidesPerGroup: 5, // 한 번에 슬라이드 할 개수(전체 개수로 나뉘어야 함)
    navigation: { // 슬라이드 이전/다음 버튼 사용 여부
      prevEl: '.awards .swiper-prev', // 이전 버튼 선택자
      nextEl: '.awards .swiper-next' // 다음 버튼 선택자
    }
  })

// Promotion 토글
// 나타날건지 사라질건지 표시만 자바스크립트에서
// 실제 구현은 css 에서
const promotionEl = document.querySelector(".promotion")
const promotionToggleBtn = document.querySelector(".toggle-promotion")
let isHidePromotion = false;

promotionToggleBtn.addEventListener('click', () => {
    if (isHidePromotion) {
        promotionEl.classList.remove("hide");
        isHidePromotion = false;
    }
    else {
        promotionEl.classList.add("hide");
        isHidePromotion = true;
    }
})

// 떠다니는(부유하는) 요소를 만드는 함수
function rand(min, max) {
    return parseFloat((Math.random() * (max - min) + min).toFixed(2))
}
function floatingObject(selector, delay, size) {
    gsap.to(selector, rand(1.5, 2.5), {
        y: size,
        repeat: -1, // 무한반복
        yoyo: true,
        delay: rand(0, delay),
        ease: Power1.easeInOut
    })
}
floatingObject('.floating1', 1, 15);
floatingObject('.floating2', .5, 15);
floatingObject('.floating3', 1.5, 20);

// Product를 순차적으로 나타나게 하는 기능
const spyEls = document.querySelectorAll('section.scroll-spy')
// 요소들 반복 처리!
spyEls.forEach(function (spyEl) {
  new ScrollMagic
    .Scene({ // 감시할 장면(Scene)을 추가
      triggerElement: spyEl, // 보여짐 여부를 감시할 요소를 지정
      triggerHook: .8 // 화면의 80% 지점에서 보여짐 여부 감시
    })
    .setClassToggle(spyEl, 'show') // 요소가 화면에 보이면 show 클래스 추가
    .addTo(new ScrollMagic.Controller()) // 컨트롤러에 장면을 할당(필수!)
})


/**
 * 올해가 몇 년도인지 계산
 */
const thisYear = document.querySelector('.this-year')
thisYear.textContent = new Date().getFullYear()
