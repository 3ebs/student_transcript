
import static java.awt.PageAttributes.MediaType.A;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class UpdatePersonGUI extends javax.swing.JFrame {

    /**
     * Creates new form UpdateGUI
     */
    private boolean Sflag;
    private boolean Pflag;
    private Connection conn;
    private PreparedStatement preparedStmt; 
    private final String[] PersonColumn = new String[] {"ID", "name", "birthdate", "address", "email", "university", "faculty"};
    private final String[] StudentColumn = new String[] {"accGPA", "enrollmentDate", "graduationDate", "departmentName"};
    private final String[] ProfessorColumn = new String[] {"phd", "officehours", "roomNo"};
    
    public UpdatePersonGUI(String s) {
        initComponents();
        setLocation(600, 300);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        if(s.equals("Student")) 
        {
            Sflag = true;
            PhD.setVisible(false);
            PhDText.setVisible(false);
            OfficeHours.setVisible(false);
            OfficeHoursText.setVisible(false);
            RoomNo.setVisible(false);
            RoomNoText.setVisible(false);
        }
        else if(s.equals("Professor")) 
        {
            Pflag = true;
            AccGPAText.setVisible(false);
            AccGPA.setVisible(false);
            EDate.setVisible(false);
            EDateText.setVisible(false);
            GDateText.setVisible(false);
            GDate.setVisible(false);
            DNameText.setVisible(false);
            DName.setVisible(false);
        }
        try
        {
            String myDriver = "com.mysql.jdbc.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Transcript?autoReconnect=true&useSSL=false", "root", "u1234q-a-z");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage() + "Error connecting to database!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doneInsertPerson = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        AccGPAText = new javax.swing.JTextArea();
        EDate = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        EDateText = new javax.swing.JTextArea();
        GDate = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        GDateText = new javax.swing.JTextArea();
        DName = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        DNameText = new javax.swing.JTextArea();
        Addr = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        AddrText = new javax.swing.JTextArea();
        PhD = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        PhDText = new javax.swing.JTextArea();
        Email = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        EmailText = new javax.swing.JTextArea();
        OfficeHours = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        OfficeHoursText = new javax.swing.JTextArea();
        Uni = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        UniText = new javax.swing.JTextArea();
        NewPersonID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NewPersonIDText = new javax.swing.JTextArea();
        PersonName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PersonNameText = new javax.swing.JTextArea();
        BirthDate = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        BirthDateText = new javax.swing.JTextArea();
        RoomNo = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        RoomNoText = new javax.swing.JTextArea();
        Faculty = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        FacultyText = new javax.swing.JTextArea();
        AccGPA = new javax.swing.JLabel();
        OldPersonID = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        OldPersonIDText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(874, 423));
        setResizable(false);
        setSize(new java.awt.Dimension(874, 423));

        doneInsertPerson.setText("Done");
        doneInsertPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneInsertPersonActionPerformed(evt);
            }
        });

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        AccGPAText.setColumns(20);
        AccGPAText.setRows(5);
        jScrollPane9.setViewportView(AccGPAText);

        EDate.setText("Enrollment date");

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        EDateText.setColumns(20);
        EDateText.setRows(5);
        jScrollPane10.setViewportView(EDateText);

        GDate.setText("Graduation date");

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        GDateText.setColumns(20);
        GDateText.setRows(5);
        jScrollPane11.setViewportView(GDateText);

        DName.setText("Department name");

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        DNameText.setColumns(20);
        DNameText.setRows(5);
        jScrollPane12.setViewportView(DNameText);

        Addr.setText("Address");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        AddrText.setColumns(20);
        AddrText.setRows(5);
        jScrollPane4.setViewportView(AddrText);

        PhD.setText("PhD");

        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        PhDText.setColumns(20);
        PhDText.setRows(5);
        jScrollPane13.setViewportView(PhDText);

        Email.setText("Email");

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        EmailText.setColumns(20);
        EmailText.setRows(5);
        jScrollPane5.setViewportView(EmailText);

        OfficeHours.setText("Office hours");

        jScrollPane14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        OfficeHoursText.setColumns(20);
        OfficeHoursText.setRows(5);
        jScrollPane14.setViewportView(OfficeHoursText);

        Uni.setText("University");

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        UniText.setColumns(20);
        UniText.setRows(5);
        jScrollPane6.setViewportView(UniText);

        NewPersonID.setText("New Person ID");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        NewPersonIDText.setColumns(20);
        NewPersonIDText.setRows(5);
        jScrollPane1.setViewportView(NewPersonIDText);

        PersonName.setText("Person name");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        PersonNameText.setColumns(20);
        PersonNameText.setRows(5);
        jScrollPane2.setViewportView(PersonNameText);

        BirthDate.setText("Birth date");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        BirthDateText.setColumns(20);
        BirthDateText.setRows(5);
        jScrollPane3.setViewportView(BirthDateText);

        RoomNo.setText("Room number");

        jScrollPane15.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane15.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        RoomNoText.setColumns(20);
        RoomNoText.setRows(5);
        jScrollPane15.setViewportView(RoomNoText);

        Faculty.setText("Faculty");

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        FacultyText.setColumns(20);
        FacultyText.setRows(5);
        jScrollPane7.setViewportView(FacultyText);

        AccGPA.setText("Accumlated GPA");

        OldPersonID.setText("Current Person ID*");

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        OldPersonIDText.setColumns(20);
        OldPersonIDText.setRows(5);
        jScrollPane8.setViewportView(OldPersonIDText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Uni)
                            .addComponent(Email)
                            .addComponent(Addr)
                            .addComponent(BirthDate)
                            .addComponent(NewPersonID)
                            .addComponent(Faculty)
                            .addComponent(PersonName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OldPersonID)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(GDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(EDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(AccGPA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(RoomNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PhD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(OfficeHours)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(doneInsertPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(OldPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(NewPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(PersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(BirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Addr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Uni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(PhD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(OfficeHours, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(RoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(AccGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(EDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(GDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(DName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(doneInsertPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneInsertPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneInsertPersonActionPerformed
        // TODO add your handling code here:
        String[] enteries1 = {NewPersonIDText.getText(), PersonNameText.getText(), BirthDateText.getText(), 
               AddrText.getText(), EmailText.getText(), UniText.getText(), 
                FacultyText.getText()};
        String oldID = OldPersonIDText.getText();
        String query;
        boolean changeID = false;
        ArrayList<String> tmpcolumn = new ArrayList<String>();
        ArrayList<String> tmpvalue = new ArrayList<String>();
        for(int i = 0; i < 7; i++)
        {
            if(!enteries1[i].equals(""))
            {
                tmpvalue.add(enteries1[i]);
                tmpcolumn.add(PersonColumn[i]);
            }
        }
        String cmd;
        try
        {
            if(tmpcolumn.size() > 0)
            {
                if(tmpcolumn.get(0).equals("ID"))
                {
                    cmd = tmpcolumn.get(0) + "=" + Integer.parseInt(tmpvalue.get(0));
                    changeID = true;
                }
                else
                    cmd = tmpcolumn.get(0) + "=" + "\'" + tmpvalue.get(0) + "\'";
                for (int i = 1 ; i < tmpcolumn.size() ; i++)
                {
                    cmd += ", " + tmpcolumn.get(i) + "=" + "\'" + tmpvalue.get(i) + "\'";
                }
                query = "UPDATE person SET "+ cmd
                + " WHERE " + "ID" + "=" + oldID;

                preparedStmt = conn.prepareStatement(query);
                preparedStmt.executeUpdate(query);
                if(changeID)
                {
                    oldID = tmpvalue.get(0);
                    changeID = false;
                }
            }
        }
        catch(SQLException e)
        {
            System.out.println("Can't update Person table!");
        }
        if(Sflag)
        {
            tmpcolumn.clear();
            tmpvalue.clear();
            String[] enteries2 = {AccGPAText.getText(), EDateText.getText(), GDateText.getText(),
            DNameText.getText()};
            for(int i = 0; i < 4; i++)
            {
                if(!enteries2[i].equals(""))
                {
                    tmpvalue.add(enteries2[i]);
                    tmpcolumn.add(StudentColumn[i]);
                }
            }
            try
            {
                if(tmpcolumn.size() > 0)
                {
                    if(tmpcolumn.get(0).equals("accGPA"))
                        cmd = tmpcolumn.get(0) + "=" + Float.parseFloat(tmpvalue.get(0));
                    else
                        cmd = tmpcolumn.get(0) + "=" + "\'" + tmpvalue.get(0) + "\'";
                    for (int i = 1 ; i < tmpcolumn.size() ; i++)
                    {
                        cmd += ", " + tmpcolumn.get(i) + "=" + "\'" + tmpvalue.get(i) + "\'";
                    }
                    query = "UPDATE student SET "+ cmd
                    + " WHERE " + "personID" + "=" + oldID;

                    preparedStmt = conn.prepareStatement(query);
                    preparedStmt.executeUpdate(query);
                    Success s = new Success();
                }
            }
            catch(SQLException e)
            {
                System.out.println("Can't update Student table!");
                Failure f = new Failure();
            }
        }
        else if(Pflag)
        {
            tmpcolumn.clear();
            tmpvalue.clear();
            String[] enteries3 = {PhDText.getText(), OfficeHoursText.getText(), RoomNoText.getText()};
            for(int i = 0; i < 3; i++)
            {
                if(!enteries3[i].equals(""))
                {
                    tmpvalue.add(enteries3[i]);
                    tmpcolumn.add(ProfessorColumn[i]);
                }
            }
            try
            {
                if(tmpcolumn.size() > 0)
                {
                    if(tmpcolumn.get(0).equals("roomNo"))
                        cmd = tmpcolumn.get(0) + "=" + Integer.parseInt(tmpvalue.get(0));
                    else
                        cmd = tmpcolumn.get(0) + "=" + "\'" + tmpvalue.get(0) + "\'";
                    for (int i = 1 ; i < tmpcolumn.size() ; i++)
                    {
                        if(tmpcolumn.get(i).equals("roomNo"))
                            cmd += ", " + tmpcolumn.get(i) + "=" + Integer.parseInt(tmpvalue.get(i));
                        else
                            cmd += ", " + tmpcolumn.get(i) + "=" + "\'" + tmpvalue.get(i) + "\'";
                    }
                    query = "UPDATE professor SET "+ cmd
                    + " WHERE " + "personID" + "=" + oldID;

                    preparedStmt = conn.prepareStatement(query);
                    preparedStmt.executeUpdate(query);
                    Success s = new Success();
                }
            }
            catch(SQLException e)
            {
                System.out.println("Can't update Professor table!");
                Failure f = new Failure();
            }
        }
    }//GEN-LAST:event_doneInsertPersonActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(UpdatePersonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePersonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePersonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePersonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePersonGUI("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccGPA;
    private javax.swing.JTextArea AccGPAText;
    private javax.swing.JLabel Addr;
    private javax.swing.JTextArea AddrText;
    private javax.swing.JLabel BirthDate;
    private javax.swing.JTextArea BirthDateText;
    private javax.swing.JLabel DName;
    private javax.swing.JTextArea DNameText;
    private javax.swing.JLabel EDate;
    private javax.swing.JTextArea EDateText;
    private javax.swing.JLabel Email;
    private javax.swing.JTextArea EmailText;
    private javax.swing.JLabel Faculty;
    private javax.swing.JTextArea FacultyText;
    private javax.swing.JLabel GDate;
    private javax.swing.JTextArea GDateText;
    private javax.swing.JLabel NewPersonID;
    private javax.swing.JTextArea NewPersonIDText;
    private javax.swing.JLabel OfficeHours;
    private javax.swing.JTextArea OfficeHoursText;
    private javax.swing.JLabel OldPersonID;
    private javax.swing.JTextArea OldPersonIDText;
    private javax.swing.JLabel PersonName;
    private javax.swing.JTextArea PersonNameText;
    private javax.swing.JLabel PhD;
    private javax.swing.JTextArea PhDText;
    private javax.swing.JLabel RoomNo;
    private javax.swing.JTextArea RoomNoText;
    private javax.swing.JLabel Uni;
    private javax.swing.JTextArea UniText;
    private javax.swing.JButton doneInsertPerson;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
