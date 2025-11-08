package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandPointingLeft01: ImageVector
    get() {
        if (_handPointingLeft01 != null) {
            return _handPointingLeft01!!
        }
        _handPointingLeft01 = ImageVector.Builder(
            name = "HandPointingLeft01",
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
        moveTo(21.9986f, 8.83415f)
        horizontalLineTo(21.0513f)
        curveTo(20.4058f, 8.83415f, 19.7775f, 8.62541f, 19.2595f, 8.23886f)
        lineTo(14.3566f, 4.58042f)
        curveTo(13.7911f, 4.15849f, 13.0896f, 3.82148f, 12.4419f, 4.10005f)
        curveTo(11.3935f, 4.551f, 10.7124f, 5.82324f, 12.2843f, 7.38045f)
        lineTo(13.9937f, 8.97804f)
        lineTo(3.57057f, 8.97804f)
        curveTo(1.52742f, 9.03427f, 1.42614f, 12.3231f, 3.57057f, 12.4637f)
        horizontalLineTo(9.5106f)
        curveTo(9.31946f, 13.9441f, 10.3629f, 20.9177f, 14.7831f, 19.9012f)
        curveTo(14.9931f, 19.8529f, 15.2063f, 19.8047f, 15.4165f, 19.7576f)
        curveTo(16.3353f, 19.5519f, 17.9727f, 18.9439f, 18.93f, 18.2735f)
        curveTo(19.9266f, 17.5755f, 21.5155f, 17.8218f, 22f, 17.8218f)
        }
        }.build()

        return _handPointingLeft01!!
    }

private var _handPointingLeft01: ImageVector? = null
