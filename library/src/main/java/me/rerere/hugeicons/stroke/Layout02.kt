package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Layout02: ImageVector
    get() {
        if (_layout02 != null) {
            return _layout02!!
        }
        _layout02 = ImageVector.Builder(
            name = "Layout02",
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
        moveTo(20.1088f, 20.1088f)
        curveTo(21.5f, 18.7175f, 21.5f, 16.4783f, 21.5f, 12f)
        curveTo(21.5f, 7.52166f, 21.5f, 5.28249f, 20.1088f, 3.89124f)
        curveTo(18.7175f, 2.5f, 16.4783f, 2.5f, 12f, 2.5f)
        curveTo(7.52166f, 2.5f, 5.28249f, 2.5f, 3.89124f, 3.89124f)
        curveTo(2.5f, 5.28248f, 2.5f, 7.52166f, 2.5f, 12f)
        curveTo(2.5f, 16.4783f, 2.5f, 18.7175f, 3.89124f, 20.1088f)
        curveTo(5.28249f, 21.5f, 7.52166f, 21.5f, 12f, 21.5f)
        curveTo(16.4783f, 21.5f, 18.7175f, 21.5f, 20.1088f, 20.1088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 9f)
        lineTo(2.5f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 21.5f)
        lineTo(16f, 9f)
        }
        }.build()

        return _layout02!!
    }

private var _layout02: ImageVector? = null
