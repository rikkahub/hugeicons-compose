package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowTurnDown: ImageVector
    get() {
        if (_arrowTurnDown != null) {
            return _arrowTurnDown!!
        }
        _arrowTurnDown = ImageVector.Builder(
            name = "ArrowTurnDown",
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
        moveTo(5.99994f, 13f)
        lineTo(5.99994f, 8.5f)
        curveTo(5.99994f, 6.01472f, 8.01466f, 4f, 10.4999f, 4f)
        curveTo(12.9852f, 4f, 14.9999f, 6.01472f, 14.9999f, 8.5f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9999f, 17f)
        curveTo(11.9999f, 17f, 14.2093f, 20f, 14.9999f, 20f)
        curveTo(15.7905f, 20f, 17.9999f, 17f, 17.9999f, 17f)
        }
        }.build()

        return _arrowTurnDown!!
    }

private var _arrowTurnDown: ImageVector? = null
