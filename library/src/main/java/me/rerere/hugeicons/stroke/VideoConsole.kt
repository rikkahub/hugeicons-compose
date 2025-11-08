package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VideoConsole: ImageVector
    get() {
        if (_videoConsole != null) {
            return _videoConsole!!
        }
        _videoConsole = ImageVector.Builder(
            name = "VideoConsole",
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
        moveTo(3f, 10f)
        curveTo(3f, 6.22876f, 3f, 4.34315f, 4.17157f, 3.17157f)
        curveTo(5.34315f, 2f, 7.22876f, 2f, 11f, 2f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 2f, 18.6569f, 2f, 19.8284f, 3.17157f)
        curveTo(21f, 4.34315f, 21f, 6.22876f, 21f, 10f)
        verticalLineTo(14f)
        curveTo(21f, 17.7712f, 21f, 19.6569f, 19.8284f, 20.8284f)
        curveTo(18.6569f, 22f, 16.7712f, 22f, 13f, 22f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 22f, 5.34315f, 22f, 4.17157f, 20.8284f)
        curveTo(3f, 19.6569f, 3f, 17.7712f, 3f, 14f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 18f)
        lineTo(8.5f, 16.5f)
        moveTo(8.5f, 16.5f)
        lineTo(7f, 15f)
        moveTo(8.5f, 16.5f)
        lineTo(7f, 18f)
        moveTo(8.5f, 16.5f)
        lineTo(10f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9912f, 15f)
        horizontalLineTo(17.0002f)
        moveTo(15f, 18f)
        horizontalLineTo(15.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12f)
        horizontalLineTo(21f)
        }
        }.build()

        return _videoConsole!!
    }

private var _videoConsole: ImageVector? = null
