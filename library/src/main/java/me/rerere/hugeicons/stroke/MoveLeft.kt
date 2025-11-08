package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoveLeft: ImageVector
    get() {
        if (_moveLeft != null) {
            return _moveLeft!!
        }
        _moveLeft = ImageVector.Builder(
            name = "MoveLeft",
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
        moveTo(2f, 11.9999f)
        horizontalLineTo(12f)
        moveTo(2f, 11.9999f)
        curveTo(2f, 12.5619f, 2.4381f, 12.9891f, 3.3143f, 13.8436f)
        lineTo(4.97057f, 15.5f)
        moveTo(2f, 11.9999f)
        curveTo(2f, 11.4378f, 2.4381f, 11.0106f, 3.3143f, 10.1561f)
        lineTo(4.97044f, 8.5f)
        }
        }.build()

        return _moveLeft!!
    }

private var _moveLeft: ImageVector? = null
