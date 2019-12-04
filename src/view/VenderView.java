package view;


import data.ProdutoData;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author Matheus
 */
public class VenderView extends javax.swing.JFrame {
    private ProdutoData DAO;
    private Produto objPro;

    /**
     *
     */
    public VenderView() {
        initComponents(); 
        id.setVisible(false);
        idBox.setVisible(false);
        tipo_produtoBox.setVisible(false);
        DAO = new ProdutoData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBox1 = new javax.swing.JComboBox<>();
        id = new javax.swing.JLabel();
        idBox = new javax.swing.JTextField();
        tipo_produtoBox = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        socket = new javax.swing.JLabel();
        socketBox = new javax.swing.JTextField();
        cache = new javax.swing.JLabel();
        cacheBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        potencia = new javax.swing.JLabel();
        clienteBox = new javax.swing.JTextField();
        potenciaBox = new javax.swing.JTextField();
        chipset = new javax.swing.JLabel();
        chipsetBox = new javax.swing.JTextField();
        marca = new javax.swing.JLabel();
        nomeBox = new javax.swing.JTextField();
        modelo = new javax.swing.JLabel();
        modeloBox = new javax.swing.JTextField();
        nucleos = new javax.swing.JLabel();
        nucleosBox = new javax.swing.JTextField();
        threads = new javax.swing.JLabel();
        threadsBox = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        gigas = new javax.swing.JLabel();
        gigasBox = new javax.swing.JTextField();
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
        consultar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Opção", "Computador Completo", "Placa Mãe", "Processador", "Placa de Video", "Fonte", "Gabinete", "HD", "SSD" }));
        comboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox1ActionPerformed(evt);
            }
        });

        id.setText("ID:");

        idBox.setEditable(false);

        tipo_produtoBox.setEditable(false);

        socket.setText("Socket:");

        cache.setText("Cache:");

        jLabel1.setText("Cliente:");

        potencia.setText("Potência:");

        chipset.setText("Chipset:");

        marca.setText("Nome/Marca:");

        modelo.setText("Modelo:");

        nucleos.setText("Nucleos:");

        threads.setText("Threads:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clienteBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nucleosBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modeloBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(threadsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(threads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(marca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nucleos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(socket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cacheBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(socketBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cache, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(226, 226, 226))
                    .addComponent(chipset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(potencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(potenciaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addGap(181, 181, 181))
                    .addComponent(chipsetBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clienteBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modeloBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nucleos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nucleosBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(threads)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(threadsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(socket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(socketBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cache)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cacheBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(potencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(potenciaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(chipset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(chipsetBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        gigas.setText("Armazenamento:");

        ddr.setText("Memoria Compativel:");

        comp_cpu.setText("Compatibilidade com Cpu's:");

        estoque.setText("Quantidade:");

        preco.setText("Preço:");

        frequencia.setText("Frequencia:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gigas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gigasBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mem_compBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comp_cpuBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comp_cpu, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(ddr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(preco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantidadeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frequenciaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frequencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gigas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gigasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(ddr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mem_compBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comp_cpu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comp_cpuBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantidadeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frequencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frequenciaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        consultar.setText("Consultar Sistema");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        jButton1.setText("Venda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipo_produtoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(idBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo_produtoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(25, Short.MAX_VALUE))
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
               frequencia.setVisible(false);
               frequenciaBox.setVisible(false);
               tipo_produtoBox.setVisible(false);
    }//GEN-LAST:event_comboBox1ActionPerformed
               if(valor.equals("Computador Completo")){
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
               frequencia.setVisible(false);
               frequenciaBox.setVisible(false);
                            
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
               frequencia.setVisible(false);
               frequenciaBox.setVisible(false);
               
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
               frequencia.setVisible(false);
               frequenciaBox.setVisible(false);
               
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
               frequencia.setVisible(false);
               frequenciaBox.setVisible(false);
               
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
               frequencia.setVisible(false);
               frequenciaBox.setVisible(false);
               
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
               frequencia.setVisible(false);
               frequenciaBox.setVisible(false);
               
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
               frequencia.setVisible(false);
               frequenciaBox.setVisible(false);
               
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
               frequencia.setVisible(false);
               frequenciaBox.setVisible(false);
              
               tipo_produtoBox.setVisible(false);
                 } 
    }
    
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     /**
     * Executa a venda
     * @param args
     */
        JOptionPane.showMessageDialog(this, "Venda completa para: " + clienteBox.getText() + "\nFoi vendido: " + nomeBox.getText() + "\nPelo valor de :" + precoBox.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VenderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VenderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VenderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VenderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VenderView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cache;
    private javax.swing.JTextField cacheBox;
    private javax.swing.JLabel chipset;
    private javax.swing.JTextField chipsetBox;
    private javax.swing.JTextField clienteBox;
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JLabel comp_cpu;
    private javax.swing.JTextField comp_cpuBox;
    private javax.swing.JButton consultar;
    private javax.swing.JLabel ddr;
    private javax.swing.JLabel estoque;
    private javax.swing.JLabel frequencia;
    private javax.swing.JTextField frequenciaBox;
    private javax.swing.JLabel gigas;
    private javax.swing.JTextField gigasBox;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
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
