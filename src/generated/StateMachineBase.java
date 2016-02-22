/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("RadioButton", com.codename1.ui.RadioButton.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("RadioButton", com.codename1.ui.RadioButton.class);
        UIBuilder.registerCustomComponent("CheckBox", com.codename1.ui.CheckBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findUsename(Component root) {
        return (com.codename1.ui.TextField)findByName("usename", root);
    }

    public com.codename1.ui.TextField findUsename() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("usename", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("usename", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findCancel(Component root) {
        return (com.codename1.ui.Button)findByName("cancel", root);
    }

    public com.codename1.ui.Button findCancel() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("cancel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("cancel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea", root);
    }

    public com.codename1.ui.TextArea findTextArea() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPassword(Component root) {
        return (com.codename1.ui.TextField)findByName("password", root);
    }

    public com.codename1.ui.TextField findPassword() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("password", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("password", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea1(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea1", root);
    }

    public com.codename1.ui.TextArea findTextArea1() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Component findMain(Component root) {
        return (com.codename1.ui.Component)findByName("Main", root);
    }

    public com.codename1.ui.Component findMain() {
        com.codename1.ui.Component cmp = (com.codename1.ui.Component)findByName("Main", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Component)findByName("Main", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel3(Component root) {
        return (com.codename1.ui.Label)findByName("Label3", root);
    }

    public com.codename1.ui.Label findLabel3() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findCheckBox(Component root) {
        return (com.codename1.ui.CheckBox)findByName("CheckBox", root);
    }

    public com.codename1.ui.CheckBox findCheckBox() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("CheckBox", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("CheckBox", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findLogin(Component root) {
        return (com.codename1.ui.Button)findByName("login", root);
    }

    public com.codename1.ui.Button findLogin() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("login", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("login", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea4(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea4", root);
    }

    public com.codename1.ui.TextArea findTextArea4() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea3(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea3", root);
    }

    public com.codename1.ui.TextArea findTextArea3() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea2(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea2", root);
    }

    public com.codename1.ui.TextArea findTextArea2() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.RadioButton findRadioButton(Component root) {
        return (com.codename1.ui.RadioButton)findByName("RadioButton", root);
    }

    public com.codename1.ui.RadioButton findRadioButton() {
        com.codename1.ui.RadioButton cmp = (com.codename1.ui.RadioButton)findByName("RadioButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.RadioButton)findByName("RadioButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel4(Component root) {
        return (com.codename1.ui.Label)findByName("Label4", root);
    }

    public com.codename1.ui.Label findLabel4() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel5(Component root) {
        return (com.codename1.ui.Label)findByName("Label5", root);
    }

    public com.codename1.ui.Label findLabel5() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.RadioButton findRadioButton1(Component root) {
        return (com.codename1.ui.RadioButton)findByName("RadioButton1", root);
    }

    public com.codename1.ui.RadioButton findRadioButton1() {
        com.codename1.ui.RadioButton cmp = (com.codename1.ui.RadioButton)findByName("RadioButton1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.RadioButton)findByName("RadioButton1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.CheckBox findCheckBox1(Component root) {
        return (com.codename1.ui.CheckBox)findByName("CheckBox1", root);
    }

    public com.codename1.ui.CheckBox findCheckBox1() {
        com.codename1.ui.CheckBox cmp = (com.codename1.ui.CheckBox)findByName("CheckBox1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.CheckBox)findByName("CheckBox1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_MainBuscarCoche = 5;
    public static final int COMMAND_MainMostrarSolicitud = 8;
    public static final int COMMAND_MainRegistro = 6;

    protected boolean onMainBuscarCoche() {
        return false;
    }

    protected boolean onMainMostrarSolicitud() {
        return false;
    }

    protected boolean onMainRegistro() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_MainBuscarCoche:
                if(onMainBuscarCoche()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainMostrarSolicitud:
                if(onMainMostrarSolicitud()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainRegistro:
                if(onMainRegistro()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("Buscar coche".equals(f.getName())) {
            exitBuscarCoche(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Solicitar plaza".equals(f.getName())) {
            exitSolicitarPlaza(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Inicio sesion".equals(f.getName())) {
            exitInicioSesion(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Recupera clave".equals(f.getName())) {
            exitRecuperaClave(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Registro".equals(f.getName())) {
            exitRegistro(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Mostrar solicitud".equals(f.getName())) {
            exitMostrarSolicitud(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitBuscarCoche(Form f) {
    }


    protected void exitSolicitarPlaza(Form f) {
    }


    protected void exitInicioSesion(Form f) {
    }


    protected void exitRecuperaClave(Form f) {
    }


    protected void exitMain(Form f) {
    }


    protected void exitRegistro(Form f) {
    }


    protected void exitMostrarSolicitud(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Buscar coche".equals(f.getName())) {
            beforeBuscarCoche(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Solicitar plaza".equals(f.getName())) {
            beforeSolicitarPlaza(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Inicio sesion".equals(f.getName())) {
            beforeInicioSesion(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Recupera clave".equals(f.getName())) {
            beforeRecuperaClave(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Registro".equals(f.getName())) {
            beforeRegistro(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Mostrar solicitud".equals(f.getName())) {
            beforeMostrarSolicitud(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeBuscarCoche(Form f) {
    }


    protected void beforeSolicitarPlaza(Form f) {
    }


    protected void beforeInicioSesion(Form f) {
    }


    protected void beforeRecuperaClave(Form f) {
    }


    protected void beforeMain(Form f) {
    }


    protected void beforeRegistro(Form f) {
    }


    protected void beforeMostrarSolicitud(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Buscar coche".equals(c.getName())) {
            beforeContainerBuscarCoche(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Solicitar plaza".equals(c.getName())) {
            beforeContainerSolicitarPlaza(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Inicio sesion".equals(c.getName())) {
            beforeContainerInicioSesion(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Recupera clave".equals(c.getName())) {
            beforeContainerRecuperaClave(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Registro".equals(c.getName())) {
            beforeContainerRegistro(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Mostrar solicitud".equals(c.getName())) {
            beforeContainerMostrarSolicitud(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerBuscarCoche(Container c) {
    }


    protected void beforeContainerSolicitarPlaza(Container c) {
    }


    protected void beforeContainerInicioSesion(Container c) {
    }


    protected void beforeContainerRecuperaClave(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }


    protected void beforeContainerRegistro(Container c) {
    }


    protected void beforeContainerMostrarSolicitud(Container c) {
    }

    protected void postShow(Form f) {
        if("Buscar coche".equals(f.getName())) {
            postBuscarCoche(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Solicitar plaza".equals(f.getName())) {
            postSolicitarPlaza(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Inicio sesion".equals(f.getName())) {
            postInicioSesion(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Recupera clave".equals(f.getName())) {
            postRecuperaClave(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Registro".equals(f.getName())) {
            postRegistro(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Mostrar solicitud".equals(f.getName())) {
            postMostrarSolicitud(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postBuscarCoche(Form f) {
    }


    protected void postSolicitarPlaza(Form f) {
    }


    protected void postInicioSesion(Form f) {
    }


    protected void postRecuperaClave(Form f) {
    }


    protected void postMain(Form f) {
    }


    protected void postRegistro(Form f) {
    }


    protected void postMostrarSolicitud(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Buscar coche".equals(c.getName())) {
            postContainerBuscarCoche(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Solicitar plaza".equals(c.getName())) {
            postContainerSolicitarPlaza(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Inicio sesion".equals(c.getName())) {
            postContainerInicioSesion(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Recupera clave".equals(c.getName())) {
            postContainerRecuperaClave(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Registro".equals(c.getName())) {
            postContainerRegistro(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Mostrar solicitud".equals(c.getName())) {
            postContainerMostrarSolicitud(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerBuscarCoche(Container c) {
    }


    protected void postContainerSolicitarPlaza(Container c) {
    }


    protected void postContainerInicioSesion(Container c) {
    }


    protected void postContainerRecuperaClave(Container c) {
    }


    protected void postContainerMain(Container c) {
    }


    protected void postContainerRegistro(Container c) {
    }


    protected void postContainerMostrarSolicitud(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Buscar coche".equals(rootName)) {
            onCreateBuscarCoche();
            aboutToShowThisContainer = null;
            return;
        }

        if("Solicitar plaza".equals(rootName)) {
            onCreateSolicitarPlaza();
            aboutToShowThisContainer = null;
            return;
        }

        if("Inicio sesion".equals(rootName)) {
            onCreateInicioSesion();
            aboutToShowThisContainer = null;
            return;
        }

        if("Recupera clave".equals(rootName)) {
            onCreateRecuperaClave();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

        if("Registro".equals(rootName)) {
            onCreateRegistro();
            aboutToShowThisContainer = null;
            return;
        }

        if("Mostrar solicitud".equals(rootName)) {
            onCreateMostrarSolicitud();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateBuscarCoche() {
    }


    protected void onCreateSolicitarPlaza() {
    }


    protected void onCreateInicioSesion() {
    }


    protected void onCreateRecuperaClave() {
    }


    protected void onCreateMain() {
    }


    protected void onCreateRegistro() {
    }


    protected void onCreateMostrarSolicitud() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Buscar coche".equals(f.getName())) {
            getStateBuscarCoche(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Solicitar plaza".equals(f.getName())) {
            getStateSolicitarPlaza(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Inicio sesion".equals(f.getName())) {
            getStateInicioSesion(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Recupera clave".equals(f.getName())) {
            getStateRecuperaClave(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Registro".equals(f.getName())) {
            getStateRegistro(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Mostrar solicitud".equals(f.getName())) {
            getStateMostrarSolicitud(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateBuscarCoche(Form f, Hashtable h) {
    }


    protected void getStateSolicitarPlaza(Form f, Hashtable h) {
    }


    protected void getStateInicioSesion(Form f, Hashtable h) {
    }


    protected void getStateRecuperaClave(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }


    protected void getStateRegistro(Form f, Hashtable h) {
    }


    protected void getStateMostrarSolicitud(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Buscar coche".equals(f.getName())) {
            setStateBuscarCoche(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Solicitar plaza".equals(f.getName())) {
            setStateSolicitarPlaza(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Inicio sesion".equals(f.getName())) {
            setStateInicioSesion(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Recupera clave".equals(f.getName())) {
            setStateRecuperaClave(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Registro".equals(f.getName())) {
            setStateRegistro(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Mostrar solicitud".equals(f.getName())) {
            setStateMostrarSolicitud(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateBuscarCoche(Form f, Hashtable state) {
    }


    protected void setStateSolicitarPlaza(Form f, Hashtable state) {
    }


    protected void setStateInicioSesion(Form f, Hashtable state) {
    }


    protected void setStateRecuperaClave(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }


    protected void setStateRegistro(Form f, Hashtable state) {
    }


    protected void setStateMostrarSolicitud(Form f, Hashtable state) {
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Inicio sesion")) {
            if("usename".equals(c.getName())) {
                onInicioSesion_UsenameAction(c, event);
                return;
            }
            if("password".equals(c.getName())) {
                onInicioSesion_PasswordAction(c, event);
                return;
            }
            if("login".equals(c.getName())) {
                onInicioSesion_LoginAction(c, event);
                return;
            }
            if("cancel".equals(c.getName())) {
                onInicioSesion_CancelAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Registro")) {
            if("TextArea".equals(c.getName())) {
                onRegistro_TextAreaAction(c, event);
                return;
            }
            if("TextArea1".equals(c.getName())) {
                onRegistro_TextArea1Action(c, event);
                return;
            }
            if("TextArea2".equals(c.getName())) {
                onRegistro_TextArea2Action(c, event);
                return;
            }
            if("TextArea3".equals(c.getName())) {
                onRegistro_TextArea3Action(c, event);
                return;
            }
            if("TextArea4".equals(c.getName())) {
                onRegistro_TextArea4Action(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onRegistro_ButtonAction(c, event);
                return;
            }
            if("RadioButton".equals(c.getName())) {
                onRegistro_RadioButtonAction(c, event);
                return;
            }
            if("RadioButton1".equals(c.getName())) {
                onRegistro_RadioButton1Action(c, event);
                return;
            }
            if("CheckBox".equals(c.getName())) {
                onRegistro_CheckBoxAction(c, event);
                return;
            }
            if("CheckBox1".equals(c.getName())) {
                onRegistro_CheckBox1Action(c, event);
                return;
            }
        }
    }

      protected void onInicioSesion_UsenameAction(Component c, ActionEvent event) {
      }

      protected void onInicioSesion_PasswordAction(Component c, ActionEvent event) {
      }

      protected void onInicioSesion_LoginAction(Component c, ActionEvent event) {
      }

      protected void onInicioSesion_CancelAction(Component c, ActionEvent event) {
      }

      protected void onRegistro_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onRegistro_TextArea1Action(Component c, ActionEvent event) {
      }

      protected void onRegistro_TextArea2Action(Component c, ActionEvent event) {
      }

      protected void onRegistro_TextArea3Action(Component c, ActionEvent event) {
      }

      protected void onRegistro_TextArea4Action(Component c, ActionEvent event) {
      }

      protected void onRegistro_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onRegistro_RadioButtonAction(Component c, ActionEvent event) {
      }

      protected void onRegistro_RadioButton1Action(Component c, ActionEvent event) {
      }

      protected void onRegistro_CheckBoxAction(Component c, ActionEvent event) {
      }

      protected void onRegistro_CheckBox1Action(Component c, ActionEvent event) {
      }

}
