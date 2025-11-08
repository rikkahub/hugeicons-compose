package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowExpandDiagonal02: ImageVector
    get() {
        if (_arrowExpandDiagonal02 != null) {
            return _arrowExpandDiagonal02!!
        }
        _arrowExpandDiagonal02 = ImageVector.Builder(
            name = "ArrowExpandDiagonal02",
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
        moveTo(16f, 8f)
        lineTo(7.99999f, 16f)
        moveTo(6.99999f, 3.23663f)
        curveTo(6.24939f, 3.22596f, 3.7637f, 2.70959f, 3.2366f, 3.23663f)
        curveTo(2.7096f, 3.76367f, 3.226f, 6.24941f, 3.2366f, 7f)
        moveTo(20.7634f, 17f)
        curveTo(20.774f, 17.7506f, 21.2904f, 20.2363f, 20.7634f, 20.7634f)
        curveTo(20.2363f, 21.2904f, 17.7506f, 20.774f, 17f, 20.7634f)
        moveTo(9.00256f, 9.00714f)
        lineTo(3.61682f, 3.62135f)
        moveTo(20.374f, 20.374f)
        lineTo(14.9883f, 14.9882f)
        }
        }.build()

        return _arrowExpandDiagonal02!!
    }

private var _arrowExpandDiagonal02: ImageVector? = null
