package sir_sd3;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.IElementDescriptor;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.presentation.UtilitiesDrawing.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.presentation.*;

import javax.swing.JApplet;



public class Simulation extends ExperimentSimulation<Main> {
  @AnyLogicInternalCodegenAPI
  public static String[] COMMAND_LINE_ARGUMENTS_xjal = new String[0];
  {
    setCommandLineArguments_xjal( COMMAND_LINE_ARGUMENTS_xjal );
  }
  // View areas
  @AnyLogicInternalCodegenAPI
  protected static final Font _button_Font = new Font("Dialog", 0, 11 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = new Font("Serif", 1, 28 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text1_Font = new Font("Serif", 2, 16 );
  @AnyLogicInternalCodegenAPI
  protected static final int _button = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _text1 = 3;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 4;
 

  /**
   * Top-level presentation group id
   */	 
  @AnyLogicInternalCodegenAPI
  protected static final int _presentation = 0;

  /**
   * Top-level icon group id
   */	 
  @AnyLogicInternalCodegenAPI
  protected static final int _icon = -1;
  

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeShapeControlAction( int _shape, int index ) {
    switch( _shape ) {
      case _button: {
          ShapeButton self = this.button;
if ( getState() == IDLE )
	run();
getEngine().getPresentation().setPresentable( getEngine().getRoot() ); 
;}
        break;
      default:
        super.executeShapeControlAction( _shape, index );
        break;
    }
  }
  
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _button_SetDynamicParams_xjal( ShapeButton shape ) {
    shape.setText(
getState() == IDLE ?
	"Run the model and switch to Main view" :
	"Switch to Main view" 
);
  }
  
  protected ShapeButton button;
  protected ShapeText text;
  protected ShapeText text1;
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    button = new ShapeButton(
			Simulation.this, true, 40.0, 120.0, 
			330.0, 30.0,
            controlDefault, controlDefault, true,
            _button_Font, 
			"Run the model and switch to Main view" ) {
      @Override
      public void updateDynamicProperties(boolean publicOnly) {
        _button_SetDynamicParams_xjal( this );
        super.updateDynamicProperties(publicOnly);
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void action(){
        executeShapeControlAction( _button, 0 );
      }
    };

    text = new ShapeText(
        SHAPE_DRAW_2D, true,40.0, 30.0, 0.0, 0.0, 
        black,"SIR-SD3",
        _text_Font, ALIGNMENT_LEFT );

    text1 = new ShapeText(
        SHAPE_DRAW_2D, true,40.0, 63.0, 0.0, 0.0, 
        black,"Experiment setup page",
        _text1_Font, ALIGNMENT_LEFT );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
  }


  // Static initialization of persistent elements
  {
    _createPersistentElementsBP0_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public Object getPersistentShape( int _shape ) {
    switch (_shape) {
      case _presentation: return presentation;
      case _icon: return icon;
      case _button: return button;
      case _text: return text;
      case _text1: return text1;
      default: return super.getPersistentShape( _shape ); 
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOfShape_xjal( Object _shape ) {
    try {
      if ( _shape == null ) return null;
      String _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, presentation, "presentation" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, icon, "icon" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, button, "button" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, text, "text" ); if (_name_xjal != null) return _name_xjal;
      _name_xjal = checkNameOfShape_xjal( _shape, text1, "text1" ); if (_name_xjal != null) return _name_xjal;
    } catch (Exception e) {
      return null;
    }
    return super.getNameOfShape_xjal( _shape );
  }

  @Override
  public int getWindowWidth() {
    return 800;
  }

  @Override
  public int getWindowHeight() {
    return 600;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onDestroy_xjal() {
    onDestroy();
    super.onDestroy_xjal();
  }

  /**
   * Applet class to run experiment as java applet
   */  
  @AnyLogicInternalCodegenAPI
  public static class Applet extends JApplet {

  @AnyLogicInternalCodegenAPI
    Simulation ex;

    @Override
    public void init() {
      ex = new Simulation();
      ex.setup( this );
    }

    @Override
    public void destroy() {
      ex.close();
    }

  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void initDefaultRandomNumberGenerator(Engine _e) {
    _e.setDefaultRandomGenerator( new java.util.Random() );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Main createRoot( Engine engine ) {
    // Create the root object
    return new Main( engine, null, null );
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void setupRootParameters( final Main self, boolean callOnChangeActions ) {
    final Main root = self; // for compatibility
    double InfectionRisk_xjal;
    InfectionRisk_xjal = self._InfectionRisk_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_InfectionRisk( InfectionRisk_xjal );
    } else {
      self.InfectionRisk = InfectionRisk_xjal;
    }
    double DiseaseDuration_xjal;
    DiseaseDuration_xjal = self._DiseaseDuration_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_DiseaseDuration( DiseaseDuration_xjal );
    } else {
      self.DiseaseDuration = DiseaseDuration_xjal;
    }
    double PopulationSize_xjal;
    PopulationSize_xjal = self._PopulationSize_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_PopulationSize( PopulationSize_xjal );
    } else {
      self.PopulationSize = PopulationSize_xjal;
    }
    double InitiallyInfected_xjal;
    InitiallyInfected_xjal = self._InitiallyInfected_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_InitiallyInfected( InitiallyInfected_xjal );
    } else {
      self.InitiallyInfected = InitiallyInfected_xjal;
    }
    double EncounterRate_xjal;
    EncounterRate_xjal = self._EncounterRate_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_EncounterRate( EncounterRate_xjal );
    } else {
      self.EncounterRate = EncounterRate_xjal;
    }
    double VaccRate_xjal;
    VaccRate_xjal = self._VaccRate_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_VaccRate( VaccRate_xjal );
    } else {
      self.VaccRate = VaccRate_xjal;
    }
    double BirthRate_xjal;
    BirthRate_xjal = self._BirthRate_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_BirthRate( BirthRate_xjal );
    } else {
      self.BirthRate = BirthRate_xjal;
    }
    double DeathRisk_xjal;
    DeathRisk_xjal = self._DeathRisk_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_DeathRisk( DeathRisk_xjal );
    } else {
      self.DeathRisk = DeathRisk_xjal;
    }
  }
  

