package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoveTop: ImageVector
    get() {
        if (_moveTop != null) {
            return _moveTop!!
        }
        _moveTop = ImageVector.Builder(
            name = "MoveTop",
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
        moveTo(12.0006f, 1.99988f)
        lineTo(12.0006f, 11.9999f)
        moveTo(12.0006f, 1.99988f)
        curveTo(11.4386f, 1.99988f, 11.0113f, 2.43798f, 10.1569f, 3.31418f)
        lineTo(8.50049f, 4.97045f)
        moveTo(12.0006f, 1.99988f)
        curveTo(12.5627f, 1.99988f, 12.9899f, 2.43798f, 13.8444f, 3.31418f)
        lineTo(15.5005f, 4.97032f)
        }
        }.build()

        return _moveTop!!
    }

private var _moveTop: ImageVector? = null
