/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function iniciar(){
  var addBtn = document.getElementById('salvar');
  addBtn.addEventListener("click",adicionar);  
}


function adicionar(){
  var nome = document.querySelector("#divAlert").value;
  var txt = alert("CADASTRADO COM SUCESSO!");
  var p = document.createElement("p");
  p.textContent = txt;
  var listagem = document.querySelector("#divAlert");
  listagem.appendChild(p);
  
}

window.addEventListener("load",iniciar);
