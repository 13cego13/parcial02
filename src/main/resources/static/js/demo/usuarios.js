// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
  $('#usurious').DataTable();
});

 async function cargarUsuarios() {

  const request = await fetch('usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const usuarios = await request.json();

  let listadohtml = '';
  for(let usuario of usuarios) {

   let usuariohtml = '<tr><td>'+usuario.id+'</td><td>'+usuario.nombre+' '+usuario.apellido+'</td><td>'+usuario.email+'</td><td>'+usuario.telefono+'</td><td> <a href="#" class="btn btn-success btn-circle btn-lg"> <i class="fas fa-check"></i></a></td> </tr>';

   listadohtml += usuariohtml;

  }

  console.log(usuarios);

  

  document.querySelector('#usurious tbody').outerHTML = listadohtml;

}