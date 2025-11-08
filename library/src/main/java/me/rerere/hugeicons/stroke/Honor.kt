package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Honor: ImageVector
    get() {
        if (_honor != null) {
            return _honor!!
        }
        _honor = ImageVector.Builder(
            name = "Honor",
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
        moveTo(2.5f, 3.00098f)
        horizontalLineTo(21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 3.00098f)
        verticalLineTo(14f)
        curveTo(4.5f, 16.3288f, 4.93059f, 17.0893f, 6.92752f, 18.2875f)
        lineTo(9.94202f, 20.0962f)
        curveTo(10.9447f, 20.6978f, 11.446f, 20.9986f, 12f, 20.9986f)
        curveTo(12.554f, 20.9986f, 13.0553f, 20.6978f, 14.058f, 20.0962f)
        lineTo(17.0725f, 18.2875f)
        curveTo(19.0694f, 17.0893f, 19.5f, 16.3288f, 19.5f, 14f)
        verticalLineTo(3.00098f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 13.001f)
        horizontalLineTo(9.5f)
        moveTo(14.5f, 8.00098f)
        horizontalLineTo(9.5f)
        }
        }.build()

        return _honor!!
    }

private var _honor: ImageVector? = null
