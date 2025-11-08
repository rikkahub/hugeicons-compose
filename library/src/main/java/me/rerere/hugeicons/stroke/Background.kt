package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Background: ImageVector
    get() {
        if (_background != null) {
            return _background!!
        }
        _background = ImageVector.Builder(
            name = "Background",
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
        moveTo(4.25276f, 20.302f)
        curveTo(5.6554f, 21.5f, 7.77027f, 21.5f, 12f, 21.5f)
        curveTo(16.2297f, 21.5f, 18.3446f, 21.5f, 19.7472f, 20.302f)
        curveTo(19.9464f, 20.1319f, 20.1319f, 19.9464f, 20.302f, 19.7472f)
        curveTo(21.5f, 18.3446f, 21.5f, 16.2297f, 21.5f, 12f)
        curveTo(21.5f, 7.77027f, 21.5f, 5.6554f, 20.302f, 4.25276f)
        curveTo(20.1319f, 4.05358f, 19.9464f, 3.86808f, 19.7472f, 3.69797f)
        curveTo(18.3446f, 2.5f, 16.2297f, 2.5f, 12f, 2.5f)
        curveTo(7.77027f, 2.5f, 5.6554f, 2.5f, 4.25276f, 3.69797f)
        curveTo(4.05358f, 3.86808f, 3.86808f, 4.05358f, 3.69797f, 4.25276f)
        curveTo(2.5f, 5.6554f, 2.5f, 7.77027f, 2.5f, 12f)
        curveTo(2.5f, 16.2297f, 2.5f, 18.3446f, 3.69797f, 19.7472f)
        curveTo(3.86808f, 19.9464f, 4.05358f, 20.1319f, 4.25276f, 20.302f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 20f)
        lineTo(20f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.69806f, 15.8021f)
        lineTo(15.8058f, 2.69434f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.3058f, 8.19434f)
        lineTo(8.19806f, 21.3021f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 21.5f)
        lineTo(21.5f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 10.5f)
        lineTo(10.5f, 2.5f)
        }
        }.build()

        return _background!!
    }

private var _background: ImageVector? = null
