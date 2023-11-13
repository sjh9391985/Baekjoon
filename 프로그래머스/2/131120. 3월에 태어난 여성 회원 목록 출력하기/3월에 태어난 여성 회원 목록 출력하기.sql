-- 코드를 입력하세요
SELECT  MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(date_of_birth, '%Y-%m-%d')
FROM    MEMBER_PROFILE 
WHERE   Month(date_of_birth) = '03'
AND     GENDER = 'W'
AND     TLNO is not null;