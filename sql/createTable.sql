CREATE TABLE TipoConta (
    id INT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

INSERT INTO TipoConta (id, nome) VALUES
(1, 'CORRENTE'),
(2, 'POUPANCA');

CREATE TABLE Cliente (
    id INT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL
);

CREATE TABLE Conta (
    id INT PRIMARY KEY,
    numero INT NOT NULL,
    tipoContaId INT,
    saldo DOUBLE,
    clienteId INT,
    FOREIGN KEY (tipoContaId) REFERENCES TipoConta(id),
    FOREIGN KEY (clienteId) REFERENCES Cliente(id)
);

CREATE TABLE TipoOperacao (
    id INT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

INSERT INTO TipoOperacao (id, nome) VALUES
(1, 'SAQUE'),
(2, 'DEPOSITO'),
(3, 'TRANSFERENCIA'),
(4, 'INVESTIMENTO');

CREATE TABLE Operacao (
    id INT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    tipoOperacaoId INT,
    valorEntrada DOUBLE,
    valorSaida DOUBLE,
    contaEntradaId INT,
    contaSaidaId INT,
    data DATE,
    FOREIGN KEY (tipoOperacaoId) REFERENCES TipoOperacao(id),
    FOREIGN KEY (contaEntradaId) REFERENCES Conta(id),
    FOREIGN KEY (contaSaidaId) REFERENCES Conta(id)
);

CREATE TABLE Administrador (
    id INT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL
);
