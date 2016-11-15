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

 
;  
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

 
;  
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

 
;  
  }


 
  public 
double  MilkTemp;

  /**
   * Returns default value for parameter <code>MilkTemp</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _MilkTemp_DefaultValue_xjal() {
    final Main self = this;
    return 
8 
;
  }

  public void set_MilkTemp( double MilkTemp ) {
    if (MilkTemp == this.MilkTemp) {
      return;
    }
    double _oldValue_xjal = this.MilkTemp;
    this.MilkTemp = MilkTemp;
    onChange_MilkTemp_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter MilkTemp.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_MilkTemp()</code> method instead.
   */
  protected void onChange_MilkTemp() {
    onChange_MilkTemp_xjal( MilkTemp );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_MilkTemp_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  Vmilk;

  /**
   * Returns default value for parameter <code>Vmilk</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Vmilk_DefaultValue_xjal() {
    final Main self = this;
    return 
0.05 
;
  }

  public void set_Vmilk( double Vmilk ) {
    if (Vmilk == this.Vmilk) {
      return;
    }
    double _oldValue_xjal = this.Vmilk;
    this.Vmilk = Vmilk;
    onChange_Vmilk_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Vmilk.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Vmilk()</code> method instead.
   */
  protected void onChange_Vmilk() {
    onChange_Vmilk_xjal( Vmilk );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Vmilk_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  Vcoffee;

  /**
   * Returns default value for parameter <code>Vcoffee</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Vcoffee_DefaultValue_xjal() {
    final Main self = this;
    return 
0.2 
;
  }

  public void set_Vcoffee( double Vcoffee ) {
    if (Vcoffee == this.Vcoffee) {
      return;
    }
    double _oldValue_xjal = this.Vcoffee;
    this.Vcoffee = Vcoffee;
    onChange_Vcoffee_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Vcoffee.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Vcoffee()</code> method instead.
   */
  protected void onChange_Vcoffee() {
    onChange_Vcoffee_xjal( Vcoffee );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Vcoffee_xjal( double oldValue ) {

 
;  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    InitTempCoffee = _InitTempCoffee_DefaultValue_xjal();
    RoomTemp = _RoomTemp_DefaultValue_xjal();
    c = _c_DefaultValue_xjal();
    MilkTemp = _MilkTemp_DefaultValue_xjal();
    Vmilk = _Vmilk_DefaultValue_xjal();
    Vcoffee = _Vcoffee_DefaultValue_xjal();
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
    case "MilkTemp":
      if ( _callOnChange_xjal ) {
        set_MilkTemp( ((Number) _value_xjal).doubleValue() );
      } else {
        MilkTemp = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "Vmilk":
      if ( _callOnChange_xjal ) {
        set_Vmilk( ((Number) _value_xjal).doubleValue() );
      } else {
        Vmilk = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "Vcoffee":
      if ( _callOnChange_xjal ) {
        set_Vcoffee( ((Number) _value_xjal).doubleValue() );
      } else {
        Vcoffee = ((Number) _value_xjal).doubleValue();
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
    case "MilkTemp": _result_xjal = MilkTemp; break;
    case "Vmilk": _result_xjal = Vmilk; break;
    case "Vcoffee": _result_xjal = Vcoffee; break;
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
      list.add( "MilkTemp" );
      list.add( "Vmilk" );
      list.add( "Vcoffee" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
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

  public EventTimeout pourMilk = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _plot_autoUpdateEvent_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == pourMilk ) return "pourMilk";
     if( _e == _plot_autoUpdateEvent_xjal ) return "plot auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == pourMilk ) return EVENT_TIMEOUT_MODE_ONCE;
    if ( _e == _plot_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == pourMilk ) {
      _t = 
0 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    if ( _e == _plot_autoUpdateEvent_xjal ) {
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
10 
;
      _t = toModelTime( _t, SECOND );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == pourMilk ) {
      EventTimeout self = _e;

TcoffeeLater = mixTemp(TcofeeLater, Vcoffee,  
;
      return;
    }
    if ( _e == _plot_autoUpdateEvent_xjal ) {
      plot.updateData();
      return;
    }
    super.executeActionOf( _e );
  }

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final short _STATECHART_ELEMENT_NEXT_ID_xjal = 0;
  // Stub function for code completion support (internal)
  public double TcoffeeIMM;
  public double TcoffeeLater;
  @AnyLogicInternalCodegenAPI
  private void _stubForCodeCompletion_xjal(){
    TcoffeeIMM = 
mixTemp(InitTempCoffee, Vcoffee, MilkTemp, Vmilk) 
;
TcoffeeIMM = 
-c*(TcoffeeIMM - RoomTemp) 
;
    TcoffeeLater = 
mixTemp(TcoffeeLater, Vcoffee, MilkTemp, Vmilk)
 
;
TcoffeeLater = 
-c*(TcoffeeLater - RoomTemp) 
;
    {double _t = 
0 
;}
    {double _t = 
1 
;}
    class _Stub_Implements_xjal implements 
  {}
    class _Stub_Extends_xjal extends 
  {}
  }

  // Functions

 
  void mixTemp( double T2, double T1, double V2, double V1 ) { 

return ( T1 * V1 + T2 * V2)/(V1 + V2); 
  }
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
TcoffeeIMM 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression1_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression1_dataSet_xjal_YValue() {
    return 
TcoffeeLater 
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
  
 
  @Override
  @AnyLogicInternalCodegenAPI
  public void onSelectionChanged_xjal( int _shape, int index, int[] selectedIndices, boolean programmatically ) {
    switch( _shape ) {
      case _plot: {
        TimePlot self = this.plot;
        
 
;}
        break;
      default:
        super.onSelectionChanged_xjal( _shape, index, selectedIndices, programmatically );
        break;
    }
  }

 
  @Override
  @AnyLogicInternalCodegenAPI
  public void onItemRemoved_xjal( int _shape, int index, int removedIndex, boolean programmatically ) {
    switch( _shape ) {
      case _plot: {
        TimePlot self = this.plot;
        
 
;}
        break;
      default:
        super.onItemRemoved_xjal( _shape, index, removedIndex, programmatically );
        break;
    }
  }
  
  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForReplication_xjal() {
    {
      int _result_xjal = 
 
;
    }
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _plot_SetDynamicParams_xjal( TimePlot shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected TimePlot plot;
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 2 );
    _items.add( _plot_expression0_dataSet_xjal ); 
    _items.add( _plot_expression1_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "" );
    _titles.add( "Dataset Title 1" );
    List<Chart2DPlot.Appearance> _appearances = new ArrayList<Chart2DPlot.Appearance>( 2 );
    _appearances.add( new Chart2DPlot.Appearance( coral, true, Chart.INTERPOLATION_LINEAR, 1.0, Chart.POINT_NONE ) );
    _appearances.add( new Chart2DPlot.Appearance( limeGreen, true, Chart.INTERPOLATION_LINEAR, 1.0, Chart.POINT_NONE ) );
    plot = new TimePlot(
		    Main.this, true, 110.0, 220.0, 
			480.0, 320.0,
            null, null,
            50.0, 30.0,
			400.0, 230.0, white, black, black,
            30.0, Chart.SOUTH,
            
10 
            , Chart.WINDOW_MOVES_WITH_TIME, null, Chart.SCALE_AUTO,
            0, 0, Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _appearances ) {
      @Override
      public void updateDynamicProperties(boolean publicOnly) {
        _plot_SetDynamicParams_xjal( this );
        super.updateDynamicProperties(publicOnly);
      }
    };

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
  private void drawModelElements_Events_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawEvent( _panel, _g, 30, 230, 10, 0, "pourMilk", pourMilk );
    }
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
    if (!_publicOnly) {
      drawParameter( _panel, _g, 60, 30, 10, 0, "MilkTemp", MilkTemp, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 570, 50, 10, 0, "Vmilk", Vmilk, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 510, 60, 10, 0, "Vcoffee", Vcoffee, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_StockVariables_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawStock( _panel, _g, 110, 160, 20, 20, 0, -20, "TcoffeeIMM", TcoffeeIMM, null, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 500, 160, 20, 20, 0, -20, "TcoffeeLater", TcoffeeLater, null, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private static void createLinkArcs_xjal() {
    _arc_PD_1478003060446_xjal = new Arc2D.Double(-128.6279101653154, -72.87562361331794, 276.25, 276.25, 15.389045715332031, -49.91743087768555, Arc2D.OPEN);
    _arc_PD_1478003150774_xjal = new Arc2D.Double(-943.2154485909623, -1682.4141681180113, 1851.2499999999854, 1851.2499999999854, -58.769697189331055, -22.18663215637207, Arc2D.OPEN);
    _arc_PD_1478003150775_xjal = new Arc2D.Double(-371.65913152839204, -611.9109586560163, 782.4999999999956, 782.4999999999956, -41.15959167480469, -32.79821014404297, Arc2D.OPEN);
    _arc_PD_1478003455084_xjal = new Arc2D.Double(265.0928866191696, -3.4829795379449706, 242.49999999999915, 242.49999999999915, 42.11954116821289, -53.7537956237793, Arc2D.OPEN);
    _arc_PD_1478003455085_xjal = new Arc2D.Double(-82.67437757118978, 18.558743255693912, 636.2499999999999, 636.2499999999999, 72.96605682373047, -35.593040466308594, Arc2D.OPEN);
    _arc_PD_1478004039121_xjal = new Arc2D.Double(-150.08469373136256, 3.6864262984127834, 262.49999999999943, 262.49999999999943, 49.15425109863281, -52.25060272216797, Arc2D.OPEN);
    _arc_PD_1478004138437_xjal = new Arc2D.Double(337.54758185713143, -62.924264329524014, 232.4999999999998, 232.4999999999998, -2.7975387573242188, -54.34512710571289, Arc2D.OPEN);
    _arc_PD_1478004138438_xjal = new Arc2D.Double(379.01364845867215, 31.58886387699968, 146.24999999999977, 146.24999999999977, 30.639747619628906, -62.6229248046875, Arc2D.OPEN);
  }
  
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478003060446_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478003150774_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478003150775_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478003455084_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478003455085_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478004039121_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478004138437_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1478004138438_xjal;

  static {
    createLinkArcs_xjal();
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Links_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478003060446_xjal, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478003150774_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478003150775_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478003455084_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478003455085_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, 563, 52, 129, 155, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, 503, 62, 129, 155, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478004039121_xjal, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478004138437_xjal, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1478004138438_xjal, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, 67, 32, 481, 154, null, 1, null, 0.95f, 0 | DRAW_SD_LINK_INITIAL );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Functions_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawFunction( _panel, _g, 310, 160, 10, 0, "mixTemp");
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
    drawModelElements_Events_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_Parameters_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_StockVariables_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_Links_xjal( _panel, _g, _publicOnly, _isSuperClass );
    drawModelElements_Functions_xjal( _panel, _g, _publicOnly, _isSuperClass );
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
    if( !_publicOnly && modelElementContains(_x, _y, 60, 30) ) {
      _panel.addInspect( 60, 30, this, "MilkTemp" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 570, 50) ) {
      _panel.addInspect( 570, 50, this, "Vmilk" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 510, 60) ) {
      _panel.addInspect( 510, 60, this, "Vcoffee" ); 
      return true;
    }
    return false;
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_StockVariables_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 110, 160, 20, 20) ) {
      _panel.addInspect( 110, 160, this, "TcoffeeIMM" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 500, 160, 20, 20) ) {
      _panel.addInspect( 500, 160, this, "TcoffeeLater" ); 
      return true;
    }
    return false;
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_Events_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 30, 230) ) {
      _panel.addInspect( 30, 230, this, "pourMilk" ); 
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
    if ( onClickModelAt_Events_xjal( _panel, _x, _y, _clickCount, _publicOnly, _isSuperClass ) ) { return true; }
    return super.onClickModelAt( _panel, _x, _y, _clickCount, _publicOnly, true );
  }



  @Override
  @AnyLogicInternalCodegenAPI
  public void onArrival() {
    super.onArrival();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onStep() {
    super.onStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onBeforeStep() {
    super.onBeforeStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onEnterFlowchartBlock(Agent oldBlock, Agent block) {
    super.onEnterFlowchartBlock( oldBlock, block );
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onExitFlowchartBlock(Agent block) {
    super.onExitFlowchartBlock(block);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onSeizeResource(Agent unit) {
    super.onSeizeResource(unit);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onReleaseResource(Agent unit) {
    super.onReleaseResource(unit);
    
 
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
  public Main( double InitTempCoffee, double RoomTemp, double c, double MilkTemp, double Vmilk, double Vcoffee ) {
    markParametersAreSet();
    this.InitTempCoffee = InitTempCoffee;
    this.RoomTemp = RoomTemp;
    this.c = c;
    this.MilkTemp = MilkTemp;
    this.Vmilk = Vmilk;
    this.Vcoffee = Vcoffee;
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
    if ( _ext instanceof ExtAgentWithSpatialMetrics ) {
      ExtAgentWithSpatialMetrics _e = (ExtAgentWithSpatialMetrics) _ext;
      _e.setAutomaticHorizontalRotation( true );
    }
    if ( _ext instanceof ExtAgentContinuous ) {
      ExtAgentContinuous _e = (ExtAgentContinuous) _ext;
      _e.setAutomaticVerticalRotation( false );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    pourMilk.start();
    _plot_autoUpdateEvent_xjal.start();
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
 
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
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    
Object  msg = (Object) _msg_xjal;
    Agent sender = _sender_xjal;
    
 
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
    return super.isLoggingToDB( _e );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    pourMilk.onDestroy();
    _plot_autoUpdateEvent_xjal.onDestroy();
    // On destroy code
    
 
    _ds_TcoffeeIMM.destroyUpdater_xjal();
    _ds_TcoffeeLater.destroyUpdater_xjal();
    _plot_expression0_dataSet_xjal.destroyUpdater_xjal();
    _plot_expression1_dataSet_xjal.destroyUpdater_xjal();
    logToDB( _plot_expression0_dataSet_xjal, "plot : Value_1" );
    logToDB( _plot_expression1_dataSet_xjal, "plot : Dataset Title 1" );
    super.onDestroy();
  }

  // Additional class code

 
  // End of additional class code


}
