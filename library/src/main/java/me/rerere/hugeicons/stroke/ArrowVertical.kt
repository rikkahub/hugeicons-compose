package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowVertical: ImageVector
    get() {
        if (_arrowVertical != null) {
            return _arrowVertical!!
        }
        _arrowVertical = ImageVector.Builder(
            name = "ArrowVertical",
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
        moveTo(9f, 5f)
        curveTo(9.58984f, 4.39316f, 11.1597f, 2f, 12f, 2f)
        curveTo(12.8403f, 2f, 14.4102f, 4.39316f, 15f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 19f)
        curveTo(9.58984f, 19.6068f, 11.1597f, 22f, 12f, 22f)
        curveTo(12.8403f, 22f, 14.4102f, 19.6068f, 15f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2.23145f)
        verticalLineTo(21.769f)
        }
        }.build()

        return _arrowVertical!!
    }

private var _arrowVertical: ImageVector? = null
