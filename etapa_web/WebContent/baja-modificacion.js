document.getElementById('chkEliminar').checked = false;
document.getElementById('rdbElectrodomestico').checked = true;

function eliminar() {
	document.getElementById('chkEliminar').checked = true;

	if(window.confirm('Seguro que desea eliminar?')) {
		document.getElementById('form').submit();
	}
}

function modificar() {
	document.getElementById('form').submit();
}