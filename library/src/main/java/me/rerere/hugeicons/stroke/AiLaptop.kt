package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiLaptop: ImageVector
    get() {
        if (_aiLaptop != null) {
            return _aiLaptop!!
        }
        _aiLaptop = ImageVector.Builder(
            name = "AiLaptop",
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
        moveTo(3.9926f, 14.999f)
        verticalLineTo(6.96505f)
        curveTo(3.9926f, 5.07142f, 3.9926f, 4.12461f, 4.5762f, 3.53633f)
        curveTo(4.90157f, 3.20835f, 5.33749f, 3.06323f, 5.98512f, 2.99902f)
        horizontalLineTo(10.9664f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.4921f, 16.0144f)
        lineTo(4.01206f, 14.999f)
        horizontalLineTo(19.8848f)
        lineTo(20.4332f, 16.0144f)
        curveTo(21.8707f, 18.676f, 22.2288f, 20.0067f, 21.6823f, 21.0029f)
        curveTo(21.136f, 21.999f, 19.6873f, 21.999f, 16.79f, 21.999f)
        horizontalLineTo(7.13543f)
        curveTo(4.2381f, 21.999f, 2.78942f, 21.999f, 2.24303f, 21.0029f)
        curveTo(1.69664f, 20.0067f, 2.05461f, 18.676f, 3.4921f, 16.0144f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.4367f, 2.00098f)
        verticalLineTo(3.98f)
        moveTo(11.9627f, 5.50136f)
        horizontalLineTo(14.007f)
        moveTo(19.9558f, 5.50136f)
        horizontalLineTo(22.0001f)
        moveTo(19.9558f, 8.47458f)
        horizontalLineTo(22.0001f)
        moveTo(11.9627f, 8.47458f)
        horizontalLineTo(14.007f)
        moveTo(15.4367f, 10.0202f)
        verticalLineTo(11.9992f)
        moveTo(18.4508f, 10.0202f)
        verticalLineTo(11.9992f)
        moveTo(18.4401f, 2.00098f)
        verticalLineTo(3.98f)
        moveTo(15.0033f, 9.96854f)
        horizontalLineTo(18.9595f)
        curveTo(19.5097f, 9.96854f, 19.9558f, 9.52082f, 19.9558f, 8.96854f)
        verticalLineTo(4.98f)
        curveTo(19.9558f, 4.42771f, 19.5097f, 3.98f, 18.9595f, 3.98f)
        horizontalLineTo(15.0033f)
        curveTo(14.453f, 3.98f, 14.007f, 4.42771f, 14.007f, 4.98f)
        verticalLineTo(8.96854f)
        curveTo(14.007f, 9.52082f, 14.453f, 9.96854f, 15.0033f, 9.96854f)
        }
        }.build()

        return _aiLaptop!!
    }

private var _aiLaptop: ImageVector? = null
