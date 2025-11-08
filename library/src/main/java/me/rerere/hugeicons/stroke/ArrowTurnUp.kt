package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowTurnUp: ImageVector
    get() {
        if (_arrowTurnUp != null) {
            return _arrowTurnUp!!
        }
        _arrowTurnUp = ImageVector.Builder(
            name = "ArrowTurnUp",
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
        moveTo(6f, 11f)
        lineTo(6f, 15.5f)
        curveTo(6f, 17.9853f, 8.01472f, 20f, 10.5f, 20f)
        curveTo(12.9853f, 20f, 15f, 17.9853f, 15f, 15.5f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 6.99998f)
        curveTo(18f, 6.99998f, 15.7905f, 4.00001f, 15f, 4f)
        curveTo(14.2094f, 3.99999f, 12f, 7f, 12f, 7f)
        }
        }.build()

        return _arrowTurnUp!!
    }

private var _arrowTurnUp: ImageVector? = null
