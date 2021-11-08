const transactionsUl = document.querySelector('#transactions');
const inputTransactionName = document.querySelector('#text');
const inputTransactionAmount = document.querySelector('#amount');
const balanceDisplay = document.querySelector('#balance');
const incomeDisplay = document.querySelector('#money-plus');
const expensesDisplay = document.querySelector('#money-minus');

// objeto literal ficticio
let dummyTransactions = [];

  //gerador de id numero aleatorio

  const geradorID = () => Math.round(Math.random() * 1000);


const addTransactionInArray = (transactionName, transactionAmount) => {
    dummyTransactions.push ({
        id: geradorID(), //AINDA ESTA FIXO PQ NAO TEMOS UM GERADOR DE ID
        name: transactionName,
        amount: Number(transactionAmount)
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
  addTransactionInArray(inputTransactionName.value, (inputTransactionAmount.value));
  init();
  cleanInputs();
}

const cleanInputs = () =>{
  inputTransactionName.value = '';
  inputTransactionAmount.value = '';
}

form.addEventListener('submit', handleFormSubmit);


// é o parametro da funcao
const addTransactionIntoDOM = transaction => {
  const li = document.createElement('li');
  //condicao na linha ou if ternario
  const operator = transaction.amount < 0 ? '-' : '+';
  const amountWithoutOperator = Math.abs(transaction.amount);
  const CssClass = transaction.amount < 0 ? 'minus' : 'plus';


  li.innerHTML = `
                  ${transaction.name}
                  <span> R$ ${transaction.amount}</span>
                  <button class="delete-btn" onClick="removeTransaction(${transaction.id})">X</button>
                  `
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

    //jogar os valores pegados no html
    balanceDisplay.textContent = `R$ ${total}`;
    incomeDisplay.textContent = `R$ ${income}`;
    expensesDisplay.textContent = `R$ ${expenses}`;
} 

// remover produtos

const removeTransaction = ID =>{
  dummyTransactions = dummyTransactions.filter(transaction => transaction.id !== ID);
  console.log(dummyTransactions);
  init();
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
