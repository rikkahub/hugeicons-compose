package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Game: ImageVector
    get() {
        if (_game != null) {
            return _game!!
        }
        _game = ImageVector.Builder(
            name = "Game",
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
        moveTo(2f, 14.5f)
        curveTo(2f, 11.2125f, 2f, 9.56878f, 2.90796f, 8.46243f)
        curveTo(3.07418f, 8.25989f, 3.25989f, 8.07418f, 3.46243f, 7.90796f)
        curveTo(4.56878f, 7f, 6.21252f, 7f, 9.5f, 7f)
        horizontalLineTo(14.5f)
        curveTo(17.7875f, 7f, 19.4312f, 7f, 20.5376f, 7.90796f)
        curveTo(20.7401f, 8.07418f, 20.9258f, 8.25989f, 21.092f, 8.46243f)
        curveTo(22f, 9.56878f, 22f, 11.2125f, 22f, 14.5f)
        curveTo(22f, 17.7875f, 22f, 19.4312f, 21.092f, 20.5376f)
        curveTo(20.9258f, 20.7401f, 20.7401f, 20.9258f, 20.5376f, 21.092f)
        curveTo(19.4312f, 22f, 17.7875f, 22f, 14.5f, 22f)
        horizontalLineTo(9.5f)
        curveTo(6.21252f, 22f, 4.56878f, 22f, 3.46243f, 21.092f)
        curveTo(3.25989f, 20.9258f, 3.07418f, 20.7401f, 2.90796f, 20.5376f)
        curveTo(2f, 19.4312f, 2f, 17.7875f, 2f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        verticalLineTo(5f)
        curveTo(12f, 4.44772f, 12.4477f, 4f, 13f, 4f)
        curveTo(13.5523f, 4f, 14f, 3.55228f, 14f, 3f)
        verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16f)
        lineTo(8.5f, 14.5f)
        moveTo(8.5f, 14.5f)
        lineTo(7f, 13f)
        moveTo(8.5f, 14.5f)
        lineTo(7f, 16f)
        moveTo(8.5f, 14.5f)
        lineTo(10f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 15.5f)
        lineTo(17f, 13.5f)
        }
        }.build()

        return _game!!
    }

private var _game: ImageVector? = null
