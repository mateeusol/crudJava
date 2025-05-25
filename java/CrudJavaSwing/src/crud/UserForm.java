package crud;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserForm extends JFrame {
    private JTextField idField, nameField, emailField;
    private JTextArea outputArea;

    public UserForm() {
        setTitle("CRUD de Usuários");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2));

        add(new JLabel("ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Nome:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        JButton addBtn = new JButton("Salvar");
        JButton updateBtn = new JButton("Alterar");
        JButton deleteBtn = new JButton("Excluir");
        JButton searchBtn = new JButton("Consultar");
        JButton listBtn = new JButton("Listar Todos");

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(outputArea);
        add(scroll);

        add(addBtn);
        add(updateBtn);
        add(deleteBtn);
        add(searchBtn);
        add(listBtn);

        addBtn.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            User user = new User(id, nameField.getText(), emailField.getText());
            UserDAO.addUser(user);
            outputArea.setText("Usuário salvo com sucesso!");
        });

        updateBtn.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            User user = new User(id, nameField.getText(), emailField.getText());
            boolean updated = UserDAO.updateUser(user);
            outputArea.setText(updated ? "Usuário atualizado!" : "Usuário não encontrado.");
        });

        deleteBtn.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            boolean deleted = UserDAO.deleteUser(id);
            outputArea.setText(deleted ? "Usuário excluído!" : "Usuário não encontrado.");
        });

        searchBtn.addActionListener(e -> {
            int id = Integer.parseInt(idField.getText());
            User user = UserDAO.getUserById(id);
            if (user != null) {
                nameField.setText(user.getName());
                emailField.setText(user.getEmail());
                outputArea.setText("Usuário encontrado!");
            } else {
                outputArea.setText("Usuário não encontrado.");
            }
        });

        listBtn.addActionListener(e -> {
            StringBuilder sb = new StringBuilder("Lista de Usuários:\n");
            for (User u : UserDAO.getAllUsers()) {
                sb.append("ID: ").append(u.getId()).append(", Nome: ").append(u.getName()).append(", Email: ").append(u.getEmail()).append("\n");
            }
            outputArea.setText(sb.toString());
        });

        setVisible(true);
    }
}
