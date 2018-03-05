package com.mx.entity;

public class Machine {

    private int machine_number;
    private QQ qq;
    private String script_code;

    public int getMachine_number() {
        return machine_number;
    }

    public void setMachine_number(int machine_number) {
        this.machine_number = machine_number;
    }

    public QQ getQq() {
        return qq;
    }

    public void setQq(QQ qq) {
        this.qq = qq;
    }

    public String getScript_code() {
        return script_code;
    }

    public void setScript_code(String script_code) {
        this.script_code = script_code;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "machine_number=" + machine_number +
                ", qq=" + qq +
                ", script_code='" + script_code + '\'' +
                '}';
    }
}
