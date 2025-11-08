package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowRight03: ImageVector
    get() {
        if (_arrowRight03 != null) {
            return _arrowRight03!!
        }
        _arrowRight03 = ImageVector.Builder(
            name = "ArrowRight03",
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
        moveTo(20.0001f, 18f)
        lineTo(20.0001f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.0001f, 11.9995f)
        lineTo(4.00012f, 11.9995f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0002f, 8f)
        curveTo(12.0002f, 8f, 16.0001f, 10.946f, 16.0001f, 12f)
        curveTo(16.0001f, 13.0541f, 12.0001f, 16f, 12.0001f, 16f)
        }
        }.build()

        return _arrowRight03!!
    }

private var _arrowRight03: ImageVector? = null
