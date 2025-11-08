package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoveBottom: ImageVector
    get() {
        if (_moveBottom != null) {
            return _moveBottom!!
        }
        _moveBottom = ImageVector.Builder(
            name = "MoveBottom",
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
        moveTo(11.9999f, 22.0001f)
        lineTo(11.9999f, 12.0001f)
        moveTo(11.9999f, 22.0001f)
        curveTo(12.5619f, 22.0001f, 12.9891f, 21.562f, 13.8436f, 20.6858f)
        lineTo(15.5f, 19.0295f)
        moveTo(11.9999f, 22.0001f)
        curveTo(11.4378f, 22.0001f, 11.0106f, 21.562f, 10.1561f, 20.6858f)
        lineTo(8.5f, 19.0296f)
        }
        }.build()

        return _moveBottom!!
    }

private var _moveBottom: ImageVector? = null
