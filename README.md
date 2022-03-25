# mountain-info
    전국 산 정보를 조회할 수 있는 사이트

## 설명
  * 산 정보를 공공 API를 통해 하루에 한번 조회 후 DB 입력 및 수정 진행
  * 공지사항 게시판을 통해 중요사항 게시
  * Q & A 게시판을 통해 사용자와 소통

## 사이트 구성
  * 메인 페이지
    + 지도 표시
      - 카카오맵 API를 사용하여 마커 표시 및 클릭 시 정보 노출
    + 리스트 표시
      - 전국 산 정보를 표시
      - Paging 기능
      - 산 정보 클릭 시 지도에서 마커 표시
  * 소개 페이지
  * 게시판
    + 공지사항
    + Q & A

## 공공 API 사용
  * [산림청_산 정보 조회](https://www.data.go.kr/data/15058682/openapi.do)
  * [산림청_산정보 서비스(국내 소재 3,368개 설명)](https://www.data.go.kr/data/15058662/openapi.do)

## 테이블 정보
  * 산 정보
    + ID, 이름 ...
  * 게시판

## 기술 스펙
  + 언어
    - java
  + Framework
    - Spring Boot, Mybatis
  + Database
    - mysql
  + Etc
    - github ...