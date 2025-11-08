package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowTurnBackward: ImageVector
    get() {
        if (_arrowTurnBackward != null) {
            return _arrowTurnBackward!!
        }
        _arrowTurnBackward = ImageVector.Builder(
            name = "ArrowTurnBackward",
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
        moveTo(11f, 6f)
        horizontalLineTo(15.5f)
        curveTo(17.9853f, 6f, 20f, 8.01472f, 20f, 10.5f)
        curveTo(20f, 12.9853f, 17.9853f, 15f, 15.5f, 15f)
        horizontalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.99998f, 12f)
        curveTo(6.99998f, 12f, 4.00001f, 14.2095f, 4f, 15f)
        curveTo(3.99999f, 15.7906f, 7f, 18f, 7f, 18f)
        }
        }.build()

        return _arrowTurnBackward!!
    }

private var _arrowTurnBackward: ImageVector? = null
