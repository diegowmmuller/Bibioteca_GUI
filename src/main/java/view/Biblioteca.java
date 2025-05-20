package view;

import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Estante;
import model.Livro;

public class Biblioteca extends javax.swing.JFrame {

    private CardLayout card;

    public Biblioteca() {
        initComponents();
        card = (CardLayout) this.parentPanel.getLayout();
    }

    private void atualizarTabelaLivrosDisponiveis() {
        String[] colunas = {"Nome", "Autor ", "Ano"};
        List<Livro> disponiveis = Estante.encontrarLivrosDisponiveis();

        String[][] dados = new String[disponiveis.size()][3];

        for (int i = 0; i < disponiveis.size(); i++) {
            Livro livro = disponiveis.get(i);
            dados[i][0] = livro.getNome();
            dados[i][1] = livro.getAutor();
            dados[i][2] = livro.getAnoDeLancamento();
        }

        jTableLivrosDisponiveis.setModel(new javax.swing.table.DefaultTableModel(dados, colunas));
    }

    private void atualizarTabelaLivrosDelete() {
        String[] colunas = {"Nome", "Autor", "Ano", "Status"};
        List<Livro> livros = Estante.todosLivros();

        String[][] dados = new String[livros.size()][4];

        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            dados[i][0] = livro.getNome();
            dados[i][1] = livro.getAutor();
            dados[i][2] = livro.getAnoDeLancamento();
            dados[i][3] = livro.getStatus().toString();
        }

