package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Amazon: ImageVector
    get() {
        if (_amazon != null) {
            return _amazon!!
        }
        _amazon = ImageVector.Builder(
            name = "Amazon",
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
        moveTo(7f, 6f)
        lineTo(9.5f, 7f)
        curveTo(9.5f, 7f, 10f, 5f, 12f, 5f)
        curveTo(13.6f, 5f, 14.1664f, 6.86545f, 14f, 8.5f)
        curveTo(7.5f, 8.5f, 6.5f, 11.5f, 6.5f, 13f)
        curveTo(6.5f, 14.5f, 7.5f, 17f, 10.5f, 17f)
        curveTo(13f, 17f, 14.5f, 15f, 14.5f, 15f)
        lineTo(15.5f, 16.5f)
        lineTo(18f, 14.5f)
        curveTo(18f, 14.5f, 17f, 13.6667f, 17f, 12.5f)
        verticalLineTo(9f)
        curveTo(17f, 9f, 17.6681f, 2.5f, 12f, 2.5f)
        curveTo(7.6f, 2.5f, 7f, 6f, 7f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 10.8555f)
        curveTo(13.5f, 12.3555f, 12.5805f, 14.3555f, 11.2014f, 14.3555f)
        curveTo(9.30586f, 14.3555f, 9.36245f, 10.8555f, 13.5f, 10.8555f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 17.5f)
        curveTo(2f, 17.5f, 10.5f, 23.5844f, 19f, 19.5281f)
        curveTo(19f, 19.5281f, 10.5f, 25.1056f, 2f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.99f, 17.7025f)
        curveTo(22.136f, 19.0999f, 20.6414f, 21f, 20.6414f, 21f)
        curveTo(20.6414f, 21f, 21.6208f, 19.4076f, 21.4245f, 17.7025f)
        curveTo(19.8212f, 17.0648f, 18f, 17.7895f, 18f, 17.7895f)
        curveTo(18f, 17.7895f, 19.5024f, 16.685f, 21.4245f, 17.0888f)
        curveTo(21.7265f, 17.1522f, 21.9579f, 17.3956f, 21.99f, 17.7025f)
        }
        }.build()

        return _amazon!!
    }

private var _amazon: ImageVector? = null
