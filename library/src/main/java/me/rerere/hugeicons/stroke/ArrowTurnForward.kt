package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowTurnForward: ImageVector
    get() {
        if (_arrowTurnForward != null) {
            return _arrowTurnForward!!
        }
        _arrowTurnForward = ImageVector.Builder(
            name = "ArrowTurnForward",
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
        moveTo(13f, 6f)
        horizontalLineTo(8.5f)
        curveTo(6.01472f, 6f, 4f, 8.01472f, 4f, 10.5f)
        curveTo(4f, 12.9853f, 6.01472f, 15f, 8.5f, 15f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 12f)
        curveTo(17f, 12f, 20f, 14.2095f, 20f, 15f)
        curveTo(20f, 15.7906f, 17f, 18f, 17f, 18f)
        }
        }.build()

        return _arrowTurnForward!!
    }

private var _arrowTurnForward: ImageVector? = null
