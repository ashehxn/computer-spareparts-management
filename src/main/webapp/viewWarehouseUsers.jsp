<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
<link rel="stylesheet" href="./css/admindash.css">
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
                        <form method="get" action="WarehouseUserViewServlet">
	                        <input type="text" name="searchQuery" placeholder="Search here">
	                        <ion-icon name="search-outline"></ion-icon>
	                    </form>
                    </label>
                </div>

                <div class="user">
                    <img src="https://previews.dropbox.com/p/thumb/ACGHCXbb75OMs9g20hVYg9HCEt6TNbDs-vhUBa3jAmP1V3ALk6ooTtwqYEV19sJvVlTiMKOe230rBa_Y9wkvQtnTgPdS72gqa5tDPUTAXjQnp6Gqe8xTI13Y47bzPG9Ys8dyCtWptGAk-sUqDNVwZ2mskzcHHque1JdPa6qi0jPiju5Jz4NRVlNu27V1R9Fcu_G0xZB1nHnDLZ1oOS-LaxpePTLspVFWqX-XD6DOJ_wh11Z4sa7QdPNi3FSblfyojpFRwLzargH8FobYJXATq6ygNxEkJcTr-4YVCG--HLdNM6qCBIkZiI5PJ3eh5JOZDs63O15NHsgs7Ff07wLkYk1Q/p.jpeg" alt="avatar">
                </div>
            </div>

 
            <div class="details">
                <div class="detailRows">
                    <div class="cardHeader">
                        <h2>Warehouse Users</h2>
                    </div>

                    <table>
                        <thead>
                            <tr>
                                <td>ID</td>
								<td>Name</td>
								<td>Username</td>
								<td>Type</td>
								<td>Warehouse ID</td>
								<td>Admin ID</td>
                            </tr>
                        </thead>

                        <tbody>
                           <c:forEach var="warehouseUsers" items="${warehouseUsers}">
				
								<tr>
									<td>${warehouseUsers.staffId}</td>
									<td>${warehouseUsers.name}</td>
									<td>${warehouseUsers.username}</td>
									<td>${warehouseUsers.type}</td>
									<td>${warehouseUsers.warehouseId}</td>
									<td>${warehouseUsers.adminId}</td>
								</tr>
								
							</c:forEach>
                        </tbody>
                    </table>
                </div>

            </div>
        </div>
    </div>

   
    <script src="./js/main.js"></script>

    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
	
</body>
</html>