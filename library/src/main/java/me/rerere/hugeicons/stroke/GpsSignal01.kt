package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GpsSignal01: ImageVector
    get() {
        if (_gpsSignal01 != null) {
            return _gpsSignal01!!
        }
        _gpsSignal01 = ImageVector.Builder(
            name = "GpsSignal01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 10.0294f)
        curveTo(10.3726f, 8.65685f, 12.598f, 8.65685f, 13.9706f, 10.0294f)
        curveTo(15.3431f, 11.402f, 15.3431f, 13.6274f, 13.9706f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.85289f, 19.1471f)
        curveTo(8.04869f, 22.3429f, 12.9127f, 22.8538f, 16.6418f, 20.6797f)
        curveTo(17.5285f, 20.1627f, 17.9719f, 19.9043f, 17.999f, 19.3782f)
        curveTo(18.0261f, 18.8522f, 17.5277f, 18.4882f, 16.531f, 17.7603f)
        curveTo(14.683f, 16.4107f, 12.8636f, 14.7603f, 11.0516f, 12.9484f)
        curveTo(9.23967f, 11.1364f, 7.58927f, 9.31705f, 6.23969f, 7.46904f)
        curveTo(5.51179f, 6.47231f, 5.14784f, 5.97395f, 4.62178f, 6.00105f)
        curveTo(4.09572f, 6.02815f, 3.83725f, 6.47149f, 3.32031f, 7.35818f)
        curveTo(1.14624f, 11.0873f, 1.6571f, 15.9513f, 4.85289f, 19.1471f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5574f, 2f)
        curveTo(17.2371f, 2.17243f, 18.7811f, 2.83962f, 19.9693f, 4.02583f)
        curveTo(21.1611f, 5.21579f, 21.8299f, 6.76334f, 22f, 8.4465f)
        moveTo(18.5017f, 9f)
        curveTo(18.3026f, 8.14257f, 17.8914f, 7.36144f, 17.2598f, 6.73091f)
        curveTo(16.6314f, 6.10356f, 15.8537f, 5.69396f, 15f, 5.49405f)
        }
        }.build()

        return _gpsSignal01!!
    }

private var _gpsSignal01: ImageVector? = null
