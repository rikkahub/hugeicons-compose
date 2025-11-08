package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Rhombus01: ImageVector
    get() {
        if (_rhombus01 != null) {
            return _rhombus01!!
        }
        _rhombus01 = ImageVector.Builder(
            name = "Rhombus01",
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
        moveTo(8.05622f, 4.78867f)
        curveTo(9.91534f, 2.92956f, 10.8449f, 2f, 12f, 2f)
        curveTo(13.1551f, 2f, 14.0847f, 2.92956f, 15.9438f, 4.78867f)
        lineTo(19.2113f, 8.05622f)
        curveTo(21.0704f, 9.91534f, 22f, 10.8449f, 22f, 12f)
        curveTo(22f, 13.1551f, 21.0704f, 14.0847f, 19.2113f, 15.9438f)
        lineTo(15.9438f, 19.2113f)
        curveTo(14.0847f, 21.0704f, 13.1551f, 22f, 12f, 22f)
        curveTo(10.8449f, 22f, 9.91534f, 21.0704f, 8.05622f, 19.2113f)
        lineTo(4.78867f, 15.9438f)
        curveTo(2.92956f, 14.0847f, 2f, 13.1551f, 2f, 12f)
        curveTo(2f, 10.8449f, 2.92956f, 9.91534f, 4.78867f, 8.05622f)
        lineTo(8.05622f, 4.78867f)
        }
        }.build()

        return _rhombus01!!
    }

private var _rhombus01: ImageVector? = null
