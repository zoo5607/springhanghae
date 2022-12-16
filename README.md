#1. spring 숙련 주차 개인 과제

###2. Use Case
![화면 캡처 2022-12-07 102731](https://user-images.githubusercontent.com/83705371/206065191-35e7414a-99e5-40d3-a11f-eab45675f1f9.png)

###3. ERD
![화면 캡처 2022-12-16 101306](https://user-images.githubusercontent.com/83705371/208001478-bf44f5a0-b57d-4554-933f-e7a4811bc0cc.png)

###4. API 명세서
|Index|Method|       URI       |        Decription          | 
|-----|------|-----------------|----------------------------|  
|    1|  POST|       /api/memos|              신규 메모 작성|            
|    2|   GET|       /api/memos|  등록된 전체 메모 목록 조회|
|    3|   PUT|  /api/memos/{id}|              메모 내용 변경|
|    4|DELETE|  /api/memos/{id}|                   메모 삭제|
|    5|  POST|  /api/user/signup|                   회원가입|
|    6|  POST|  /api/user/login|                   로그인|
