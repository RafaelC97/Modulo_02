let lista = [
    {
        nome: "Rafael",
        idade: 25,
        ehAdmin: true,
        email: "rafael@email.com"
    },
    {
        nome: "Davi",
        idade: 25,
        ehAdmin: false,
        email: "davi@email.com"
    },
    {
        nome: "Mateus",
        idade: 25,
        ehAdmin: false,
        email: "mateus@email.com"
    },
    {
        nome: "Lucas",
        idade: 26,
        ehAdmin: false,
        email: "lucas@email.com"
    },
    {
        nome: "Miguel",
        idade: 23,
        ehAdmin: true,
        email: "miguel@email.com"
    }
]

for (let i = 0; i < lista.length; i++) {
    if(lista[i].ehAdmin){
        console.log("Olá "+ lista[i].nome+ "! Bem vindo(a) você É admin do sistema, enviamos um email para "+
                        lista[i].email+ " para você criar uma senha.\n")
    }else{
        console.log("Olá "+ lista[i].nome+ "! Bem vindo(a) você NÃO é admin do sistema, enviamos um email para "+
                        lista[i].email+ " para você criar uma senha.\n")
    }
}
