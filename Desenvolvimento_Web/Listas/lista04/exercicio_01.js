var contaCorrente = {

    saldo: 100,
    faturaAtual: 150,
    creditoDisponivel: 200,
    extrato: {
        entrada: [
            {
                data: "18/04/2023",
                valor: 10
            }
        ],
        saida: [
            {
                data: "12/04/2023",
                valor: 100,
                descrecao: "e o churras?"
            }
        ]                
    },
    exibirExtrato: true
}

if(contaCorrente.saldo >= contaCorrente.faturaAtual){
console.log("Você possui saldo para pagar a fatura atual")
}else{
console.log("você não possui saldo suficiente para pagar a fatura, experimente pegar credito para conseguir pagar, você tem um saldo de R$" 
                + contaCorrente.creditoDisponivel + " diponivel")
}

if(contaCorrente.exibirExtrato){
console.log(contaCorrente.extrato)
}