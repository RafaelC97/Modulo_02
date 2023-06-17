import { Component } from '@angular/core';
import Produto from "./models/produto"

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css', './app.components-menu.css']
})
export class AppComponent {

  public listaProdutos: Produto[] = new Array<Produto>();

  constructor(){
    this.listaProdutos.push(new Produto("Cogumelo",
                                        "Descrição: Ótimo para crescimento rápido, resistência e maior força",
                                        5,
                                        "./img/imagens_produtos/Mushroom_NSMB1.png"));
    this.listaProdutos.push(new Produto("Flor de fogo",
                                        "Para deixar seus inimigos tostado",
                                        10,
                                        "./img/imagens_produtos/Fire_Flower_NSMBU.png"));
    this.listaProdutos.push(new Produto("Flor de gelo",
                                        "Para deixar seus inimigos na maior fria",
                                        10,
                                        "./img/imagens_produtos/Ice_Flower_NSMBU.png"));
    this.listaProdutos.push(new Produto("Super folha",
                                        "Para alçar ao céu",
                                        20,
                                        "./img/imagens_produtos/Super_Leaf_NSMB2.png"));
    this.listaProdutos.push(new Produto("Ovo de Yoshi",
                                        "Gera um companheiro montável que a vida por você",
                                        30,
                                        "./img/imagens_produtos/Yoshi_Egg.png"));
  }
}
