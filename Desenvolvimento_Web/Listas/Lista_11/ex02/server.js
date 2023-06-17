const express = require("express")
const mongoose = require("mongoose")
const app = express()
const port = 7000
const connectionString = "mongodb+srv://admin:test123@appdb.mpiec4n.mongodb.net/"
const Produto = require("./models/produto")
const Funcionario = require("./models/funcionario")

app.use(express.json())

app.post("/cadastrar-produto", async (req, res) =>{
    let { nome, descricao, valor, emEstoque, publicadoEm } = req.body
    
    let produto = {
        nome,
        descricao,
        valor,
        emEstoque,
        publicadoEm
    }

    try{
        await Produto.create(produto)
        return res.status(201).json({ message: "Produto cadastrado com sucesso!!"}
        )
    }catch(error){
        return res.status(500).json({ message: error.message })
    }
})

app.get("/listar-produtos", async (req, res) =>{
    try{
        let produtos = await Produto.find()
        return res.status(200).json(produtos)
    }catch(error){
        return res.status(500).json(error)
    }
})

app.post("/cadastrar-funcionario", async (req, res) =>{
    let { nome, cargo, funcional, admitidoEm } = req.body
    
    let funcionario = {
        nome,
        cargo,
        funcional,
        admitidoEm
    }

    try{
        await Funcionario.create(funcionario)
        return res.status(201).json({ message: "Funcionario cadastrado com sucesso!!"}
        )
    }catch(error){
        return res.status(500).json({ message: error.message })
    }
})

app.get("/listar-funcionarios", async (req, res) =>{
    try{
        let funcionarios = await Funcionario.find()
        return res.status(200).json(funcionarios)
    }catch(error){
        return res.status(500).json(error)
    }
})

mongoose.connect(connectionString, {
    dbName: "DevShop(shopping-dos-desenvolvedores)"
}).then(() => {
    console.log("MongoDB UP!")
    console.log(`http://localhost:${port}`)
    app.listen(port)
}).catch((error) => {
    console.log(error)
})
