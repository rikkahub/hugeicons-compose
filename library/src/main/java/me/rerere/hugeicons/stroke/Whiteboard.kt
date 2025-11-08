package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Whiteboard: ImageVector
    get() {
        if (_whiteboard != null) {
            return _whiteboard!!
        }
        _whiteboard = ImageVector.Builder(
            name = "Whiteboard",
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
        moveTo(14f, 4f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 4f, 4.34315f, 4f, 3.17157f, 5.17157f)
        curveTo(2f, 6.34315f, 2f, 8.22876f, 2f, 12f)
        curveTo(2f, 15.7712f, 2f, 17.6569f, 3.17157f, 18.8284f)
        curveTo(4.34315f, 20f, 6.22876f, 20f, 10f, 20f)
        horizontalLineTo(14f)
        curveTo(16.8089f, 20f, 18.2134f, 20f, 19.2223f, 19.3259f)
        curveTo(19.659f, 19.034f, 20.034f, 18.659f, 20.3259f, 18.2223f)
        curveTo(21f, 17.2134f, 21f, 15.8089f, 21f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12.0168f)
        lineTo(4.5f, 9.6005f)
        curveTo(5.32843f, 8.79983f, 6.67157f, 8.79983f, 7.5f, 9.60051f)
        curveTo(8.32843f, 10.4012f, 8.32843f, 11.6993f, 7.5f, 12.5f)
        curveTo(6.67157f, 13.3007f, 6.67157f, 14.5988f, 7.5f, 15.3995f)
        curveTo(8.32843f, 16.2002f, 9.67157f, 16.2002f, 10.5f, 15.3995f)
        lineTo(11f, 14.9162f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.6716f, 13f)
        horizontalLineTo(13f)
        verticalLineTo(11.3284f)
        curveTo(13f, 10.798f, 13.2107f, 10.2893f, 13.5858f, 9.91421f)
        lineTo(19.0616f, 4.43934f)
        curveTo(19.6474f, 3.85355f, 20.5972f, 3.85355f, 21.183f, 4.43934f)
        lineTo(21.5616f, 4.81802f)
        curveTo(22.1474f, 5.40381f, 22.1474f, 6.35355f, 21.5616f, 6.93934f)
        lineTo(16.0858f, 12.4142f)
        curveTo(15.7107f, 12.7893f, 15.202f, 13f, 14.6716f, 13f)
        }
        }.build()

        return _whiteboard!!
    }

private var _whiteboard: ImageVector? = null
