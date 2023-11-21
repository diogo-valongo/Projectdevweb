CREATE TABLE TipoConta (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

INSERT INTO TipoConta (nome) VALUES
('CORRENTE'),
('POUPANCA');

CREATE TABLE Cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL
);

CREATE TABLE Conta (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero INT NOT NULL,
    tipoContaId INT,
    saldo DOUBLE,
    clienteId INT,
    FOREIGN KEY (tipoContaId) REFERENCES TipoConta(id),
    FOREIGN KEY (clienteId) REFERENCES Cliente(id)
);

CREATE TABLE TipoOperacao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

INSERT INTO TipoOperacao (nome) VALUES
('SAQUE'),
('DEPOSITO'),
('TRANSFERENCIA'),
('INVESTIMENTO');

CREATE TABLE Operacao (
    id INT AUTO_INCREMENT PRIMARY KEY,
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
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL
);
