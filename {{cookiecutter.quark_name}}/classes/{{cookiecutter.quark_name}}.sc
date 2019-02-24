{{cookiecutter.quark_name}} {
	// this is a normal constructor method
	*new { | arga, argb, argc  |
		^super.new.init(arga, argb, argc)
	}

	init { | arga, argb, argc  |
		// do initiation here
	}
}
