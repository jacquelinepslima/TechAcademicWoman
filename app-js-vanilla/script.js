const transactionsUl = document.querySelector("#transactions");
const inputTransactionName = document.querySelector("#text");
const inputTransactionAmount = document.querySelector("#amount");

// objeto literal ficticio
let dummyTransactions = [
    { id: 1, name: "Bolo de brigadeiro", amount: -20 },
    { id: 2, name: "Salario", amount: 300 },
    { id: 3, name: "Torta de frango", amount: -10 },
    { id: 4, name: "Violão", amount: 150 },
  ];

const addTransactionInArray = (transactionName, transactionAmount) => {
    dummyTransactions.push ({
        id: 123, //AINDA ESTA FIXO PQ NAO TEMOS UM GERADOR DE ID
        name: transactionName,
        amount: transactionAmount
    })
}

const handleFormSubmit = event => {
    event.preventDefault();

  if (
    inputTransactionName.value.trim() === "" ||
    inputTransactionAmount.value.trim() === "") {
    alert("Informe a descrição e o valor da transação");
    return;
  }
  addTransactionInArray(inputTransactionName.value, inputTransactionAmount.value);
  init();
};

form.addEventListener('submit', handleFormSubmit);


// é o parametro da funcao
const addTransactionIntoDOM = (trasaction) => {
  const li = document.createElement("li");

  li.innerHTML = `${trasaction.name}`;
  //atribuindo um nó para o li
  transactionsUl.append(li);
};

// metodo que irá separar os valores de total, receitas e despesas
const updateBalanceValues = () => {

    // pega todos so valores(amount) de cada linha do array
    const transactionsAmounts =  dummyTransactions.map(({ amount }) => amount)
    console.log('Somente os valores : ' + transactionsAmounts);

    // totalizador 
    const total = transactionsAmounts
                    .reduce((accumulator, transaction) =>  accumulator + transaction,0);
    console.log('Soma dos valores : ' + total);

    //somente as receitas
    const income = transactionsAmounts
                    .filter(value => value > 0)
                    .reduce((accumulator, transaction) =>  accumulator + transaction,0);
                    console.log('Soma dos valores positivos: ' + total);

    //somente as despesas
    const expenses = transactionsAmounts
                    .filter(value => value < 0)
                    .reduce((accumulator, transaction) =>  accumulator + transaction,0);
                    console.log('Soma dos valores negativos: ' + expenses);
}       

const init = () => {
    // aqui iremos fazer um tratamento a nivel de codigo para nao 
    // submeter toda a lista novamente (gambiarra)
    // solucao a nivel de codigo
    transactionsUl.innerHTML = '';
    dummyTransactions.forEach(addTransactionIntoDOM);
    updateBalanceValues();
}

// funcao de inicializacao do js
init();
