devtools

@PersistenceContext

@GeneratedValue

EntityManager
persist

영속성 컨텍스트

p6spy

데이터베이스 설계 방향

엔티티 설계 규칙

@Embedded

@Embeddable

@ManyToOne

@LocalDteTime

@Inheritance(strategy = InheritanceType)

@DiscriminatorValue

도메인 모델 패턴

@Enumerated(EnumType.ORDINAL)

@Enumerated(EnumType.STRING)

@JoinTable
joinColumns
inverseJoinColumns

테이블 카테고리 설계

@ManyToOne(fetch = FetchType.LAZY)

cascade = CascadeType.ALL

n+1 문제

영속성

연관관계 메서드

jpql과 sql 차이

jpql이 무엇인가

@Transactional(readOnly = true)

@RequiredArgsConstructor

점점점(...) 문법
-varargs 또는 가변인자라고 하며 OrderItem이 0개부터 여러개 까지 매개변수로 올수있는걸 뜻

.stream().mapToInt

도메인 모델패턴과 트랜잭션 스크립트 패턴의 차이

assert문법

createQuery

동적쿼리, 동적쿼리 생성방법

mybatis를 쓰는 이유 - 동적쿼리를 생성하기 편해서

findAllByCriteria - Criteria

JPA Criteria -

queryDSL

th:object -> 이 안에서는 이 객체를 쓰겠다

th:field= "*{name}"  ->설정해 준 값으로, th:object에 설정해 준 객체의 내부와 매칭

@vaild

BIndingResult

javax.vaildation

더티채킹

변경감지