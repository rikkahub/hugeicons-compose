package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.JavaScript: ImageVector
    get() {
        if (_javaScript != null) {
            return _javaScript!!
        }
        _javaScript = ImageVector.Builder(
            name = "JavaScript",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.7324f, 12f)
        verticalLineTo(16f)
        curveTo(11.7324f, 17.1046f, 10.837f, 18f, 9.73244f, 18f)
        curveTo(8.99215f, 18f, 8.34581f, 17.5978f, 8f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.4668f, 13f)
        curveTo(18.121f, 12.4022f, 17.4747f, 12f, 16.7344f, 12f)
        horizontalLineTo(16.2344f)
        curveTo(15.4059f, 12f, 14.7344f, 12.6716f, 14.7344f, 13.5f)
        curveTo(14.7344f, 14.3284f, 15.4059f, 15f, 16.2344f, 15f)
        horizontalLineTo(17.2344f)
        curveTo(18.0628f, 15f, 18.7344f, 15.6716f, 18.7344f, 16.5f)
        curveTo(18.7344f, 17.3284f, 18.0628f, 18f, 17.2344f, 18f)
        horizontalLineTo(16.7344f)
        curveTo(15.9941f, 18f, 15.3477f, 17.5978f, 15.0019f, 17f)
        }
        }.build()

        return _javaScript!!
    }

private var _javaScript: ImageVector? = null
