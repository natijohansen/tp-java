<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Busqueda Electrodomesticos</title>
<style type="text/css">
  #divConsumo {display: none;}
  #divImporte {display: none;}
  label {display: block; margin: 10px;}
</style>
</head>
<body onload="init()">
  <form method="post" action="busqueda" onsubmit="return comprobar();">
    <p>Filtrar por:</p>
    <label><input type="checkbox" name="chkConsumo" id="chkConsumo" onclick="mostrarConsumo()"> Consumo
      <div id="divConsumo"> 
        <select name="consumo">
          <option value="A">A</option>
          <option value="B">B</option>
          <option value="C">C</option>
          <option value="D">D</option>
          <option value="E">E</option>
          <option value="F">F</option>
        </select>
      </div> 
    </label> 
    <label><input type="checkbox" name="chkImporte" id="chkImporte" onclick="mostrarImporte()"> Importe</label>    
    <div id="divImporte">
      <label>Minimo <input type="text" name="importeMinimo" id="importeMinimo"></label>
      <label>Maximo <input type="text" name="importeMaximo" id="importeMaximo"></label>      
    </div>
    <input type="reset" value="Limpiar">
    <input type="submit" value="Buscar">
  </form>

  <script type="text/javascript">
    function init() {
      document.getElementById('chkConsumo').checked = false;
      document.getElementById('chkImporte').checked = false;
    }
  
    function mostrarConsumo() {
      consumo = document.getElementById('chkConsumo').checked;
      if(consumo) {
        document.getElementById('divConsumo').style.display = "inline-block";
      }
      else {
        document.getElementById('divConsumo').style.display = "none"; 
      }
    }

    function mostrarImporte() {
      importe = document.getElementById('chkImporte').checked;
      if(importe) {
        document.getElementById('divImporte').style.display = "block";
      }
      else {
        document.getElementById('divImporte').style.display = "none"; 
      }
    }

    function comprobar() {
      chkImporte = document.getElementById('chkImporte').checked;
      if(chkImporte) {
        importeMinimo = document.getElementById('importeMinimo').value;
        importeMaximo = document.getElementById('importeMaximo').value;
        expReg= new RegExp(/^[0-9]+$/)

        if(!expReg.test(importeMinimo)) {
          alert('Importe Minimo Invalido');
          return false;
        }
        if(!expReg.test(importeMaximo)) {
          alert('Importe Maximo Invalido');
          return false;
        }
        if(importeMinimo >= importeMaximo) {
          alert('Importe Maximo debe ser mayor que importe minimo');
          return false;
        }

        return true;
      }
      else {
        return true;
      }
    }
  </script>
</body>
</html>