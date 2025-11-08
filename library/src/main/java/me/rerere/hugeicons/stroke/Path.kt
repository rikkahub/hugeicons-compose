package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Path: ImageVector
    get() {
        if (_path != null) {
            return _path!!
        }
        _path = ImageVector.Builder(
            name = "Path",
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
        moveTo(11f, 13.4625f)
        curveTo(14f, 14.955f, 17f, 12.8198f, 17f, 10.3934f)
        curveTo(17f, 7.96698f, 14.7614f, 6f, 12f, 6f)
        curveTo(9.23858f, 6f, 7f, 7.96698f, 7f, 10.3934f)
        curveTo(7f, 11.3826f, 7.37209f, 12.2955f, 8f, 13.0298f)
        moveTo(11f, 13.4625f)
        verticalLineTo(9.90523f)
        moveTo(11f, 13.4625f)
        verticalLineTo(15.8456f)
        curveTo(11f, 16.8264f, 11f, 17.3168f, 10.7732f, 17.5868f)
        curveTo(10.1251f, 18.3583f, 9f, 17.9399f, 8.5f, 17.2275f)
        }
        }.build()

        return _path!!
    }

private var _path: ImageVector? = null
