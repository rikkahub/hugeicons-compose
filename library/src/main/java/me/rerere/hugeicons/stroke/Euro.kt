package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Euro: ImageVector
    get() {
        if (_euro != null) {
            return _euro!!
        }
        _euro = ImageVector.Builder(
            name = "Euro",
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
        moveTo(5f, 10f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 14f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 17.6076f)
        curveTo(17.8693f, 19.6404f, 15.812f, 21f, 13.4615f, 21f)
        curveTo(9.89293f, 21f, 7f, 17.866f, 7f, 14f)
        verticalLineTo(10f)
        curveTo(7f, 6.13401f, 9.89293f, 3f, 13.4615f, 3f)
        curveTo(15.812f, 3f, 17.8693f, 4.35958f, 19f, 6.39241f)
        }
        }.build()

        return _euro!!
    }

private var _euro: ImageVector? = null
