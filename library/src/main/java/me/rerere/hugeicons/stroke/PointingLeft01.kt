package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PointingLeft01: ImageVector
    get() {
        if (_pointingLeft01 != null) {
            return _pointingLeft01!!
        }
        _pointingLeft01 = ImageVector.Builder(
            name = "PointingLeft01",
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
        moveTo(2.01758f, 4.49869f)
        horizontalLineTo(8.00963f)
        moveTo(2.01758f, 4.49869f)
        curveTo(2.01758f, 3.79883f, 4.00924f, 2.49127f, 4.51427f, 2f)
        moveTo(2.01758f, 4.49869f)
        curveTo(2.01758f, 5.19855f, 4.00924f, 6.50611f, 4.51427f, 6.99738f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9999f, 10.8261f)
        lineTo(21.0513f, 10.8261f)
        curveTo(20.4058f, 10.8261f, 19.7774f, 10.6173f, 19.2594f, 10.2306f)
        lineTo(14.3566f, 6.57049f)
        curveTo(13.7911f, 6.14837f, 13.0895f, 5.81121f, 12.4419f, 6.0899f)
        curveTo(11.3935f, 6.54106f, 10.7124f, 7.81387f, 12.2842f, 9.37179f)
        lineTo(13.9936f, 10.9701f)
        lineTo(3.57057f, 10.9701f)
        curveTo(1.52742f, 11.0263f, 1.42614f, 14.3166f, 3.57057f, 14.4573f)
        lineTo(9.51058f, 14.4573f)
        curveTo(9.31944f, 15.9384f, 10.3629f, 22.9151f, 14.7831f, 21.8982f)
        curveTo(14.9931f, 21.8498f, 15.2062f, 21.8016f, 15.4165f, 21.7545f)
        curveTo(16.3353f, 21.5487f, 17.9727f, 20.9405f, 18.93f, 20.2697f)
        curveTo(19.9265f, 19.5714f, 20.9191f, 19.8178f, 21.9999f, 19.8178f)
        }
        }.build()

        return _pointingLeft01!!
    }

private var _pointingLeft01: ImageVector? = null
