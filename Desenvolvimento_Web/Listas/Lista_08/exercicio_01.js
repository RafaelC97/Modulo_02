const express = require("express")
const app = express()
const port = 6000

app.use(express.json())

let bancoDeDadosProdutos = []

app.get("/listar-produtos", (req, res) =>{
    try{
        return res.status(200).json(bancoDeDadosProdutos)
    }catch (error){
        return res.status(500).json(error.message)
    }
})

app.post("/adicionar-produto", (req, res) =>{
    let body = req.body

    if(body == null){
        return res.status(400).json({ message: "Body está nulo!!"})
    }

    bancoDeDadosProdutos.push(body)
    return res.status(201).json({ message: "produto adicionado com sucesso!"})
})

app.listen(port, () => {
    console.log(`rodando na porta http://localhost:${port}`)
})