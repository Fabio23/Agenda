<%-- 
    Document   : cadastro
    Created on : 30/06/2017, 15:31:22
    Author     : fabio.ribeiro
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Formulario</title>
        <link href="estilo.css" type="text/css" rel="stylesheet"/>
        <script src="programa.js" type="text/javascript"></script>
    </head>
    <body>
        <fieldset>
            <div id="divAlert">                
            </div>
            <legend><h1>Cadastro</h1></legend>
            <form method="post" action="Servlet" id="form">
                <div class="form">
                    <h3>Dados Pessoais</h3>
                    <div class="campo">		  
                        <label for="nome">Nome</label>
                        <input type="text" name="nome" id="nome" size="60" />
                    </div>
                    <div class="campo">
                        <label for="email">E-mail</label>
                        <input type="text" name="email" id="email" size="60" />
                    </div>
                    <div class="campo">
                        <label for="dataNasc">Data Nascimento</label>
                        <input type="date" name="dataNasc" id="dataNasc" />
                    </div>
                    <div class="campo">
                        <label for="telefone">Telefone</label>
                        <input type="text" name="telefone" id="telefone" />
                    </div>
                    <div class="campo">
                        <label for="celular">Celular</label>
                        <input type="text" name="celular" id="celular" />
                    </div>
                    <br>
                    <h3>Endereço</h3>
                    <div class="campo">
                        <label for="endereco">Rua</label>
                        <input type="text" name="rua" id="rua" size="60" />
                    </div>
                    <div class="campo">
                        <label for="numero">Numero</label>
                        <input type="text" name="numero" id="numero" />
                    </div>
                    <div class="campo">
                        <label for="complemento">Complemento</label>
                        <input type="text" name="complemento" id="complemento" size="20"/>
                    </div>
                    <div class="campo">
                        <label for="bairro">Bairro</label>
                        <input type="text" name="bairro" id="bairro" size="60"/>
                    </div>
                    <div class="campo">
                        <label for="cep">CEP</label>
                        <input type="text" name="cep" id="cep" />
                    </div>			
                    <button id="salvar" type="submit">Salvar</button>
                    <button id="cancelar" type="reset">Cancelar</button>
                </div>
            </form>
        </fieldset>
    </body>
</html>
