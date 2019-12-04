package view;


import data.ProdutoData;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author Matheus
 */
public class ProdutoView extends javax.swing.JFrame {
    private ProdutoData DAO;
    private Produto objPro;

    /**
     *
     */
    public ProdutoView() {
        initComponents();
               comboBox1.setVisible(false);
               editar.setVisible(false);
               excluir.setVisible(false);
               id.setVisible(false);
               idBox.setVisible(false);
               marca.setVisible(false);
               nomeBox.setVisible(false);
               modelo.setVisible(false);
               modeloBox.setVisible(false);
               nucleos.setVisible(false);
               nucleosBox.setVisible(false);
               threads.setVisible(false);
               threadsBox.setVisible(false);
               socket.setVisible(false);
               socketBox.setVisible(false);
               cache.setVisible(false);
               cacheBox.setVisible(false);
               potencia.setVisible(false);
               potenciaBox.setVisible(false);
               gigas.setVisible(false);
               gigasBox.setVisible(false);
               chipset.setVisible(false);
               chipsetBox.setVisible(false);
               ddr.setVisible(false);
               mem_compBox.setVisible(false);
               comp_cpu.setVisible(false);
               comp_cpuBox.setVisible(false);
               estoque.setVisible(false);
               quantidadeBox.setVisible(false);
               preco.setVisible(false);
               precoBox.setVisible(false);
               cadastrar.setVisible(false);
               frequencia.setVisible(false);
               frequenciaBox.setVisible(false);
               consultar.setVisible(false);             
               tipo_produtoBox.setVisible(false);
               DAO = new ProdutoData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBox1 = new javax.swing.JComboBox<>();
        cadastrar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        tipo_produtoBox = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        gigas = new javax.swing.JLabel();
        gigasBox = new javax.swing.JTextField();
        chipset = new javax.swing.JLabel();
        chipsetBox = new javax.swing.JTextField();
        ddr = new javax.swing.JLabel();
        mem_compBox = new javax.swing.JTextField();
        comp_cpu = new javax.swing.JLabel();
        comp_cpuBox = new javax.swing.JTextField();
        estoque = new javax.swing.JLabel();
        quantidadeBox = new javax.swing.JTextField();
        preco = new javax.swing.JLabel();
        precoBox = new javax.swing.JTextField();
        frequenciaBox = new javax.swing.JTextField();
        frequencia = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        idBox = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cache = new javax.swing.JLabel();
        nomeBox = new javax.swing.JTextField();
        modeloBox = new javax.swing.JTextField();
        modelo = new javax.swing.JLabel();
        threads = new javax.swing.JLabel();
        potencia = new javax.swing.JLabel();
        cacheBox = new javax.swing.JTextField();
        marca = new javax.swing.JLabel();
        socketBox = new javax.swing.JTextField();
        potenciaBox = new javax.swing.JTextField();
        threadsBox = new javax.swing.JTextField();
        socket = new javax.swing.JLabel();
        nucleos = new javax.swing.JLabel();
        nucleosBox = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Opção", "Computador Completo", "Placa Mãe", "Processador", "Placa de Video", "Fonte", "Gabinete", "HD", "SSD" }));
        comboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox1ActionPerformed(evt);
            }
        });

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        tipo_produtoBox.setEditable(false);

        gigas.setText("Armazenamento:");

        chipset.setText("Chipset:");

        ddr.setText("Memoria Compativel:");

        comp_cpu.setText("Compatibilidade com Cpu's:");

        estoque.setText("Quantidade:");

        preco.setText("Preço:");

        frequencia.setText("Frequencia:");

        id.setText("ID:");

        idBox.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comp_cpuBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantidadeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(frequenciaBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chipsetBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chipset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(frequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gigas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gigasBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mem_compBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comp_cpu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ddr, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gigas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gigasBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(ddr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mem_compBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comp_cpu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comp_cpuBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidadeBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precoBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chipset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chipsetBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frequencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frequenciaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cache.setText("Cache:");

        modelo.setText("Modelo:");

        threads.setText("Threads:");

        potencia.setText("Potência:");

        marca.setText("Nome/Marca:");

        socket.setText("Socket:");

        nucleos.setText("Nucleos:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nucleosBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modeloBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threadsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threads, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nucleos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(socket, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cacheBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(socketBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cache, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potenciaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(marca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modeloBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nucleos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nucleosBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(threads)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(threadsBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(socket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(socketBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cache)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cacheBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(potencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(potenciaBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Opções");

        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Consultar/Alterar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tipo_produtoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(consultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluir)
                    .addComponent(tipo_produtoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox1ActionPerformed
            String valor= (String)comboBox1.getSelectedItem();           
            if(valor.equals("Selecione uma Opção")){
               marca.setVisible(false);
               nomeBox.setVisible(false);
               modelo.setVisible(false);
               modeloBox.setVisible(false);
               nucleos.setVisible(false);
               nucleosBox.setVisible(false);
               threads.setVisible(false);
               threadsBox.setVisible(false);
               socket.setVisible(false);
               socketBox.setVisible(false);
               cache.setVisible(false);
               cacheBox.setVisible(false);
               potencia.setVisible(false);
               potenciaBox.setVisible(false);
               gigas.setVisible(false);
               gigasBox.setVisible(false);
               chipset.setVisible(false);
               chipsetBox.setVisible(false);
               ddr.setVisible(false);
               mem_compBox.setVisible(false);
               comp_cpu.setVisible(false);
               comp_cpuBox.setVisible(false);
               estoque.setVisible(false);
               quantidadeBox.setVisible(false);
               preco.setVisible(false);
               precoBox.setVisible(false);
               cadastrar.setVisible(false);
               tipo_produtoBox.setVisible(false);
    }//GEN-LAST:event_comboBox1ActionPerformed
               if(valor.equals("Computador Completo")){
               
               tipo_produtoBox.setVisible(false);
               tipo_produtoBox.setText("Computador Completo");
               marca.setVisible(true);
               nomeBox.setVisible(true);
               modelo.setVisible(true);
               modeloBox.setVisible(true);
               nucleos.setVisible(true);
               nucleosBox.setVisible(true);
               threads.setVisible(true);
               threadsBox.setVisible(true);
               socket.setVisible(true);
               socketBox.setVisible(true);
               cache.setVisible(true);
               cacheBox.setVisible(true);
               potencia.setVisible(true);
               potenciaBox.setVisible(true);
               gigas.setVisible(true);
               gigasBox.setVisible(true);
               chipset.setVisible(true);
               chipsetBox.setVisible(true);
               ddr.setVisible(true);
               mem_compBox.setVisible(true);
               comp_cpu.setVisible(true);
               comp_cpuBox.setVisible(true);
               estoque.setVisible(true);
               quantidadeBox.setVisible(true);
               preco.setVisible(true);
               precoBox.setVisible(true);
                           
               }
               if(valor.equals("Placa Mãe")){
               tipo_produtoBox.setText("Placa Mãe");
               marca.setVisible(true);
               nomeBox.setVisible(true);
               modelo.setVisible(true);
               modeloBox.setVisible(true);
               nucleos.setVisible(false);
               nucleosBox.setVisible(false);
               threads.setVisible(false);
               threadsBox.setVisible(false);
               socket.setVisible(true);
               socketBox.setVisible(true);
               cache.setVisible(false);
               cacheBox.setVisible(false);
               potencia.setVisible(false);
               potenciaBox.setVisible(false);
               gigas.setVisible(false);
               gigasBox.setVisible(false);
               chipset.setVisible(true);
               chipsetBox.setVisible(true);
               ddr.setVisible(true);
               mem_compBox.setVisible(true);
               comp_cpu.setVisible(true);
               comp_cpuBox.setVisible(true);
               estoque.setVisible(true);
               quantidadeBox.setVisible(true);
               preco.setVisible(true);
               precoBox.setVisible(true);
               
               tipo_produtoBox.setVisible(false);
                 }
               if(valor.equals("Processador")){
               tipo_produtoBox.setText("Processador");   
               marca.setVisible(true);
               nomeBox.setVisible(true);
               modelo.setVisible(true);
               modeloBox.setVisible(true);
               nucleos.setVisible(true);
               nucleosBox.setVisible(true);
               threads.setVisible(true);
               threadsBox.setVisible(true);
               socket.setVisible(true);
               socketBox.setVisible(true);
               cache.setVisible(true);
               cacheBox.setVisible(true);
               potencia.setVisible(true);
               potenciaBox.setVisible(true);
               gigas.setVisible(false);
               gigasBox.setVisible(false);
               chipset.setVisible(false);
               chipsetBox.setVisible(false);
               ddr.setVisible(false);
               mem_compBox.setVisible(false);
               comp_cpu.setVisible(false);
               comp_cpuBox.setVisible(false);
               estoque.setVisible(true);
               quantidadeBox.setVisible(true);
               preco.setVisible(true);
               precoBox.setVisible(true);
           
               tipo_produtoBox.setVisible(false);
                 }
               if(valor.equals("Placa de Video")){
                   tipo_produtoBox.setText("Placa de Video"); 
               marca.setVisible(true);
               nomeBox.setVisible(true);
               modelo.setVisible(true);
               modeloBox.setVisible(true);
               nucleos.setVisible(false);
               nucleosBox.setVisible(false);
               threads.setVisible(false);
               threadsBox.setVisible(false);
               socket.setVisible(false);
               socketBox.setVisible(false);
               cache.setVisible(false);
               cacheBox.setVisible(false);
               potencia.setVisible(true);
               potenciaBox.setVisible(true);
               gigas.setVisible(false);
               gigasBox.setVisible(false);
               chipset.setVisible(false);
               chipsetBox.setVisible(false);
               ddr.setVisible(false);
               mem_compBox.setVisible(false);
               comp_cpu.setVisible(false);
               comp_cpuBox.setVisible(false);
               estoque.setVisible(true);
               quantidadeBox.setVisible(true);
               preco.setVisible(true);
               precoBox.setVisible(true);
            
               tipo_produtoBox.setVisible(false);
                 }
               if(valor.equals("Fonte")){
                   tipo_produtoBox.setText("Fonte");
               marca.setVisible(true);
               nomeBox.setVisible(true);
               modelo.setVisible(true);
               modeloBox.setVisible(true);
               nucleos.setVisible(false);
               nucleosBox.setVisible(false);
               threads.setVisible(false);
               threadsBox.setVisible(false);
               socket.setVisible(false);
               socketBox.setVisible(false);
               cache.setVisible(false);
               cacheBox.setVisible(false);
               potencia.setVisible(true);
               potenciaBox.setVisible(true);
               gigas.setVisible(false);
               gigasBox.setVisible(false);
               chipset.setVisible(false);
               chipsetBox.setVisible(false);
               ddr.setVisible(false);
               mem_compBox.setVisible(false);
               comp_cpu.setVisible(false);
               comp_cpuBox.setVisible(false);
               estoque.setVisible(true);
               quantidadeBox.setVisible(true);
               preco.setVisible(true);
               precoBox.setVisible(true);
             
               tipo_produtoBox.setVisible(false);
                 }
                if(valor.equals("Gabinete")){
                    tipo_produtoBox.setText("Gabinete");
               marca.setVisible(true);
               nomeBox.setVisible(true);
               modelo.setVisible(true);
               modeloBox.setVisible(true);
               nucleos.setVisible(false);
               nucleosBox.setVisible(false);
               threads.setVisible(false);
               threadsBox.setVisible(false);
               socket.setVisible(false);
               socketBox.setVisible(false);
               cache.setVisible(false);
               cacheBox.setVisible(false);
               potencia.setVisible(false);
               potenciaBox.setVisible(false);
               gigas.setVisible(false);
               gigasBox.setVisible(false);
               chipset.setVisible(false);
               chipsetBox.setVisible(false);
               ddr.setVisible(false);
               mem_compBox.setVisible(false);
               comp_cpu.setVisible(false);
               comp_cpuBox.setVisible(false);
               estoque.setVisible(true);
               quantidadeBox.setVisible(true);
               preco.setVisible(true);
               precoBox.setVisible(true);
              
               tipo_produtoBox.setVisible(false);
                 }
               if(valor.equals("HD")){
                   tipo_produtoBox.setText("HD");
               marca.setVisible(true);
               nomeBox.setVisible(true);
               modelo.setVisible(true);
               modeloBox.setVisible(true);
               nucleos.setVisible(false);
               nucleosBox.setVisible(false);
               threads.setVisible(false);
               threadsBox.setVisible(false);
               socket.setVisible(false);
               socketBox.setVisible(false);
               cache.setVisible(false);
               cacheBox.setVisible(false);
               potencia.setVisible(false);
               potenciaBox.setVisible(false);
               gigas.setVisible(true);
               gigasBox.setVisible(true);
               chipset.setVisible(false);
               chipsetBox.setVisible(false);
               ddr.setVisible(false);
               mem_compBox.setVisible(false);
               comp_cpu.setVisible(false);
               comp_cpuBox.setVisible(false);
               estoque.setVisible(true);
               quantidadeBox.setVisible(true);
               preco.setVisible(true);
               precoBox.setVisible(true);
           
               tipo_produtoBox.setVisible(false);
                 }
               if(valor.equals("SSD")){
                tipo_produtoBox.setText("SSD");
               marca.setVisible(true);
               nomeBox.setVisible(true);
               modelo.setVisible(true);
               modeloBox.setVisible(true);
               nucleos.setVisible(false);
               nucleosBox.setVisible(false);
               threads.setVisible(false);
               threadsBox.setVisible(false);
               socket.setVisible(false);
               socketBox.setVisible(false);
               cache.setVisible(false);
               cacheBox.setVisible(false);
               potencia.setVisible(false);
               potenciaBox.setVisible(false);
               gigas.setVisible(true);
               gigasBox.setVisible(true);
               chipset.setVisible(false);
               chipsetBox.setVisible(false);
               ddr.setVisible(false);
               mem_compBox.setVisible(false);
               comp_cpu.setVisible(false);
               comp_cpuBox.setVisible(false);
               estoque.setVisible(true);
               quantidadeBox.setVisible(true);
               preco.setVisible(true);
               precoBox.setVisible(true);
           
               tipo_produtoBox.setVisible(false);
                 } 
    }
    
    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        /**
    * Comando que faz o cadastro pegando os valores das textBox
    */
        try{
                if(preencherObj()){
                    this.DAO = new ProdutoData();
                    if(DAO.Incluir(objPro))
                        JOptionPane.showMessageDialog(this,"Salvo!");
                    nomeBox.setText("");
                    cacheBox.setText("");
                    comp_cpuBox.setText("");
                    frequenciaBox.setText("");
                    chipsetBox.setText("");
                    gigasBox.setText("");
                    idBox.setText("");
                    modeloBox.setText("");
                    socketBox.setText("");
                    threadsBox.setText("");
                    potenciaBox.setText("");
                    nucleosBox.setText("");
                    mem_compBox.setText("");
                    quantidadeBox.setText("");
                    precoBox.setText("");
                }
            }           
         catch(Exception erro){
               JOptionPane.showMessageDialog(this,"Nao foi possivel salvar");
               System.out.println(erro.getMessage());
                              
    }//GEN-LAST:event_cadastrarActionPerformed
}
    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        /**
    * Comando que faz a exclusão
    */
        try {
        if(DAO.Excluir(Integer.parseInt(idBox.getText()))){
           JOptionPane.showMessageDialog(this, "Apagado com sucesso");

       } else {
                JOptionPane.showMessageDialog(this, "Não foi possivel apagar");
              }
       }
       catch (Exception erro){ 
               System.out.println(  erro.getMessage());
               } 
    }//GEN-LAST:event_excluirActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        /**
    * Comando que faz a consulta e exibi nas textBox
    */
        try{
        if(nomeBox.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencher o campo Nome!");
            idBox.requestFocus();
        }else{
            Produto objPro = DAO.Pesquisar(nomeBox.getText());
            if(objPro == null){
                JOptionPane.showMessageDialog(this, "Não foi encontrado o registro!");
                idBox.setText("");
                idBox.requestFocus();
            }else{
                idBox.setText(Integer.toString(objPro.getCod_produto()));
                nomeBox.setText(objPro.getNome_produto());
                tipo_produtoBox.setText(objPro.getTipo_produto());
                modeloBox.setText(objPro.getTipo_produto());
                nucleosBox.setText(objPro.getNucleos());
                threadsBox.setText(objPro.getThreads());
                socketBox.setText(objPro.getSocket());
                cacheBox.setText(objPro.getCache());
                potenciaBox.setText(objPro.getPotencia());
                chipsetBox.setText(objPro.getChipset());
                mem_compBox.setText(objPro.getMem_comp());
                comp_cpuBox.setText(objPro.getComp_cpu());
                gigasBox.setText(objPro.getGb());
                quantidadeBox.setText(String.valueOf(objPro.getQuantidade()));
                precoBox.setText(String.valueOf(objPro.getValor()));
                frequenciaBox.setText(objPro.getFrequencia());
            }
        }
        }catch(Exception erro){
                JOptionPane.showMessageDialog(this, "Erro: " + erro.getMessage());
                System.out.println(erro.getMessage());
                }
    }//GEN-LAST:event_consultarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        /**
    * Comando que edita as informações
    */  
        try{
                if(preencherObj2()){
                    this.DAO = new ProdutoData();
                    if(DAO.Editar(objPro))
                        JOptionPane.showMessageDialog(this,"Alterado com sucesso");
                }                     
        } catch(Exception erro){
               JOptionPane.showMessageDialog(this,"Nao foi possivel salvar a alteração");
               System.out.println(erro.getMessage());
               }
    }//GEN-LAST:event_editarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
               comboBox1.setVisible(true);
               consultar.setVisible(false);
               tipo_produtoBox.setVisible(false);
               tipo_produtoBox.setText("Computador Completo");
               marca.setVisible(true);
               nomeBox.setVisible(true);
               modelo.setVisible(true);
               modeloBox.setVisible(true);
               nucleos.setVisible(true);
               nucleosBox.setVisible(true);
               threads.setVisible(true);
               threadsBox.setVisible(true);
               socket.setVisible(true);
               socketBox.setVisible(true);
               cache.setVisible(true);
               cacheBox.setVisible(true);
               potencia.setVisible(true);
               potenciaBox.setVisible(true);
               gigas.setVisible(true);
               gigasBox.setVisible(true);
               chipset.setVisible(true);
               chipsetBox.setVisible(true);
               ddr.setVisible(true);
               mem_compBox.setVisible(true);
               comp_cpu.setVisible(true);
               comp_cpuBox.setVisible(true);
               estoque.setVisible(true);
               quantidadeBox.setVisible(true);
               preco.setVisible(true);
               precoBox.setVisible(true);
               cadastrar.setVisible(true);
               tipo_produtoBox.setVisible(false);
               editar.setVisible(false);
               excluir.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
                comboBox1.setVisible(true);
               consultar.setVisible(true);
               tipo_produtoBox.setVisible(false);
               tipo_produtoBox.setText("Computador Completo");
               marca.setVisible(true);
               nomeBox.setVisible(true);
               modelo.setVisible(true);
               modeloBox.setVisible(true);
               nucleos.setVisible(true);
               nucleosBox.setVisible(true);
               threads.setVisible(true);
               threadsBox.setVisible(true);
               socket.setVisible(true);
               socketBox.setVisible(true);
               cache.setVisible(true);
               cacheBox.setVisible(true);
               potencia.setVisible(true);
               potenciaBox.setVisible(true);
               gigas.setVisible(true);
               gigasBox.setVisible(true);
               chipset.setVisible(true);
               chipsetBox.setVisible(true);
               ddr.setVisible(true);
               mem_compBox.setVisible(true);
               comp_cpu.setVisible(true);
               comp_cpuBox.setVisible(true);
               estoque.setVisible(true);
               quantidadeBox.setVisible(true);
               preco.setVisible(true);
               precoBox.setVisible(true);
               cadastrar.setVisible(false);
               tipo_produtoBox.setVisible(false);
               editar.setVisible(true);
               excluir.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cache;
    private javax.swing.JTextField cacheBox;
    private javax.swing.JButton cadastrar;
    private javax.swing.JLabel chipset;
    private javax.swing.JTextField chipsetBox;
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JLabel comp_cpu;
    private javax.swing.JTextField comp_cpuBox;
    private javax.swing.JButton consultar;
    private javax.swing.JLabel ddr;
    private javax.swing.JButton editar;
    private javax.swing.JLabel estoque;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel frequencia;
    private javax.swing.JTextField frequenciaBox;
    private javax.swing.JLabel gigas;
    private javax.swing.JTextField gigasBox;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idBox;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel marca;
    private javax.swing.JTextField mem_compBox;
    private javax.swing.JLabel modelo;
    private javax.swing.JTextField modeloBox;
    private javax.swing.JTextField nomeBox;
    private javax.swing.JLabel nucleos;
    private javax.swing.JTextField nucleosBox;
    private javax.swing.JLabel potencia;
    private javax.swing.JTextField potenciaBox;
    private javax.swing.JLabel preco;
    private javax.swing.JTextField precoBox;
    private javax.swing.JTextField quantidadeBox;
    private javax.swing.JLabel socket;
    private javax.swing.JTextField socketBox;
    private javax.swing.JLabel threads;
    private javax.swing.JTextField threadsBox;
    private javax.swing.JTextField tipo_produtoBox;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @return
     */
