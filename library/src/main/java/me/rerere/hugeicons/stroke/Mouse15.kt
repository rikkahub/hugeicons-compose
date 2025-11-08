package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mouse15: ImageVector
    get() {
        if (_mouse15 != null) {
            return _mouse15!!
        }
        _mouse15 = ImageVector.Builder(
            name = "Mouse15",
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
        moveTo(6f, 2f)
        curveTo(6f, 3.80215f, 7.74439f, 3.5f, 9.00657f, 3.5f)
        curveTo(11.0476f, 3.5f, 11.9337f, 3.87677f, 12f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(17.2f, 22f, 18.5f, 18.392f, 18.5f, 14f)
        curveTo(18.5f, 9.60799f, 17.2f, 6f, 12f, 6f)
        curveTo(6.79994f, 6f, 5.5f, 9.60797f, 5.5f, 14f)
        curveTo(5.5f, 18.392f, 6.79994f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        verticalLineTo(11f)
        }
        }.build()

        return _mouse15!!
    }

private var _mouse15: ImageVector? = null
