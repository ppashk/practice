<!doctype html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:import url="common/head.jsp"/>
</head>
<body>
<div id="wrapper">
    <c:import url="common/header.jsp"/>
    <main>
        <div class="slider-content">
            <p class="slider-phrase-1">there are planty of places</p>
            <p class="slider-phrase-2">that are worth seeing</p>
            <div class='slider'>
                <input type="radio" name="slider1" id="slider1-1" checked="checked">
                <div>
                    <img src='${pageContext.request.contextPath}/static/img/slider-1.jpg' alt='1'>
                </div>
                <label for="slider1-4"></label>
                <label for="slider1-2"></label>
                <input type="radio" name="slider1" id="slider1-2">
                <div>
                    <img src='${pageContext.request.contextPath}/static/img/slider-2.jpg' alt='2'>
                </div>
                <label for="slider1-1"></label>
                <label for="slider1-3"></label>
                <input type="radio" name="slider1" id="slider1-3">
                <div>
                    <img src='${pageContext.request.contextPath}/static/img/slider-3.jpg' alt='3'>
                </div>
                <label for="slider1-2"></label>
                <label for="slider1-4"></label>
                <input type="radio" name="slider1" id="slider1-4">
                <div>
                    <img src='${pageContext.request.contextPath}/static/img/slider-4.jpg' alt='4'>
                </div>
                <label for="slider1-3"></label>
                <label for="slider1-1"></label>
            </div>
        </div>
        <div class="destination-content">
            <h2>top destinations</h2>

            <div class="list">
                <ul>
                    <li class="list-item">
                        <img src="${pageContext.request.contextPath}/static/img/vien.jpg" alt="vena">
                        <div class="info">
                            <p class="name">venice</p>
                            <p class="inform">${destinations}</p>
                            <p class="buttom">
                                <a href="https://github.com">Details</a>
                            </p>
                        </div>
                    </li>
                    <li class="list-item">
                        <img src="${pageContext.request.contextPath}/static/img/newyork.jpg" alt="newy">
                        <div class="info">
                            <p class="name">venice</p>
                            <p class="inform">${destinations}</p>
                            <p class="buttom">
                                <a href="https://github.com">Details</a>
                            </p>
                        </div>
                    </li>
                    <li class="list-item">
                        <img src="${pageContext.request.contextPath}/static/img/paris.jpg" alt="paris">
                        <div class="info">
                            <p class="name">venice</p>
                            <p class="inform">${destinations}</p>
                            <p class="buttom">
                                <a href="https://github.com">Details</a>
                            </p>
                        </div>
                    </li>

                </ul>

            </div>

        </div>
        <div class="content-3">

            <div class="content-3-1">
                <ul>
                    <li>
                        <a href="#">last minute</a>
                    </li>
                    <li>
                        <a href="#">hot deals</a>
                    </li>
                    <li>
                        <a href="#">all-inclusive</a>

                    </li>
                </ul>
                <div class="content-3-border">
                    <div class="content-3-2">
                        <img src="${pageContext.request.contextPath}/static/img/content.jpg" alt="content">
                        <div>
                            <h4>Rem psum dr sit </h4>
                            <p>${last_minute_one}</p>
                            <div class="content-buttom">
                                <span>Details</span>
                            </div>
                        </div>
                    </div>
                    <div class="content-3-2 content-3-3">
                        <img src="${pageContext.request.contextPath}/static/img/content.jpg" alt="content">
                        <div>
                            <h4>Rem psum dr sit</h4>
                            <p>${last_minute_two}</p>
                            <div class="content-buttom">
                                <span>Details</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="sidebar">
                <h3>newsletter</h3>
                <p>Sign up to receive our newsletters </p>
                <form action="1">
                    <label>
                        <input class="email" type="email" name="email address" placeholder="email address">
                    </label>
                </form>
                <ul>
                    <li>Fgo psu dr sit </li>
                    <li>Sem psum dr sit ametre </li>
                    <li>Rame sum dr sit ame </li>
                    <li>Bem psum dr sit ameteko </li>
                    <li>Nem dsum dr sit </li>
                    <li>Vcem psum dr </li>
                    <li>Zdfem psum dr sittr </li>
                </ul>
            </div>
        </div>
    </main>
    <c:import url="common/footer.jsp"/>
</div>
</body>
</html>