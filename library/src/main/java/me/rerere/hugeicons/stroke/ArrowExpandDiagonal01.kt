package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowExpandDiagonal01: ImageVector
    get() {
        if (_arrowExpandDiagonal01 != null) {
            return _arrowExpandDiagonal01!!
        }
        _arrowExpandDiagonal01 = ImageVector.Builder(
            name = "ArrowExpandDiagonal01",
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
        moveTo(8f, 8f)
        lineTo(16f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 3.23663f)
        curveTo(17.7506f, 3.22596f, 20.2363f, 2.70959f, 20.7634f, 3.23663f)
        curveTo(21.2904f, 3.76367f, 20.774f, 6.24941f, 20.7634f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.23663f, 17f)
        curveTo(3.22596f, 17.7506f, 2.70959f, 20.2363f, 3.23663f, 20.7634f)
        curveTo(3.76367f, 21.2904f, 6.24941f, 20.774f, 7f, 20.7634f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9981f, 9.00737f)
        lineTo(20.3838f, 3.62158f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.62598f, 20.3741f)
        lineTo(9.01172f, 14.9883f)
        }
        }.build()

        return _arrowExpandDiagonal01!!
    }

private var _arrowExpandDiagonal01: ImageVector? = null
