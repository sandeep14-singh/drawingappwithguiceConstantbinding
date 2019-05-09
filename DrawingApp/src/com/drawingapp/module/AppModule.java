package com.drawingapp.module;


import com.drawingapp.annotations.ColorValue;
import com.drawingapp.annotations.EdgeValue;
import com.drawingapp.services.DrawShape;
import com.drawingapp.services.DrawSquare;
import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule{
	
	@Override
	protected void configure() {
		bind(DrawShape.class).to(DrawSquare.class);
		bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
		bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
		
	}
	
}
