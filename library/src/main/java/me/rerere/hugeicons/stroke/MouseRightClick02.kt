package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MouseRightClick02: ImageVector
    get() {
        if (_mouseRightClick02 != null) {
            return _mouseRightClick02!!
        }
        _mouseRightClick02 = ImageVector.Builder(
            name = "MouseRightClick02",
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
        moveTo(13.5f, 2.09084f)
        curveTo(12.8345f, 2.02383f, 12.1611f, 2f, 11.5f, 2f)
        curveTo(10.5753f, 2f, 9.66267f, 2.07762f, 8.7651f, 2.1882f)
        curveTo(6.32417f, 2.48893f, 4.43061f, 4.51965f, 4.24069f, 6.91118f)
        curveTo(4.10906f, 8.56832f, 4f, 10.268f, 4f, 12f)
        curveTo(4f, 13.732f, 4.10906f, 15.4317f, 4.24069f, 17.0888f)
        curveTo(4.43061f, 19.4803f, 6.32417f, 21.511f, 8.7651f, 21.8118f)
        curveTo(9.66267f, 21.9223f, 10.5753f, 22f, 11.5f, 22f)
        curveTo(12.4248f, 22f, 13.3374f, 21.9223f, 14.235f, 21.8118f)
        curveTo(16.6758f, 21.511f, 18.5695f, 19.4803f, 18.7594f, 17.0888f)
        curveTo(18.891f, 15.4317f, 19f, 13.732f, 19f, 12f)
        curveTo(19f, 11.3283f, 18.9836f, 10.6614f, 18.9558f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 2f)
        lineTo(11.5f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 11f)
        horizontalLineTo(4.5f)
        }
        }.build()

        return _mouseRightClick02!!
    }

private var _mouseRightClick02: ImageVector? = null
