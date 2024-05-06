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

                <div class="user">
                    <img src="https://previews.dropbox.com/p/thumb/ACGHCXbb75OMs9g20hVYg9HCEt6TNbDs-vhUBa3jAmP1V3ALk6ooTtwqYEV19sJvVlTiMKOe230rBa_Y9wkvQtnTgPdS72gqa5tDPUTAXjQnp6Gqe8xTI13Y47bzPG9Ys8dyCtWptGAk-sUqDNVwZ2mskzcHHque1JdPa6qi0jPiju5Jz4NRVlNu27V1R9Fcu_G0xZB1nHnDLZ1oOS-LaxpePTLspVFWqX-XD6DOJ_wh11Z4sa7QdPNi3FSblfyojpFRwLzargH8FobYJXATq6ygNxEkJcTr-4YVCG--HLdNM6qCBIkZiI5PJ3eh5JOZDs63O15NHsgs7Ff07wLkYk1Q/p.jpeg" alt="avatar">
                </div>
            </div>

 
            <div class="form">
            	<div class="formRows">
            
	            	<h2>Edit Warehouse User Details</h2>
	                
	                <c:if test="${warehouseUser != null}">
						<form action="WarehouseUserUpdateServlet" method="post">
					</c:if>
						
							<c:if test="${warehouseUser != null}">
								<h4>ID: </h4>
								<div class="inputContainer">
									<input type="number" name="id" class="inputField" value="<c:out value='${warehouseUser.staffId}' />" readonly><br>
								</div>
							</c:if>
							<c:if test="${warehouseUser != null}">
								<h4>Name: </h4>
								<div class="inputContainer">
									<input type="text" name="name" class="inputField" value="<c:out value='${warehouseUser.name}' />"><br>
								</div>
							</c:if>
							<c:if test="${warehouseUser != null}">
								<h4>Username: </h4>
								<div class="inputContainer">
									<input type="text" name="user" class="inputField" value="<c:out value='${warehouseUser.username}' />"><br>									
								</div>
							</c:if>
							<c:if test="${warehouseUser != null}">
								<h4>Password: </h4>
								<div class="inputContainer">
									<input type="password" name="pass" class="inputField" value="<c:out value='${warehouseUser.password}' />"><br>
								</div>
							</c:if>
							<c:if test="${warehouseUser != null}">
								<h4>Type: </h4>
								<div class="inputContainer">
									<input type="text" name="type" class="inputField" value="<c:out value='${warehouseUser.type}' />" ><br>
								</div>
							</c:if>
							<c:if test="${warehouseUser != null}">
								<h4>Warehouse ID: </h4>
								<div class="inputContainer">
									<input type="number" class="inputField" name="warehouseId" value="<c:out value='${warehouseUser.warehouseId}' />"> <br>
								</div>
							</c:if>
							<c:if test="${warehouseUser != null}">
								<h4>Supervising Admin ID: </h4>
								<div class="inputContainer">
									<input type="number" name="adminId" class="inputField" value="<c:out value='${warehouseUser.adminId}' />"><br>
								</div>
							</c:if>
							
							<div class="submitContainer">
								<input type="submit" name="submit" value="Save" class="submit">
							</div>
				
						</form>
				</div>
            </div>
        </div>
    </div>

   
    <script src="./js/main.js"></script>

    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
	

</body>
</html>