  /**
   * Engine setup
   */
  @Override
  @AnyLogicInternalCodegenAPI
  public void setupEngine(Engine engine) {
    engine.setATOL( 1.0E-5 );
    engine.setRTOL( 1.0E-5 );
    engine.setTTOL( 1.0E-5 );
    engine.setHTOL( 0.001 );
    engine.setSolverODE( Engine.SOLVER_ODE_EULER );
    engine.setSolverNAE( Engine.SOLVER_NAE_MODIFIED_NEWTON );
    engine.setSolverDAE( Engine.SOLVER_DAE_RK45_NEWTON );
    engine.setVMethods( 427829 );
    engine.setSimultaneousEventsSelectionMode( Engine.EVENT_SELECTION_LIFO );

    engine.setStartTime( 0.0 );
    engine.setTimeUnit( MINUTE );
    engine.setStartDate( toDate( 2009, NOVEMBER, 6, 14, 32, 37 ) );
    engine.setStopTime( 300.0 );
    engine.setRealTimeMode( true );
    engine.setRealTimeScale( 1.0 );
  }

  /**
   * Experiment setup
   */
  @Override
  @AnyLogicInternalCodegenAPI
  public void setup( java.awt.Container container ) {
    setName( "SIR-SD3 : Simulation" );

    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup( Simulation.this, true, 0, 0, 0, 0 , text, text1, button );
    icon = new ShapeGroup( Simulation.this, true, 0, 0, 0  );
    // Setup presentation
    Presentation _p = new Presentation( this, container instanceof JApplet ? Presentation.MODE_APPLET :
    	container != null ? Presentation.MODE_COMPONENT :
        Presentation.MODE_APPLICATION, container );
    _p.start();

    Panel _panel = _p.getPanel();
    ToolBar _tb = _p.getToolBar();
    StatusBar _sb = _p.getStatusBar();

    _panel.setFrameManagementBalance( 2.0 );

    _sb.setSectionVisible( StatusBar.DATE, false );
    _sb.setSectionVisible( StatusBar.EPS, false );
    _sb.setSectionVisible( StatusBar.EXPERIMENT, false );
    _sb.setSectionVisible( StatusBar.FPS, false );
    _sb.setSectionVisible( StatusBar.MEMORY, true );
    _sb.setSectionVisible( StatusBar.SECONDS, true );
    _sb.setSectionVisible( StatusBar.SIMULATION, true );
    _sb.setSectionVisible( StatusBar.STATUS, true );
    _sb.setSectionVisible( StatusBar.STEP, false );
    _sb.setSectionVisible( StatusBar.TIME, true );
    _tb.setSectionVisible( ToolBar.ANIMATION, false );
    _tb.setSectionVisible( ToolBar.EXECUTION, true );
    _tb.setSectionVisible( ToolBar.FILE, false );
    _tb.setSectionVisible( ToolBar.NAVIGATION, true );
    _tb.setSectionVisible( ToolBar.TIME_SCALE, true );
    _tb.setSectionVisible( ToolBar.VIEW, false );
  }

}
