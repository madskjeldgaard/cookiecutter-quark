{{cookiecutter.quark_name}}Test1 : UnitTest {
	test_check_classname {
		var result = {{cookiecutter.quark_name}}.new;
		this.assert(result.class == {{cookiecutter.quark_name}});
	}
}


{{cookiecutter.quark_name}}Tester {
	*new {
		^super.new.init();
	}

	init {
		{{cookiecutter.quark_name}}Test1.run;
	}
}
