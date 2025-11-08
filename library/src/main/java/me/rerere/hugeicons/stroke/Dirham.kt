package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dirham: ImageVector
    get() {
        if (_dirham != null) {
            return _dirham!!
        }
        _dirham = ImageVector.Builder(
            name = "Dirham",
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
        moveTo(22f, 12.001f)
        curveTo(22f, 17.5236f, 17.5229f, 22.001f, 12f, 22.001f)
        curveTo(6.47713f, 22.001f, 2f, 17.5236f, 2f, 12.001f)
        curveTo(2f, 6.47811f, 6.47713f, 2.00098f, 12f, 2.00098f)
        curveTo(17.5229f, 2.00098f, 22f, 6.47811f, 22f, 12.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.6904f, 9.00098f)
        lineTo(17.1609f, 10.704f)
        curveTo(17.9481f, 11.6155f, 17.2771f, 12.9999f, 16.048f, 13.0005f)
        lineTo(15f, 13.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 8.00098f)
        verticalLineTo(12.999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 17.5007f)
        horizontalLineTo(11f)
        moveTo(9.5f, 17.5007f)
        horizontalLineTo(8f)
        moveTo(9.5f, 17.5007f)
        curveTo(9.16667f, 17.1673f, 8.69989f, 16.3005f, 9.5f, 15.5007f)
        curveTo(10.1328f, 14.8681f, 11f, 15.5015f, 11f, 15.5015f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13.001f)
        verticalLineTo(13.011f)
        }
        }.build()

        return _dirham!!
    }

private var _dirham: ImageVector? = null
