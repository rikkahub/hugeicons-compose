package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.IrisScan: ImageVector
    get() {
        if (_irisScan != null) {
            return _irisScan!!
        }
        _irisScan = ImageVector.Builder(
            name = "IrisScan",
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
        moveTo(2.5f, 8.18677f)
        curveTo(2.60406f, 6.08705f, 2.91537f, 4.77792f, 3.84664f, 3.84664f)
        curveTo(4.77792f, 2.91537f, 6.08705f, 2.60406f, 8.18677f, 2.5f)
        moveTo(21.5f, 8.18677f)
        curveTo(21.3959f, 6.08705f, 21.0846f, 4.77792f, 20.1534f, 3.84664f)
        curveTo(19.2221f, 2.91537f, 17.9129f, 2.60406f, 15.8132f, 2.5f)
        moveTo(15.8132f, 21.5f)
        curveTo(17.9129f, 21.3959f, 19.2221f, 21.0846f, 20.1534f, 20.1534f)
        curveTo(21.0846f, 19.2221f, 21.3959f, 17.9129f, 21.5f, 15.8132f)
        moveTo(8.18676f, 21.5f)
        curveTo(6.08705f, 21.3959f, 4.77792f, 21.0846f, 3.84664f, 20.1534f)
        curveTo(2.91537f, 19.2221f, 2.60406f, 17.9129f, 2.5f, 15.8132f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.49986f, 12f)
        horizontalLineTo(21.4999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        curveTo(6f, 8.68629f, 8.68629f, 6f, 12f, 6f)
        curveTo(12f, 7.65685f, 13.3431f, 9f, 15f, 9f)
        curveTo(15.6755f, 9f, 16.2989f, 8.77672f, 16.8004f, 8.39993f)
        curveTo(17.5536f, 9.40273f, 18f, 10.6492f, 18f, 12f)
        moveTo(17.1973f, 15f)
        curveTo(16.1599f, 16.7934f, 14.2208f, 18f, 12f, 18f)
        curveTo(9.77915f, 18f, 7.84012f, 16.7934f, 6.80269f, 15f)
        }
        }.build()

        return _irisScan!!
    }

private var _irisScan: ImageVector? = null
