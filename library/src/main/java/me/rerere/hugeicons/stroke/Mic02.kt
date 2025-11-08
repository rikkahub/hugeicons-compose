package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mic02: ImageVector
    get() {
        if (_mic02 != null) {
            return _mic02!!
        }
        _mic02 = ImageVector.Builder(
            name = "Mic02",
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
        moveTo(17f, 7f)
        verticalLineTo(11f)
        curveTo(17f, 13.7614f, 14.7614f, 16f, 12f, 16f)
        curveTo(9.23858f, 16f, 7f, 13.7614f, 7f, 11f)
        verticalLineTo(7f)
        curveTo(7f, 4.23858f, 9.23858f, 2f, 12f, 2f)
        curveTo(14.7614f, 2f, 17f, 4.23858f, 17f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 11f)
        curveTo(20f, 15.4183f, 16.4183f, 19f, 12f, 19f)
        moveTo(12f, 19f)
        curveTo(7.58172f, 19f, 4f, 15.4183f, 4f, 11f)
        moveTo(12f, 19f)
        verticalLineTo(22f)
        moveTo(12f, 22f)
        horizontalLineTo(15f)
        moveTo(12f, 22f)
        horizontalLineTo(9f)
        }
        }.build()

        return _mic02!!
    }

private var _mic02: ImageVector? = null
