<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
  <meta charset="UTF-8">
  <title>Result-Page</title>
  <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div>
  <h2>Dices!</h2>
  <table border="1px solid black">
    <thead>
      <tr>
        <th>Primary Key</th>
        <th>Color</th>
        <th>Number</th>
        <th>InsertTimestamp</th>
        <th>LastRollTimestamp</th>
      </tr>
    </thead>
    <tbody>
        <c:forEach var="dice" items="${dices}">
            <tr>
            <td>${dice.id}</td>
            <td>${dice.color}</td>
            <td>${dice.number}</td>
            <td>${dice.insertTimestamp}</td>
            <td>${dice.lastRollTimestamp}</td>
            </tr>
        </c:forEach>
    </tbody>
  </table>
  </br>
  </br>
  <div>
    <a href="/">Click here</a> to return to the start page!
  </div>
</div>
</body>
</html>