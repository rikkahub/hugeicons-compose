package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wordpress: ImageVector
    get() {
        if (_wordpress != null) {
            return _wordpress!!
        }
        _wordpress = ImageVector.Builder(
            name = "Wordpress",
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
        moveTo(2f, 6f)
        horizontalLineTo(3f)
        moveTo(3f, 6f)
        lineTo(7.457f, 17.4921f)
        curveTo(8.10731f, 19.1689f, 8.43246f, 20.0073f, 8.9816f, 20f)
        curveTo(9.53074f, 19.9926f, 9.83482f, 19.1459f, 10.443f, 17.4524f)
        lineTo(10.5f, 17.2935f)
        moveTo(3f, 6f)
        horizontalLineTo(6.5f)
        moveTo(6.5f, 6f)
        horizontalLineTo(7.457f)
        moveTo(6.5f, 6f)
        lineTo(10.5f, 17.2935f)
        moveTo(10.5f, 17.2935f)
        lineTo(12.816f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 6f)
        horizontalLineTo(11f)
        moveTo(11f, 6f)
        lineTo(15.457f, 17.4921f)
        curveTo(16.1073f, 19.1689f, 16.4325f, 20.0073f, 16.9816f, 20f)
        curveTo(17.5307f, 19.9926f, 17.8348f, 19.1459f, 18.443f, 17.4524f)
        lineTo(18.5f, 17.2935f)
        moveTo(11f, 6f)
        horizontalLineTo(14.5f)
        moveTo(14.5f, 6f)
        horizontalLineTo(15.457f)
        moveTo(14.5f, 6f)
        lineTo(18.5f, 17.2935f)
        moveTo(18.5f, 17.2935f)
        lineTo(20.5288f, 11.644f)
        moveTo(20.5288f, 11.644f)
        lineTo(21.5377f, 9.23491f)
        curveTo(21.9415f, 8.12432f, 22.0835f, 6.93739f, 21.9529f, 5.76443f)
        curveTo(21.7963f, 4.35795f, 21.1576f, 3f, 19.5012f, 3f)
        curveTo(17.9632f, 3f, 17.2101f, 4.72272f, 18.1898f, 5.89363f)
        curveTo(19.7701f, 7.78249f, 21.1719f, 9.87537f, 20.5288f, 11.644f)
        }
        }.build()

        return _wordpress!!
    }

private var _wordpress: ImageVector? = null
