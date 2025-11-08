package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bread02: ImageVector
    get() {
        if (_bread02 != null) {
            return _bread02!!
        }
        _bread02 = ImageVector.Builder(
            name = "Bread02",
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
        moveTo(12f, 14f)
        curveTo(12f, 17f, 9.76142f, 17f, 7f, 17f)
        curveTo(4.23858f, 17f, 2f, 17f, 2f, 14f)
        curveTo(2f, 11f, 4.23858f, 7f, 7f, 7f)
        curveTo(9.76142f, 7f, 12f, 11f, 12f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7f)
        horizontalLineTo(17f)
        curveTo(19.7614f, 7f, 22f, 11f, 22f, 14f)
        curveTo(22f, 17f, 19.7614f, 17f, 17f, 17f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.86019f, 17f)
        curveTo(7.4363f, 17f, 9f, 16.1f, 9f, 14f)
        curveTo(9f, 11.9f, 8.14239f, 10f, 6.6451f, 10f)
        curveTo(5.14782f, 10f, 4.31835f, 13.97f, 5.7172f, 14.5f)
        curveTo(7.03693f, 15f, 7.04538f, 13f, 7.04538f, 13f)
        }
        }.build()

        return _bread02!!
    }

private var _bread02: ImageVector? = null
