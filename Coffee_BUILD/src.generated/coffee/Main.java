package coffee;

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
double  InitTempCoffee;

  /**
   * Returns default value for parameter <code>InitTempCoffee</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _InitTempCoffee_DefaultValue_xjal() {
    final Main self = this;
    return 
90 
;
  }

  public void set_InitTempCoffee( double InitTempCoffee ) {
    if (InitTempCoffee == this.InitTempCoffee) {
      return;
    }
    double _oldValue_xjal = this.InitTempCoffee;
    this.InitTempCoffee = InitTempCoffee;
    onChange_InitTempCoffee_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter InitTempCoffee.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_InitTempCoffee()</code> method instead.
   */
  protected void onChange_InitTempCoffee() {
    onChange_InitTempCoffee_xjal( InitTempCoffee );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_InitTempCoffee_xjal( double oldValue ) {  
  }


  public 
double  RoomTemp;

  /**
   * Returns default value for parameter <code>RoomTemp</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _RoomTemp_DefaultValue_xjal() {
    final Main self = this;
    return 
22 
;
  }

  public void set_RoomTemp( double RoomTemp ) {
    if (RoomTemp == this.RoomTemp) {
      return;
    }
    double _oldValue_xjal = this.RoomTemp;
    this.RoomTemp = RoomTemp;
    onChange_RoomTemp_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter RoomTemp.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_RoomTemp()</code> method instead.
   */
  protected void onChange_RoomTemp() {
    onChange_RoomTemp_xjal( RoomTemp );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_RoomTemp_xjal( double oldValue ) {  
  }


  public 
double  c;

  /**
   * Returns default value for parameter <code>c</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _c_DefaultValue_xjal() {
    final Main self = this;
    return 
0.5 
;
  }

  public void set_c( double c ) {
    if (c == this.c) {
      return;
    }
    double _oldValue_xjal = this.c;
    this.c = c;
    onChange_c_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter c.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_c()</code> method instead.
   */
  protected void onChange_c() {
    onChange_c_xjal( c );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_c_xjal( double oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    InitTempCoffee = _InitTempCoffee_DefaultValue_xjal();
    RoomTemp = _RoomTemp_DefaultValue_xjal();
    c = _c_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "InitTempCoffee":
      if ( _callOnChange_xjal ) {
        set_InitTempCoffee( ((Number) _value_xjal).doubleValue() );
      } else {
        InitTempCoffee = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "RoomTemp":
      if ( _callOnChange_xjal ) {
        set_RoomTemp( ((Number) _value_xjal).doubleValue() );
      } else {
        RoomTemp = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "c":
      if ( _callOnChange_xjal ) {
        set_c( ((Number) _value_xjal).doubleValue() );
      } else {
        c = ((Number) _value_xjal).doubleValue();
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
    case "InitTempCoffee": _result_xjal = InitTempCoffee; break;
    case "RoomTemp": _result_xjal = RoomTemp; break;
    case "c": _result_xjal = c; break;
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
      list.add( "InitTempCoffee" );
      list.add( "RoomTemp" );
      list.add( "c" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }

  // Dynamic (Flow/Auxiliary/Stock) Variables

  public double TcoffeeIMM;

  public double TcoffeeLater;
  /**
   * Writes model variables into given arrays
   */
  @AnyLogicInternalCodegenAPI
  public void getPhaseVector_xjal(double[] _d_xjal, int _d_idx_xjal, double[] _a_xjal, int _a_idx_xjal) {
    _d_xjal[ _d_idx_xjal + 0 ] = TcoffeeIMM;
    _d_xjal[ _d_idx_xjal + 1 ] = TcoffeeLater;
    _d_idx_xjal += 2;
    super.getPhaseVector_xjal(_d_xjal, _d_idx_xjal, _a_xjal, _a_idx_xjal);
  }
  /**
   * Writes given arrays to model variables
   */
  @AnyLogicInternalCodegenAPI
  public void putPhaseVector_xjal(double[] _d_xjal, int _d_idx_xjal, double[] _a_xjal, int _a_idx_xjal) {
    TcoffeeIMM = _d_xjal[ _d_idx_xjal + 0 ];
    TcoffeeLater = _d_xjal[ _d_idx_xjal + 1 ];
    _d_idx_xjal += 2;
    super.putPhaseVector_xjal(_d_xjal, _d_idx_xjal, _a_xjal, _a_idx_xjal);
  }
  @AnyLogicInternalCodegenAPI
  public void assignInitialConditions_xjal() {
	super.assignInitialConditions_xjal(); 
    _assign_TcoffeeIMM_Formula_xjal();
    _assign_TcoffeeLater_Formula_xjal();
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
  public void _assign_TcoffeeIMM_Formula_xjal() {
    TcoffeeIMM = 
InitTempCoffee 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_TcoffeeLater_Formula_xjal() {
    TcoffeeLater = 
InitTempCoffee 
;
  }
  @AnyLogicInternalCodegenAPI
  public void getRightPart_xjal( double[] _d_xjal, int _d_idx_xjal, double[] _a_xjal, int _a_idx_xjal ) {
    _get_TcoffeeIMM_Derivative_xjal( _d_xjal, _d_idx_xjal + 0 );
    _get_TcoffeeLater_Derivative_xjal( _d_xjal, _d_idx_xjal + 1 );
    _d_idx_xjal += 2; 
	super.getRightPart_xjal( _d_xjal, _d_idx_xjal, _a_xjal, _a_idx_xjal );
  }

  @AnyLogicInternalCodegenAPI
  public void _get_TcoffeeIMM_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
-c * (TcoffeeIMM - RoomTemp) 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_TcoffeeLater_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
-c * (TcoffeeLater - RoomTemp) 
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
    return super.getDifferentialFlatEquationsCount_xjal() + 2;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public int getInitialFormulaFlatEquationsCount_xjal() {
    return super.getInitialFormulaFlatEquationsCount_xjal() + 2;
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
  public EventTimeout _autoCreatedDS_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == _autoCreatedDS_xjal ) return "Auto-created DataSets auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == _autoCreatedDS_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
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
    if ( _e == _autoCreatedDS_xjal ) {
      _ds_TcoffeeIMM.update();
      _ds_TcoffeeLater.update();
      return;
    }
    super.executeActionOf( _e );
  }

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final short _STATECHART_ELEMENT_NEXT_ID_xjal = 0;
  /**
   * Auto-created data set(s) for TcoffeeIMM
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_TcoffeeIMM = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.TcoffeeIMM );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for TcoffeeLater
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_TcoffeeLater = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.TcoffeeLater );
      _lastUpdateTime = time();
    }
  } );
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
  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 1;
 

  /**
   * Top-level presentation group id
   */	 
  @AnyLogicInternalCodegenAPI
  protected static final int _presentation = 0;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return false;
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
  
  
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public Object getPersistentShape( int _shape ) {
    switch (_shape) {
      case _presentation: return presentation;
      case _icon: return icon;
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
    } catch (Exception e) {
      return null;
    }
    return super.getNameOfShape_xjal( _shape );
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Parameters_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawParameter( _panel, _g, 140, 20, 10, 0, "InitTempCoffee", InitTempCoffee, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 320, 30, 10, 0, "RoomTemp", RoomTemp, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 470, 30, 10, 0, "c", c, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_StockVariables_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawStock( _panel, _g, 20, 110, 20, 20, 0, -20, "TcoffeeIMM", TcoffeeIMM, null, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 20, 170, 20, 20, 0, -20, "TcoffeeLater", TcoffeeLater, null, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private static void createLinkArcs_xjal() {
    _arc_PD_1478003060446_xjal = new Arc2D.Double(-149.0000061462999, -190.12498570596813, 301.249999999997, 301.249999999997, -26.69124984741211, -49.40616226196289, Arc2D.OPEN);
    _arc_PD_1478003150775_xjal = new Arc2D.Double(-595.1650699455564, -1114.9942304239892, 1224.9999999999895, 1224.9999999999895, -61.228384017944336, -26.83841896057129, Arc2D.OPEN);
    _arc_PD_1478003455083_xjal = new Arc2D.Double(-332.9041843248063, -283.4483328819949, 481.24999999999864, 481.24999999999864, -17.27752685546875, -40.27503967285156, Arc2D.OPEN);
    _arc_PD_1478003455085_xjal = new Arc2D.Double(-810.4476702036924, -1206.673634686214, 1389.9999999999984, 1389.9999999999984, -51.946401596069336, -25.31406593322754, Arc2D.OPEN);
  }
  
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478003060446_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478003150775_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478003455083_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478003455085_xjal;

  static {
    createLinkArcs_xjal();
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Links_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478003060446_xjal, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, 463, 31, 40, 106, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478003150775_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478003455083_xjal, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, 463, 32, 39, 164, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478003455085_xjal, null, 1, null, 0.95f, 0 );
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
    if( !_publicOnly && modelElementContains(_x, _y, 140, 20) ) {
      _panel.addInspect( 140, 20, this, "InitTempCoffee" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 320, 30) ) {
      _panel.addInspect( 320, 30, this, "RoomTemp" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 470, 30) ) {
      _panel.addInspect( 470, 30, this, "c" ); 
      return true;
    }
    return false;
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_StockVariables_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 20, 110, 20, 20) ) {
      _panel.addInspect( 20, 110, this, "TcoffeeIMM" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 20, 170, 20, 20) ) {
      _panel.addInspect( 20, 170, this, "TcoffeeLater" ); 
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
  public Main( double InitTempCoffee, double RoomTemp, double c ) {
    markParametersAreSet();
    this.InitTempCoffee = InitTempCoffee;
    this.RoomTemp = RoomTemp;
    this.c = c;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0  );
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
    if ( _e == _autoCreatedDS_xjal ) return false;
    return super.isLoggingToDB( _e );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    _autoCreatedDS_xjal.onDestroy();
    // Unregistering in Engine continuous part
    getEngine().unregisterAgentWithEquations( this );
    _ds_TcoffeeIMM.destroyUpdater_xjal();
    _ds_TcoffeeLater.destroyUpdater_xjal();
    super.onDestroy();
  }



}
