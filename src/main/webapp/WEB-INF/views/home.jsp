<%@ page language="java" contentType="text/html; charset=EUC-KR"
pageEncoding="EUC-KR"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>parameter01.jsp �ĸ����Ͱ� �Է� ������</title>
</head>
<body>
<!-- get ����� ����ؼ� ������ ���� (method="get") -->
<form action="gethome.jsp" method="get">
    �̸� : <input type="text" name="name" size="10"><br>
    �ּ� : <input type="text" name="address" size="30"><br>
    ��� :
    <input type="checkbox" name="hobby" value="game">����
    <input type="checkbox" name="hobby" value="travel">����
    <input type="checkbox" name="hobby" value="reading">����
    <br>
    <input type="submit" value="����">
</form>
</body>
</html>

