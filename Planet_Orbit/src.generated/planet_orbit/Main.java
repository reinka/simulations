package planet_orbit;

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
double  gamma;

  /**
   * Returns default value for parameter <code>gamma</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _gamma_DefaultValue_xjal() {
    final Main self = this;
    return 
1.0 
;
  }

  public void set_gamma( double gamma ) {
    if (gamma == this.gamma) {
      return;
    }
    double _oldValue_xjal = this.gamma;
    this.gamma = gamma;
    onChange_gamma_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter gamma.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_gamma()</code> method instead.
   */
  protected void onChange_gamma() {
    onChange_gamma_xjal( gamma );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_gamma_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  sun_m;

  /**
   * Returns default value for parameter <code>sun_m</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _sun_m_DefaultValue_xjal() {
    final Main self = this;
    return 
10.0
 
;
  }

  public void set_sun_m( double sun_m ) {
    if (sun_m == this.sun_m) {
      return;
    }
    double _oldValue_xjal = this.sun_m;
    this.sun_m = sun_m;
    onChange_sun_m_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter sun_m.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_sun_m()</code> method instead.
   */
  protected void onChange_sun_m() {
    onChange_sun_m_xjal( sun_m );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_sun_m_xjal( double oldValue ) {

 
;  
  }


 
  public 
double  earth_m;

  /**
   * Returns default value for parameter <code>earth_m</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _earth_m_DefaultValue_xjal() {
    final Main self = this;
    return 
1.0
 
;
  }

  public void set_earth_m( double earth_m ) {
    if (earth_m == this.earth_m) {
      return;
    }
    double _oldValue_xjal = this.earth_m;
    this.earth_m = earth_m;
    onChange_earth_m_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter earth_m.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_earth_m()</code> method instead.
   */
  protected void onChange_earth_m() {
    onChange_earth_m_xjal( earth_m );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_earth_m_xjal( double oldValue ) {

 
;  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    gamma = _gamma_DefaultValue_xjal();
    sun_m = _sun_m_DefaultValue_xjal();
    earth_m = _earth_m_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "gamma":
      if ( _callOnChange_xjal ) {
        set_gamma( ((Number) _value_xjal).doubleValue() );
      } else {
        gamma = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "sun_m":
      if ( _callOnChange_xjal ) {
        set_sun_m( ((Number) _value_xjal).doubleValue() );
      } else {
        sun_m = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "earth_m":
      if ( _callOnChange_xjal ) {
        set_earth_m( ((Number) _value_xjal).doubleValue() );
      } else {
        earth_m = ((Number) _value_xjal).doubleValue();
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
    case "gamma": _result_xjal = gamma; break;
    case "sun_m": _result_xjal = sun_m; break;
    case "earth_m": _result_xjal = earth_m; break;
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
      list.add( "gamma" );
      list.add( "sun_m" );
      list.add( "earth_m" );
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
  public double sun_y;
  public double sun_v;
  public double sun_u;
  public double earth_x;
  public double earth_y;
  public double earth_v;
  public double earth_u;
  public double sun_x;
  @AnyLogicInternalCodegenAPI
  private void _stubForCodeCompletion_xjal(){
    sun_y = 
0 
;
sun_y = 
sun_v 
;
    sun_v = 
0 
;
sun_v = 
(earth_y - sun_y)/ distance() * force() / sun_m 
;
    sun_u = 
0 
;
sun_u = 
(earth_x - sun_x) / distance() * force() / sun_m 
;
    earth_x = 
1
 
;
earth_x = 
earth_u 
;
    earth_y = 
0 
;
earth_y = 
earth_v 
;
    earth_v = 
3.16 
;
earth_v = 
(sun_y - earth_y) / distance() * force() / earth_m 
;
    earth_u = 
0 
;
earth_u = 
(sun_x - earth_x) / distance() * force() / earth_m 
;
    sun_x = 
0 
;
sun_x = 
sun_u 
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

 
  
double 
 distance(  ) { 

return sqrt((sun_x - earth_x)*(sun_x - earth_x) + (sun_y - earth_y)*(sun_y - earth_y)); 
  }

 
  
double 
 force(  ) { 

return sun_m * earth_m * gamma / (distance() * distance());


 
  }
  /**
   * Auto-created data set(s) for sun_y
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_sun_y = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.sun_y );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for sun_v
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_sun_v = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.sun_v );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for sun_u
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_sun_u = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.sun_u );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for earth_x
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_earth_x = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.earth_x );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for earth_y
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_earth_y = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.earth_y );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for earth_v
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_earth_v = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.earth_v );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for earth_u
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_earth_u = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.earth_u );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for sun_x
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_sun_x = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Main.this.sun_x );
      _lastUpdateTime = time();
    }
  } );
  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression0_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( __plot_expression0_dataSet_xjal_XValue(), __plot_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression0_dataSet_xjal_XValue() {
    return 
sun_x	 
;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression0_dataSet_xjal_YValue() {
    return 
sun_y 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression1_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( __plot_expression1_dataSet_xjal_XValue(), __plot_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression1_dataSet_xjal_XValue() {
    return 
earth_x	 
;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression1_dataSet_xjal_YValue() {
    return 
earth_y 
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
        Plot self = this.plot;
        
 
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
        Plot self = this.plot;
        
 
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
  private void _plot_SetDynamicParams_xjal( Plot shape ) {
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
  
  protected Plot plot;
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
    _titles.add( "Sun" );
    _titles.add( "Earth" );
    List<Chart2DPlot.Appearance> _appearances = new ArrayList<Chart2DPlot.Appearance>( 2 );
    _appearances.add( new Chart2DPlot.Appearance( darkOrange, true, Chart.INTERPOLATION_LINEAR, 1.0, Chart.POINT_CIRCLE ) );
    _appearances.add( new Chart2DPlot.Appearance( mediumSeaGreen, true, Chart.INTERPOLATION_LINEAR, 1.0, Chart.POINT_CIRCLE ) );
    plot = new Plot(
		    Main.this, true, 170.0, 270.0, 
			490.0, 310.0,
            null, null,
            50.0, 30.0,
			410.0, 220.0, white, black, black,
            30.0, Chart.SOUTH,
            Chart.SCALE_AUTO,
            0, 0, Chart.SCALE_AUTO,
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
  private void drawModelElements_Parameters_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawParameter( _panel, _g, 170, 330, 10, 0, "gamma", gamma, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 240, 250, 10, 0, "sun_m", sun_m, 0 );
    }
    if (!_publicOnly) {
      drawParameter( _panel, _g, 320, 250, 10, 0, "earth_m", earth_m, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_StockVariables_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawStock( _panel, _g, 90, 90, 20, 20, 0, -20, "sun_y", sun_y, null, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 90, 270, 20, 20, 0, -20, "sun_v", sun_v, null, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 90, 180, 20, 20, 0, -20, "sun_u", sun_u, null, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 460, 60, 20, 20, 0, -20, "earth_x", earth_x, null, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 460, 110, 20, 20, 0, -20, "earth_y", earth_y, null, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 460, 210, 20, 20, 0, -20, "earth_v", earth_v, null, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 460, 160, 20, 20, 0, -20, "earth_u", earth_u, null, 0 );
    }
    if (!_publicOnly) {
      drawStock( _panel, _g, 90, 40, 20, 20, 0, -20, "sun_x", sun_x, null, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private static void createLinkArcs_xjal() {
    _arc_PD_1477398365558_xjal = new Arc2D.Double(-969.2698093347607, -1725.6127922085202, 1911.2499999999714, 1911.2499999999714, -61.09601593017578, -21.594436645507812, Arc2D.OPEN);
    _arc_PD_1477398373512_xjal = new Arc2D.Double(51.940274966693124, -112.3720310866973, 362.4999999999995, 362.4999999999995, 269.3078384399414, -44.84522247314453, Arc2D.OPEN);
    _arc_PD_1477398370931_xjal = new Arc2D.Double(-155.0, -22.5, 265.0, 265.0, 26.05960464477539, -49.523799896240234, Arc2D.OPEN);
    _arc_PD_1477398495670_xjal = new Arc2D.Double(334.99999999999994, 37.50000000000004, 145.0, 145.0, 31.89759063720703, -59.048038482666016, Arc2D.OPEN);
    _arc_PD_1477398501057_xjal = new Arc2D.Double(-969.2696974726341, 34.36285113853228, 1911.2499999999998, 1911.2499999999998, 83.05018615722656, -21.594436645507812, Arc2D.OPEN);
    _arc_PD_1477398575428_xjal = new Arc2D.Double(295.08608112598114, 159.0922404377199, 366.2499999999999, 366.2499999999999, 146.9469757080078, -45.5814208984375, Arc2D.OPEN);
    _arc_PD_1477398652176_xjal = new Arc2D.Double(-314.9999999999998, -32.499999999999915, 424.99999999999983, 424.99999999999983, 21.575767517089844, -41.53355407714844, Arc2D.OPEN);
    _arc_PD_1477398652178_xjal = new Arc2D.Double(-5.719309924064078, -25.082203127510667, 306.249999999996, 306.249999999996, -56.16099548339844, -48.87889099121094, Arc2D.OPEN);
    _arc_PD_1477398670263_xjal = new Arc2D.Double(70.0, -32.5, 425.0, 425.0, 201.5757598876953, -41.53355407714844, Arc2D.OPEN);
    _arc_PD_1477398724409_xjal = new Arc2D.Double(440.0, 87.50000000000011, 145.0, 145.0, 211.89758682250977, -59.048038482666016, Arc2D.OPEN);
    _arc_PD_1477398759541_xjal = new Arc2D.Double(-969.269697472634, 84.36285113853239, 1911.2499999999998, 1911.2499999999998, 83.05018615722656, -21.594436645507812, Arc2D.OPEN);
    _arc_PD_1477398759542_xjal = new Arc2D.Double(334.99999999999983, 87.5, 145.0000000000001, 145.0000000000001, 31.89759063720703, -59.048038482666016, Arc2D.OPEN);
    _arc_PD_1477398759543_xjal = new Arc2D.Double(281.15333743140206, 205.28668436618509, 285.00000000000006, 285.00000000000006, 133.04889297485352, -50.48561477661133, Arc2D.OPEN);
    _arc_PD_1477399062015_xjal = new Arc2D.Double(70.00000000000003, -22.500000000000014, 265.0, 265.0, 206.05961227416992, -49.523799896240234, Arc2D.OPEN);
    _arc_PD_1477399520646_xjal = new Arc2D.Double(440.0000000000001, 37.50000000000004, 145.0, 145.0, 211.89758682250977, -59.048038482666016, Arc2D.OPEN);
  }
  
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477398365558_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477398373512_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477398370931_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477398495670_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477398501057_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477398575428_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477398652176_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477398652178_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477398670263_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477398724409_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477398759541_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477398759542_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477398759543_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477399062015_xjal;
  @AnyLogicInternalCodegenAPI
  protected static Arc2D.Double _arc_PD_1477399520646_xjal;

  static {
    createLinkArcs_xjal();
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Links_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477398365558_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477398373512_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477398370931_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477398495670_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477398501057_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477398575428_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477398652176_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, 451, 114, 108, 262, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477398652178_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477398670263_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477398724409_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477398759541_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477398759542_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477398759543_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477399062015_xjal, null, 1, null, 0.95f, 0 );
    }
    if (!_publicOnly) {
      drawLink( _panel, _g, _arc_PD_1477399520646_xjal, null, 1, null, 0.95f, 0 );
    }
  }

  @AnyLogicInternalCodegenAPI
  private void drawModelElements_Functions_xjal(Panel _panel, Graphics2D _g, boolean _publicOnly, boolean _isSuperClass ) {
    if (!_publicOnly) {
      drawFunction( _panel, _g, 280, 330, 10, 0, "distance");
    }
    if (!_publicOnly) {
      drawFunction( _panel, _g, 410, 330, 10, 0, "force");
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
    if( !_publicOnly && modelElementContains(_x, _y, 170, 330) ) {
      _panel.addInspect( 170, 330, this, "gamma" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 240, 250) ) {
      _panel.addInspect( 240, 250, this, "sun_m" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 320, 250) ) {
      _panel.addInspect( 320, 250, this, "earth_m" ); 
      return true;
    }
    return false;
  }

  @AnyLogicInternalCodegenAPI
  private boolean onClickModelAt_StockVariables_xjal( Panel _panel, double _x, double _y, int _clickCount, boolean _publicOnly, boolean _isSuperClass ) {
    if( !_publicOnly && modelElementContains(_x, _y, 90, 90, 20, 20) ) {
      _panel.addInspect( 90, 90, this, "sun_y" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 90, 270, 20, 20) ) {
      _panel.addInspect( 90, 270, this, "sun_v" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 90, 180, 20, 20) ) {
      _panel.addInspect( 90, 180, this, "sun_u" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 460, 60, 20, 20) ) {
      _panel.addInspect( 460, 60, this, "earth_x" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 460, 110, 20, 20) ) {
      _panel.addInspect( 460, 110, this, "earth_y" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 460, 210, 20, 20) ) {
      _panel.addInspect( 460, 210, this, "earth_v" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 460, 160, 20, 20) ) {
      _panel.addInspect( 460, 160, this, "earth_u" ); 
      return true;
    }
    if( !_publicOnly && modelElementContains(_x, _y, 90, 40, 20, 20) ) {
      _panel.addInspect( 90, 40, this, "sun_x" ); 
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
  public Main( double gamma, double sun_m, double earth_m ) {
    markParametersAreSet();
    this.gamma = gamma;
    this.sun_m = sun_m;
    this.earth_m = earth_m;
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
    
 
    _ds_sun_y.destroyUpdater_xjal();
    _ds_sun_v.destroyUpdater_xjal();
    _ds_sun_u.destroyUpdater_xjal();
    _ds_earth_x.destroyUpdater_xjal();
    _ds_earth_y.destroyUpdater_xjal();
    _ds_earth_v.destroyUpdater_xjal();
    _ds_earth_u.destroyUpdater_xjal();
    _ds_sun_x.destroyUpdater_xjal();
    _plot_expression0_dataSet_xjal.destroyUpdater_xjal();
    _plot_expression1_dataSet_xjal.destroyUpdater_xjal();
    logToDB( _plot_expression0_dataSet_xjal, "plot : Sun" );
    logToDB( _plot_expression1_dataSet_xjal, "plot : Earth" );
    super.onDestroy();
  }

  // Additional class code

 
  // End of additional class code


}
