package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Notion02: ImageVector
    get() {
        if (_notion02 != null) {
            return _notion02!!
        }
        _notion02 = ImageVector.Builder(
            name = "Notion02",
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
        moveTo(2.5f, 3.5f)
        lineTo(16.5f, 2.5f)
        lineTo(21.5f, 5.5f)
        moveTo(2.5f, 3.5f)
        lineTo(6.5f, 6.5f)
        moveTo(2.5f, 3.5f)
        verticalLineTo(16.5f)
        lineTo(6.5f, 21.5f)
        moveTo(21.5f, 5.5f)
        lineTo(6.5f, 6.5f)
        moveTo(21.5f, 5.5f)
        verticalLineTo(19.5f)
        lineTo(6.5f, 21.5f)
        moveTo(6.5f, 6.5f)
        verticalLineTo(21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.4704f, 17.704f)
        lineTo(9.5f, 18.1f)
        moveTo(18.5f, 8.70001f)
        lineTo(16.2654f, 8.84899f)
        moveTo(17.5f, 8.76668f)
        verticalLineTo(17f)
        lineTo(11.7148f, 9.15236f)
        lineTo(9.5f, 9.30001f)
        moveTo(11f, 9.20001f)
        verticalLineTo(17.7f)
        }
        }.build()

        return _notion02!!
    }

private var _notion02: ImageVector? = null
