package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandPointingRight01: ImageVector
    get() {
        if (_handPointingRight01 != null) {
            return _handPointingRight01!!
        }
        _handPointingRight01 = ImageVector.Builder(
            name = "HandPointingRight01",
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
        moveTo(2f, 8.83415f)
        horizontalLineTo(2.94868f)
        curveTo(3.59418f, 8.83415f, 4.22251f, 8.62541f, 4.74055f, 8.23886f)
        lineTo(9.64341f, 4.58042f)
        curveTo(10.2089f, 4.15849f, 10.9104f, 3.82148f, 11.5581f, 4.10005f)
        curveTo(12.6065f, 4.551f, 13.2876f, 5.82324f, 11.7157f, 7.38045f)
        lineTo(10.0063f, 8.97804f)
        lineTo(20.4294f, 8.97804f)
        curveTo(22.4726f, 9.03427f, 22.5739f, 12.3231f, 20.4294f, 12.4637f)
        horizontalLineTo(14.4894f)
        curveTo(14.6805f, 13.9441f, 13.6371f, 20.9177f, 9.21687f, 19.9012f)
        curveTo(9.00686f, 19.8529f, 8.79375f, 19.8047f, 8.58346f, 19.7576f)
        curveTo(7.6647f, 19.5519f, 6.02726f, 18.9439f, 5.06998f, 18.2735f)
        curveTo(4.07344f, 17.5755f, 3.08083f, 17.8218f, 2f, 17.8218f)
        }
        }.build()

        return _handPointingRight01!!
    }

private var _handPointingRight01: ImageVector? = null
