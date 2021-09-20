import { Component, createElement } from "react";
import "./ui/ReactStaticProgressBar.css";

export default class ReactStaticProgressBar extends Component {
    constructor(props) {
        super(props);

        this.state = {
            value: undefined
        };
    }

    calculatePercent(start, end, value) {
        const percent = ((value - start) / (end - start)) * 100;
        return percent;
    }

    render() {
        const startValue = Number(this.props.startValue.value);
        const endValue = Number(this.props.endValue.value);
        const value = Number(this.props.valueAttribute.value);
        const calculatedPerenct = this.calculatePercent(startValue, endValue, value).toFixed(2);
        const showLabels = this.props.showLabels;
        const style = {
            backgroundColor: this.props.colorAttribute.value,
            width: this.calculatePercent(startValue, endValue, value) + "%"
        };

        if (this.props.valueAttribute.status !== "available") {
            return "";
        }

        if (this.props.startValue.value === undefined) {
            console.warn("start value should not be empty");
            return "";
        }

        if (this.props.endValue.value === undefined) {
            console.warn("end value should not be empty");
            return "";
        }

        if (this.props.colorAttribute.value === undefined) {
            console.warn("color should not be empty");
            return "";
        }

        return (
            <div>
                <div className="progressBar">
                    <div className="valueBar" style={style} min={startValue} max={endValue} value={calculatedPerenct}>
                        <span>{calculatedPerenct + "%"} </span>
                    </div>
                    <span className={`${showLabels ? "leftLabel" : "emptyLabel"}`}>{startValue}</span>
                    <span className={`${showLabels ? "rightLabel" : "emptyLabel"}`}>{endValue}</span>
                </div>
            </div>
        );
    }
}
