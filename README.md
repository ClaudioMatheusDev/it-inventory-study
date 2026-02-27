# 🚀 Projeto de Estudo: Configuração de Setup (Android)

Projeto desenvolvido para praticar **componentes de seleção** no Android Studio.  
A ideia é simular a montagem/configuração de um setup de informática (periféricos, armazenamento e serviços), gerando um **resumo final** para o usuário.

---

## 📋 Sobre a atividade

A aplicação demonstra o uso prático de componentes de interface para captura de dados do usuário:

- **CheckBox**: seleção múltipla de periféricos (Teclado, Mouse, Monitor, etc.).
- **RadioGroup + RadioButton**: seleção **exclusiva** do tipo de armazenamento (SSD ou HDD).
- **Switch**: ativação/desativação de um serviço (ex.: Backup Automático).
- **Toast**: exibição de um resumo das escolhas ao clicar no botão de finalizar.

---

## 🛠️ Tecnologias utilizadas

- **Linguagem:** Java  
- **IDE:** Android Studio  
- **Layout:** XML (ConstraintLayout / componentes do Material Design)  
- **SDK mínima:** API 24  

---

## 📸 Layout (visão geral)

A interface foi organizada de forma simples e limpa, com agrupamentos por seção para facilitar a leitura e a seleção das opções.

<img width="601" height="887" alt="IMAGE02" src="https://github.com/user-attachments/assets/b9c074c5-a958-4704-9162-d34eb75255c6" />
<img width="598" height="923" alt="IMAGE00" src="https://github.com/user-attachments/assets/51bca760-3f8a-4230-bc01-de9afbf6a910" />


---

## 💻 Lógica do app (resumo)

No arquivo `MainActivity.java`, são usados métodos essenciais para capturar as escolhas do usuário:

- `isChecked()` para identificar CheckBoxes marcados e o estado do Switch.
- `getCheckedRadioButtonId()` para descobrir qual RadioButton está selecionado no RadioGroup, sem criar múltiplos listeners.

Exemplo:

```java
// Exemplo de captura de dados
if (chkTeclado.isChecked()) {
    resumo.append("- Teclado Mecânico\n");
}

int idArmazenamento = rgArmazenamento.getCheckedRadioButtonId();
RadioButton rb = findViewById(idArmazenamento);
```

---

## 📂 Como clonar e executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/ClaudioMatheusDev/it-inventory-study.git
   ```

2. Abra o projeto no **Android Studio**.

3. Aguarde a sincronização do **Gradle**.

4. Execute no emulador ou em um dispositivo físico.

---

## 📝 Aprendizados

Este projeto ajudou a reforçar:

- Diferença entre **seleção múltipla** (CheckBox) e **seleção única** (RadioGroup/RadioButton).
- Montagem dinâmica de texto com **StringBuilder** para gerar um resumo.
- Boas práticas básicas de leitura de estado de componentes de UI no Android.

---

## 📌 Próximos passos (opcional)

- Validar se o usuário selecionou pelo menos 1 periférico antes de finalizar.
- Exibir o resumo também em uma nova tela (Activity/Fragment) além do Toast.
- Melhorar a UI com ícones e padronização de espaçamentos.
