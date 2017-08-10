<%@ page import="br.unipar.aulajsp.model.domain.Pessoa" %>
<html>
<head>
<title>Projeto JSP | Resultado</title>
</head>
<body>
	<%
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
	
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setEndereco(endereco);
		pessoa.setEmail(email);
		
		out.println(pessoa);
	%>
</body>
</html>