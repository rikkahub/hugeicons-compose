package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Collapse: ImageVector
    get() {
        if (_collapse != null) {
            return _collapse!!
        }
        _collapse = ImageVector.Builder(
            name = "Collapse",
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
        moveTo(13f, 4f)
        lineTo(13f, 7.00002f)
        curveTo(13f, 8.88563f, 13.0001f, 9.82843f, 13.5858f, 10.4142f)
        curveTo(14.1716f, 11f, 15.1144f, 11f, 17f, 11f)
        lineTo(20f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.0001f, 20f)
        lineTo(11f, 17f)
        curveTo(11f, 15.1144f, 11f, 14.1715f, 10.4142f, 13.5858f)
        curveTo(9.82843f, 13f, 8.88563f, 13f, 7.00002f, 13f)
        lineTo(4.00006f, 13f)
        }
        }.build()

        return _collapse!!
    }

private var _collapse: ImageVector? = null