public boolean preencherObj(){
     objPro = new Produto();
     objPro.setNome_produto(nomeBox.getText());
     objPro.setTipo_produto(tipo_produtoBox.getText());
     objPro.setMarca(nomeBox.getText());
     objPro.setModelo(modeloBox.getText());
     objPro.setNucleos(nucleosBox.getText());
     objPro.setThreads(threadsBox.getText());
     objPro.setSocket(socketBox.getText());
     objPro.setCache(cacheBox.getText());
     objPro.setPotencia(potenciaBox.getText());
     objPro.setChipset(chipsetBox.getText());
     objPro.setMem_comp(mem_compBox.getText());
     objPro.setComp_cpu(comp_cpuBox.getText());
     objPro.setGb(gigasBox.getText());
     objPro.setQuantidade(Integer.parseInt(quantidadeBox.getText()));
     objPro.setValor(Double.parseDouble(precoBox.getText()));
     objPro.setFrequencia(frequenciaBox.getText());       
     return true;
 }

    /**
     *
     * @return
     */
    public boolean preencherObj2(){
     objPro = new Produto();
     objPro.setNome_produto(nomeBox.getText());
     objPro.setTipo_produto(modeloBox.getText());
     objPro.setMarca(nomeBox.getText());
     objPro.setModelo(modeloBox.getText());
     objPro.setNucleos(nucleosBox.getText());
     objPro.setThreads(threadsBox.getText());
     objPro.setSocket(socketBox.getText());
     objPro.setCache(cacheBox.getText());
     objPro.setPotencia(potenciaBox.getText());
     objPro.setChipset(chipsetBox.getText());
     objPro.setMem_comp(mem_compBox.getText());
     objPro.setComp_cpu(comp_cpuBox.getText());
     objPro.setGb(gigasBox.getText());
     objPro.setQuantidade(Integer.parseInt(quantidadeBox.getText()));
     objPro.setValor(Double.parseDouble(precoBox.getText()));
     objPro.setFrequencia(frequenciaBox.getText());  
     objPro.setCod_produto(Integer.parseInt(idBox.getText()));    
     return true;
 }
}
