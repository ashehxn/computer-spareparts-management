<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

 
            <div class="alertBox">
            	<img src="data:image/png;base64,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">
            	<h2>Insert Unsuccessful!</h2>
            </div>
        </div>
    </div>

   
    <script src="./js/main.js"></script>

    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
	
</body>
</html>