<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!-- Sidebar  -->
<section>
    <!-- Left Sidebar -->
    <aside id="leftsidebar" class="sidebar">
        <!-- Menu -->
        <div class="menu" id="sidebarAdmin">
            <ul class="list">
                <li class="header">
                    <a href="${contextPath}/customer?action=list"><span>Customer management</span></a>
                </li>
    <li class="header">
    <a href="${contextPath}/service?action=list"><span>Service management</span></a>
    </li>
    <li class="header">
    <a href="${contextPath}/employee?action=list"><span>Employee management</span></a>
    </li>
            </ul>
        </div>
        <!-- #Menu -->
    </aside>
    <!-- #END# Left Sidebar -->
</section>