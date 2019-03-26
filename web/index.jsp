<%-- 
    Document   : index
    Created on : 25 mars 2019, 13:31:04
    Author     : gai
--%>

<%@page import="dto.Vol"%>
<%@page import="java.util.List"%>

<%@page import="dao.daoAeroport"%>
<%@page import="dto.Aeroport"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    List <Aeroport> liste= daoAeroport.getAeroports();
    List <Vol> listeVol=daoAeroport.getVolParVille("Paris");
    request.setAttribute("listeAero", liste);
    request.setAttribute("listeVol", listeVol);
    for( Aeroport a : liste){
        System.out.println("Id="+ a.getIdAeroport()+ "****"+a.getNomAeroport()+"****"+a.getNomVilleDesservie());
    }
    

    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSSFormulaire.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Liste des aéroports de airMaf3</h1>
        
        <table id="cadre1">
        
            <c:forEach items="${listeAero}" var="aeroport">
                <tr>
                   <td><c:out value="${aeroport.idAeroport}" /></td>
                   <td> <c:out value="${aeroport.nomAeroport}" /></td>
                   <td><c:out value="${aeroport.nomVilleDesservie}" /></td>
                </tr>
            </c:forEach>
                
        </table>
        
        <h1>Liste des vols au départ de Paris</h1>
            
        <table id="cadre2">
                
              <c:forEach items="${listeVol}" var="vol">
                <tr>
                   <td>NumVol= <c:out value="${vol.numVol}" /></td>
                   <td>Aeroport de <c:out value="${vol.aeroportDept.nomVilleDesservie}"/> </td>
                   <td> Heure départ <c:out value="${vol.hdépart}" /></td>
                   <td>Heure arrivé <c:out value="${vol.harrivée}" /></td>
                </tr>
            </c:forEach>  
            
        </table>
        
      
        
    </body>
</html>
