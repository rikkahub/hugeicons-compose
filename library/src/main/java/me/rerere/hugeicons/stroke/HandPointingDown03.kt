package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandPointingDown03: ImageVector
    get() {
        if (_handPointingDown03 != null) {
            return _handPointingDown03!!
        }
        _handPointingDown03 = ImageVector.Builder(
            name = "HandPointingDown03",
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
        moveTo(11.5004f, 16.0002f)
        horizontalLineTo(12.5004f)
        curveTo(13.605f, 16.0002f, 14.5004f, 15.1048f, 14.5004f, 14.0002f)
        moveTo(14.5004f, 14.0002f)
        verticalLineTo(13.0002f)
        moveTo(14.5004f, 14.0002f)
        curveTo(14.5004f, 14.5525f, 14.9481f, 15.0002f, 15.5004f, 15.0002f)
        curveTo(16.605f, 15.0002f, 17.5004f, 14.1048f, 17.5004f, 13.0002f)
        moveTo(17.5004f, 13.0002f)
        verticalLineTo(12.0002f)
        moveTo(17.5004f, 13.0002f)
        curveTo(17.5004f, 13.5237f, 17.9705f, 13.9219f, 18.4868f, 13.8358f)
        lineTo(18.8292f, 13.7788f)
        curveTo(19.7936f, 13.618f, 20.5004f, 12.7837f, 20.5004f, 11.806f)
        lineTo(20.5f, 10.3334f)
        curveTo(20.5f, 8.16008f, 20.5f, 7.07338f, 20.1689f, 6.20824f)
        curveTo(19.9769f, 5.70638f, 19.4703f, 5.06636f, 19.0652f, 4.60386f)
        curveTo(18.7148f, 4.20383f, 18.5f, 3.69642f, 18.5f, 3.16465f)
        verticalLineTo(2.00008f)
        moveTo(11.5002f, 14.0002f)
        verticalLineTo(20.5002f)
        curveTo(11.5002f, 21.3287f, 10.8286f, 22.0002f, 10.0002f, 22.0002f)
        curveTo(9.17178f, 22.0002f, 8.50021f, 21.3287f, 8.50021f, 20.5002f)
        lineTo(8.5f, 10.5378f)
        lineTo(6.8797f, 12.1632f)
        curveTo(6.16877f, 12.8764f, 4.99772f, 12.8113f, 4.36965f, 12.0237f)
        curveTo(3.88907f, 11.4211f, 3.8758f, 10.5687f, 4.33738f, 9.95133f)
        lineTo(7.93707f, 5.35312f)
        curveTo(8.62579f, 4.47336f, 9f, 3.11736f, 9f, 2.00008f)
        }
        }.build()

        return _handPointingDown03!!
    }

private var _handPointingDown03: ImageVector? = null
