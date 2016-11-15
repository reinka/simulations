package skydiver;

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

import java.awt.geom.Arc2D;

public class Main extends Agent
{
  // Parameters

  public 
double  b;

  /**
   * Returns default value for parameter <code>b</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _b_DefaultValue_xjal() {
    final Main self = this;
    return 
0.0033 
;
  }

  public void set_b( double b ) {
    if (b == this.b) {
      return;
    }
    double _oldValue_xjal = this.b;
    this.b = b;
    onChange_b_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter b.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_b()</code> method instead.
   */
  protected void onChange_b() {
    onChange_b_xjal( b );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_b_xjal( double oldValue ) {  
  }


  public 
double  g;

  /**
   * Returns default value for parameter <code>g</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _g_DefaultValue_xjal() {
    final Main self = this;
    return 
9.81
 
;
  }

  public void set_g( double g ) {
    if (g == this.g) {
      return;
    }
    double _oldValue_xjal = this.g;
    this.g = g;
    onChange_g_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter g.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_g()</code> method instead.
   */
  protected void onChange_g() {
    onChange_g_xjal( g );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_g_xjal( double oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    b = _b_DefaultValue_xjal();
    g = _g_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "b":
      if ( _callOnChange_xjal ) {
        set_b( ((Number) _value_xjal).doubleValue() );
      } else {
        b = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "g":
      if ( _callOnChange_xjal ) {
        set_g( ((Number) _value_xjal).doubleValue() );
      } else {
        g = ((Number) _value_xjal).doubleValue();
      }
      return true;
    default:
      return super.setParameter( _name_xjal, _value_xjal, _callOnChange_xjal );
    }
  }

  @Override
  public <T> T getParameter(String _name_xjal) {
    Object _result_xjal;
    switch ( _name_xjal ) {
    case "b": _result_xjal = b; break;
    case "g": _result_xjal = g; break;
    default: _result_xjal = super.getParameter( _name_xjal ); break;
    }
    return (T) _result_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private static String[] _parameterNames_xjal;

  @Override
  public String[] getParameterNames() {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList<>( Arrays.asList( super.getParameterNames() ) );
      list.add( "b" );
      list.add( "g" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }

  // Dynamic (Flow/Auxiliary/Stock) Variables

  public double v;
  /**
   * Writes model variables into given arrays
   */
  @AnyLogicInternalCodegenAPI
  public void getPhaseVector_xjal(double[] _d_xjal, int _d_idx_xjal, double[] _a_xjal, int _a_idx_xjal) {
    _d_xjal[ _d_idx_xjal + 0 ] = v;
    _d_idx_xjal += 1;
    super.getPhaseVector_xjal(_d_xjal, _d_idx_xjal, _a_xjal, _a_idx_xjal);
  }
  /**
   * Writes given arrays to model variables
   */
  @AnyLogicInternalCodegenAPI
  public void putPhaseVector_xjal(double[] _d_xjal, int _d_idx_xjal, double[] _a_xjal, int _a_idx_xjal) {
    v = _d_xjal[ _d_idx_xjal + 0 ];
    _d_idx_xjal += 1;
    super.putPhaseVector_xjal(_d_xjal, _d_idx_xjal, _a_xjal, _a_idx_xjal);
  }
  @AnyLogicInternalCodegenAPI
  public void assignInitialConditions_xjal() {
	super.assignInitialConditions_xjal(); 
    _assign_v_Formula_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupInitialConditions_xjal(Class<?> callerClass) {
    if (callerClass != Main.class) {
      return;
    }
    if (getInitialAlgebraicFlatEquationsCount_xjal() > 0) {
      SDIntegrationManager integrationManagerForInitialConditions = new SDIntegrationManager( 0, getInitialAlgebraicFlatEquationsCount_xjal(), getInitialFormulaFlatEquationsCount_xjal() );
      integrationManagerForInitialConditions.doStep( this, 0, 0.1, true );
    } else {
      assignInitialConditions_xjal();
    } 
  }
  
  @AnyLogicInternalCodegenAPI
  public void _assign_v_Formula_xjal() {
    v = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void getRightPart_xjal( double[] _d_xjal, int _d_idx_xjal, double[] _a_xjal, int _a_idx_xjal ) {
    _get_v_Derivative_xjal( _d_xjal, _d_idx_xjal + 0 );
    _d_idx_xjal += 1; 
	super.getRightPart_xjal( _d_xjal, _d_idx_xjal, _a_xjal, _a_idx_xjal );
  }

  @AnyLogicInternalCodegenAPI
  public void _get_v_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
g - b * v * v 
;
  }
  @AnyLogicInternalCodegenAPI
  protected SDIntegrationManager integrationManager_xjal = null;
  
  @AnyLogicInternalCodegenAPI
  public SDIntegrationManager getIntegrationManager_xjal() {
    if (integrationManager_xjal == null) {
      integrationManager_xjal = new SDIntegrationManager( getDifferentialFlatEquationsCount_xjal(), getRuntimeAlgebraicFlatEquationsCount_xjal(), getRuntimeFormulaFlatEquationsCount_xjal() );
    }
    return integrationManager_xjal;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public int getDifferentialFlatEquationsCount_xjal() {
    return super.getDifferentialFlatEquationsCount_xjal() + 1;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public int getInitialFormulaFlatEquationsCount_xjal() {
    return super.getInitialFormulaFlatEquationsCount_xjal() + 1;
  }

  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = null;
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    if (elementDesciptors_xjal == null) {
      elementDesciptors_xjal = createElementDescriptors(super.getElementDesciptors(), Main.class);
    }
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }
  // Events
	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _plot_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _autoCreatedDS_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == _plot_autoUpdateEvent_xjal ) return "plot auto update event";
     if( _e == _autoCreatedDS_xjal ) return "Auto-created DataSets auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == _plot_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _autoCreatedDS_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == _plot_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if ( _e == _autoCreatedDS_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    return super.getFirstOccurrenceTime( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( EventTimeout _e ) {
    double _t;
    if( _e == _plot_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if( _e == _autoCreatedDS_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == _plot_autoUpdateEvent_xjal ) {
      plot.updateData();
      return;
    }
    if ( _e == _autoCreatedDS_xjal ) {
      _ds_v.update();
      return;
    }
    super.executeActionOf( _e );
  }

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final short _STATECHART_ELEMENT_NEXT_ID_xjal = 0;
  /**
   * Auto-created data set(s) for v
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_v = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.v );
      _lastUpdateTime = time();
    }
  } );
  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression0_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression0_dataSet_xjal_YValue() {
    return 
v 
;
  }

  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, ViewArea.TOP_LEFT, ViewArea.SPECIFIED_ZOOM, 1, 100, 100 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final int _plot = 1;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 2;
 

  /**
   * Top-level presentation group id
   */	 
  @AnyLogicInternalCodegenAPI
  protected static final int _presentation = 0;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  /**
   * Top-level icon group id
   */	 
  @AnyLogicInternalCodegenAPI
  protected static final int _icon = -1;
  
  
  protected TimePlot plot;
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 1 );
    _items.add( _plot_expression0_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 1 );
    _titles.add( "Velocity" );
    List<Chart2DPlot.Appearance> _appearances = new ArrayList<Chart2DPlot.Appearance>( 1 );
    _appearances.add( new Chart2DPlot.Appearance( deepPink, true, Chart.INTERPOLATION_LINEAR, 1.0, Chart.POINT_NONE ) );
    plot = new TimePlot(
		    Main.this, true, 10.0, 70.0, 
			570.0, 280.0,
            null, null,
            50.0, 30.0,
			490.0, 190.0, white, black, black,
            30.0, Chart.SOUTH,
            
100 
            , Chart.WINDOW_MOVES_WITH_TIME, null, Chart.SCALE_AUTO,
            0, 0, Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _appearances );

    }
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
      case _plot: return plot;
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
      _name_xjal = checkNameOfShape_xjal( _shape, plot, "plot" ); if (_name_xjal != null) return _name_xjal;
    } catch (Exception e) {
      return null;
    }
    return super.getNameOfShape_xjal( _shape );
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Parameters_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawParameter( _panel, _g, 110, 60, 10, 0, "b", b, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 60, 60, 10, 0, "g", g, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_StockVariables_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawStock( _panel, _g, 100, 30, 20, 20, 0, -20, "v", v, null, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private static void createLinkArcs_xjal() {
    _arc_PD_1477396619034_xjal = new Arc2D.Double(85.19243691881536, 29.935854564557918, 32.49999999999998, 32.49999999999998, 269.62398529052734, -105.60216522216797, Arc2D.OPEN);
    _arc_PD_1477396622730_xjal = new Arc2D.Double(57.750000313517816, 23.875000697950362, 51.24999999999994, 51.24999999999994, 183.96125030517578, -90.79639434814453, Arc2D.OPEN);
  }
  
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477396619034_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477396622730_xjal;

  static {
    createLinkArcs_xjal();
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Links_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477396619034_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477396622730_xjal, null, 1, null, 0.95f, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_AgentLinks_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (_publicOnly) { return; }
      drawLinkToAgent( _panel, _g, 50, -50, 15, 0, "connections", true, connections );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void drawModelElements( Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
  	super.drawModelElements( _panel, _g, _publicOnly, true );
    drawModelElements_Parameters_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_StockVariables_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_Links_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_AgentLinks_xjal( _panel, _g, _publicOnly, _isSuperClass );
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_AgentLinks_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if ( modelElementContains(_x, _y, 50, -50) ) {
        _panel.addInspect_xjal( 50, -50, this, "connections", Panel.INSPECT_CONNECTIONS_xjal );
      return true;
    }
    return false;
  }


  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_Parameters_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 110, 60) ) {
      _panel.addInspect( 110, 60, this, "b" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 60, 60) ) {
      _panel.addInspect( 60, 60, this, "g" ); 
      return true;
    }
    return false;
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_StockVariables_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 100, 30, 20, 20) ) {
      _panel.addInspect( 100, 30, this, "v" ); 
      return true;
    }
    return false;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onClickModelAt( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if ( onClickModelAt_AgentLinks_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    if ( onClickModelAt_Parameters_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    if ( onClickModelAt_StockVariables_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    return super.onClickModelAt( _panel, _x, _y, _clickCount, _publicOnly, true );
  }



  /**
   * Constructor
   */
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
    setupReferences_xjal();
    // Registering in Engine continuous part
    getEngine().registerAgentWithEquations( this );
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main( double b, double g ) {
    markParametersAreSet();
    this.b = b;
    this.g = g;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , plot );
    icon = new ShapeGroup( Main.this, true, 0, 0, 0  );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Main.class );
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentWithSpatialMetrics && _ext instanceof ExtWithSpaceType ) {
      double _value;
      _value = 
10 
;
      ((ExtAgentWithSpatialMetrics) _ext).setSpeed( _value, MPS );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    _plot_autoUpdateEvent_xjal.start();
    _autoCreatedDS_xjal.start();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
  }

  // User API -----------------------------------------------------
  @AnyLogicInternalCodegenAPI
  static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }


  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean isLoggingToDB(EventOriginator _e) {
    if ( _e == _plot_autoUpdateEvent_xjal ) return false;
    if ( _e == _autoCreatedDS_xjal ) return false;
    return super.isLoggingToDB( _e );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    _plot_autoUpdateEvent_xjal.onDestroy();
    _autoCreatedDS_xjal.onDestroy();
    // Unregistering in Engine continuous part
    getEngine().unregisterAgentWithEquations( this );
    _ds_v.destroyUpdater_xjal();
    _plot_expression0_dataSet_xjal.destroyUpdater_xjal();
    logToDB( _plot_expression0_dataSet_xjal, "plot : Velocity" );
    super.onDestroy();
  }



}
