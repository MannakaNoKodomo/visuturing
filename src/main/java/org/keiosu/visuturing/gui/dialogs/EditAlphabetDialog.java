package org.keiosu.visuturing.gui.dialogs;

import org.keiosu.visuturing.core.TuringMachine;
import org.keiosu.visuturing.gui.panels.EditAlphabetPanel;
import java.awt.Frame;
import java.util.Vector;

public class EditAlphabetDialog extends VTDialog {
  private EditAlphabetPanel alphabetEditor;

  public EditAlphabetDialog(Frame var1, TuringMachine var2) {
    super(var1, "Edit Alphabet");
    this.alphabetEditor = new EditAlphabetPanel(var2);
    this.init(this.alphabetEditor);
  }

  public Vector getAlphabet() {
    return this.alphabetEditor.getAlphabet();
  }
}