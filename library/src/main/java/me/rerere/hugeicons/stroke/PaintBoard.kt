package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PaintBoard: ImageVector
    get() {
        if (_paintBoard != null) {
            return _paintBoard!!
        }
        _paintBoard = ImageVector.Builder(
            name = "PaintBoard",
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
        moveTo(22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(12.8417f, 22f, 14f, 22.1163f, 14f, 21f)
        curveTo(14f, 20.391f, 13.6832f, 19.9212f, 13.3686f, 19.4544f)
        curveTo(12.9082f, 18.7715f, 12.4523f, 18.0953f, 13f, 17f)
        curveTo(13.6667f, 15.6667f, 14.7778f, 15.6667f, 16.4815f, 15.6667f)
        curveTo(17.3334f, 15.6667f, 18.3334f, 15.6667f, 19.5f, 15.5f)
        curveTo(21.601f, 15.1999f, 22f, 13.9084f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 15.002f)
        lineTo(7.00868f, 14.9996f)
        }
        }.build()

        return _paintBoard!!
    }

private var _paintBoard: ImageVector? = null
