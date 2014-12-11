<!DOCTYPE html>
<html>
<head>
  <title>Alta</title>
  <style type="text/css">
  label {display: block;}
  </style>
</head>
<body>

<form method="post" action="alta">
<fieldset>
<legend>Alta Televisor</legend>
  <label>Precio Base: <input type="text" name="precioBase"/></label>
  <label>Peso: <input type="text" name="peso"/></label>
  <label>Color: 
    <select name="color">
      <option value="blanco">Blanco</option>
      <option value="negro">Negro</option>
      <option value="rojo">Rojo</option>
      <option value="azul">Azul</option>
      <option value="gris">Gris</option>
    </select>
  </label>
  <label>Consumo: 
    <select name="consumo">
      <option value="A">A</option>
      <option value="B">B</option>
      <option value="C">C</option>
      <option value="D">D</option>
      <option value="E">E</option>
      <option value="F">F</option>
    </select>
  </label>
  <label>Descripcion: <textarea name="descripcion"></textarea></label>
  <label>Resolucion: <input type="text" name="resolucion"/></label>
  <label>TDT: <input type="checkbox" name="tdt"/></label>

  <input type="submit" value="Guardar">
  <input type="reset" value="Limpiar">
</fieldset>
</form>
</body>
</html>