<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
<link rel="stylesheet" href="style.css">
<link
	rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/fpnt-awesome/6.4.0/css/all.min.css"
>
</head>
<body>
	<!-- =============== Navigation ================ -->
    <div class="container">
        <div class="navigation">
            <ul>
                <li>
                    <a href="#">
                        <span class="icon">
                            <ion-icon name="logo-microsoft"></ion-icon>
                        </span>
                        <span class="title">Admin Dashboard</span>
                    </a>
                </li>

                <li>
                    <a href="adminDashboard.jsp">
                        <span class="icon">
                            <ion-icon name="home-outline"></ion-icon>
                        </span>
                        <span class="title">Dashboard</span>
                    </a>
                </li>

                <li>
                    <a href="chooseUserToShow.jsp">
                        <span class="icon">
                            <ion-icon name="people-outline"></ion-icon>
                        </span>
                        <span class="title">View Users</span>
                    </a>
                </li>

                <li>
                    <a href="chooseUserToAdd.jsp">
                        <span class="icon">
                            <ion-icon name="person-add-outline"></ion-icon>
                        </span>
                        <span class="title">Add Users</span>
                    </a>
                </li>

                <li>
                    <a href="chooseUserToManage.jsp">
                        <span class="icon">
                            <ion-icon name="person-remove-outline"></ion-icon>
                        </span>
                        <span class="title">Manage Users</span>
                    </a>
                </li>

                <li>
                    <a href="http://localhost:8090/ComputerSpareParts2/AdminLogoutServlet">
                        <span class="icon">
                            <ion-icon name="log-out-outline"></ion-icon>
                        </span>
                        <span class="title">Sign Out</span>
                    </a>
                </li>
            </ul>
        </div>


        <div class="main">
            <div class="topbar">
                <div class="toggle">
                    <ion-icon name="menu-outline"></ion-icon>
                </div>

                <div class="search">
                    <label>
                        <input type="text" placeholder="Search here">
                        <ion-icon name="search-outline"></ion-icon>
                    </label>
                </div>

                <div class="user">
                    <img src="https://upload.wikimedia.org/wikipedia/commons/a/a6/Profile_picture_3_edited_%281%29.jpg" alt="avatar">
                </div>
            </div>

 
            <div class="details">
                <div class="detailRows">
                    <div class="cardHeader">
                        <h2>Shop Managers</h2>
                    </div>

                    <table>
                        <thead>
                            <tr>
                                <td>ID</td>
								<td>Name</td>
								<td>Username</td>
								<td>Admin ID</td>
								<td>Action</td>
                            </tr>
                        </thead>

                        <tbody>
                           <c:forEach var="shopUsers" items="${shopUsers}">
				
								<tr>
									<td>${shopUsers.id}</td>
									<td>${shopUsers.name}</td>
									<td>${shopUsers.username}</td>
									<td>${shopUsers.adminId}</td>
									<td>
										<a href="ShopUserEditServlet?id=<c:out value='${shopUsers.id}' /> ">Edit</a>
										<a href="ShopUserDeleteServlet?id=<c:out value='${shopUsers.id}'/> ">Delete</a>
									</td>
								</tr>
								
							</c:forEach>
                        </tbody>
                    </table>
                </div>

            </div>
        </div>
    </div>

   
    <script src="main.js"></script>

    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
	
</body>
</html>