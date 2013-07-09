package unwrittenfun.bukkit.lukkit.player;

import org.luaj.vm2.LuaValue;
import org.luaj.vm2.Varargs;
import org.luaj.vm2.lib.VarArgFunction;


public class SetFlyingFunction extends VarArgFunction {

	@Override
	public Varargs invoke(Varargs args) {
		((PlayerObject) args.arg(1)).player.setFlying(args.toboolean(2));
		return LuaValue.NIL;
	}
	
}