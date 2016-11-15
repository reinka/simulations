package assignment1;

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
double  a;

  /**
   * Returns default value for parameter <code>a</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _a_DefaultValue_xjal() {
    final Main self = this;
    return 
.175 
;
  }

  public void set_a( double a ) {
    if (a == this.a) {
      return;
    }
    double _oldValue_xjal = this.a;
    this.a = a;
    onChange_a_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter a.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_a()</code> method instead.
   */
  protected void onChange_a() {
    onChange_a_xjal( a );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_a_xjal( double oldValue ) {

 
;  
  }


 
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
0.125 
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
.001 
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


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    a = _a_DefaultValue_xjal();
    b = _b_DefaultValue_xjal();
    c = _c_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "a":
      if ( _callOnChange_xjal ) {
        set_a( ((Number) _value_xjal).doubleValue() );
      } else {
        a = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "b":
      if ( _callOnChange_xjal ) {
        set_b( ((Number) _value_xjal).doubleValue() );
      } else {
        b = ((Number) _value_xjal).doubleValue();
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
    case "a": _result_xjal = a; break;
    case "b": _result_xjal = b; break;
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
      list.add( "a" );
      list.add( "b" );
      list.add( "c" );
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
	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _plot_autoUpdateEvent_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == _plot_autoUpdateEvent_xjal ) return "plot auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == _plot_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
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
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
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
  public double Hare;
  public double Fox;
  @AnyLogicInternalCodegenAPI
  private void _stubForCodeCompletion_xjal(){
    Hare = 
400 
;
Hare = 
a*Hare - c* Hare * Fox 
;
    Fox = 
37 
;
Fox = 
-b * Fox + c * Hare * Fox 
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

  /**
   * Auto-created data set(s) for Hare
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Hare = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.Hare );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Fox
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Fox = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.Fox );
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
Fox 
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
Hare
 
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
    _titles.add( "Foxes" );
    _titles.add( "Hares" );
    List<Chart2DPlot.Appearance> _appearances = new ArrayList<Chart2DPlot.Appearance>( 2 );
    _appearances.add( new Chart2DPlot.Appearance( red, true, Chart.INTERPOLATION_LINEAR, 1.0, Chart.POINT_NONE ) );
    _appearances.add( new Chart2DPlot.Appearance( mediumTurquoise, true, Chart.INTERPOLATION_LINEAR, 1.0, Chart.POINT_NONE ) );
    plot = new TimePlot(
		    Main.this, true, 50.0, 250.0, 
			640.0, 370.0,
            null, null,
            50.0, 30.0,
			560.0, 280.0, white, black, black,
            30.0, Chart.SOUTH,
            
100 
            , Chart.WINDOW_MOVES_WITH_TIME, null, Chart.SCALE_FIXED,
            
0 
            , 
1000 
            , Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
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
  private void drawModelElements_Parameters_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawParameter( _panel, _g, 220, 90, 10, 0, "b", b, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 200, 240, 10, 0, "c", c, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_StockVariables_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawStock( _panel, _g, 40, 220, 20, 20, 0, -20, "Hare", Hare, null, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 350, 150, 20, 20, 0, -20, "Fox", Fox, null, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private static void createLinkArcs_xjal() {
    _arc_PD_1476978439531_xjal = new Arc2D.Double(-583.0870094762278, -1062.2427516177, 1282.499999999987, 1282.499999999987, -64.1059684753418, -25.90860366821289, Arc2D.OPEN);
    _arc_PD_1476978462620_xjal = new Arc2D.Double(-33.58470604447419, -93.82237503663302, 344.9999999999998, 344.9999999999998, 287.74948501586914, -46.119022369384766, Arc2D.OPEN);
    _arc_PD_1476978478023_xjal = new Arc2D.Double(-309.4129334995519, 149.74272247237354, 1282.5000000000005, 1282.5000000000005, 115.89404678344727, -25.90860366821289, Arc2D.OPEN);
    _arc_PD_1476978481216_xjal = new Arc2D.Double(167.00235572752473, 149.1705926996342, 402.4999999999998, 402.4999999999998, 144.1614112854004, -43.81326675415039, Arc2D.OPEN);
    _arc_PD_1476978484298_xjal = new Arc2D.Double(97.37375232380651, 89.12770234645768, 276.2499999999999, 276.2499999999999, 92.70865631103516, -50.21320343017578, Arc2D.OPEN);
    _arc_PD_1476978487330_xjal = new Arc2D.Double(97.37375232380651, 89.12770234645768, 276.2499999999999, 276.2499999999999, 92.70865631103516, -50.21320343017578, Arc2D.OPEN);
  }
  
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1476978439531_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1476978462620_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1476978478023_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1476978481216_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1476978484298_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1476978487330_xjal;

  static {
    createLinkArcs_xjal();
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Links_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1476978439531_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1476978462620_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1476978478023_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1476978481216_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1476978484298_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1476978487330_xjal, null, 1, null, 0.95f, 0 );
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
    if( !_publicOnly && modelElementContains(_x, _y, 220, 90) ) {
      _panel.addInspect( 220, 90, this, "b" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 200, 240) ) {
      _panel.addInspect( 200, 240, this, "c" ); 
      return true;
    }
    return false;
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_StockVariables_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 40, 220, 20, 20) ) {
      _panel.addInspect( 40, 220, this, "Hare" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 350, 150, 20, 20) ) {
      _panel.addInspect( 350, 150, this, "Fox" ); 
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
  public Main( double a, double b, double c ) {
    markParametersAreSet();
    this.a = a;
    this.b = b;
    this.c = c;
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
    _plot_autoUpdateEvent_xjal.onDestroy();
    // On destroy code
    
 
    _ds_Hare.destroyUpdater_xjal();
    _ds_Fox.destroyUpdater_xjal();
    _plot_expression0_dataSet_xjal.destroyUpdater_xjal();
    _plot_expression1_dataSet_xjal.destroyUpdater_xjal();
    logToDB( _plot_expression0_dataSet_xjal, "plot : Foxes" );
    logToDB( _plot_expression1_dataSet_xjal, "plot : Hares" );
    super.onDestroy();
  }

  // Additional class code

 
  // End of additional class code


}
