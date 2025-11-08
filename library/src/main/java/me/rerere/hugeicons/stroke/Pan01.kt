package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pan01: ImageVector
    get() {
        if (_pan01 != null) {
            return _pan01!!
        }
        _pan01 = ImageVector.Builder(
            name = "Pan01",
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
        moveTo(19.8033f, 14.8033f)
        curveTo(16.8744f, 17.7322f, 12.1256f, 17.7322f, 9.1967f, 14.8033f)
        curveTo(6.26777f, 11.8744f, 6.26777f, 7.12563f, 9.1967f, 4.1967f)
        curveTo(12.1256f, 1.26777f, 16.8744f, 1.26777f, 19.8033f, 4.1967f)
        curveTo(22.7322f, 7.12563f, 22.7322f, 11.8744f, 19.8033f, 14.8033f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.3284f, 12.3284f)
        curveTo(15.7663f, 13.8905f, 13.2337f, 13.8905f, 11.6716f, 12.3284f)
        curveTo(10.1095f, 10.7663f, 10.1095f, 8.23367f, 11.6716f, 6.67157f)
        curveTo(13.2337f, 5.10948f, 15.7663f, 5.10948f, 17.3284f, 6.67157f)
        curveTo(18.8905f, 8.23367f, 18.8905f, 10.7663f, 17.3284f, 12.3284f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 15.9707f)
        curveTo(8.26829f, 16.7441f, 7.48472f, 19.486f, 5.58597f, 21.3847f)
        curveTo(4.76563f, 22.2051f, 3.43559f, 22.2051f, 2.61525f, 21.3847f)
        curveTo(1.79492f, 20.5644f, 1.79492f, 19.2344f, 2.61525f, 18.414f)
        curveTo(4.514f, 16.5153f, 7.25588f, 15.7317f, 8.02929f, 13f)
        }
        }.build()

        return _pan01!!
    }

private var _pan01: ImageVector? = null
