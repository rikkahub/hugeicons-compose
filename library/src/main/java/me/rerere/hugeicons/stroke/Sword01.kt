package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sword01: ImageVector
    get() {
        if (_sword01 != null) {
            return _sword01!!
        }
        _sword01 = ImageVector.Builder(
            name = "Sword01",
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
        moveTo(2.5f, 19.5f)
        curveTo(2.98686f, 19.5717f, 3.45571f, 19.7949f, 3.83041f, 20.1696f)
        curveTo(4.20512f, 20.5443f, 4.42832f, 21.0131f, 4.5f, 21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 16f)
        lineTo(4f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 16.5f)
        lineTo(19.8538f, 7.92675f)
        curveTo(20.1737f, 7.64942f, 20.3975f, 7.27769f, 20.4927f, 6.86509f)
        lineTo(21.5f, 2.5f)
        lineTo(17.1349f, 3.50733f)
        curveTo(16.7223f, 3.60254f, 16.3506f, 3.82626f, 16.0732f, 4.14625f)
        lineTo(7.5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 13f)
        horizontalLineTo(4.57157f)
        curveTo(5.10201f, 13f, 5.61071f, 13.2107f, 5.98579f, 13.5858f)
        lineTo(10.4142f, 18.0142f)
        curveTo(10.7893f, 18.3893f, 11f, 18.898f, 11f, 19.4284f)
        verticalLineTo(20f)
        }
        }.build()

        return _sword01!!
    }

private var _sword01: ImageVector? = null
