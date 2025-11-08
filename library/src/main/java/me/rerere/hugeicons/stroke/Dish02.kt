package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dish02: ImageVector
    get() {
        if (_dish02 != null) {
            return _dish02!!
        }
        _dish02 = ImageVector.Builder(
            name = "Dish02",
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
        moveTo(21f, 17f)
        curveTo(18.2386f, 17f, 16f, 14.7614f, 16f, 12f)
        curveTo(16f, 9.23858f, 18.2386f, 7f, 21f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 21f)
        curveTo(16.0294f, 21f, 12f, 16.9706f, 12f, 12f)
        curveTo(12f, 7.02944f, 16.0294f, 3f, 21f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 3f)
        lineTo(6f, 8f)
        moveTo(6f, 21f)
        lineTo(6f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 8f)
        horizontalLineTo(8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 3f)
        lineTo(9f, 7.35224f)
        curveTo(9f, 12.216f, 3f, 12.2159f, 3f, 7.35207f)
        lineTo(3f, 3f)
        }
        }.build()

        return _dish02!!
    }

private var _dish02: ImageVector? = null
