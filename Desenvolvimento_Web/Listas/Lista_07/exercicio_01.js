const express = require("express")
const app = express()
const port = 5000

let usuarios = [
    {
        nomeUsuario: "Rafael Castro",
        criadoEm: "25/03/2022",
        idade: 25,
        email: "rafael@email.com.br",
        isAdmin: true,
        telefone: ["(11) 955212635","(11) 956687415","(15) 925889532"],
        endereco: ["Rua das Laranjas","Rua das Maçãs","Rua das Peras"]
    },
    {
        nomeUsuario: "Henrique Gonzales",
        criadoEm: "13/7/2021",
        idade: 32,
        email: "henrique@email.com.br",
        isAdmin: true,
        telefone: ["(41) 99177-4210","(61) 99235-2263","(69) 98018-4088"],
        endereco: ["Avenida Conselheiro Carrão","Rua Eugênio Grieco"]
    },
    {
        nomeUsuario: "Diego Goobi",
        criadoEm: "20/09/2020",
        idade: 28,
        email: "diego@email.com.br",
        isAdmin: false,
        telefone: ["(67) 98952-7521","(45) 98951-9544"],
        endereco: ["Rua Ismael Neri","Rua Paracatu","Rua das Tulipas"]
    },
    {
        nomeUsuario: "Leuzimaria Veloso",
        criadoEm: "01/03/2023",
        idade: 30,
        email: "leuzimario@email.com.br",
        isAdmin: false,
        telefone: ["(28) 97526-1561","(99) 96772-3363"],
        endereco: ["Rua Amambaí","Rua Saint-Germain"]
    },
    {
        nomeUsuario: "Lucas França",
        criadoEm: "13/02/2020",
        idade: 26,
        email: "lucas@email.com.br",
        isAdmin: true,
        telefone: ["(87) 97280-3495","(74) 97577-5146"],
        endereco: ["Rua Nova Gales do Sul"]
    }
]

let produtos = [
    {
        nomeProduto: "Cogumelo",
        descricao: "Ótimo para crescimento rápido, resistência e maior força",
        valor: 5,
        criadoEm: "13/09/1985",
        emEstoque: true
    },
    {
        nomeProduto: "Flor de fogo",
        descricao: "Para deixar seus inimigos tostados",
        valor: 10,
        criadoEm: "13/09/1985",
        emEstoque: true
    },
    {
        nomeProduto: "Flor de gelo",
        descricao: "Para deixar seus inimigos na maior fria",
        valor: 10,
        criadoEm: "28/11/2005",
        emEstoque: true
    },
    {
        nomeProduto: "Super folha",
        descricao: "Para alçar ao céu",
        valor: 20,
        criadoEm: "23/10/1988",
        emEstoque: false
    },    {
        nomeProduto: "Ovo de Yoshi",
        descricao: "Gera um companheiro montável que a vida por você",
        valor: 30,
        criadoEm: "21/11/1990",
        emEstoque: true
    }
]

app.get("/usuarios", function(req, res){
    return res.send(usuarios)
})

app.get("/produtos", function(req, res){
    return res.send(produtos)
})

app.listen(port, function(){
    console.log("Servidor rodando")
})