        jTableLivrosDelete.setModel(new javax.swing.table.DefaultTableModel(dados, colunas));

    }

    private void procurarLivrosPorNomeParcial(String nome) {
        if (!nome.isEmpty()) {
            List<Livro> livrosEncontrados = Estante.buscarLivrosPorNomeParcial(nome);

            String[] colunas = {"Nome", "Autor", "Ano", "Status"};
            String[][] dados = new String[livrosEncontrados.size()][4];

            for (int i = 0; i < livrosEncontrados.size(); i++) {
                Livro livro = livrosEncontrados.get(i);
                dados[i][0] = livro.getNome();
                dados[i][1] = livro.getAutor();
                dados[i][2] = livro.getAnoDeLancamento();
                dados[i][3] = livro.getStatus().toString();
            }

            jTable1.setModel(new javax.swing.table.DefaultTableModel(dados, colunas));
        } else {
            JOptionPane.showMessageDialog(this, "Digite algo para buscar");
        }
    }

    private void limparTabela(JTable tabela) {
        DefaultTableModel model = new DefaultTableModel();
        tabela.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnEncontrar = new javax.swing.JButton();
        btnProcurarDisp = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cadastroPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeDoLivro = new javax.swing.JTextField();
        txtAnoDeLancamento = new javax.swing.JTextField();
        txtNomeDoAutor = new javax.swing.JTextField();
        btnCadastrarLivro = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        procurarPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtProcuraLivro = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnVoltarPanelProcurar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        procurarDisponiveisPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLivrosDisponiveis = new javax.swing.JTable();
        btnVoltar1 = new javax.swing.JButton();
        deletarPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLivrosDelete = new javax.swing.JTable();
        btnVoltar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parentPanel.setBackground(new java.awt.Color(204, 204, 204));
        parentPanel.setLayout(new java.awt.CardLayout());

        loginPanel.setBackground(new java.awt.Color(204, 204, 204));
        loginPanel.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Biblioteca");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Senha");

        txtLogin.setBackground(new java.awt.Color(153, 153, 153));
        txtLogin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(0, 0, 0));

        txtSenha.setBackground(new java.awt.Color(153, 153, 153));
        txtSenha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(218, 218, 218))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar)
                .addGap(183, 183, 183))
        );

        parentPanel.add(loginPanel, "cardLogin");

        menuPanel.setBackground(new java.awt.Color(204, 204, 204));

        btnCadastrar.setText("Cadastrar Livro");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEncontrar.setText("Encontrar Livro");
        btnEncontrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncontrarActionPerformed(evt);
            }
        });

        btnProcurarDisp.setText("Verificar Livros disponiveis");
        btnProcurarDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarDispActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar Livro");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        jButton5.setText("Retirar Livro");

        jButton6.setText("Devolver Livro");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Menu");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEncontrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcurarDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(213, Short.MAX_VALUE))
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnEncontrar)
                .addGap(18, 18, 18)
                .addComponent(btnProcurarDisp)
                .addGap(18, 18, 18)
                .addComponent(btnDeletar)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(62, 62, 62)
                .addComponent(btnSair)
                .addGap(45, 45, 45))
        );

        parentPanel.add(menuPanel, "cardMenu");

        cadastroPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cadastro de Livro");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nome do autor");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nome do livro");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Ano de lançamento (aaaa)");

        txtNomeDoLivro.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeDoLivro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNomeDoLivro.setForeground(new java.awt.Color(0, 0, 0));

        txtAnoDeLancamento.setBackground(new java.awt.Color(255, 255, 255));
        txtAnoDeLancamento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAnoDeLancamento.setForeground(new java.awt.Color(0, 0, 0));

        txtNomeDoAutor.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeDoAutor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNomeDoAutor.setForeground(new java.awt.Color(0, 0, 0));

        btnCadastrarLivro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCadastrarLivro.setText("Cadastrar Livro");
        btnCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLivroActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastroPanelLayout = new javax.swing.GroupLayout(cadastroPanel);
        cadastroPanel.setLayout(cadastroPanelLayout);
        cadastroPanelLayout.setHorizontalGroup(
            cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
            .addGroup(cadastroPanelLayout.createSequentialGroup()
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroPanelLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel7))
                    .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(cadastroPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnCadastrarLivro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cadastroPanelLayout.createSequentialGroup()
                            .addGap(163, 163, 163)
                            .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomeDoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNomeDoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAnoDeLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        cadastroPanelLayout.setVerticalGroup(
            cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroPanelLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeDoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeDoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnoDeLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cadastroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarLivro)
                    .addComponent(btnVoltar))
                .addGap(0, 164, Short.MAX_VALUE))
        );

        parentPanel.add(cadastroPanel, "cardCadastro");

        procurarPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel9.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Procura de Livro");

        txtProcuraLivro.setBackground(new java.awt.Color(255, 255, 255));
        txtProcuraLivro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtProcuraLivro.setForeground(new java.awt.Color(0, 0, 0));

        btnProcurar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnProcurar.setText("Procurar");
        btnProcurar.setPreferredSize(new java.awt.Dimension(71, 29));
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nome do livro");

        btnVoltarPanelProcurar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnVoltarPanelProcurar.setText("Voltar");
        btnVoltarPanelProcurar.setPreferredSize(new java.awt.Dimension(71, 29));
        btnVoltarPanelProcurar.setRequestFocusEnabled(false);
        btnVoltarPanelProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPanelProcurarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout procurarPanelLayout = new javax.swing.GroupLayout(procurarPanel);
        procurarPanel.setLayout(procurarPanelLayout);
        procurarPanelLayout.setHorizontalGroup(
            procurarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
            .addGroup(procurarPanelLayout.createSequentialGroup()
                .addComponent(txtProcuraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltarPanelProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(procurarPanelLayout.createSequentialGroup()
                .addGroup(procurarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(procurarPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(procurarPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        procurarPanelLayout.setVerticalGroup(
            procurarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(procurarPanelLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(procurarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcuraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarPanelProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 150, Short.MAX_VALUE))
        );

        parentPanel.add(procurarPanel, "cardEncontrar");

        procurarDisponiveisPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Procura de Livros disponiveis");

        jTableLivrosDisponiveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "nome", "autor", "ano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableLivrosDisponiveis.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTableLivrosDisponiveisAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTableLivrosDisponiveis);

        btnVoltar1.setText("Voltar");
        btnVoltar1.setPreferredSize(new java.awt.Dimension(71, 29));
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout procurarDisponiveisPanelLayout = new javax.swing.GroupLayout(procurarDisponiveisPanel);
        procurarDisponiveisPanel.setLayout(procurarDisponiveisPanelLayout);
        procurarDisponiveisPanelLayout.setHorizontalGroup(
            procurarDisponiveisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
            .addGroup(procurarDisponiveisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        procurarDisponiveisPanelLayout.setVerticalGroup(
            procurarDisponiveisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(procurarDisponiveisPanelLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(procurarDisponiveisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        parentPanel.add(procurarDisponiveisPanel, "cardProcurarDisponiveis");

        deletarPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Deletar Livro");

        jTableLivrosDelete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Autor", "Ano", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableLivrosDelete);

        btnVoltar2.setText("Voltar");
        btnVoltar2.setPreferredSize(new java.awt.Dimension(71, 29));
        btnVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletarPanelLayout = new javax.swing.GroupLayout(deletarPanel);
        deletarPanel.setLayout(deletarPanelLayout);
        deletarPanelLayout.setHorizontalGroup(
            deletarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletarPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        deletarPanelLayout.setVerticalGroup(
            deletarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletarPanelLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(deletarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletarPanelLayout.createSequentialGroup()
                        .addComponent(btnVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        parentPanel.add(deletarPanel, "cardDeletar");

        getContentPane().add(parentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        card.show(parentPanel, "cardMenu");
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed


    private void btnCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLivroActionPerformed
        String nome = txtNomeDoLivro.getText();
        String autor = txtNomeDoAutor.getText();
        String anoDeLancamento = txtAnoDeLancamento.getText();

        if (!nome.isEmpty() && !autor.isEmpty() && !anoDeLancamento.isEmpty()) {
            Livro livro = new Livro(nome, autor, anoDeLancamento);
            Estante.adicionarLivro(livro);

            // Mensagem de sucesso
            JOptionPane.showMessageDialog(this, "📗 Livro cadastrado com sucesso!");

            // Limpar campos
            txtNomeDoLivro.setText("");
            txtNomeDoAutor.setText("");
            txtAnoDeLancamento.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "⚠️ Por favor, preencha todos os campos.");
        }
    }//GEN-LAST:event_btnCadastrarLivroActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        card.show(parentPanel, "cardMenu");
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        card.show(parentPanel, "cardCadastro");
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        String nome = txtProcuraLivro.getText().trim();

        procurarLivrosPorNomeParcial(nome);

    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnEncontrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncontrarActionPerformed
        card.show(parentPanel, "cardEncontrar");
    }//GEN-LAST:event_btnEncontrarActionPerformed

    private void btnVoltarPanelProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPanelProcurarActionPerformed
        card.show(parentPanel, "cardMenu");        
        limparTabela(jTable1);
    }//GEN-LAST:event_btnVoltarPanelProcurarActionPerformed

    private void btnProcurarDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarDispActionPerformed
        card.show(parentPanel, "cardProcurarDisponiveis");
        atualizarTabelaLivrosDisponiveis();
    }//GEN-LAST:event_btnProcurarDispActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        card.show(parentPanel, "cardMenu");
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        card.show(parentPanel, "cardDeletar");
        atualizarTabelaLivrosDelete();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar2ActionPerformed
        card.show(parentPanel, "cardMenu");
    }//GEN-LAST:event_btnVoltar2ActionPerformed

    private void jTableLivrosDisponiveisAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableLivrosDisponiveisAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableLivrosDisponiveisAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastrarLivro;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEncontrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnProcurarDisp;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JButton btnVoltar2;
    private javax.swing.JButton btnVoltarPanelProcurar;
    private javax.swing.JPanel cadastroPanel;
    private javax.swing.JPanel deletarPanel;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableLivrosDelete;
    private javax.swing.JTable jTableLivrosDisponiveis;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel procurarDisponiveisPanel;
    private javax.swing.JPanel procurarPanel;
    private javax.swing.JTextField txtAnoDeLancamento;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNomeDoAutor;
    private javax.swing.JTextField txtNomeDoLivro;
    private javax.swing.JTextField txtProcuraLivro;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
