package javabasic.exgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * 간단한 메모장 프로그램
 * - 메모 등록, 수정, 삭제 기능 포함
 * - Java GUI 실습용
 */
public class ExMemopad1 extends JFrame {
    // 메모 데이터를 저장하는 리스트
    private final DefaultListModel<String> memoListModel;
    private final JList<String> memoList;
    private final JTextArea memoTextArea;

    public ExMemopad1() {
        // 프레임 설정
        setTitle("메모장 프로그램");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 좌측: 메모 목록 패널
        memoListModel = new DefaultListModel<>();
        memoList = new JList<>(memoListModel);
        memoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(memoList);

        // 우측: 메모 내용 패널
        memoTextArea = new JTextArea();
        JScrollPane textScrollPane = new JScrollPane(memoTextArea);

        // 하단: 버튼 패널
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("메모 등록");
        JButton editButton = new JButton("메모 수정");
        JButton deleteButton = new JButton("메모 삭제");

        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);

        // 이벤트 처리
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMemo();
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editMemo();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteMemo();
            }
        });

        memoList.addListSelectionListener(e -> displaySelectedMemo());

        // 프레임에 구성요소 추가
        add(listScrollPane, BorderLayout.WEST);
        add(textScrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // 메모 등록 메서드
    private void addMemo() {
        String newMemo = memoTextArea.getText().trim();
        if (!newMemo.isEmpty()) {
            memoListModel.addElement(newMemo);
            memoTextArea.setText("");
            JOptionPane.showMessageDialog(this, "메모가 등록되었습니다.");
        } else {
            JOptionPane.showMessageDialog(this, "메모 내용을 입력하세요.");
        }
    }

    // 메모 수정 메서드
    private void editMemo() {
        int selectedIndex = memoList.getSelectedIndex();
        if (selectedIndex != -1) {
            String updatedMemo = memoTextArea.getText().trim();
            if (!updatedMemo.isEmpty()) {
                memoListModel.set(selectedIndex, updatedMemo);
                JOptionPane.showMessageDialog(this, "메모가 수정되었습니다.");
            } else {
                JOptionPane.showMessageDialog(this, "메모 내용을 입력하세요.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "수정할 메모를 선택하세요.");
        }
    }

    // 메모 삭제 메서드
    private void deleteMemo() {
        int selectedIndex = memoList.getSelectedIndex();
        if (selectedIndex != -1) {
            memoListModel.remove(selectedIndex);
            memoTextArea.setText("");
            JOptionPane.showMessageDialog(this, "메모가 삭제되었습니다.");
        } else {
            JOptionPane.showMessageDialog(this, "삭제할 메모를 선택하세요.");
        }
    }

    // 선택된 메모를 텍스트 영역에 표시
    private void displaySelectedMemo() {
        int selectedIndex = memoList.getSelectedIndex();
        if (selectedIndex != -1) {
            memoTextArea.setText(memoListModel.get(selectedIndex));
        }
    }

    public static void main(String[] args) {
        // 프로그램 실행
        SwingUtilities.invokeLater(ExMemopad1::new);
    }
}
