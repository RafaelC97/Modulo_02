let listaDePessoas = [
    {
        nome: "Fulano",
        sobrenome: "Santos",
        idade: 18
    },
    {
        nome: "Ciclano",
        sobrenome: "Ribeiro",
        idade: 17
    },
    {
        nome: "Beltrano",
        sobrenome: "Silva",
        idade: 16
    },
    {
        nome: "Herculano",
        sobrenome: "Menezes",
        idade: 20
    },
    {
        nome: "Minuano",
        sobrenome: "Souza",
        idade: 13
    },
    {
        nome: "M",
        sobrenome: "S",
        idade: 13
    },
    {
        nome: "Minuanoaaaaaaaaaaaaaaaaaaaaaaaaaa",
        sobrenome: "Souzaaaaaaaaaaaaaaaaaaaaaaaaaaa",
        idade: 13
    },
]

function maiorIdade(pessoas){
    for(let pessoa of pessoas){
        if(pessoa.idade >= 18){
            console.log("Seja  bem vindo(a)! Você se chama " + pessoa.nome +" "+pessoa.sobrenome + " e tem " + pessoa.idade + " anos e é maior de idade.")
        }else{
            console.log("Seja  bem vindo(a)! Você se chama " + pessoa.nome +" "+pessoa.sobrenome + " e tem " + pessoa.idade + " anos e NÃO é maior de idade.")
        }
    }
}

function verificaNome(pessoas){
    for(let pessoa of pessoas){
        if(pessoa.nome.length+pessoa.sobrenome.length <= 3){
            console.log("Erro! Nome invalido, nome e sobrenome devem ser maiores que 3 caracteres.")
        }else if(pessoa.nome.length+pessoa.sobrenome.length >= 49){
            console.log("Erro! Nome invalido, nome e sobrenome devem ser menores que 50 caracteres.")
        }
    }
}

function quantidadePessoas(pessoas){
    console.log(pessoas.length)
}

maiorIdade(listaDePessoas)

verificaNome(listaDePessoas)

quantidadePessoas(listaDePessoas)