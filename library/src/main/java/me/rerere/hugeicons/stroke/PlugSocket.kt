package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PlugSocket: ImageVector
    get() {
        if (_plugSocket != null) {
            return _plugSocket!!
        }
        _plugSocket = ImageVector.Builder(
            name = "PlugSocket",
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
        moveTo(17.854f, 12.16f)
        curveTo(17.471f, 12.6105f, 16.7631f, 12.6138f, 16.3165f, 12.1671f)
        lineTo(11.8329f, 7.68351f)
        curveTo(11.3862f, 7.23686f, 11.3895f, 6.529f, 11.84f, 6.14596f)
        lineTo(13.071f, 5.09939f)
        curveTo(13.9559f, 4.34704f, 15.0349f, 3.84824f, 16.2044f, 3.6509f)
        lineTo(16.9294f, 3.52858f)
        curveTo(17.614f, 3.41306f, 18.3339f, 3.65221f, 18.8475f, 4.16577f)
        lineTo(19.8342f, 5.15255f)
        curveTo(20.3478f, 5.66611f, 20.5869f, 6.38601f, 20.4714f, 7.07063f)
        lineTo(20.3491f, 7.79559f)
        curveTo(20.1518f, 8.9651f, 19.653f, 10.0441f, 18.9006f, 10.929f)
        lineTo(17.854f, 12.16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 4.5f)
        lineTo(21.5f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 21.5f)
        lineTo(4.5f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.14596f, 11.84f)
        curveTo(6.52901f, 11.3895f, 7.23686f, 11.3862f, 7.68351f, 11.8329f)
        lineTo(12.1671f, 16.3165f)
        curveTo(12.6138f, 16.7631f, 12.6105f, 17.471f, 12.16f, 17.854f)
        lineTo(10.929f, 18.9006f)
        curveTo(10.0441f, 19.653f, 8.9651f, 20.1518f, 7.79559f, 20.3491f)
        lineTo(7.07063f, 20.4714f)
        curveTo(6.38601f, 20.5869f, 5.66611f, 20.3478f, 5.15255f, 19.8342f)
        lineTo(4.16577f, 18.8475f)
        curveTo(3.65221f, 18.3339f, 3.41306f, 17.614f, 3.52858f, 16.9294f)
        lineTo(3.6509f, 16.2044f)
        curveTo(3.84824f, 15.0349f, 4.34704f, 13.9559f, 5.09939f, 13.071f)
        lineTo(6.14596f, 11.84f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 12.5f)
        lineTo(10.5f, 10.5f)
        moveTo(11.5f, 15.5f)
        lineTo(13.5f, 13.5f)
        }
        }.build()

        return _plugSocket!!
    }

private var _plugSocket: ImageVector? = null
