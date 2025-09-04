-- 코드를 입력하세요
SELECT a.APNT_NO,
       p.PT_NAME,
       p.PT_NO,
       d.MCDP_CD,
       d.DR_NAME,
       a.APNT_YMD
FROM APPOINTMENT a JOIN
     DOCTOR d ON a.MDDR_ID=d.DR_ID JOIN 
     PATIENT p ON a.PT_NO=p.PT_NO
WHERE a.APNT_CNCL_YN = 'N' AND
      d.MCDP_CD = 'CS' AND
      DATE(a.APNT_YMD) = '2022-04-13'
ORDER BY a.APNT_YMD ASC;